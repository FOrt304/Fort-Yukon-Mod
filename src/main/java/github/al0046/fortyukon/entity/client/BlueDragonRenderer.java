package github.al0046.fortyukon.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import github.al0046.fortyukon.FortYukon;
import github.al0046.fortyukon.entity.custom.BlueDragonEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlueDragonRenderer extends MobRenderer<BlueDragonEntity, blue_dragon<BlueDragonEntity>> {
    public BlueDragonRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new blue_dragon<>(pContext.bakeLayer(ModModelLayers.BLUE_DRAGON_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BlueDragonEntity pEntity) {
        return new ResourceLocation(FortYukon.MOD_ID, "textures/entity/blue_dragon.png");
    }

    @Override
    public void render(BlueDragonEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
