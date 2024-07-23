package net.oiariano.tutorialmod.entity.custom;

import net.minecraft.core.Direction;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MercyHeal extends HealProjectile {


    public MercyHeal(EntityType entityType, Level pLevel, LivingEntity pShooter, int level) {
        super(entityType, pLevel, pShooter, level);
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.level().isClientSide) {
            LivingEntity target = this.findClosestEntity();
            if (target != null) {
                double dx = target.getX() - this.getX();
                double dy = target.getY() + target.getEyeHeight() - this.getY();
                double dz = target.getZ() - this.getZ();
                double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);

                this.setDeltaMovement(dx / distance * 0.5, dy / distance * 0.5, dz / distance * 0.5);
            }
        }
        Vec3 vec3 = this.getDeltaMovement();
        double d2 = this.getX() + vec3.x;
        double d0 = this.getY() + vec3.y;
        double d1 = this.getZ() + vec3.z;
        this.updateRotation();
        float f;
        for(int i = 0; i < 4; ++i) {
            float f1 = 0.25F;
            this.level().addParticle(ParticleTypes.FLAME, d2 - vec3.x * 0.25D, d0 - vec3.y * 0.25D, d1 - vec3.z * 0.25D, vec3.x, vec3.y, vec3.z);
        }
        if(this.tickCount > 100){
            this.kill();
        }
        f = 0.8F;
    }

    @Override
    public ParticleOptions getParticle(){
        ItemStack itemstack = this.getItemRaw();
        return ParticleTypes.FLAME;
    }

    @Override
    public void handleEntityEvent(byte pId) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 1.0D, 1.0D, 1.0D);
            }


    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        Entity entity = pResult.getEntity();
        if(entity instanceof LivingEntity) {
            LivingEntity target = (LivingEntity) entity;
            target.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 50, 2));
        }
    }

    private LivingEntity findClosestEntity() {
        List<LivingEntity> entities = this.level().getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(10));
        LivingEntity closest = null;
        double closestDistance = Double.MAX_VALUE;

        for (LivingEntity entity : entities) {
            if (entity != this.getOwner() && (entity.getType().getCategory().equals(MobCategory.CREATURE) || (entity instanceof Player) || entity.getType().getCategory().equals(MobCategory.MISC) || entity.getType().getCategory().equals(MobCategory.AXOLOTLS) || entity.getType().getCategory().equals(MobCategory.WATER_AMBIENT) || entity.getType().getCategory().equals(MobCategory.WATER_CREATURE))) {
                double distance = this.distanceToSqr(entity);
                if (distance < closestDistance) {
                    closest = entity;
                    closestDistance = distance;
                }
            }
        }

        return closest;
    }


    /*public MercyHeal(Level pLevel) {
        super(EntityType.SHULKER_BULLET, pLevel);
    }*/
}
