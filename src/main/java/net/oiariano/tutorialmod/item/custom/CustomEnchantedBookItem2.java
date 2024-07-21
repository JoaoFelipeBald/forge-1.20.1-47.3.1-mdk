package net.oiariano.tutorialmod.item.custom;

import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentInstance;

public class CustomEnchantedBookItem2 extends EnchantedBookItem {
    private final Rarity customRarity;

    public CustomEnchantedBookItem2(Rarity rarity, Item.Properties properties) {
        super(properties);
        this.customRarity = Rarity.RARE;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }

    public static ItemStack createForEnchantment(EnchantmentInstance enchantmentInstance, Rarity rarity) {
        ItemStack itemStack = new ItemStack(Items.ENCHANTED_BOOK);
        EnchantedBookItem.addEnchantment(itemStack, enchantmentInstance);
        return itemStack;
    }
}