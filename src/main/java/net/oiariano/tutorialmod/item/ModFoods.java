package net.oiariano.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ACCEL = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200, 2), 1f).build();
    public static final FoodProperties CORVIVA = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION,200, 2), 1f).build();
    public static final FoodProperties ESTELARIS = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,200, 2), 1f).build();
    public static final FoodProperties DINAMITA = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,200, 2), 1f).build();
    public static final FoodProperties MIRACULA = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,200, 2), 1f).build();
}