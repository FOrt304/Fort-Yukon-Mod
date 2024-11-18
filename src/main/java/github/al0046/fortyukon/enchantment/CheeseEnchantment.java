
package github.al0046.fortyukon.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import java.util.List;

public class CheeseEnchantment extends Enchantment {
	public CheeseEnchantment(EquipmentSlot... slots) {
		super(Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 10;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.VANISHING_CURSE, Enchantments.BINDING_CURSE, Enchantments.BANE_OF_ARTHROPODS).contains(ench);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
