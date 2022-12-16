package net.rajbrad.epicbossmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {
    public static final String KEY_CATEGORY_BASED = "key.category.epicbossmod.based";
    public static final String KEY_DASH = "key.epicbossmod.dash";

    public static final KeyMapping DASH_KEY = new KeyMapping(KEY_DASH, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_LEFT_ALT, KEY_CATEGORY_BASED);
}
