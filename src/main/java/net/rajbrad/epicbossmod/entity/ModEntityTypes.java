package net.rajbrad.epicbossmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rajbrad.epicbossmod.EpicBossMod;
import net.rajbrad.epicbossmod.entity.custom.JermaGolemEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class ModEntityTypes{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EpicBossMod.MODID);

    public static void register(IEventBus modEventBus) {
        ENTITY_TYPES.register(modEventBus);
    }

    //Entity declaring:

    public static final RegistryObject<EntityType<JermaGolemEntity>> JERMA_GOLEM =
            ENTITY_TYPES.register("jerma_golem",
                    () -> EntityType.Builder.of(JermaGolemEntity::new, MobCategory.CREATURE)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(EpicBossMod.MODID, "jerma_golem").toString()));













    //Entities end.




}
