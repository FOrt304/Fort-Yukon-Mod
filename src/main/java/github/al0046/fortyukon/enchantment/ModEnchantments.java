
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package github.al0046.fortyukon.enchantment;

import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.enchantment.MagicalTouchEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantments {
	public static DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, FortYukon.MOD_ID);
	public static RegistryObject<Enchantment> CHEESEENCHANT = REGISTRY.register("cheeseenchant", () -> new CheeseEnchantment());
	public static RegistryObject<Enchantment> MAGICALTOUCHENCHANT = REGISTRY.register("magicaltouchenchant", () -> new MagicalTouchEnchantment());

	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "fortyukon");
		MAGICALTOUCHENCHANT = REGISTRY.register("magicaltouchenchant", () -> {
			return new MagicalTouchEnchantment(new EquipmentSlot[0]);
		});
	}
	static {
		REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "fortyukon");
		CHEESEENCHANT = REGISTRY.register("cheeseenchant", () -> {
			return new MagicalTouchEnchantment(new EquipmentSlot[0]);
		});
	}
}
