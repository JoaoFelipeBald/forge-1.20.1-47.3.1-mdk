//package net.oiariano.tutorialmod.effect;
//
//
//import net.minecraft.world.effect.MobEffect;
//import net.minecraft.world.effect.MobEffectCategory;
//import net.minecraft.world.entity.LivingEntity;
//
//public class FeatherEffect extends MobEffect {
//    public FeatherEffect(MobEffectCategory mobEffectCategory, int color) {
//        super(mobEffectCategory, color);
//    }
//
//    @Override
//    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
//        if (!pLivingEntity.level().isClientSide()) {
//            Double x = pLivingEntity.getX();
//            Double y = pLivingEntity.getY();
//            Double z = pLivingEntity.getZ();
//            pLivingEntity.teleportTo(x, y, z);
//
//            pLivingEntity.
//        }
//        super.applyEffectTick(pLivingEntity, pAmplifier);
//    }
//
//    @Override
//    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
//        return true;
//    }
//}