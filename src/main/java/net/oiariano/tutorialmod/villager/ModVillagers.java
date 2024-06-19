package net.oiariano.tutorialmod.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.block.ModBlocks;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TutorialMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, TutorialMod.MOD_ID);

    public static final RegistryObject<PoiType> SOUND_POI = POI_TYPES.register("sound_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.SOUND_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SOUND_MASTER =
            VILLAGER_PROFESSIONS.register("soundmaster", () -> new VillagerProfession("soundmaster",
                    holder -> holder.get() == SOUND_POI.get(), holder -> holder.get() == SOUND_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> SIGEL_FERREIRO_POI = POI_TYPES.register("sigelferreiropoi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.BSIGEL_FERREIRO.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SIGEL_FERREIRO_MASTER=
            VILLAGER_PROFESSIONS.register("sigelferreiromaster", () -> new VillagerProfession("sigelferreiromaster",
                    holder -> holder.get() == SIGEL_FERREIRO_POI.get(), holder -> holder.get() == SIGEL_FERREIRO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> SIGEL_COLECIONADOR_POI = POI_TYPES.register("sigelcolecionadorpoi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.BSIGEL_COLECIONADOR.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SIGEL_COLECIONADOR_MASTER=
            VILLAGER_PROFESSIONS.register("sigelcolecionadormaster", () -> new VillagerProfession("sigelcolecionadormaster",
                    holder -> holder.get() == SIGEL_COLECIONADOR_POI.get(), holder -> holder.get() == SIGEL_COLECIONADOR_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> SIGEL_ARMEIRO_POI = POI_TYPES.register("sigelarmeiropoi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.BSIGEL_ARMEIRO.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SIGEL_ARMEIRO_MASTER =
            VILLAGER_PROFESSIONS.register("sigelarmeiromaster", () -> new VillagerProfession("sigelarmeiromaster",
                    holder -> holder.get() == SIGEL_ARMEIRO_POI.get(), holder -> holder.get() == SIGEL_ARMEIRO_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<PoiType> SIGEL_PRINCIPAL_POI = POI_TYPES.register("sigelprincipalpoi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.BSIGEL_PRINCIPAL.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> SIGEL_PRINCIPAL =
            VILLAGER_PROFESSIONS.register("sigelprincipal", () -> new VillagerProfession("sigelprincipal",
                    holder -> holder.get() == SIGEL_PRINCIPAL_POI.get(), holder -> holder.get() == SIGEL_PRINCIPAL_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));




    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}