package net.oiariano.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ACCEL = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600, 1), 1f).build();
    public static final FoodProperties CORVIVA = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.REGENERATION,600, 0), 1f).build();
    public static final FoodProperties ESTELARIS = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,600, 2), 1f).build();
    public static final FoodProperties DINAMITA = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,600, 2), 1f).build();
    public static final FoodProperties MIRACULA = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,600, 2), 1f).build();
    public static final FoodProperties PIRARUCU = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.4f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,3000, 4), 1f).build();
    public static final FoodProperties ENERGY = new FoodProperties.Builder().nutrition(9).fast()
            .saturationMod(0.7f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,3000, 4), 1f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,3000, 1), 1f).build();
    public static final FoodProperties PAMONHA = new FoodProperties.Builder().nutrition(9).fast()
            .saturationMod(0.7f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,3000, 3), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,3000, 1), 1f).build();

}