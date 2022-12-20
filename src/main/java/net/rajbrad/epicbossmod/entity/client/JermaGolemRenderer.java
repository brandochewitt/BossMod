package net.rajbrad.epicbossmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.rajbrad.epicbossmod.EpicBossMod;
import net.rajbrad.epicbossmod.entity.custom.JermaGolemEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JermaGolemRenderer extends GeoEntityRenderer<JermaGolemEntity> {
    public JermaGolemRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JermaGolemModel());
        this.shadowRadius = 0.65f;
    }

    @Override
    public ResourceLocation getTextureLocation(JermaGolemEntity instance) {
        return new ResourceLocation(EpicBossMod.MODID, "textures/entity/jerma_golem/jerma_golem.png");
    }

    @Override
    public RenderType getRenderType(JermaGolemEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.5F, 1.5F, 1.5F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
