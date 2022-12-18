package net.rajbrad.epicbossmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.rajbrad.epicbossmod.EpicBossMod;
import net.rajbrad.epicbossmod.entity.custom.JermaGolemEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JermaGolemModel extends AnimatedGeoModel<JermaGolemEntity> {
    @Override
    public ResourceLocation getModelResource(JermaGolemEntity object) {
        return new ResourceLocation(EpicBossMod.MODID, "geo/jerma_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JermaGolemEntity object) {
        return new ResourceLocation(EpicBossMod.MODID, "textures/entity/jerma_golem/jerma_golem.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JermaGolemEntity animatable) {
        return new ResourceLocation(EpicBossMod.MODID, "animations/jerma_model.animation.json");
    }
}
