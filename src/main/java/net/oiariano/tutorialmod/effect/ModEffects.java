package net.oiariano.tutorialmod.effect;

import net.oiariano.tutorialmod.TutorialMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TutorialMod.MOD_ID);

    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.BENEFICIAL, 3124687));

    public static final RegistryObject<MobEffect> COOLDOWN = MOB_EFFECTS.register("cooldown",
            () -> new CooldownEffect(MobEffectCategory.BENEFICIAL, 3124687));

    public static final RegistryObject<MobEffect> BENCAO_HELIOS = MOB_EFFECTS.register("bencao_helios",
            () -> new BencaoHelios(MobEffectCategory.BENEFICIAL, 3124687));

//    public static final RegistryObject<MobEffect> POWEREFFECT = MOB_EFFECTS.register("desativado",
//            () -> new PowerEffect(MobEffectCategory.BENEFICIAL, 3124687));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
