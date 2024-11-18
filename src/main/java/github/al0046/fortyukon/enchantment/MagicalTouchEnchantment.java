package github.al0046.fortyukon.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment.Rarity;

public class MagicalTouchEnchantment extends Enchantment {
    public MagicalTouchEnchantment(EquipmentSlot... slots) {
        super(Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
    }

    public boolean isAllowedOnBooks() {
        return false;
    }

    public boolean m_6592_() {
        return false;
    }

    public boolean m_6594_() {
        return false;
    }
}
