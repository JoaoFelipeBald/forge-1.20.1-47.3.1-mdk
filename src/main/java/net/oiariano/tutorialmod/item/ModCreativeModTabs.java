package net.oiariano.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;
import net.oiariano.tutorialmod.item.custom.CustomEnchantedBookItem;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMULETO_SIGEL.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.FRAGMENTO_SIGEL.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.UPGRADE_SIGEL.get());
                        pOutput.accept(ModItems.DICE.get());
           //             pOutput.accept(ModItems.DICE.get());
                        pOutput.accept(ModItems.SUPRIMENTO_DO_FERREIRO.get());
                        pOutput.accept(ModItems.RALUQUEI_MUSIC_DISC.get());
                        pOutput.accept(ModItems.TRACER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MERCY_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SKIBIDI_MUSIC_DISC.get());

                        pOutput.accept(ModItems.BEN10_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DELA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.VAGALUMES_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GRACA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BOA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ELA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BARATA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BORBOLETAS_MUSIC_DISC.get());
                        pOutput.accept(ModItems.RECOMECAR_MUSIC_DISC.get());
                        pOutput.accept(ModItems.PRACA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ERRADA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.DUROU_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GARRAFA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.COMIGO_MUSIC_DISC.get());
                        pOutput.accept(ModItems.LEMBRAR_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ESTRANHA_MUSIC_DISC.get());
                        pOutput.accept(ModItems.PESCADOR_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SAUDADE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.NEGAO_MUSIC_DISC.get());
                        pOutput.accept(ModItems.EVIDENCIAS_MUSIC_DISC.get());

                        pOutput.accept(ModItems.MIM_MUSIC_DISC.get());
                        pOutput.accept(ModItems.LIGACAO_MUSIC_DISC.get());
                        pOutput.accept(ModItems.FRENTE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.NORMAL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.REZO_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ESTIVER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.TARDE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.EMOCOES_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ABRIU_MUSIC_DISC.get());
                        pOutput.accept(ModItems.NIGHTMARE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.AFTERLIFE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GOD_MUSIC_DISC.get());
                        pOutput.accept(ModItems.HEAVEN_MUSIC_DISC.get());
                        pOutput.accept(ModItems.AWAY_MUSIC_DISC.get());
                        pOutput.accept(ModItems.SPACE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.ROAR_MUSIC_DISC.get());
                        pOutput.accept(ModItems.HORSE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.CHANDELIER_MUSIC_DISC.get());
                        pOutput.accept(ModItems.YEARS_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BASS_MUSIC_DISC.get());
                        pOutput.accept(ModItems.MAYBE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.BLOOD_MUSIC_DISC.get());
                        pOutput.accept(ModItems.CYCLONE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.LOVE_MUSIC_DISC.get());
                        pOutput.accept(ModItems.FLY_MUSIC_DISC.get());
                        pOutput.accept(ModItems.GIRL_MUSIC_DISC.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.HEALER_STAFF1.get());
                        pOutput.accept(ModItems.HEALER_STAFF2.get());
                        pOutput.accept(ModItems.HEALER_STAFF6.get());
                        pOutput.accept(ModItems.HEALER_STAFF3.get());
                        pOutput.accept(ModItems.HEALER_STAFF4.get());
                        pOutput.accept(ModItems.HEALER_STAFF5.get());
                        pOutput.accept(ModItems.MERCY_STAFF.get());

                        pOutput.accept(ModItems.PERGAMINHO_SIGEL.get());
                        pOutput.accept(ModItems.POTE_SIGEL.get());
                        pOutput.accept(ModItems.CALICE_SIGEL.get());
                        pOutput.accept(ModItems.AMULETO_SIGEL.get());
                        pOutput.accept(ModItems.MAPA_SIGEL.get());
                        pOutput.accept(ModItems.DINHEIRO_SIGEL.get());
                        pOutput.accept(ModItems.DINHEIRO_PEIXE.get());

                        pOutput.accept(ModItems.JORNAL_MANI.get());
                        pOutput.accept(ModItems.AMULETO_MANI.get());
                        pOutput.accept(ModItems.RELOGIO_MANI.get());
                        pOutput.accept(ModItems.FACA_MANI.get());
                        pOutput.accept(ModItems.LANTERNA_MANI.get());
                        pOutput.accept(ModItems.DINHEIRO_MANI.get());

                        pOutput.accept(ModItems.ACCEL.get());
                        pOutput.accept(ModItems.DINAMI.get());
                        pOutput.accept(ModItems.DINAMITA.get());
                        pOutput.accept(ModItems.MIRACULA.get());
                        pOutput.accept(ModItems.CORVIVA.get());
                        pOutput.accept(ModItems.ESTELARIS.get());
                        pOutput.accept(ModItems.PIRARUCU.get());
                        pOutput.accept(ModItems.ENERGY.get());
                        pOutput.accept(ModItems.PAMONHA.get());

                        pOutput.accept(ModItems.ACELL_SEEDS.get());
                        pOutput.accept(ModItems.DINAMI_SEEDS.get());
                        pOutput.accept(ModItems.DINAMITA.get());
                        pOutput.accept(ModItems.MIRACULA_SEEDS.get());
                        pOutput.accept(ModItems.CORVIVA_SEEDS.get());
                        pOutput.accept(ModItems.ESTELARIS_SEEDS.get());

                        ItemStack prot = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.PROTECTION2.get(), 5));
                        ItemStack fProt = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.FIRE_PROTECTION_2.get(), 4),Rarity.RARE);
                        ItemStack eProt = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.EXPLOSION_PROTECTION2.get(), 4),Rarity.RARE);
                        ItemStack pProt = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.PROJECTILE_PROTECTION2.get(), 4),Rarity.RARE);
                        ItemStack necro = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.WITHER_ENCHANTMENT.get(), 1), Rarity.RARE);
                        ItemStack poison = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.POISON_ENCHANTMENT.get(), 1), Rarity.RARE);
                        ItemStack night = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), 1), Rarity.RARE);
                        ItemStack reaper = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.REAPER_ENCHANTMENT.get(), 1), Rarity.RARE);
                        ItemStack passar = CustomEnchantedBookItem.createForEnchantment(
                                new EnchantmentInstance(ModEnchantments.PASSAR_ENCHANTMENT.get(), 1), Rarity.RARE);

                  //      Prot5.getOrCreateTag().putInt("CustomRarity", Enchantment.Rarity.RARE.ordinal());
                 //       FProt4.getOrCreateTag().putInt("CustomRarity", Enchantment.Rarity.RARE.ordinal());

                        pOutput.accept(prot);
                        pOutput.accept(fProt);
                        pOutput.accept(eProt);
                        pOutput.accept(pProt);
                        pOutput.accept(necro);
                        pOutput.accept(poison);
                        pOutput.accept(night);
                        pOutput.accept(reaper);
                        pOutput.accept(passar);


                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
            //            pOutput.accept(ModItems.RHINO_SPANW_EGG.get());

                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());

                        pOutput.accept(ModItems.MANI_HELMET.get());
                        pOutput.accept(ModItems.MANI_CHESTPLATE.get());
                        pOutput.accept(ModItems.MANI_LEGGINGS.get());
                        pOutput.accept(ModItems.MANI_BOOTS.get());

                        pOutput.accept(ModItems.SIGEL.get());

                        pOutput.accept(ModItems.ELMO_MINEIRO.get());

                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(ModItems.SIGEL1_HELMET.get());
                        pOutput.accept(ModItems.SIGEL1_CHESTPLATE.get());
                        pOutput.accept(ModItems.SIGEL1_LEGGINGS.get());
                        pOutput.accept(ModItems.SIGEL1_BOOTS.get());

                        pOutput.accept(ModItems.SIGEL2_HELMET.get());
                        pOutput.accept(ModItems.SIGEL2_CHESTPLATE.get());
                        pOutput.accept(ModItems.SIGEL2_LEGGINGS.get());
                        pOutput.accept(ModItems.SIGEL2_BOOTS.get());

                        pOutput.accept(ModItems.SIGEL3_HELMET.get());
                        pOutput.accept(ModItems.SIGEL3_CHESTPLATE.get());
                        pOutput.accept(ModItems.SIGEL3_LEGGINGS.get());
                        pOutput.accept(ModItems.SIGEL3_BOOTS.get());

                        pOutput.accept(ModItems.SIGEL4_HELMET.get());
                        pOutput.accept(ModItems.SIGEL4_CHESTPLATE.get());
                        pOutput.accept(ModItems.SIGEL4_LEGGINGS.get());
                        pOutput.accept(ModItems.SIGEL4_BOOTS.get());

//                        pOutput.accept(ModItems.getScaryBook());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.BSIGEL_ARMEIRO.get());
                        pOutput.accept(ModBlocks.BSIGEL_COLECIONADOR.get());
                        pOutput.accept(ModBlocks.BSIGEL_PRINCIPAL.get());
                        pOutput.accept(ModBlocks.BSIGEL_FERREIRO.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());



                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.CATMINT.get());
                        pOutput.accept(ModItems.HEAL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
