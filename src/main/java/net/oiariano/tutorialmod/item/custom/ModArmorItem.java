package net.oiariano.tutorialmod.item.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.oiariano.tutorialmod.item.ModArmorMaterials;
import net.oiariano.tutorialmod.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
//                    .put(ModArmorMaterials.SAPPHIRE, ImmutableList.of(
//                            new MobEffectInstance(MobEffects.HEAL, 2000, 1, false, false, false),
//                            new MobEffectInstance(ModEffects.FREEZE.get(), 2000, 1, false, false, false),
//                            new MobEffectInstance(MobEffects.WATER_BREATHING, 2000, 1, false, false, false)
//                    ))
//                    .put(ModArmorMaterials.SIGEL1, ImmutableList.of(
//                            new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1, false, false, false)
//                    ))
//                    .put(ModArmorMaterials.SIGEL2, ImmutableList.of(
//                            new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1, false, false, false)
//                    ))
//                    .put(ModArmorMaterials.SIGEL3, ImmutableList.of(
//                            new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1, false, false, false)
//                    ))
//                    .put(ModArmorMaterials.SIGEL4, ImmutableList.of(
//                            new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1, false, false, false)
//                    ))
                    .put(ModArmorMaterials.MANI, ImmutableList.of(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 15, false, false, false),
                            new MobEffectInstance(MobEffects.LUCK, 2000, 20, false, false, false),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2000, 1, false, false, false)))
                    .build();
    private final String translationKey;
    public int maxin=0;
    public ModArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties, String translationKey, int maxin) {
        super(pMaterial, pType, pProperties);
        this.translationKey = translationKey;
        this.maxin=maxin;

    }

    public int getMax(){
        return this.maxin;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (hasFullSuitOfArmorOn(player)) {
            BlockPos blockPosBelow = player.blockPosition().below();
            BlockState blockStateBelow = world.getBlockState(blockPosBelow);
//            int level = 0;
//            try {
//                if (world.isClientSide && player != null) {
//                    Collection<MobEffectInstance> efeitos = player.getActiveEffects();
////                            player.sendSystemMessage(Component.literal(efeitos.toString()));
////                    for(MobEffectInstance efeito : efeitos){
////                        if(efeito.getEffect()==ModEffects.BENCAO_HELIOS.get()){
////                            level=efeito.getAmplifier();
////                        }
////                    }
//                }
//            } finally {
//            }
//            if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                CompoundTag playerData = Minecraft.getInstance().player.getPersistentData();
//                if(!playerData.contains("velocidade")){
//                    playerData.putInt("velocidade", 1);
//                }
//                if (!playerData.contains("velocidade", CompoundTag.TAG_INT)) {
//                    playerData.putInt("velocidade", 1);
//                }
//            }
 //           int speed=0;
 //           try {
 //               if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
 //                   if(!Minecraft.getInstance().player.getPersistentData().contains("speed_current")){
 //                       Minecraft.getInstance().player.getPersistentData().putInt("speed_current", 0);
 //                   }
 //                   speed = Minecraft.getInstance().player.getPersistentData().getInt("speed_current");
 //               } else {
//                }
//            } catch (NullPointerException e) {
//                if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                    Minecraft.getInstance().player.getPersistentData().putInt("speed_current", 0);
//                } else {
//                }
//            }
//            if(speed<0){speed=0;}
////            if(speed>this.max){speed=this.max;}
//
         //   player.sendSystemMessage(Component.literal("d "+player.hasEffect(ModEffects.BENCAO_HELIOS.get())));
            if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL1_HELMET.get()) {
                player.fallDistance = 0.0F;
//                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 8, false, false, false));

//                try {
//                    if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                        int velocidade = Minecraft.getInstance().player.getPersistentData().getInt("velocidade");
//                        if (velocidade < 0) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", 0);
//                        }
//                        if (velocidade > this.maxin) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", this.maxin);
//                        }
//                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, velocidade));
//                    }
//                } finally {
//
//                }
//                try {
//                    addEffect(player, speed);
//                }
//                finally {
//
//                }
                if ((blockStateBelow.getBlock() == Blocks.WATER || blockStateBelow.getBlock() == Blocks.LAVA) && !player.isShiftKeyDown()) {
                    if (player.getDeltaMovement().y < 0) {
                        player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    }
//                    player.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 3));
 //                   player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    player.setOnGround(true);
//                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 18, false, false, false));
//                    player.setSprinting(true);
                }
//                else{player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 10, false, false, false));}
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL2_HELMET.get()) {
                player.setMaxUpStep(1.1F);
                player.fallDistance = 0.0F;
//                try {
//                    if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                        int velocidade = Minecraft.getInstance().player.getPersistentData().getInt("velocidade");
//                        if (velocidade < 0) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", 0);
//                        }
//                        if (velocidade > this.maxin) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", this.maxin);
//                        }
//                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, velocidade));
//                    }
//                } finally {
//
//                }
//                try {
//                    addEffect(player, speed);
//                }
 //               finally {}
                if ((blockStateBelow.getBlock() == Blocks.WATER|| blockStateBelow.getBlock() == Blocks.LAVA) && !player.isShiftKeyDown()) {
                    if(player.getDeltaMovement().y<0){
                        player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    }
//                    player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    player.setOnGround(true);
//                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,10, 18,false,false,false));
//                    player.setSprinting(true);
                }
//                else{player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, level, false, false, false));}
//                player.sendSystemMessage(Component.literal("a "+level));
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL3_HELMET.get()) {
                player.setMaxUpStep(2.2F);
                player.fallDistance = 0.0F;

//                if (!player.hasEffect(MobEffects.MOVEMENT_SPEED) && level > 0) {
//                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, level));
//                }
//                player.sendSystemMessage(Component.literal("a "+level));


                if ((blockStateBelow.getBlock() == Blocks.WATER|| blockStateBelow.getBlock() == Blocks.LAVA) && !player.isShiftKeyDown()) {
                    if(player.getDeltaMovement().y<0){
                        player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    }
                    player.setOnGround(true);
//                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,10, 18,false,false,false));
//                    player.setSprinting(true);
                }
//                else{player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, level, false, false, false));}
            }
            else if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.SIGEL4_HELMET.get()) {
                player.setMaxUpStep(3.3F);
                player.fallDistance = 0.0F;
  //              try {
//                    if (!world.isClientSide) {
//                        int level = 0;
//                        MobEffectInstance effectInstance = Minecraft.getInstance().player.getEffect(ModEffects.BENCAO_HELIOS.get());
//                        if (effectInstance != null) {
//                            level = effectInstance.getAmplifier();
//                        } else {
//                        }
//////            player.sendSystemMessage(Component.literal("nivel " + level));
//                        if (!player.hasEffect(MobEffects.MOVEMENT_SPEED) && level > 0) {
//                            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, level));
//                        }
//                    }


//                    }
//                }
//                finally {
//
//                }
//                try {
//                    if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                        int velocidade = Minecraft.getInstance().player.getPersistentData().getInt("velocidade");
//                        if (velocidade < 0) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", 0);
//                        }
//                        if (velocidade > this.maxin) {
//                            Minecraft.getInstance().player.getPersistentData().putInt("velocidade", this.maxin);
//                        }
//                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, velocidade));
//                    }
//                } finally {
//


                if ((blockStateBelow.getBlock() == Blocks.WATER|| blockStateBelow.getBlock() == Blocks.LAVA) && !player.isShiftKeyDown()) {
                    if(player.getDeltaMovement().y<0){
                        player.setDeltaMovement(player.getDeltaMovement().multiply(1, 0, 1));
                    }
                    player.setOnGround(true);
//                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,10, 18,false,false,false));
//                    player.setSprinting(true);
                }
//                else{player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, level, false, false, false));}
            }
            else {
                player.setMaxUpStep(0.6F);
            }

            if (!world.isClientSide()) {
                if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.ELMO_MINEIRO.get()){
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 4));
                    player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 400, 10));
                }
                if(hasFullSuitOfArmorOn(player)) {
 //                   evaluateArmorEffects(player);
//                    addEffect(player, level);
                }
//                try {
//                    addEffect(player, speed);
//                }
//                finally {}
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

//    private void addEffect(Player player){
//        if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//            Player p1 = Minecraft.getInstance().player;
//            if (p1.hasEffect(ModEffects.BENCAO_HELIOS.get())&&!p1.hasEffect(MobEffects.WITHER)) {
//                p1.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 10));
////                p1.sendSystemMessage(Component.literal("a"));
//            }
////        p1.sendSystemMessage(Component.literal(String.valueOf(player.hasEffect(MobEffects.MOVEMENT_SPEED))));
//        }
//    }

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
//    @OnlyIn(Dist.CLIENT)
//    private MobEffectInstance getEffect(Player player) {
//        return player.getEffect(ModEffects.BENCAO_HELIOS.get());
//    }
}