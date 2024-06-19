package net.oiariano.tutorialmod.enchantments;


import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TutorialMod.MOD_ID);

    private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    public static RegistryObject<Enchantment> FIRE_PROTECTION_2 =
            ENCHANTMENTS.register("fire_protection_2",
                    () -> new CustomProtectionEnchantment(Enchantment.Rarity.UNCOMMON, CustomProtectionEnchantment.Type.FIRE, ARMOR_SLOTS));

    public static RegistryObject<Enchantment> FALL_PROTECTION2 =
            ENCHANTMENTS.register("fall_protection_2",
                    () -> new CustomProtectionEnchantment(Enchantment.Rarity.UNCOMMON, CustomProtectionEnchantment.Type.FALL, EquipmentSlot.FEET));

    public static RegistryObject<Enchantment> PROJECTILE_PROTECTION2 =
            ENCHANTMENTS.register("projectile_protection_2",
                    () -> new CustomProtectionEnchantment(Enchantment.Rarity.UNCOMMON, CustomProtectionEnchantment.Type.PROJECTILE, ARMOR_SLOTS));

    public static RegistryObject<Enchantment> POISON_ENCHANTMENT =
            ENCHANTMENTS.register("poison_enchantment",
                    () -> new PoisonEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> FREEZE_ENCHANTMENT =
            ENCHANTMENTS.register("freeze_enchantment",
                    () -> new PoisonEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> REAPER_ENCHANTMENT =
            ENCHANTMENTS.register("reaper_enchantment",
                    () -> new ReaperEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> NIGHT_VISION_ENCHANTMENT =
            ENCHANTMENTS.register("night_vision_enchantment",
                    () -> new NightVisionEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.ARMOR, EquipmentSlot.HEAD));
    public static RegistryObject<Enchantment> SILENT_ENCHANTMENT =
            ENCHANTMENTS.register("silent_enchantment",
                    () -> new SilentEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.ARMOR, EquipmentSlot.FEET));
    public static RegistryObject<Enchantment> SACRED_ENCHANTMENT =
            ENCHANTMENTS.register("sacred_enchantment",
                    () -> new SacredEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}

