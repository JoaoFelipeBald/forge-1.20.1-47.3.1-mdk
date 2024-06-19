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
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.enchantments.ModEnchantments;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.villager.ModVillagers;

import java.util.List;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();


        }

        if(event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 2));



            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    enchantedBook,
                    2, 8, 0.02f));


        }

        if(event.getType() == ModVillagers.SOUND_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModBlocks.SOUND_BLOCK.get(), 1),
                    16, 8, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModBlocks.SAPPHIRE_ORE.get(), 2),
                    5, 12, 0.02f));
        }

        if(event.getType() == ModVillagers.SIGEL_PRINCIPAL.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModBlocks.SOUND_BLOCK.get(), 1),
                    16, 8, 0.02f));

            

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModBlocks.SAPPHIRE_ORE.get(), 2),
                    5, 12, 0.02f));
        }

        if(event.getType() == ModVillagers.SIGEL_ARMEIRO_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook1 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.FIRE_PROTECTION_2.get(), 4));
            ItemStack enchantedBook2 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.FIRE_PROTECTION_2.get(), 5));
            ItemStack enchantedBook3 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.NIGHT_VISION_ENCHANTMENT.get(), 1));
            ItemStack enchantedBook4 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.REAPER_ENCHANTMENT.get(), 14));
            ItemStack enchantedBook5 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.PROJECTILE_PROTECTION2.get(), 4));
            ItemStack enchantedBook6 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.PROJECTILE_PROTECTION2.get(), 5));
            ItemStack enchantedBook7 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.POISON_ENCHANTMENT.get(), 4));


            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.FRAGMENTO_SIGEL.get(), 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(ModItems.FRAGMENTO_SIGEL.get(), 1),
                    16, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook1,
                    5, 12, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook2,
                    40, 12, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook5,
                    5, 12, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook6,
                    40, 12, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook3,
                    5, 12, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    enchantedBook7,
                    40, 12, 0.02f));
        }

        if(event.getType() == ModVillagers.SIGEL_FERREIRO_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook1 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 5));
            ItemStack enchantedBook2 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 7));
            ItemStack enchantedBook3 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 9));
            ItemStack enchantedBook4 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 12));
            ItemStack enchantedBook5 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 15));
            ItemStack enchantedBook6 = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.REAPER_ENCHANTMENT.get(), 12));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 70),
                    enchantedBook1,
                    1000, 0, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    enchantedBook2,
                    1000, 0, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    enchantedBook3,
                    1000, 0, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    enchantedBook4,
                    1000, 0, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    enchantedBook5,
                    1000, 0, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 10, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 70, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 150, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SUPRIMENTO_DO_FERREIRO.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 250, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    enchantedBook6,
                    1000, 18, 0.02f));


        }
        if(event.getType() == ModVillagers.SIGEL_COLECIONADOR_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.POTE_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 18, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MAPA_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 18, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.PERGAMINHO_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 18, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMULETO_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 18, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.CALICE_SIGEL.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_SIGEL.get(), 1),
                    1000, 18, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.JORNAL_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 1),
                    1000, 18, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.LANTERNA_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 1),
                    1000, 18, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.FACA_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 1),
                    1000, 18, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMULETO_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 1),
                    1000, 18, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RELOGIO_MANI.get(), 1),
                    new ItemStack(ModItems.DINHEIRO_MANI.get(), 1),
                    1000, 18, 0.02f));
        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 12),
                new ItemStack(ModItems.SAPPHIRE_BOOTS.get(), 1),
                3, 2, 0.2f));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 24),
                new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                2, 12, 0.15f));
    }
}