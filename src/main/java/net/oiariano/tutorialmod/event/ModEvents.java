package net.oiariano.tutorialmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.villager.ModVillagers;

import java.util.List;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


        }

        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 2));


//            // Level 1
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.EMERALD, 32),
//                    enchantedBook,
//                    2, 8, 0.02f));


        }


        if (event.getType() == ModVillagers.SIGEL_PRINCIPAL.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

//            ItemStack book1= BookUtil.createBook("Ancião Sigel", "Boas Vindas", BookUtil.REGISTRY_OUT_PAGES);
//
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.BREAD, 1),
//                    book1,
//                    1, 0, 0.02f));
//
//


        }

        if (event.getType() == ModVillagers.SIGEL_ARMEIRO_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook1 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.FIRE_PROTECTION_2.get(), 4));
            ItemStack enchantedBook2 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.FIRE_PROTECTION_2.get(), 5));
            ItemStack enchantedBook3 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), 1));
            ItemStack enchantedBook4 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.REAPER_ENCHANTMENT.get(), 1));
            ItemStack enchantedBook5 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.PROJECTILE_PROTECTION2.get(), 4));
            ItemStack enchantedBook6 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.PROJECTILE_PROTECTION2.get(), 5));
            ItemStack enchantedBook7 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.POISON_ENCHANTMENT.get(), 1));


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.FRAGMENTO_SIGEL.get(), 1),
                    16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    new ItemStack(ModItems.FRAGMENTO_SIGEL.get(), 3),
                    16, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 9),
                    enchantedBook1,
                    5, 12, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 9),
                    enchantedBook2,
                    40, 12, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 15),
                    enchantedBook3,
                    5, 16, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 15),
                    enchantedBook7,
                    40, 16, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 10),
                    enchantedBook5,
                    5, 22, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 20),
                    enchantedBook6,
                    40, 22, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 20),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 20),
                    enchantedBook4,
                    1, 52, 0.02f));
        }

        if (event.getType() == ModVillagers.SIGEL_FERREIRO_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook1 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 5));
            ItemStack enchantedBook2 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 7));
            ItemStack enchantedBook3 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 8));
            ItemStack enchantedBook4 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 9));
            ItemStack enchantedBook5 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 10));
            ItemStack enchantedBook6 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 11));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 70),
                    enchantedBook1,
                    1000, 0, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 20),
                    enchantedBook2,
                    1000, 0, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 30),
                    enchantedBook3,
                    1000, 0, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 40),
                    enchantedBook4,
                    1000, 0, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 50),
                    enchantedBook5,
                    1000, 0, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 20),
                    1000, 10, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 30),
                    1000, 70, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 40),
                    1000, 150, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 50),
                    1000, 250, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 25),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 25),
                    enchantedBook6,
                    1000, 18, 0.02f));


        }
        if (event.getType() == ModVillagers.SIGEL_COLECIONADOR_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POTE_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 2),
                    1000, 18, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MAPA_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 4),
                    1000, 20, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.PERGAMINHO_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 6),
                    1000, 30, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMULETO_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 8),
                    1000, 80, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.CALICE_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 11),
                    1000, 80, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.JORNAL_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 2),
                    1000, 18, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.LANTERNA_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 4),
                    1000, 20, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FACA_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 6),
                    1000, 30, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMULETO_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 8),
                    1000, 80, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RELOGIO_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 11),
                    1000, 18, 0.02f));
        }

        if (event.getType() == ModVillagers.SOUND_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.PRACA_MUSIC_DISC.get(), 1),
                    16, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.LEMBRAR_MUSIC_DISC.get(), 1),
                    5, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.VAGALUMES_MUSIC_DISC.get(), 1),
                    5, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.GIRL_MUSIC_DISC.get(), 1),
                    5, 10, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.CLOCK, 10),
                    new ItemStack(ModItems.GARRAFA_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.BAR_BRAWL_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.RALUQUEI_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.SKIBIDI_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.MERCY_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.TRACER_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.MIM_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.LIGACAO_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.FRENTE_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.NORMAL_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.REZO_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.ESTIVER_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.TARDE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

        }

        if(event.getType() == ModVillagers.SOUND_MASTER2.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.EVIDENCIAS_MUSIC_DISC.get(), 1),
                    16, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.ESTRANHA_MUSIC_DISC.get(), 1),
                    5, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.ELA_MUSIC_DISC.get(), 1),
            5, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.DUROU_MUSIC_DISC.get(), 1),
            5, 10, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.DELA_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.BOA_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.BEN10_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.EMOCOES_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.ABRIU_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.NIGHTMARE_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.AFTERLIFE_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.GOD_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.HEAVEN_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.AWAY_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.SPACE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.ROAR_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.HORSE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

        }

        if(event.getType() == ModVillagers.SOUND_MASTER3.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.RECOMECAR_MUSIC_DISC.get(), 1),
                    16, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.COMIGO_MUSIC_DISC.get(), 1),
                    5, 10, 0.02f));
//
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.BORBOLETAS_MUSIC_DISC.get(), 1),
            5, 10, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.GRACA_MUSIC_DISC.get(), 1),
            5, 10, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.ERRADA_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                    new ItemStack(ModItems.NEGAO_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.SAUDADE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.BARATA_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.PESCADOR_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.CHANDELIER_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.YEARS_MUSIC_DISC.get(), 1),
                    5, 150, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.BASS_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.MAYBE_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.BLOOD_MUSIC_DISC.get(), 1),
                    5, 250, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.CYCLONE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.LOVE_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                            new ItemStack(ModItems.DINHEIRO_PEIXE.get(), 10),
                            new ItemStack(ModItems.FLY_MUSIC_DISC.get(), 1),
                    5, 70, 0.02f));
        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();
//
//        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                new ItemStack(Items.EMERALD, 12),
//                new ItemStack(ModItems.SAPPHIRE_BOOTS.get(), 1),
//                3, 2, 0.2f));
//
//        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                new ItemStack(Items.EMERALD, 24),
//                new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
//                2, 12, 0.15f));
    }
}