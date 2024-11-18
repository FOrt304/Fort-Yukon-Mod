package github.al0046.fortyukon.item;

import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(FortYukon.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier ALEXANDRITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1400, 11f, 3f, 26,
                    ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL, () -> Ingredient.of(ModItems.ALEXANDRITE.get())),
            new ResourceLocation(FortYukon.MOD_ID, "alexandrite"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1400, 11f, 3f, 26,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(FortYukon.MOD_ID, "ruby"), List.of(Tiers.NETHERITE), List.of());


    public static final Tier KOSLING = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.KOSLING.get())),
            new ResourceLocation(FortYukon.MOD_ID, "kosling"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier COAL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 120, 7f, 1.5f, 2,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.CHERRY.get())),
            new ResourceLocation(FortYukon.MOD_ID, "cherry"), List.of(Tiers.WOOD), List.of());

//    public Ingredient getRepairIngredient() {
//        return Ingredient.of(new ItemStack(Items.COAL));
    }

