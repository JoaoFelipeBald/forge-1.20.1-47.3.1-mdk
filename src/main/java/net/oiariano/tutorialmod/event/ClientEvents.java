package net.oiariano.tutorialmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.util.KeyBinding;

import java.util.ArrayList;
import java.util.Collections;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.SPEED_KEY.consumeClick()) {
//                try {
//                    if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//                        Boolean isActive = Minecraft.getInstance().player.getPersistentData().getBoolean("speed_active");
//                        Minecraft.getInstance().player.getPersistentData().putBoolean("speed_active", !isActive);
//                        Minecraft.getInstance().player.sendSystemMessage(Component.literal("c"+Minecraft.getInstance().player.getPersistentData().getBoolean("speed_active")));
//                    } else {
//                        System.out.println("Instancia ou player sao nulos.");
//                    }
//                } catch (NullPointerException e) {
//                    if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
//
//                        Minecraft.getInstance().player.getPersistentData().putBoolean("speed_active", true);
//                        Boolean isActive = Minecraft.getInstance().player.getPersistentData().getBoolean("speed_active");
//                        Minecraft.getInstance().player.getPersistentData().putBoolean("speed_active", isActive);
//                    } else {
//                        System.out.println("Minecraft e nulo e nullpointer.");
//                    }
//                }

            }

            if(KeyBinding.NIGHT_KEY.consumeClick()) {
            //    Minecraft.getInstance().player.sendSystemMessage(Component.literal("Pressed a Key! Night"));
                try {
                    Boolean isActive = Minecraft.getInstance().player.getPersistentData().getBoolean("night_active");
                    Minecraft.getInstance().player.getPersistentData().putBoolean("night_active", !isActive);
                } catch (NullPointerException e) {
                    Minecraft.getInstance().player.getPersistentData().putBoolean("night_active", true);
                    Boolean isActive = Minecraft.getInstance().player.getPersistentData().getBoolean("night_active");
                    Minecraft.getInstance().player.getPersistentData().putBoolean("night_active", isActive);
                }
            }
            if(KeyBinding.CHANGE_MINUS_KEY.consumeClick()) {
                if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
                    CompoundTag playerData = Minecraft.getInstance().player.getPersistentData();
                    if(!playerData.contains("velocidade")){
                        playerData.putInt("velocidade", 1);
                    }
                    if (!playerData.contains("velocidade", CompoundTag.TAG_INT)) {
                        playerData.putInt("velocidade", 1);
                    }
                    int speed = playerData.getInt("velocidade")-1;
                    playerData.putInt("velocidade",speed);
                }

            }
            if(KeyBinding.CHANGE_PLUS_KEY.consumeClick()) {
                if (Minecraft.getInstance() != null && Minecraft.getInstance().player != null) {
                    CompoundTag playerData = Minecraft.getInstance().player.getPersistentData();
                    if (!playerData.contains("velocidade")) {
                        playerData.putInt("velocidade", 1);
                    }
                    if (!playerData.contains("velocidade", CompoundTag.TAG_INT)) {
                        playerData.putInt("velocidade", 1);
                    }
                    int speed = playerData.getInt("velocidade") + 1;
                    playerData.putInt("velocidade", speed);
                    Player player = Minecraft.getInstance().player;
                    int nivelSigel=verificarArmadura(player);
                    if (!player.getPersistentData().contains("velocidade")) {
                        player.getPersistentData().putInt("velocidade", 0);
                    }
                    int velocidadeAtual = player.getPersistentData().getInt("velocidade");
                    if (velocidadeAtual < 0) {
                        velocidadeAtual = 0;
                    }
                    if (velocidadeAtual > (nivelSigel + 1) * 3) {
                        velocidadeAtual = (nivelSigel + 1) * 3;
                    }
                    player.getPersistentData().putInt("velocidade", velocidadeAtual);
                    player.sendSystemMessage(Component.literal("A" + String.valueOf(velocidadeAtual)));
                    if (nivelSigel != 0 && !player.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, velocidadeAtual));
                    }
//                if(!Minecraft.getInstance().player.hasEffect(MobEffects.MOVEMENT_SPEED)){
//                    Minecraft.getInstance().player.removeEffect(MobEffects.MOVEMENT_SPEED);
//                }
                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.SPEED_KEY);
            event.register(KeyBinding.NIGHT_KEY);
            event.register(KeyBinding.CHANGE_MINUS_KEY);
            event.register(KeyBinding.CHANGE_PLUS_KEY);
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

