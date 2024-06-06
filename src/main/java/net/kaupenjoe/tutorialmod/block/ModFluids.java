
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.kaupenjoe.tutorialmod.block;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.kaupenjoe.tutorialmod.fluid.CheeseFluid;
import net.kaupenjoe.tutorialmod.TutorialMod;

public class ModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TutorialMod.MOD_ID);
	public static final RegistryObject<FlowingFluid> CHEESE = REGISTRY.register("cheese", () -> new CheeseFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHEESE = REGISTRY.register("flowing_cheese", () -> new CheeseFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CHEESE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHEESE.get(), RenderType.translucent());
		}
	}
}
