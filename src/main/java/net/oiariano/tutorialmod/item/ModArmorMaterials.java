package net.oiariano.tutorialmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;
import net.oiariano.tutorialmod.TutorialMod;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    // Existing armor materials
    MANI("mani", 25, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f, () -> Ingredient.of(ModItems.MANI.get())),
    SAPPHIRE("sapphire", 33, new int[]{3, 8, 6, 3}, 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0f, 0.1f, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
    MINAS("minas", 30, new int[]{4, 7, 6, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.05f, () -> Ingredient.of(ModItems.SIGEL.get())),
    SIGEL1("sigel1", 30, new int[]{4, 7, 6, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.05f, () -> Ingredient.of(ModItems.SIGEL.get())),
    SIGEL2("sigel2", 30, new int[]{4, 7, 6, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.05f, () -> Ingredient.of(ModItems.SIGEL.get())),
    SIGEL3("sigel3", 30, new int[]{4, 7, 6, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.05f, () -> Ingredient.of(ModItems.SIGEL.get())),
    SIGEL4("sigel4", 30, new int[]{4, 7, 6, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.05f, () -> Ingredient.of(ModItems.SIGEL.get()));




    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TutorialMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
