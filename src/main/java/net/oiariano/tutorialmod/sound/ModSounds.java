package net.oiariano.tutorialmod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);

    public static final RegistryObject<SoundEvent> METAL_DETECTOR_FOUND_ORE = registerSoundEvents("metal_detector_found_ore");

    public static final RegistryObject<SoundEvent> SOUND_BLOCK_BREAK = registerSoundEvents("sound_block_break");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_STEP = registerSoundEvents("sound_block_step");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_FALL = registerSoundEvents("sound_block_fall");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_PLACE = registerSoundEvents("sound_block_place");
    public static final RegistryObject<SoundEvent> SOUND_BLOCK_HIT = registerSoundEvents("sound_block_hit");

    public static final RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvents("bar_brawl");
    public static final RegistryObject<SoundEvent> RALUQUEI = registerSoundEvents("raluquei");
    public static final RegistryObject<SoundEvent> SKIBIDI = registerSoundEvents("skibidi");
    public static final RegistryObject<SoundEvent> MERCY = registerSoundEvents("mercy");
    public static final RegistryObject<SoundEvent> TRACER = registerSoundEvents("tracer");

    public static final RegistryObject<SoundEvent> PRACA = registerSoundEvents("praca");
    public static final RegistryObject<SoundEvent> EVIDENCIAS = registerSoundEvents("evidencias");
    public static final RegistryObject<SoundEvent> RECOMECAR = registerSoundEvents("recomecar");
    public static final RegistryObject<SoundEvent> LEMBRAR = registerSoundEvents("lembrar");
    public static final RegistryObject<SoundEvent> ESTRANHA = registerSoundEvents("estranha");
    public static final RegistryObject<SoundEvent> COMIGO = registerSoundEvents("comigo");
    public static final RegistryObject<SoundEvent> VAGALUMES = registerSoundEvents("vagalumes");
    public static final RegistryObject<SoundEvent> ELA = registerSoundEvents("ela");
    public static final RegistryObject<SoundEvent> BORBOLETAS = registerSoundEvents("borboletas");
    public static final RegistryObject<SoundEvent> GARRAFA = registerSoundEvents("garrafa");
    public static final RegistryObject<SoundEvent> DUROU = registerSoundEvents("durou");
    public static final RegistryObject<SoundEvent> DELA = registerSoundEvents("dela");
    public static final RegistryObject<SoundEvent> BOA = registerSoundEvents("boa");
    public static final RegistryObject<SoundEvent> GRACA = registerSoundEvents("graca");
    public static final RegistryObject<SoundEvent> ERRADA = registerSoundEvents("errada");
    public static final RegistryObject<SoundEvent> NEGAO = registerSoundEvents("negao");
    public static final RegistryObject<SoundEvent> CONTRARIAR = registerSoundEvents("contrariar");
    public static final RegistryObject<SoundEvent> BARATA = registerSoundEvents("barata");
    public static final RegistryObject<SoundEvent> PESCADOR = registerSoundEvents("pescador");
    public static final RegistryObject<SoundEvent> BEN10 = registerSoundEvents("ben10");

    public static final RegistryObject<SoundEvent> MIM = registerSoundEvents("mim");
    public static final RegistryObject<SoundEvent> LIGACAO = registerSoundEvents("ligacao");
    public static final RegistryObject<SoundEvent> FRENTE = registerSoundEvents("frente");
    public static final RegistryObject<SoundEvent> NORMAL = registerSoundEvents("normal");
    public static final RegistryObject<SoundEvent> REZO = registerSoundEvents("rezo");
    public static final RegistryObject<SoundEvent> ESTIVER = registerSoundEvents("estiver");
    public static final RegistryObject<SoundEvent> TARDE = registerSoundEvents("tarde");
    public static final RegistryObject<SoundEvent> EMOCOES = registerSoundEvents("emocoes");
    public static final RegistryObject<SoundEvent> ABRIU = registerSoundEvents("abriu");
    public static final RegistryObject<SoundEvent> NIGHTMARE = registerSoundEvents("nightmare");
    public static final RegistryObject<SoundEvent> AFTERLIFE = registerSoundEvents("afterlife");
    public static final RegistryObject<SoundEvent> GOD = registerSoundEvents("god");
    public static final RegistryObject<SoundEvent> HEAVEN = registerSoundEvents("heaven");
    public static final RegistryObject<SoundEvent> AWAY = registerSoundEvents("away");
    public static final RegistryObject<SoundEvent> SPACE = registerSoundEvents("space");
    public static final RegistryObject<SoundEvent> ROAR = registerSoundEvents("roar");
    public static final RegistryObject<SoundEvent> HORSE = registerSoundEvents("horse");
    public static final RegistryObject<SoundEvent> CHANDELIER = registerSoundEvents("chandelier");
    public static final RegistryObject<SoundEvent> YEARS = registerSoundEvents("years");
    public static final RegistryObject<SoundEvent> BASS = registerSoundEvents("bass");
    public static final RegistryObject<SoundEvent> MAYBE = registerSoundEvents("maybe");
    public static final RegistryObject<SoundEvent> BLOOD = registerSoundEvents("blood");
    public static final RegistryObject<SoundEvent> CYCLONE = registerSoundEvents("cyclone");
    public static final RegistryObject<SoundEvent> LOVE = registerSoundEvents("love");
    public static final RegistryObject<SoundEvent> FLY = registerSoundEvents("fly");

    public static final RegistryObject<SoundEvent> GIRL = registerSoundEvents("girl");


    public static final ForgeSoundType SOUND_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SOUND_BLOCK_BREAK, ModSounds.SOUND_BLOCK_STEP, ModSounds.SOUND_BLOCK_PLACE,
            ModSounds.SOUND_BLOCK_HIT, ModSounds.SOUND_BLOCK_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(TutorialMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}