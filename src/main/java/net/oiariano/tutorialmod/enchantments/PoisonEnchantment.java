package net.oiariano.tutorialmod.enchantments;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class PoisonEnchantment extends Enchantment {
    public PoisonEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            LivingEntity target = (LivingEntity) pTarget;
            int duration = 40 + (20 * pLevel);
            int amplifier = pLevel;
            target.addEffect(new MobEffectInstance(MobEffects.POISON, duration, amplifier));

            super.doPostAttack(pAttacker, pTarget, pLevel);
        }
    }

    @Override
    public int getMaxLevel() {
        return 999;
    }
    public boolean isAllowedOnBooks() {
        return true;
    }
    public boolean isDiscoverable() {
        return false;
    }
    public boolean isTreasureOnly() {
        return true;
    }
    public boolean isTradeable() {
        return false;
    }

}