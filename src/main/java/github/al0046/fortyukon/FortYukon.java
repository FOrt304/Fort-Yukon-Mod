package github.al0046.fortyukon;

import com.mojang.logging.LogUtils;
import github.al0046.fortyukon.block.ModBlocks;
import github.al0046.fortyukon.block.ModFluidTypes;
import github.al0046.fortyukon.block.ModFluids;
import github.al0046.fortyukon.block.entity.ModBlockEntities;
import github.al0046.fortyukon.enchantment.ModEnchantments;
import github.al0046.fortyukon.entity.ModEntities;
import github.al0046.fortyukon.entity.client.ModBoatRenderer;
import github.al0046.fortyukon.item.ModCreativeModTabs;
import github.al0046.fortyukon.loot.ModLootModifiers;
import github.al0046.fortyukon.recipe.ModRecipes;
import github.al0046.fortyukon.screen.GemPolishingStationScreen;
import github.al0046.fortyukon.screen.ModMenuTypes;
import github.al0046.fortyukon.sound.ModSounds;
import github.al0046.fortyukon.util.ModWoodTypes;
import github.al0046.fortyukon.entity.client.BlueDragonRenderer;
import github.al0046.fortyukon.entity.client.RhinoRenderer;
import github.al0046.fortyukon.item.ModItems;
import github.al0046.fortyukon.villager.ModVillagers;
import github.al0046.fortyukon.worldgen.biome.ModTerrablender;
import github.al0046.fortyukon.worldgen.biome.surface.ModSurfaceRules;
import github.al0046.fortyukon.worldgen.tree.ModFoliagePlacers;
import github.al0046.fortyukon.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;
import github.al0046.fortyukon.entity.HappyOgerdayVillager;
import net.minecraft.world.entity.npc.Villager;

import github.al0046.fortyukon.util.discs.Disc;
import github.al0046.fortyukon.util.discs.DiscSegment;
import github.al0046.fortyukon.util.discs.*;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static github.al0046.fortyukon.entity.ModEntities.HAPPY_OGERDAY_VILLAGER;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FortYukon.MOD_ID)
public class FortYukon {
    public static final String MOD_ID = "fortyukon";
    private static final UUID HOCKEYMANNA_PLAYER_UUID = UUID.fromString("9beb9d7c-890b-4996-b57d-6273206e6ae8");

//    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
//    public static final RegistryObject<Item> YUKOES = ITEMS.register("yukoes", () -> new YukoesItem());

//    @ObjectHolder(FortYukon.MOD_ID + ":happy_ogerday_villager")
//    public static final EntityType<HappyOgerdayVillager> HAPPY_OGERDAY_VILLAGER = null;

    public static final Logger LOGGER = LogUtils.getLogger();
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
    }

    public static final DiscManager discManager = new DiscManager();
    private static final HashMap<BlockPos, DiscPlayback> musicSourceBlocks = new HashMap<>();
    private static final HashMap<Integer, DiscPlayback> musicSourceEntities = new HashMap<>();
    public static final double JAM_RADIUS = 3.46D;

    public FortYukon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

//        HappyOgerdayVillager.ENTITY_TYPES.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluids.REGISTRY.register(modEventBus);
        ModFluidTypes.REGISTRY.register(modEventBus);

        ModEnchantments.REGISTRY.register(modEventBus);

//        ModDimensions.register();

        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);

        ModFoliagePlacers.register(modEventBus);
        ModTerrablender.registerBiomes();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        initialiseModdedDiscs();
    }
    public static void tickPlayingDiscs(World world) {

        // Iterate over a copy of the keys to avoid ConcurrentModificationException
        final List<BlockPos> musicSourceBlockKeys = new ArrayList<>(musicSourceBlocks.keySet());
        final List<Integer> musicSourceEntityKeys = new ArrayList<>(musicSourceEntities.keySet());

        for (BlockPos sourcePos : musicSourceBlockKeys) {
            if (isBlockEntityLoadedAtPos(world, sourcePos)) {
                DiscPlayback playback = musicSourceBlocks.get(sourcePos);
                if (playback != null) playback.tick();
            } else {
                removeMusicSource(sourcePos);
            }
        }

        for (Integer musicSourceEntityID : musicSourceEntityKeys) {
            if (world.getEntityById(musicSourceEntityID) != null) {
                DiscPlayback playback = musicSourceEntities.get(musicSourceEntityID);
                if (playback != null) playback.tick();
            } else {
                removeMusicSource(musicSourceEntityID);
            }
        }

    }
    @SubscribeEvent
    public static void onClientWorldTickEnd(TickEvent.LevelTickEvent event) {
        if (event.side == LogicalSide.CLIENT && event.phase == TickEvent.Phase.END)
            FortYukon.tickPlayingDiscs(MinecraftClient.getInstance().world);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATMINT.getId(), ModBlocks.POTTED_CATMINT);

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRules.makeRules());
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.RAW_SAPPHIRE);
            event.accept(ModItems.KOSLING);
            event.accept(ModItems.ALEXANDRITE);
            event.accept(ModItems.RAW_ALEXANDRITE);
            event.accept(ModItems.RUBY);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ALEXANDRITE_BLOCK);
            event.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.PINE);

            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
            EntityRenderers.register(ModEntities.BLUE_DRAGON.get(), BlueDragonRenderer::new);
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);

            MenuScreens.register(ModMenuTypes.GEM_POLISHING_MENU.get(), GemPolishingStationScreen::new);
        }

        public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
            // Code to spawn the custom villager
            if (event.getEntity() instanceof ServerPlayer player) {
                ServerLevel world = (ServerLevel) player.level();
                BlockPos pos = player.blockPosition().offset(0, 1, 0); // Adjust spawn position as needed
                HappyOgerdayVillager villager = new HappyOgerdayVillager(ModEntities.HAPPY_OGERDAY_VILLAGER.get(), world);
                villager.moveTo(pos, 0.0F, 0.0F);
                world.addFreshEntityWithPassengers(villager);

                // Play sound
                world.playSound(null, pos, ModSounds.HAPPYOGERDAYVILLAGER.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
            }
        }
    }
    private void initialiseModdedDiscs() {

        // Mod List

        /* final boolean example_mod = ModList.get().isLoaded("example_mod"); */

        // Modded Discs

        /* if (example_mod) discManager.addDisc(new Disc("example_mod:example_disc", 0, 0)); */

    }
}
