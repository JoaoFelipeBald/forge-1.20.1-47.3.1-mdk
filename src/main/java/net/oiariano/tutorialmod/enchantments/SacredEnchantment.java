package net.oiariano.tutorialmod.enchantments;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class SacredEnchantment extends Enchantment {
    public SacredEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            LivingEntity target = (LivingEntity) pTarget;
            if (target instanceof LivingEntity && (pTarget.getType().getCategory().equals(MobCategory.CREATURE) || (pTarget instanceof Player)) || pTarget.getType().getCategory().equals(MobCategory.MISC)){
                target.heal(10f);
                target.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2));
            }
            else{
                target.hurt(target.damageSources().generic(), 1);
                target.setSecondsOnFire(9);
            }
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