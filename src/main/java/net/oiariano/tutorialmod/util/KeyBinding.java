package net.oiariano.tutorialmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_TUTORIAL = "key.category.tutorialmod.tutorial";
    public static final String KEY_ACTIVATE_NIGHT = "key.tutorialmod.activate_night_vision";
    public static final String KEY_ACTIVATE_SPEED = "key.tutorialmod.activate_speed";
    public static final String KEY_CHANGE_MINUS_SPEED = "key.tutorialmod.change_plus_speed";
    public static final String KEY_CHANGE_PLUS_SPEED = "key.tutorialmod.change_minus_speed";

    public static final KeyMapping NIGHT_KEY = new KeyMapping(KEY_ACTIVATE_NIGHT, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_TUTORIAL);
    public static final KeyMapping SPEED_KEY = new KeyMapping(KEY_ACTIVATE_SPEED, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_P, KEY_CATEGORY_TUTORIAL);
    public static final KeyMapping CHANGE_PLUS_KEY = new KeyMapping(KEY_CHANGE_PLUS_SPEED, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_END, KEY_CATEGORY_TUTORIAL);
    public static final KeyMapping CHANGE_MINUS_KEY = new KeyMapping(KEY_CHANGE_MINUS_SPEED, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_HOME, KEY_CATEGORY_TUTORIAL);
}