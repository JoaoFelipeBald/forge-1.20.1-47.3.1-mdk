package net.oiariano.tutorialmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oiariano.tutorialmod.effect.ModEffects;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;
import net.oiariano.tutorialmod.item.ModItems;

import java.util.ArrayList;
import java.util.Collections;

@Mod.EventBusSubscriber(modid = "tutorialmod", value = Dist.CLIENT)
public class PlayerTickHandler {
    private static int jumps = 0;
    private static boolean canReallyDoubleJump = true;
    private static boolean wasReallyJumping = false;

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level world = player.level();
        if (world.isClientSide()){
            boolean hasNightEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), player) > 0;
            Boolean isNight = Minecraft.getInstance().player.getPersistentData().getBoolean("night_active");
            if (hasNightEnchantment) {
                if(isNight){
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, false, false, false));
                }
                else{player.removeEffect(MobEffects.NIGHT_VISION);}


            }
            int nivelSigel=verificarArmadura(player);
//            if(!player.getPersistentData().contains("velocidade")){
//                player.getPersistentData().putInt("velocidade",0);
//            }
//            int velocidadeAtual= player.getPersistentData().getInt("velocidade");
//            if(velocidadeAtual<0){velocidadeAtual=0;}
//            if(velocidadeAtual>nivelSigel){velocidadeAtual=nivelSigel;}
//            player.getPersistentData().putInt("velocidade",velocidadeAtual);
//            player.sendSystemMessage(Component.literal("A"+String.valueOf(velocidadeAtual)));
            if(nivelSigel==0){
                player.removeEffect(ModEffects.BENCAO_HELIOS.get());
            }
        }
        if (!world.isClientSide()) {

            // Night Vision Enchantment
//            boolean hasNightEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), player) > 0;
//            if (hasNightEnchantment) {
//                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0, false, false));
            //}
        } else if (Minecraft.getInstance().options.keyJump.isDown()) { // Only execute on the client side

            boolean hasJumpEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.JUMP_ENCHANTMENT.get(), player) > 0;
            int jumpLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.JUMP_ENCHANTMENT.get(), player);

            if (hasJumpEnchantment && (player.onGround() || player.isInWaterOrBubble())) {
                jumps = 0;
                canReallyDoubleJump = true;
                wasReallyJumping = false;
            }

            if (!wasReallyJumping && canReallyDoubleJump && jumps < jumpLevel+1) {
                // Calculate the direction the player is looking
                if (jumps > 0) {
                    if (!player.getPersistentData().contains("speed_active")) {
                        player.getPersistentData().putBoolean("speed_active", true);
                    }
                    Boolean isActive = Minecraft.getInstance().player.getPersistentData().getBoolean("speed_active");
                    Vec3 lookVec = player.getLookAngle();
                    double pushX = lookVec.x * 1* 0.2*(jumpLevel); // Adjust push strength as needed
                    double pushY = lookVec.y * 3* 0.2*(jumpLevel); // Adjust push strength as needed
                    double pushZ = lookVec.z * 1* 0.2*(jumpLevel); // Adjust push strength as needed
                    if(!isActive){pushX = lookVec.x * 1* 0.2*(4);pushY = lookVec.y * 3* 0.2*(4);pushZ = lookVec.z * 1* 0.2*(4);}
                    player.setDeltaMovement(pushX , pushY , pushZ );
                } else {
                    player.setDeltaMovement(player.getDeltaMovement().x * 0.7, 0.7, player.getDeltaMovement().z * 0.7);
                }

                jumps++;
                if (jumps >= ((jumpLevel+1)/5)+2) {
                    canReallyDoubleJump = false;
                }
            }
            wasReallyJumping = true;
        } else {
            wasReallyJumping = false;
        }
    }
    public static void printCompoundTag(CompoundTag compound) {
        if (compound != null) {
            System.out.println("CompoundTag contents: " + compound.toString());
        } else {
            System.out.println("CompoundTag is null!");
        }
    }
    public static int verificarArmadura(Player player){
        ArrayList<Item> sigel1= new ArrayList<>();
        ArrayList<Item> sigel2= new ArrayList<>();
        ArrayList<Item> sigel3= new ArrayList<>();
        ArrayList<Item> sigel4= new ArrayList<>();
        ArrayList<ArrayList<Item>> completo = new ArrayList<>();
        Collections.addAll(sigel1, ModItems.SIGEL1_BOOTS.get(), ModItems.SIGEL1_LEGGINGS.get(), ModItems.SIGEL1_CHESTPLATE.get(), ModItems.SIGEL1_HELMET.get());
        Collections.addAll(sigel2, ModItems.SIGEL2_BOOTS.get(), ModItems.SIGEL2_LEGGINGS.get(), ModItems.SIGEL2_CHESTPLATE.get(), ModItems.SIGEL2_HELMET.get());
        Collections.addAll(sigel3, ModItems.SIGEL3_BOOTS.get(), ModItems.SIGEL3_LEGGINGS.get(), ModItems.SIGEL3_CHESTPLATE.get(), ModItems.SIGEL3_HELMET.get());
        Collections.addAll(sigel4, ModItems.SIGEL4_BOOTS.get(), ModItems.SIGEL4_LEGGINGS.get(), ModItems.SIGEL4_CHESTPLATE.get(), ModItems.SIGEL4_HELMET.get());
        Collections.addAll(completo, sigel1,sigel2,sigel3,sigel4);
        assert Minecraft.getInstance().player != null;
        int count=0;
        int count2=0;
        int correto=0;
        boolean continuar=true;
        Iterable<ItemStack> stackArmorsPlayer = Minecraft.getInstance().player.getArmorSlots();
        ArrayList<Item> armorsPlayer=new ArrayList<>();
        for(ItemStack iterando:stackArmorsPlayer){
            armorsPlayer.add(iterando.getItem());
        }
        for(ArrayList<Item> sigelAtual: completo){
            count2++;
            correto=0;
            for(Item armor: sigelAtual) {
//                Minecraft.getInstance().player.sendSystemMessage(Component.literal("b"+armor.getDescriptionId()+"atual"+armorsPlayer.get(count%4).getDescriptionId()));
                if (armorsPlayer.get(count%4) == armor) {
                    correto++;
  //                  Minecraft.getInstance().player.sendSystemMessage(Component.literal("CORRETO"+correto));
                }
                count++;
                //         Minecraft.getInstance().player.sendSystemMessage(Component.literal("Número de corretos"+String.valueOf(correto)));

                //     if(correto==3){Minecraft.getInstance().player.sendSystemMessage(Component.literal("resultado"+String.valueOf(count2)));}
            }
            if(correto==4){
//                Minecraft.getInstance().player.sendSystemMessage(Component.literal("DEU CERTO "+count2));
                return count2;
            }
        }
        return 0;
    }
}
