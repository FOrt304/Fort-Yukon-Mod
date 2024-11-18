package github.al0046.fortyukon.event;

import github.al0046.fortyukon.entity.HappyOgerdayVillager;
import github.al0046.fortyukon.entity.ModEntities;
import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.entity.custom.BlueDragonEntity;
import github.al0046.fortyukon.entity.custom.RhinoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static github.al0046.fortyukon.FortYukon.MOD_ID;
import static github.al0046.fortyukon.item.ModItems.YUKOE;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
        event.put(ModEntities.BLUE_DRAGON.get(), BlueDragonEntity.createAttributes().build());
    }

//    @SubscribeEvent
//    public static void registerVillagerTrades(VillagerTradesEvent event) {
//        if (event.getType() == VillagerProfession.FARMER) {
//            List<VillagerTrades.ItemListing> trades = event.getTrades().get(1); // 1 is the level of the trade
//            trades.add((entity, random) -> new MerchantOffer(new ItemStack(YUKOE.get(), 1), new ItemStack(Items.FROG_SPAWN_EGG, 2), 10, 5, 0.02F));
            // Add more trades as needed
//        }
//    }
//    @ObjectHolder(MOD_ID + ":happy_ogerday_villager")
//    public static final EntityType<HappyOgerdayVillager> HAPPY_OGERDAY_VILLAGER = null;

//    @SubscribeEvent
//    public static void registerEntities(<EntityType<?>> event) {
//        event.getRegistry().register(
//                EntityType.Builder.<HappyOgerdayVillager>of(HappyOgerdayVillager::new, MobCategory.MISC)
//                        .sized(0.6F, 1.95F)
//                        .build(new ResourceLocation(MOD_ID, "happy_ogerday_villager").toString())
//                        .setRegistryName(new ResourceLocation(MOD_ID, "happy_ogerday_villager"))
//        );
//    }
}
