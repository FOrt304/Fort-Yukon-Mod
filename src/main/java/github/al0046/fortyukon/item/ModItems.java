package github.al0046.fortyukon.item;

//import net.kaupenjoe.fortyukon.ThirstHUD.ThirstDrinkItem;
import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.block.ModBlocks;
import github.al0046.fortyukon.block.ModFluids;
import github.al0046.fortyukon.entity.ModEntities;
import github.al0046.fortyukon.entity.custom.RocketEntity;
import github.al0046.fortyukon.item.custom.*;
import github.al0046.fortyukon.sound.ModSounds;
import github.al0046.fortyukon.entity.custom.ModBoatEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FortYukon.MOD_ID);

    public static final RegistryObject<Item> YUKOE = ITEMS.register("yukoe",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    // Yukoe(s) = Currency

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGICALIZE_WAND = ITEMS.register("magicalize_wand",
            () -> new MagicalizeWandItem(new Item.Properties().durability(120)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().food(ModFoods.KOHLRABI)));

    public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            () -> new FuelItem(new Item.Properties(), 200));


    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
            () -> new SwordItem(ModToolTiers.ALEXANDRITE, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, 1, 2, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
            () -> new ShovelItem(ModToolTiers.ALEXANDRITE, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe",
            () -> new AxeItem(ModToolTiers.ALEXANDRITE, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
            () -> new HoeItem(ModToolTiers.ALEXANDRITE, 2, 3, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, 2, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, 2, 3, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> KOSLING_SWORD = ITEMS.register("kosling_sword",
            () -> new SwordItem(ModToolTiers.KOSLING, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_PICKAXE = ITEMS.register("kosling_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KOSLING, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_AXE = ITEMS.register("kosling_axe",
            () -> new AxeItem(ModToolTiers.KOSLING, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_SHOVEL = ITEMS.register("kosling_shovel",
            () -> new ShovelItem(ModToolTiers.KOSLING, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_HOE = ITEMS.register("kosling_hoe",
            () -> new HoeItem(ModToolTiers.KOSLING, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> KOSLING_HELMET = ITEMS.register("kosling_armor_helmet",
            () -> new ModArmorItem(ModArmorMaterials.KOSLING, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_CHESTPLATE = ITEMS.register("kosling_armor_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KOSLING, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_LEGGINGS = ITEMS.register("kosling_armor_leggings",
            () -> new ArmorItem(ModArmorMaterials.KOSLING, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> KOSLING_BOOTS = ITEMS.register("kosling_armor_boots",
            () -> new ArmorItem(ModArmorMaterials.KOSLING, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> JATTER_OGER_BEATBOX_MUSIC_DISC = ITEMS.register("jatter_oger_beatbox_music_disc",
            () -> new RecordItem(6, ModSounds.JATTER_OGER_BEATBOX, new Item.Properties().stacksTo(1), 7480));

    public static final RegistryObject<Item> RHINO_SPANW_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static final RegistryObject<Item> BLUE_DRAGON_SPAWN_EGG = ITEMS.register("blue_dragon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BLUE_DRAGON, 0x1e90ff, 0x00008b, new Item.Properties())); //, new Properties().tab(CreativeModeTabs.SPAWN_EGGS)));

    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PINE_BOAT = ITEMS.register("pine_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.PINE, new Item.Properties()));
    public static final RegistryObject<Item> PINE_CHEST_BOAT = ITEMS.register("pine_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.PINE, new Item.Properties()));

    public static final RegistryObject<Item> E = ITEMS.register("e",
            () -> new EggItem(new Item.Properties()));
    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static final RegistryObject<Item> KOSLING_IGNITER = ITEMS.register("kosling_dimension",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> KOSLING = ITEMS.register("kosling",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JATTEROGERBEATBOXEDITION = ITEMS.register("jatter_oger_beatbox_edition",
            () -> new RecordItem(6, ModSounds.JATTEROGERBEATBOXEDITION, new Item.Properties().stacksTo(1), 5880));

    public static final RegistryObject<Item> AOFY = ITEMS.register("aofy",
            () -> new RecordItem(6, ModSounds.AOFY, new Item.Properties().stacksTo(1), 5600));

    public static final RegistryObject<Item> FORTYUKON = ITEMS.register("fortyukon",
            () -> new RecordItem(6, ModSounds.FORTYUKONINTRO, new Item.Properties().stacksTo(1), 100));
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry",
//            () -> new CoalItem(new Item.Properties()));
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COALPICKAXE = ITEMS.register("coalpickaxe",
//            () -> new CoalpickaxeItem(new Item.Properties())); pText: Coal can burn.
            () -> new PickaxeItem(ModToolTiers.COAL, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> CHEESE_BUCKET = ITEMS.register("cheese_bucket",
//          () -> new Item(new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE)));
             () -> new BucketItem(() -> ModFluids.CHEESE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
//        ModFluids.CHEESE, Kosling = Cheese with Butter

    public static final RegistryObject<Item> CHEESEITEM = ITEMS.register("cheeseitem",
            () -> new Item(new Item.Properties()
//                    .tab(CreativeModeTabs.FOOD_AND_DRINKS)
                    .food(new FoodProperties.Builder()
                            .nutrition(4) // The amount of hunger restored
                            .saturationMod(0.6f) // The amount of saturation restored
                            .build())));

    public static final RegistryObject<Item> CHEESE_CAKE = ITEMS.register("cheese_cake", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(14).saturationMod(0.6F).build())));

    public static final RegistryObject<Item> SWEDEN_CAKE = ITEMS.register("sweden_cake", () ->
            new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(0.8F).build())));

    public static final RegistryObject<Item> WATER_BOTTLE = ITEMS.register("water_bottle",
            () -> new DrinkItem(new Item.Properties()
//            () -> new ThirstDrinkItem(new Item.Properties()
//                    .tab(CreativeModeTabs.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(0).saturationMod(0.0F).alwaysEat().build())));//, 5));

    public static final RegistryObject<Item> MILK_CARTON = ITEMS.register("milk_carton",
            () -> new DrinkItem(new Item.Properties()
//            () -> new ThirstDrinkItem(new Item.Properties()
//                    .tab(CreativeModeTabs.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(0).saturationMod(0.0F).alwaysEat().build())));//, 8));

    public static final RegistryObject<Item> EGGNOG_CARTON = ITEMS.register("eggnog_carton",
            () -> new DrinkItem(new Item.Properties()
//            () -> new ThirstDrinkItem(new Item.Properties()
//                    .tab(CreativeModeTabs.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(0).saturationMod(0.0F).alwaysEat().build())));//, 10));

    public static final RegistryObject<Item> ROCKET = ITEMS.register("rocket",
            () -> new Item(new Item.Properties() {
//                    .tab(CreativeModeTabs.TAB_MISC)) {
                public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
                    if (!world.isClientSide) {
                        ItemStack stack = player.getItemInHand(hand);
                        // Place the rocket entity
                        RocketEntity rocket = new RocketEntity(ModEntities.ROCKET_ENTITY.get(), world);
                        rocket.setPos(player.getX(), player.getY() + 1, player.getZ());
                        world.addFreshEntity(rocket);
                        if (!player.isCreative()) {
                            stack.shrink(1);
                        }
                    }
                    return InteractionResultHolder.success(player.getItemInHand(hand));
                }

                public UseAnim getUseAnimation(ItemStack stack) {
                    return UseAnim.BOW;
                }
            }));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
