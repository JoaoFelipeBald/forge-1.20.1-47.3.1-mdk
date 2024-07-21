package net.oiariano.tutorialmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.oiariano.tutorialmod.item.ModItems;
import org.jetbrains.annotations.Nullable;
import net.oiariano.tutorialmod.TutorialMod;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
        public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                                   CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_275343_, p_275729_, p_275322_, TutorialMod.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
                this.tag(ItemTags.TRIMMABLE_ARMOR)
                        .add(ModItems.SAPPHIRE_HELMET.get(),
                                ModItems.SAPPHIRE_CHESTPLATE.get(),
                                ModItems.SAPPHIRE_LEGGINGS.get(),
                                ModItems.SAPPHIRE_BOOTS.get());

                this.tag(ItemTags.MUSIC_DISCS)
                        .add(ModItems.BAR_BRAWL_MUSIC_DISC.get())
                        .add(ModItems.RALUQUEI_MUSIC_DISC.get())
                        .add(ModItems.SKIBIDI_MUSIC_DISC.get())
                        .add(ModItems.MERCY_MUSIC_DISC.get())
                        .add(ModItems.TRACER_MUSIC_DISC.get())

                        .add(ModItems.PRACA_MUSIC_DISC.get())
                        .add(ModItems.EVIDENCIAS_MUSIC_DISC.get())
                        .add(ModItems.RECOMECAR_MUSIC_DISC.get())
                        .add(ModItems.LEMBRAR_MUSIC_DISC.get())
                        .add(ModItems.ESTRANHA_MUSIC_DISC.get())
                        .add(ModItems.COMIGO_MUSIC_DISC.get())
                        .add(ModItems.VAGALUMES_MUSIC_DISC.get())
                        .add(ModItems.ELA_MUSIC_DISC.get())
                        .add(ModItems.BORBOLETAS_MUSIC_DISC.get())
                        .add(ModItems.GARRAFA_MUSIC_DISC.get())
                        .add(ModItems.DUROU_MUSIC_DISC.get())
                        .add(ModItems.DELA_MUSIC_DISC.get())
                        .add(ModItems.BOA_MUSIC_DISC.get())
                        .add(ModItems.GRACA_MUSIC_DISC.get())
                        .add(ModItems.ERRADA_MUSIC_DISC.get())
                        .add(ModItems.NEGAO_MUSIC_DISC.get())
                        .add(ModItems.SAUDADE_MUSIC_DISC.get())
                        .add(ModItems.BARATA_MUSIC_DISC.get())
                        .add(ModItems.PESCADOR_MUSIC_DISC.get())
                        .add(ModItems.BEN10_MUSIC_DISC.get())

                        .add(ModItems.MIM_MUSIC_DISC.get())
                        .add(ModItems.LIGACAO_MUSIC_DISC.get())
                        .add(ModItems.FRENTE_MUSIC_DISC.get())
                        .add(ModItems.NORMAL_MUSIC_DISC.get())
                        .add(ModItems.REZO_MUSIC_DISC.get())
                        .add(ModItems.ESTIVER_MUSIC_DISC.get())
                        .add(ModItems.TARDE_MUSIC_DISC.get())
                        .add(ModItems.EMOCOES_MUSIC_DISC.get())
                        .add(ModItems.ABRIU_MUSIC_DISC.get())
                        .add(ModItems.NIGHTMARE_MUSIC_DISC.get())
                        .add(ModItems.AFTERLIFE_MUSIC_DISC.get())
                        .add(ModItems.GOD_MUSIC_DISC.get())
                        .add(ModItems.HEAVEN_MUSIC_DISC.get())
                        .add(ModItems.AWAY_MUSIC_DISC.get())
                        .add(ModItems.SPACE_MUSIC_DISC.get())
                        .add(ModItems.ROAR_MUSIC_DISC.get())
                        .add(ModItems.HORSE_MUSIC_DISC.get())
                        .add(ModItems.CHANDELIER_MUSIC_DISC.get())
                        .add(ModItems.YEARS_MUSIC_DISC.get())
                        .add(ModItems.BASS_MUSIC_DISC.get())
                        .add(ModItems.MAYBE_MUSIC_DISC.get())
                        .add(ModItems.BLOOD_MUSIC_DISC.get())
                        .add(ModItems.CYCLONE_MUSIC_DISC.get())
                        .add(ModItems.LOVE_MUSIC_DISC.get())
                        .add(ModItems.GIRL_MUSIC_DISC.get())
                        .add(ModItems.FLY_MUSIC_DISC.get());

        }
}
