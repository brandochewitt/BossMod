package net.rajbrad.epicbossmod.event;


import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rajbrad.epicbossmod.EpicBossMod;
import net.rajbrad.epicbossmod.entity.ModEntityTypes;
import net.rajbrad.epicbossmod.entity.custom.JermaGolemEntity;

@Mod.EventBusSubscriber(modid = EpicBossMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.JERMA_GOLEM.get(), JermaGolemEntity.setAttributes());
    }

}
