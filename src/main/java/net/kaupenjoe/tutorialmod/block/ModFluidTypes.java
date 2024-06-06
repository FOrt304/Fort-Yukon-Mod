
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.kaupenjoe.tutorialmod.block;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.kaupenjoe.tutorialmod.fluid.types.CheeseFluidType;
import net.kaupenjoe.tutorialmod.TutorialMod;

public class ModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TutorialMod.MOD_ID);
	public static final RegistryObject<FluidType> CHEESE_TYPE = REGISTRY.register("cheese", () -> new CheeseFluidType());
}
