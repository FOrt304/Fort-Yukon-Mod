package github.al0046.fortyukon.entity;

import github.al0046.fortyukon.entity.custom.*;
import github.al0046.fortyukon.FortYukon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static github.al0046.fortyukon.FortYukon.MOD_ID;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FortYukon.MOD_ID);

    public static final RegistryObject<EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register("rhino", () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("rhino"));

    public static final RegistryObject<EntityType<BlueDragonEntity>> BLUE_DRAGON =
            ENTITY_TYPES.register("blue_dragon", () -> EntityType.Builder.of(BlueDragonEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 2.0f).build("bluedragon"));
//    public static final RegistryObject<EntityType<BlueDragonEntity>> BLUE_DRAGON = ENTITY_TYPES.register("blue_dragon",
//            () -> EntityType.Builder.<BlueDragonEntity>of(BlueDragonEntity::new, MobCategory.MONSTER)
//                    .sized(1.0F, 2.0F)
//                    .build(new ResourceLocation(TutorialMod.MOD_ID, "blue_dragon").toString()));

    public static final RegistryObject<EntityType<HappyOgerdayVillager>> HAPPY_OGERDAY_VILLAGER =
            ENTITY_TYPES.register("happy_ogerday_villager", () -> EntityType.Builder.of(HappyOgerdayVillager::new, MobCategory.MISC)
                            .sized(0.6F, 1.95F)
                            .build("happy_ogerday_villager")); //(new ResourceLocation
//                        .setRegistryName(new ResourceLocation(MOD_ID, "happy_ogerday_villager"))

    public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));


    public static final RegistryObject<EntityType<DiceProjectileEntity>> DICE_PROJECTILE =
            ENTITY_TYPES.register("dice_projectile", () -> EntityType.Builder.<DiceProjectileEntity>of(DiceProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("dice_projectile"));


    public static final RegistryObject<EntityType<RocketEntity>> ROCKET_ENTITY = ENTITY_TYPES.register("rocket_entity",
            () -> EntityType.Builder.<RocketEntity>of(RocketEntity::new, MobCategory.MISC)
                    .sized(1.0F, 1.0F)
                    .build("rocket_entity"));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
