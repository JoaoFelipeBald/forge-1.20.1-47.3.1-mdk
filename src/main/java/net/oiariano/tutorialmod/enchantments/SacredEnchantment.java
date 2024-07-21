package net.oiariano.tutorialmod.enchantments;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
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
            if (pTarget instanceof LivingEntity) {
                LivingEntity target = (LivingEntity) pTarget;
                if ((pTarget.getType().getCategory().equals(MobCategory.CREATURE) || (pTarget instanceof Player)) || pTarget.getType().getCategory().equals(MobCategory.MISC)) {
                    target.heal(target.getMaxHealth()*pLevel/10);
                    } else {
                    target.hurt(target.damageSources().generic(), 10+2*pLevel);
                    target.setSecondsOnFire(5);
                }
            }
            super.doPostAttack(pAttacker, pTarget, pLevel);
        }
    }

    @Override
    public int getMaxLevel() {
        return 2;
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