package net.oiariano.tutorialmod.item.custom;

import com.google.common.collect.ImmutableMultimap;
import dev.kosmx.playerAnim.api.layered.AnimationStack;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.data.gson.AnimationJson;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.effect.ModEffects;
import net.oiariano.tutorialmod.entity.custom.HealProjectile;
import net.oiariano.tutorialmod.entity.custom.MercyHeal;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.item.client.MercyStaffRenderer;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

import java.util.List;
import java.util.function.Consumer;

public class MercyStaff extends HealerStaff implements GeoItem {

    public MercyStaff(Properties pProperties, int emp) {
        super(pProperties, emp);
    }

    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.NONE;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 0;  // Define a duração do uso para 0 para evitar a animação de puxar o arco
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
                player.addEffect(new MobEffectInstance(ModEffects.COOLDOWN.get(),5,1));
                ItemStack itemStack = player.getItemInHand(hand);
                throwSnowball(level, player);
                // Damage the item
                itemStack.hurtAndBreak(0, player, p -> p.broadcastBreakEvent(hand));
                return InteractionResultHolder.success(itemStack);
            }
        }

        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

    protected void throwSnowball(Level level, Player player) {
        MercyHeal mercyHeal = new MercyHeal(EntityType.SNOWBALL, level, player, amp);
        mercyHeal.setNoGravity(true);
        // Defina a posição inicial da bola de neve
        mercyHeal.setPos(player.getX(), player.getEyeY() - (double) 0.1F, player.getZ());
        // Defina a direção da bola de neve (na direção que o jogador está olhando)
        mercyHeal.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 0.5F, 1.0F);
        // Adicione a bola de neve ao nível
        level.addFreshEntity(mercyHeal);

        // Tocar um som quando a bola de neve for lançada
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BEACON_ACTIVATE, SoundSource.PLAYERS, 1.0F, 1.0F);
    }



    private PlayState predicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar ControllerRegistrar) {
        ControllerRegistrar.add(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public double getTick(Object itemStack) {
        return RenderUtils.getCurrentTick();
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private MercyStaffRenderer renderer;
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if(this.renderer == null){
                    renderer = new MercyStaffRenderer();
                }
                return this.renderer;
            }
        });
    }
}
