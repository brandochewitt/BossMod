package net.rajbrad.epicbossmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rajbrad.epicbossmod.EpicBossMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicBossMod.MODID);

    public static void register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }

    //DECLARING ITEMS:

    public static final RegistryObject<Item> TROLLFACE = ITEMS.register("trollface",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.EPICBOSS_TAB)));

    public static final RegistryObject<Item> RAW_TROLLFACE = ITEMS.register("raw_trollface",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.EPICBOSS_TAB)));

    public static final RegistryObject<Item> LITTLE_JERMA = ITEMS.register("little_jerma",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.EPICBOSS_TAB)));







    //ITEMS END.


}
