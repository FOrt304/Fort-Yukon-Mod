package github.al0046.fortyukon.item;

import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FortYukon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("fortyukon",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KOSLING.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModItems.ALEXANDRITE.get());
                        pOutput.accept(ModItems.RAW_ALEXANDRITE.get());

                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RUBY_SHARD.get());

                        pOutput.accept(ModItems.MAGICALIZE_WAND.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.KOHLRABI.get());
                        pOutput.accept(ModItems.PEAT_BRICK.get());

                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());

                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());

                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(ModItems.KOSLING_SWORD.get());
                        pOutput.accept(ModItems.KOSLING_PICKAXE.get());
                        pOutput.accept(ModItems.KOSLING_AXE.get());
                        pOutput.accept(ModItems.KOSLING_SHOVEL.get());
                        pOutput.accept(ModItems.KOSLING_HOE.get());

                        pOutput.accept(ModItems.KOSLING_HELMET.get());
                        pOutput.accept(ModItems.KOSLING_CHESTPLATE.get());
                        pOutput.accept(ModItems.KOSLING_LEGGINGS.get());
                        pOutput.accept(ModItems.KOSLING_BOOTS.get());

                        pOutput.accept(ModItems.ALEXANDRITE_SWORD.get());
                        pOutput.accept(ModItems.ALEXANDRITE_PICKAXE.get());
                        pOutput.accept(ModItems.ALEXANDRITE_SHOVEL.get());
                        pOutput.accept(ModItems.ALEXANDRITE_AXE.get());
                        pOutput.accept(ModItems.ALEXANDRITE_HOE.get());

                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_PICKAXE.get());
                        pOutput.accept(ModItems.RUBY_SHOVEL.get());
                        pOutput.accept(ModItems.RUBY_AXE.get());
                        pOutput.accept(ModItems.RUBY_HOE.get());

                        pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());

                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());

                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.JATTER_OGER_BEATBOX_MUSIC_DISC.get());
                        pOutput.accept(ModItems.RHINO_SPANW_EGG.get());
                        pOutput.accept(ModItems.BLUE_DRAGON_SPAWN_EGG.get());

                        pOutput.accept(ModItems.PINE_SIGN.get());
                        pOutput.accept(ModItems.PINE_HANGING_SIGN.get());

                        pOutput.accept(ModItems.PINE_BOAT.get());
                        pOutput.accept(ModItems.PINE_CHEST_BOAT.get());

                        pOutput.accept(ModItems.E.get());

                        pOutput.accept(ModItems.DICE.get());

                        pOutput.accept(ModItems.YUKOE.get());

                        pOutput.accept(ModItems.CHERRY.get());
                        pOutput.accept(ModItems.COALPICKAXE.get());
                        pOutput.accept(ModItems.FORTYUKON.get());
                        pOutput.accept(ModItems.JATTEROGERBEATBOXEDITION.get());
                        pOutput.accept(ModItems.AOFY.get());

                        pOutput.accept(ModItems.CHEESEITEM.get());
                        pOutput.accept(ModItems.CHEESE_CAKE.get());
                        pOutput.accept(ModItems.SWEDEN_CAKE.get());

                        pOutput.accept(ModItems.WATER_BOTTLE.get());
                        pOutput.accept(ModItems.MILK_CARTON.get());
                        pOutput.accept(ModItems.EGGNOG_CARTON.get());

                        pOutput.accept(ModItems.CHEESE_BUCKET.get());

                        pOutput.accept(ModItems.KOSLING_IGNITER.get());
                        pOutput.accept(ModItems.KOSLING.get());
                        pOutput.accept(ModBlocks.KOSLING_BLOCK.get());
                        pOutput.accept(ModBlocks.KOSLING_ORE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        pOutput.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());

                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.GLOWING_OBSIDIAN.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.ALEXANDRITE_STAIRS.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_SLAB.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_BUTTON.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_FENCE.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_WALL.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_DOOR.get());
                        pOutput.accept(ModBlocks.ALEXANDRITE_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.CATMINT.get());
                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        pOutput.accept(ModBlocks.PINE_LOG.get());
                        pOutput.accept(ModBlocks.PINE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_WOOD.get());

                        pOutput.accept(ModBlocks.PINE_PLANKS.get());
                        pOutput.accept(ModBlocks.PINE_LEAVES.get());

                        pOutput.accept(ModBlocks.OGER_LOG.get());
                        pOutput.accept(ModBlocks.OGER_WOOD.get());

                        pOutput.accept(ModBlocks.OGER_PLANKS.get());
                        pOutput.accept(ModBlocks.OGER_LEAVES.get());

                        pOutput.accept(ModBlocks.OGER_STAIRS.get());
                        pOutput.accept(ModBlocks.OGER_SLAB.get());
                        pOutput.accept(ModBlocks.OGER_BUTTON.get());
                        pOutput.accept(ModBlocks.OGER_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.OGER_FENCE.get());
                        pOutput.accept(ModBlocks.OGER_FENCE_GATE.get());

                        pOutput.accept(ModBlocks.PINE_SAPLING.get());
                        pOutput.accept(ModBlocks.OGER_SAPLING.get());

                        pOutput.accept(ModItems.ROCKET.get());
                        pOutput.accept(ModBlocks.MOD_PORTAL.get());

                        pOutput.accept(ModBlocks.FLAG.get());
                        pOutput.accept(ModBlocks.FLAG1.get());
                        pOutput.accept(ModBlocks.FLAG2.get());
                        pOutput.accept(ModBlocks.FLAG3.get());
                        pOutput.accept(ModBlocks.FLAG4.get());
                        pOutput.accept(ModBlocks.FLAG5.get());
                        pOutput.accept(ModBlocks.FLAG6.get());
                        pOutput.accept(ModBlocks.FLAG7.get());
                        pOutput.accept(ModBlocks.FLAG8.get());
                        pOutput.accept(ModBlocks.FLAG9.get());
                        pOutput.accept(ModBlocks.FLAG10.get());
                        pOutput.accept(ModBlocks.FLAG11.get());
                        pOutput.accept(ModBlocks.FLAG12.get());
                        pOutput.accept(ModBlocks.FLAG13.get());
                        pOutput.accept(ModBlocks.FLAG14.get());
                        pOutput.accept(ModBlocks.FLAG15.get());
                        pOutput.accept(ModBlocks.FLAG16.get());
                        pOutput.accept(ModBlocks.FLAG17.get());
                        pOutput.accept(ModBlocks.FLAG18.get());
                        pOutput.accept(ModBlocks.FLAG19.get());
                        pOutput.accept(ModBlocks.FLAG20.get());
                        pOutput.accept(ModBlocks.FLAG21.get());
                        pOutput.accept(ModBlocks.FLAG22.get());
                        pOutput.accept(ModBlocks.FLAG23.get());
                        pOutput.accept(ModBlocks.FLAG24.get());
                        pOutput.accept(ModBlocks.FLAG25.get());
                        pOutput.accept(ModBlocks.FLAG26.get());
                        pOutput.accept(ModBlocks.FLAG27.get());
                        pOutput.accept(ModBlocks.FLAG28.get());
                        pOutput.accept(ModBlocks.FLAG29.get());
                        pOutput.accept(ModBlocks.FLAG30.get());
                        pOutput.accept(ModBlocks.FLAG31.get());
                        pOutput.accept(ModBlocks.FLAG32.get());
                        pOutput.accept(ModBlocks.FLAG33.get());
                        pOutput.accept(ModBlocks.FLAG34.get());
                        pOutput.accept(ModBlocks.FLAGFYC.get()); // Fort Yukon Flag
                        pOutput.accept(ModBlocks.FLAGLUL.get()); // Luluta-Landet Flag

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
