package net.rajbrad.epicbossmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rajbrad.epicbossmod.EpicBossMod;

import net.rajbrad.epicbossmod.util.ModKeyBindings;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = EpicBossMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        public static int cooldown = 0;
        @SubscribeEvent
        public static void onKeyInput(MovementInputUpdateEvent event) {
            Player player = event.getEntity();
            if(event.getInput().up == true && event.getInput().left == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()){
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3((viewVector.x())*(Math.cos(-45))-(viewVector.z())*(Math.sin(-45)),
                        0.3f,(viewVector.x())*(Math.sin(-45))+(viewVector.z()*Math.cos(-45)));
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if(event.getInput().up == true && event.getInput().right == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3((viewVector.x()) * (Math.cos(45)) - (viewVector.z()) * (Math.sin(45)),
                        0.3f, (viewVector.x()) * (Math.sin(45)) + (viewVector.z() * Math.cos(45)));
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if(event.getInput().down == true && event.getInput().left == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(-((viewVector.x()) * (Math.cos(45)) - (viewVector.z()) * (Math.sin(45))),
                        0.3f, -((viewVector.x()) * (Math.sin(45)) + (viewVector.z() * Math.cos(45))));
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if(event.getInput().down == true && event.getInput().right == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(-((viewVector.x()) * (Math.cos(-45)) - (viewVector.z()) * (Math.sin(-45))),
                        0.3f, -((viewVector.x()) * (Math.sin(-45)) + (viewVector.z() * Math.cos(-45))));
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if (event.getInput().up == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(viewVector.x(), 0.3f, viewVector.z());
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if (event.getInput().down == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(-viewVector.x(), 0.3f, -viewVector.z());
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if (event.getInput().left == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(viewVector.z(), 0.3f, -viewVector.x());
                player.setDeltaMovement(dash);
                cooldown = 40;
            }else if (event.getInput().right == true && cooldown ==0 && ModKeyBindings.DASH_KEY.isDown()) {
                Vec3 viewVector = player.getViewVector(1);
                Vec3 dash = new Vec3(-viewVector.z(), 0.3f, viewVector.x());
                player.setDeltaMovement(dash);
                cooldown = 40;
            }
        }
        @SubscribeEvent
        public static void tick(TickEvent.ClientTickEvent event){
            if (cooldown>1){
                --cooldown;
            }else if(cooldown>0){
                Minecraft minecraft = Minecraft.getInstance();
                if ((minecraft.player ==null)){
                    return;
                }
                minecraft.player.playSound(SoundEvents.GLASS_BREAK, 1.0F, 2.0F);
                --cooldown;
            }
        }
    }

    @Mod.EventBusSubscriber(modid = EpicBossMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(ModKeyBindings.DASH_KEY);
        }
    }

}
