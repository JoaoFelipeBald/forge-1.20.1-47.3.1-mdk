package net.oiariano.tutorialmod.event;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;

@Mod.EventBusSubscriber(modid = "tutorialmod", value = Dist.CLIENT)
public class PlayerTickHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level world = player.level();

        if (!world.isClientSide()) {
            boolean hasNightEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), player) > 0;

            if (hasNightEnchantment) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 0, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 1, false, false));
            }
            boolean hasSilentEnchantment = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.SILENT_ENCHANTMENT.get(), player) > 0;

            if (hasSilentEnchantment) {
                player.isSilent();
            }
        }
    }
}