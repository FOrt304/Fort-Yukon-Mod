
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package github.al0046.fortyukon.block;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import github.al0046.fortyukon.fluid.types.CheeseFluidType;
import github.al0046.fortyukon.FortYukon;

public class ModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FortYukon.MOD_ID);
	public static final RegistryObject<FluidType> CHEESE_TYPE = REGISTRY.register("cheese", () -> new CheeseFluidType());
}
