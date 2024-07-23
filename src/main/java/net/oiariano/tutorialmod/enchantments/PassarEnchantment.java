package net.oiariano.tutorialmod.enchantments;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.Level;

import java.util.Collection;

public class PassarEnchantment extends Enchantment {
    public PassarEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            LivingEntity target = (LivingEntity) pTarget;
            try {
                Level world = pAttacker.level();
                Collection<MobEffectInstance> efeitos = pAttacker.getActiveEffects();
//                  player.sendSystemMessage(Component.literal(efeitos.toString()));
                for(MobEffectInstance efeito : efeitos) {
                    if (efeito.getEffect().isBeneficial()) {
                        if(efeito.getEffect()== MobEffects.LUCK){
                            target.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999999, efeito.getAmplifier()));
                        }else {
                            target.addEffect(new MobEffectInstance(efeito.getEffect(), 999999, efeito.getAmplifier()));
                        }
                    }
                }
            }
             finally {
            }

            super.doPostAttack(pAttacker, pTarget, pLevel);
        }
    }

    @Override
    public int getMaxLevel() {
        return 10;
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

