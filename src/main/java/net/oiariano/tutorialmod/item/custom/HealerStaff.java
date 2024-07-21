package net.oiariano.tutorialmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.oiariano.tutorialmod.effect.ModEffects;
import net.oiariano.tutorialmod.entity.custom.HealProjectile;
import net.oiariano.tutorialmod.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class HealerStaff extends Item {
    int amp;
    public HealerStaff(Properties pProperties, int amp) {
        super(pProperties);
        this.amp=amp;
    }

    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if (!level.isClientSide()) {
            Player player = pContext.getPlayer();
            if (player != null) {
                    throwSnowball(level, player);
                    // Danificar o item
                    pContext.getItemInHand().hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
                    return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            if(!player.hasEffect(ModEffects.COOLDOWN.get())){
                player.addEffect(new MobEffectInstance(ModEffects.COOLDOWN.get(),20,1));
                ItemStack itemStack = player.getItemInHand(hand);
                throwSnowball(level, player);
            // Damage the item
                itemStack.hurtAndBreak(0, player, p -> p.broadcastBreakEvent(hand));
                return InteractionResultHolder.success(itemStack);
            }
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

    private void throwSnowball(Level level, Player player) {
        HealProjectile healProjectile = new HealProjectile(level, player, amp);
       healProjectile.setItem(new ItemStack(ModItems.HEAL.get()));  // Defina o item como uma bola de neve

        // Defina a posição inicial da bola de neve
        healProjectile.setPos(player.getX(), player.getEyeY() - (double) 0.1F, player.getZ());

        // Defina a direção da bola de neve (na direção que o jogador está olhando)
        healProjectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 4F, 1.0F);

        // Adicione a bola de neve ao nível
        level.addFreshEntity(healProjectile);

        // Tocar um som quando a bola de neve for lançada
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BLAZE_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.metal_detector.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
//versão antiga
//    private boolean isValuableBlock(BlockState state) {
//        return state.is(Blocks.IRON_ORE) || state.is(Blocks.DIAMOND_ORE);
//    }