package github.al0046.fortyukon.entity.client;

import github.al0046.fortyukon.FortYukon;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER = new ModelLayerLocation(
            new ResourceLocation(FortYukon.MOD_ID, "rhino_layer"), "main");
    public static final ModelLayerLocation BLUE_DRAGON_LAYER = new ModelLayerLocation(
            new ResourceLocation(FortYukon.MOD_ID, "blue_dragon"), "main");
//(new ResourceLocation("fortyukon", "blue_dragon"), "main"); (TutorialMod.MOD_ID, "blue_dragon_layer"), "main");
    public static final ModelLayerLocation PINE_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(FortYukon.MOD_ID, "boat/pine"), "main");
    public static final ModelLayerLocation PINE_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(FortYukon.MOD_ID, "chest_boat/pine"), "main");

}
