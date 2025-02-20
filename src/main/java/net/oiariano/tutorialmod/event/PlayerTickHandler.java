package net.oiariano.tutorialmod.event;

import dev.kosmx.playerAnim.api.AnimUtils;
import dev.kosmx.playerAnim.api.layered.*;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.Attributes;
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
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.effect.ModEffects;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.item.custom.MercyStaff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Mod.EventBusSubscriber(modid = "tutorialmod", value = Dist.CLIENT)
public class PlayerTickHandler {
    private static int jumps = 0;
    private static boolean canReallyDoubleJump = true;
    private static boolean wasReallyJumping = false;
    private static ItemStack previousMainHandItem = ItemStack.EMPTY;
    static KeyframeAnimationPlayer animationPlayer = null;

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level world = player.level();

        if (world.isClientSide()){
            AnimationStack animationStack = PlayerAnimationAccess.getPlayerAnimLayer((AbstractClientPlayer) player);

            if (event.phase == TickEvent.Phase.END) {
                ItemStack currentMainHandItem = player.getMainHandItem();
                KeyframeAnimation animation = PlayerAnimationRegistry.getAnimation(new ResourceLocation(TutorialMod.MOD_ID, "mercy"));

                if (currentMainHandItem.getItem() instanceof MercyStaff && ((animationPlayer != null && animationPlayer.getCurrentTick() > 35) || !(previousMainHandItem.getItem() instanceof MercyStaff))) {
                    animationPlayer = new KeyframeAnimationPlayer(animation);
                    animationStack.addAnimLayer(3, animationPlayer);
                } else if (!(currentMainHandItem.getItem() instanceof MercyStaff) && (previousMainHandItem.getItem() instanceof MercyStaff)){
                    animationPlayer.stop();
                }

                previousMainHandItem = currentMainHandItem;
            }
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
            int level=0;
            try {
                if (world.isClientSide && player != null) {
                    Collection<MobEffectInstance> efeitos = player.getActiveEffects();
//                            player.sendSystemMessage(Component.literal(efeitos.toString()));
                    for(MobEffectInstance efeito : efeitos){
                        if(efeito.getEffect()==ModEffects.BENCAO_HELIOS.get()){
                            level=efeito.getAmplifier();
                        }
                    }
                }
            } finally {
            }
 //           player.sendSystemMessage(Component.literal("level "+level));
            if(level>0&&nivelSigel!=0) {
                player.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1f+0.04*level);
                player.removeEffect(MobEffects.MOVEMENT_SPEED);
            }
//            player.getAttribute(Attributes.LUCK).setBaseValue(2);
 //           player.sendSystemMessage(Component.literal("a"+player.getAttribute(Attributes.LUCK).getBaseValue()));



        }
        if (!world.isClientSide()) {

            // Night Vision Enchantment
//            boolean hasNightEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), player) > 0;
//            if (hasNightEnchantment) {
//                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0, false, false));
            //}
        } else if (Minecraft.getInstance().options.keyJump.isDown()) { // Only execute on the client side
            int nivelSigel=verificarArmadura(player);
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
                if (jumps >= (nivelSigel)+2) {
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
              if (armorsPlayer.get(count%4) == armor) {
                    correto++;
             }
                count++;
                   }
            if(correto==4){
                return count2;
            }
        }
        return 0;
    }
}
