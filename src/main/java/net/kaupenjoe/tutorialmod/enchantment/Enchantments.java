
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kaupenjoe.tutorialmod.enchantment;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.kaupenjoe.tutorialmod.enchantment.CheeseenchantEnchantment;
import net.kaupenjoe.tutorialmod.TutorialMod;

public class Enchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TutorialMod.MOD_ID);
	public static final RegistryObject<Enchantment> CHEESEENCHANT = REGISTRY.register("cheeseenchant", () -> new CheeseenchantEnchantment());
}
