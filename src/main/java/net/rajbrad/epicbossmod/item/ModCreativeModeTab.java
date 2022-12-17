package net.rajbrad.epicbossmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.rajbrad.epicbossmod.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab EPICBOSS_TAB = new CreativeModeTab("epicbosstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JERMA_BLOCK.get());
        }
    };
}
