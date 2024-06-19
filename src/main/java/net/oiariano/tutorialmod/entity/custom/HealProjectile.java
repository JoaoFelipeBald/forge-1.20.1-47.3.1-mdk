package net.oiariano.tutorialmod.entity.custom;

import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class HealProjectile extends ThrowableItemProjectile {
    int amp;
    public HealProjectile(EntityType<? extends net.minecraft.world.entity.projectile.Snowball> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setGlowingTag(true);

    }

    public HealProjectile(Level pLevel, LivingEntity pShooter, int level) {
        super(EntityType.SNOWBALL, pShooter, pLevel);
        this.setSecondsOnFire(10);
        this.amp=level;
    }

    public HealProjectile(Level pLevel, double pX, double pY, double pZ) {
        super(EntityType.SNOWBALL, pX, pY, pZ, pLevel);
        this.setGlowingTag(true);
    }

    protected Item getDefaultItem() {
        return Items.SNOWBALL;
    }

    private ParticleOptions getParticle() {
        ItemStack itemstack = this.getItemRaw();
        return (ParticleOptions)(itemstack.isEmpty() ? ParticleTypes.FLASH : new ItemParticleOption(ParticleTypes.ITEM, itemstack));
    }

    /**
     * Handles an entity event received from a {@link net.minecraft.network.protocol.game.ClientboundEntityEventPacket}.
     */
    public void handleEntityEvent(byte pId) {
        if (pId == 3) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    /**
     * Called when the arrow hits an entity
     */
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        Entity entity = pResult.getEntity();
        if(entity instanceof LivingEntity) {
            LivingEntity target = (LivingEntity) entity;
            if (entity.getType().getCategory().equals(MobCategory.CREATURE) || (entity instanceof Player) || entity.getType().getCategory().equals(MobCategory.MISC))
            {
                target.heal(10f);
                target.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2));

            }

        else{
                target.hurt(target.damageSources().generic(), 10 * amp);
                target.setSecondsOnFire(9);
            }
        }
//        else if(target instanceof LivingEntity && entity.getType().getCategory().equals(MobCategory.MONSTER)) {
//            target.heal(10f);
//            target.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2));
//        }
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
    }
}