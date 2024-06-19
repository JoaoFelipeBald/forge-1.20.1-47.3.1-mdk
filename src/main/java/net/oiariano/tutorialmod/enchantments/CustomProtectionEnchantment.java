package net.oiariano.tutorialmod.enchantments;

import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.*;

public class CustomProtectionEnchantment extends Enchantment {
    public final net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type type;

    public CustomProtectionEnchantment(Enchantment.Rarity pRarity, CustomProtectionEnchantment.Type pType, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pType == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.FALL ? EnchantmentCategory.ARMOR_FEET : EnchantmentCategory.ARMOR, pApplicableSlots);
        this.type = pType;
    }

    /**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     */
    public int getMinCost(int pEnchantmentLevel) {
        return this.type.getMinCost() + (pEnchantmentLevel - 1) * this.type.getLevelCost();
    }

    public int getMaxCost(int pEnchantmentLevel) {
        return this.getMinCost(pEnchantmentLevel) + this.type.getLevelCost();
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel() {
        return 4;
    }

    /**
     * Calculates the damage protection of the enchantment based on level and damage source passed.
     * @param pLevel The level of the enchantment being used.
     * @param pSource The source of the damage.
     */
    public int getDamageProtection(int pLevel, DamageSource pSource) {
        if (pSource.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            return 0;
        } else if (this.type == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.ALL) {
            return pLevel;
        } else if (this.type == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.FIRE && pSource.is(DamageTypeTags.IS_FIRE)) {
            return pLevel * 2;
        } else if (this.type == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.FALL && pSource.is(DamageTypeTags.IS_FALL)) {
            return pLevel * 3;
        } else if (this.type == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.EXPLOSION && pSource.is(DamageTypeTags.IS_EXPLOSION)) {
            return pLevel * 2;
        } else {
            return this.type == net.oiariano.tutorialmod.enchantments.CustomProtectionEnchantment.Type.PROJECTILE && pSource.is(DamageTypeTags.IS_PROJECTILE) ? pLevel * 2 : 0;
        }
    }

    /**
     * Determines if the enchantment passed can be applied together with this enchantment.
     * @param pEnch The other enchantment to test compatibility with.
     */
    public boolean checkCompatibility(Enchantment pEnch) {
        if (pEnch instanceof ProtectionEnchantment protectionenchantment) {
            if (this.type.name() == protectionenchantment.type.name()) {
                return false;
            } else {
                return true;
            }
        }
        else if(pEnch instanceof CustomProtectionEnchantment customProtectionEnchantment){
            if (this.type == customProtectionEnchantment.type) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the amount of ticks an entity should be set fire, adjusted for fire protection.
     */
    public static int getFireAfterDampener(LivingEntity pLivingEntity, int pLevel) {
        int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.FIRE_PROTECTION, pLivingEntity);
        if (i > 0) {
            pLevel -= Mth.floor((float)pLevel * (float)i * 0.15F);
        }

        return pLevel;
    }

    public static double getExplosionKnockbackAfterDampener(LivingEntity pLivingEntity, double pDamage) {
        int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.BLAST_PROTECTION, pLivingEntity);
        if (i > 0) {
            pDamage *= Mth.clamp(1.0D - (double)i * 0.15D, 0.0D, 1.0D);
        }

        return pDamage;
    }

    public static enum Type {
        ALL(1, 11),
        FIRE(10, 8),
        FALL(5, 6),
        EXPLOSION(5, 8),
        PROJECTILE(3, 6);

        private final int minCost;
        private final int levelCost;

        private Type(int pMinCost, int pLevelCost) {
            this.minCost = pMinCost;
            this.levelCost = pLevelCost;
        }

        public int getMinCost() {
            return this.minCost;
        }

        public int getLevelCost() {
            return this.levelCost;
        }
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