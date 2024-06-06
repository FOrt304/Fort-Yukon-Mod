
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kaupenjoe.tutorialmod.paintings;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.kaupenjoe.tutorialmod.TutorialMod;

public class Paintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TutorialMod.MOD_ID);
	public static final RegistryObject<PaintingVariant> FYCFLAG = REGISTRY.register("fycflag", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> LULUTAPAINTING = REGISTRY.register("lulutapainting", () -> new PaintingVariant(64, 64));
}
