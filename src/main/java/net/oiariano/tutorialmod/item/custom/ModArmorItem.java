package net.oiariano.tutorialmod.item.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.oiariano.tutorialmod.effect.ModEffects;
import net.oiariano.tutorialmod.item.ModArmorMaterials;
import net.oiariano.tutorialmod.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
                    .put(ModArmorMaterials.SAPPHIRE, ImmutableList.of(
                            new MobEffectInstance(MobEffects.HEAL, 2000, 1, false, false, false),
                            new MobEffectInstance(ModEffects.FREEZE.get(), 2000, 1, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)))
                    .put(ModArmorMaterials.SIGEL1, ImmutableList.of(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2000, 1, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)))
                    .put(ModArmorMaterials.SIGEL2, ImmutableList.of(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2000, 1, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)))
                    .put(ModArmorMaterials.SIGEL3, ImmutableList.of(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2000, 1, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)))
                    .put(ModArmorMaterials.SIGEL4, ImmutableList.of(
                            new MobEffectInstance(MobEffects.NIGHT_VISION, 2000, 1, false, false, false),
                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)))
                    .put(ModArmorMaterials.MANI, ImmutableList.of(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2000, 15, false, false, false),
                            new MobEffectInstance(MobEffects.LUCK, 2000, 20, false, false, false),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2000, 1, false, false, false)))
                    .build();
    private final String translationKey;

    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, String translationKey) {
        super(pMaterial, pType, pProperties);
        this.translationKey = translationKey;

    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (hasFullSuitOfArmorOn(player)) {
            if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL1_HELMET.get()) {
                player.setMaxUpStep(3F);
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL2_HELMET.get()) {
                player.setMaxUpStep(4F);
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL3_HELMET.get()) {
                player.setMaxUpStep(5F);
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL4_HELMET.get()) {
                player.setMaxUpStep(5F);
            }
            else {
                player.setMaxUpStep(0.6F);
            }

            if (!world.isClientSide()) {
                if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.ELMO_MINEIRO.get()){
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 20));
                    player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 400, 30));
                }
                evaluateArmorEffects(player);
            }
        } else {
            player.setMaxUpStep(0.6F);
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffects = entry.getValue();
            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                for (MobEffectInstance effect : mapStatusEffects) {
                    addStatusEffectForMaterial(player, mapArmorMaterial, effect);
                }
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if (hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.ELMO_MINEIRO.get()){
            return true;
        }
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        tooltipComponents.add(Component.translatable(translationKey));
        super.appendHoverText(stack, world, tooltipComponents, isAdvanced);
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem) player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem) player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}