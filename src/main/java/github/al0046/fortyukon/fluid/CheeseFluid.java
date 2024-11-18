
package github.al0046.fortyukon.fluid;

import github.al0046.fortyukon.block.ModFluidTypes;
import github.al0046.fortyukon.block.ModFluids;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import github.al0046.fortyukon.item.ModItems;
import github.al0046.fortyukon.block.ModBlocks;

public abstract class CheeseFluid extends ForgeFlowingFluid {
	public static final Properties PROPERTIES = new Properties(() -> ModFluidTypes.CHEESE_TYPE.get(), () -> ModFluids.CHEESE.get(), () -> ModFluids.FLOWING_CHEESE.get()).explosionResistance(100f)
			.tickRate(6).bucket(() -> ModItems.CHEESE_BUCKET.get()).block(() -> (LiquidBlock) ModBlocks.CHEESE.get());

	private CheeseFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_LAVA;
	}

	public static class Source extends CheeseFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CheeseFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
