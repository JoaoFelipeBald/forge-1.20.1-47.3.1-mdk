package net.oiariano.tutorialmod.enchantments;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ReaperEnchantment extends Enchantment {
    public ReaperEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
    super(pRarity, pCategory, pApplicableSlots);
        }

@Override
public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
    if (!pAttacker.level().isClientSide() && pTarget instanceof LivingEntity && !(pTarget instanceof Player)) {
        LivingEntity target1 = (LivingEntity) pTarget;
        if(target1.getAttributeValue(Attributes.MAX_HEALTH)<101){
            double currentHealth = target1.getHealth();
            double maxHealth = target1.getMaxHealth();
            double healthRatio = currentHealth / maxHealth;
            double killChance = (1 - healthRatio) * 0.25 * Math.pow(pLevel,2);

            if (pAttacker.getRandom().nextDouble() < killChance) {
                target1.kill();
            }
        }
    }

        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

@Override
public int getMaxLevel() {
    return 5;
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