package net.rajbrad.epicbossmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rajbrad.epicbossmod.epicBossMod;
import net.rajbrad.epicbossmod.util.ModKeyBindings;

import javax.swing.text.JTextComponent;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = epicBossMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(ModKeyBindings.DASH_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Pressed a Key!"));
            }
        }
    }

    @Mod.EventBusSubscriber(modid = epicBossMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(ModKeyBindings.DASH_KEY);
        }
    }
}
