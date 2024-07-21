package net.oiariano.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.item.custom.*;
import net.oiariano.tutorialmod.sound.ModSounds;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CUSTOM_ENCHANTED_BOOK = ITEMS.register("custom_enchanted_book",
            () -> new EnchantedBookItem(new  Item.Properties().stacksTo(1).rarity(Rarity.RARE)){
                @Override
                public Rarity getRarity(ItemStack stack) {
                    return Rarity.RARE;
                }

            });
    public static final RegistryObject<Item> CUSTOM_ENCHANTED_BOOK2 = ITEMS.register("custom_enchanted_book2",
            () -> new CustomEnchantedBookItem2(Rarity.RARE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRAGMENTO_SIGEL = ITEMS.register("fragmento_sigel",
            () -> new Item(new  Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.fragmento_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> UPGRADE_SIGEL = ITEMS.register("upgrade_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.upgrade_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MANI = ITEMS.register("mani",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SIGEL = ITEMS.register("sigel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINAS = ITEMS.register("minas",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DINHEIRO_PEIXE = ITEMS.register("dinheiro_peixe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DINHEIRO_SIGEL = ITEMS.register("dinheiro_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.dinheiro_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> POTE_SIGEL = ITEMS.register("pote_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.pote_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> AMULETO_SIGEL = ITEMS.register("amuleto_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.amuleto_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> CALICE_SIGEL = ITEMS.register("calice_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.calice_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> PERGAMINHO_SIGEL = ITEMS.register("pergaminho_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.pergaminho_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> MAPA_SIGEL = ITEMS.register("mapa_sigel",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.mapa_sigel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });


    public static final RegistryObject<Item> DINHEIRO_MANI = ITEMS.register("dinheiro_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.dinheiro_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> AMULETO_MANI = ITEMS.register("amuleto_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.amuleto_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> RELOGIO_MANI = ITEMS.register("relogio_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.relogio_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> LANTERNA_MANI = ITEMS.register("lanterna_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.lanterna_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> JORNAL_MANI = ITEMS.register("jornal_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.jornal_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> FACA_MANI = ITEMS.register("faca_mani",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.faca_mani.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> SUPRIMENTO_DO_FERREIRO = ITEMS.register("suprimentodoferreiro",
            () -> new Item(new Item.Properties()));

    

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> HEALER_STAFF1 = ITEMS.register("healer_staff1",() -> new HealerStaff(new Item.Properties(),3){
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("item.tutorialmod.healer_staff1.tooltip"));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> HEALER_STAFF2 = ITEMS.register("healer_staff2",() -> new HealerStaff(new Item.Properties(),2){
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("item.tutorialmod.healer_staff2.tooltip"));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });

    public static final RegistryObject<Item> HEALER_STAFF3 = ITEMS.register("healer_staff3",() -> new HealerStaff(new Item.Properties(),3){
        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("item.tutorialmod.healer_staff3.tooltip"));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    public static final RegistryObject<Item> HEALER_STAFF4 = ITEMS.register("healer_staff4",
            () -> new HealerStaff(new Item.Properties().durability(100),4));

    public static final RegistryObject<Item> HEALER_STAFF5 = ITEMS.register("healer_staff5",
            () -> new HealerStaff(new Item.Properties().durability(100),5));

    public static final RegistryObject<Item> HEALER_STAFF6 = ITEMS.register("healer_staff6",
            () -> new HealerStaff(new Item.Properties().durability(100),6));


    public static final RegistryObject<Item> ACCEL= ITEMS.register("accel",
            () -> new Item(new Item.Properties().food(ModFoods.ACCEL)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> PIRARUCU= ITEMS.register("pirarucu",
            () -> new Item(new Item.Properties().food(ModFoods.PIRARUCU)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.pirarucu.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> CORVIVA= ITEMS.register("corviva",
            () -> new Item(new Item.Properties().food(ModFoods.CORVIVA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.corviva.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> ESTELARIS= ITEMS.register("estelaris",
            () -> new Item(new Item.Properties().food(ModFoods.ESTELARIS)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.estelaris.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> DINAMITA= ITEMS.register("dinamita",
            () -> new Item(new Item.Properties().food(ModFoods.DINAMITA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.dinamita.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> MIRACULA= ITEMS.register("miracula",
            () -> new Item(new Item.Properties().food(ModFoods.MIRACULA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.miracula.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> DINAMI = ITEMS.register("dinami",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.dinami.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> ENERGY= ITEMS.register("energy",
            () -> new Item(new Item.Properties().food(ModFoods.ENERGY)){
                @Override
                public UseAnim getUseAnimation(ItemStack pStack) {
                    return UseAnim.DRINK;
                }
            });
    public static final RegistryObject<Item> PAMONHA= ITEMS.register("pamonha",
            () -> new Item(new Item.Properties().food(ModFoods.PAMONHA))
            );


    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> SAPPHIRE_SWORD= ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE= ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE= ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE= ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL= ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));

    //mudei um para ModArmorItem para ter efeito
    public static final RegistryObject<Item> SAPPHIRE_HELMET= ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.sapphire_helmet.tooltip",5));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE= ITEMS.register("sapphire_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties(),"",5));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS= ITEMS.register("sapphire_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties(),"",5));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS= ITEMS.register("sapphire_boots",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties(), "",5));

    public static final RegistryObject<Item> ELMO_MINEIRO= ITEMS.register("elmo_mineiro",
            () -> new ModArmorItem(ModArmorMaterials.MINAS, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.elmo_mineiro.tooltip",1));

    public static final RegistryObject<Item> MANI_HELMET= ITEMS.register("mani_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",4));
    public static final RegistryObject<Item> MANI_CHESTPLATE= ITEMS.register("mani_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",4));
    public static final RegistryObject<Item> MANI_LEGGINGS= ITEMS.register("mani_leggings",
            () -> new ModArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.LEGGINGS, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",4));
    public static final RegistryObject<Item> MANI_BOOTS= ITEMS.register("mani_boots",
            () -> new ModArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.BOOTS, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",4));

    public static final RegistryObject<Item> SIGEL1_HELMET= ITEMS.register("sigel1_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",4));
    public static final RegistryObject<Item> SIGEL1_CHESTPLATE= ITEMS.register("sigel1_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.CHESTPLATE, new Item.Properties(),"item.tutorialmod.sigel1_chestplate.tooltip",4));
    public static final RegistryObject<Item> SIGEL1_LEGGINGS= ITEMS.register("sigel1_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.LEGGINGS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",4));
    public static final RegistryObject<Item> SIGEL1_BOOTS= ITEMS.register("sigel1_boots",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.BOOTS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",4));

    public static final RegistryObject<Item> SIGEL2_HELMET= ITEMS.register("sigel2_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",8));
    public static final RegistryObject<Item> SIGEL2_CHESTPLATE= ITEMS.register("sigel2_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.CHESTPLATE, new Item.Properties(),"item.tutorialmod.sigel2_chestplate.tooltip",8));
    public static final RegistryObject<Item> SIGEL2_LEGGINGS= ITEMS.register("sigel2_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.LEGGINGS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",8));
    public static final RegistryObject<Item> SIGEL2_BOOTS= ITEMS.register("sigel2_boots",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.BOOTS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",8));

    public static final RegistryObject<Item> SIGEL3_HELMET= ITEMS.register("sigel3_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",12));
    public static final RegistryObject<Item> SIGEL3_CHESTPLATE= ITEMS.register("sigel3_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "item.tutorialmod.sigel3_chestplate.tooltip",12));
    public static final RegistryObject<Item> SIGEL3_LEGGINGS= ITEMS.register("sigel3_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.LEGGINGS, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",12));
    public static final RegistryObject<Item> SIGEL3_BOOTS= ITEMS.register("sigel3_boots",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.BOOTS, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",12));

    public static final RegistryObject<Item> SIGEL4_HELMET= ITEMS.register("sigel4_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.mani_helmet.tooltip",14));
    public static final RegistryObject<Item> SIGEL4_CHESTPLATE= ITEMS.register("sigel4_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.CHESTPLATE, new Item.Properties(),"item.tutorialmod.sigel4_chestplate.tooltip",14));
    public static final RegistryObject<Item> SIGEL4_LEGGINGS= ITEMS.register("sigel4_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.LEGGINGS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",14));
    public static final RegistryObject<Item> SIGEL4_BOOTS= ITEMS.register("sigel4_boots",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.BOOTS, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip",14));


    public static final RegistryObject<Item> ACELL_SEEDS = ITEMS.register("acell_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ACELL_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORVIVA_SEEDS = ITEMS.register("corviva_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORVIVA_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> DINAMI_SEEDS = ITEMS.register("dinami_seeds",
            () -> new ItemNameBlockItem(ModBlocks.DINAMI_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ESTELARIS_SEEDS = ITEMS.register("estelaris_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ESTELARIS_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> MIRACULA_SEEDS = ITEMS.register("miracula_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MIRACULA_CROP.get(), new Item.Properties()));





    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2480));

    public static final RegistryObject<Item> RALUQUEI_MUSIC_DISC = ITEMS.register("raluquei_music_disc",
            () -> new RecordItem(6, ModSounds.RALUQUEI, new Item.Properties().stacksTo(1), 3040));
    public static final RegistryObject<Item> SKIBIDI_MUSIC_DISC = ITEMS.register("skibidi_music_disc",
            () -> new RecordItem(6, ModSounds.SKIBIDI, new Item.Properties().stacksTo(1), 2560));
    public static final RegistryObject<Item> TRACER_MUSIC_DISC = ITEMS.register("tracer_music_disc",
            () -> new RecordItem(6, ModSounds.TRACER, new Item.Properties().stacksTo(1), 4140));
    public static final RegistryObject<Item> MERCY_MUSIC_DISC = ITEMS.register("mercy_music_disc",
            () -> new RecordItem(6, ModSounds.MERCY, new Item.Properties().stacksTo(1), 3440));

    public static final RegistryObject<Item> PRACA_MUSIC_DISC = ITEMS.register("praca_music_disc",
            () -> new RecordItem(6, ModSounds.PRACA, new Item.Properties().stacksTo(1), 4080));

    public static final RegistryObject<Item> EVIDENCIAS_MUSIC_DISC = ITEMS.register("evidencias_music_disc",
            () -> new RecordItem(6, ModSounds.EVIDENCIAS, new Item.Properties().stacksTo(1), 6000));

    public static final RegistryObject<Item> RECOMECAR_MUSIC_DISC = ITEMS.register("recomecar_music_disc",
            () -> new RecordItem(6, ModSounds.RECOMECAR, new Item.Properties().stacksTo(1), 4080));

    public static final RegistryObject<Item> LEMBRAR_MUSIC_DISC = ITEMS.register("lembrar_music_disc",
            () -> new RecordItem(6, ModSounds.LEMBRAR, new Item.Properties().stacksTo(1), 4440));

    public static final RegistryObject<Item> ESTRANHA_MUSIC_DISC = ITEMS.register("estranha_music_disc",
            () -> new RecordItem(6, ModSounds.ESTRANHA, new Item.Properties().stacksTo(1), 3600));

    public static final RegistryObject<Item> COMIGO_MUSIC_DISC = ITEMS.register("comigo_music_disc",
            () -> new RecordItem(6, ModSounds.COMIGO, new Item.Properties().stacksTo(1), 4320));

    public static final RegistryObject<Item> VAGALUMES_MUSIC_DISC = ITEMS.register("vagalumes_music_disc",
            () -> new RecordItem(6, ModSounds.VAGALUMES, new Item.Properties().stacksTo(1), 3440));

    public static final RegistryObject<Item> ELA_MUSIC_DISC = ITEMS.register("ela_music_disc",
            () -> new RecordItem(6, ModSounds.ELA, new Item.Properties().stacksTo(1), 3980));

    public static final RegistryObject<Item> BORBOLETAS_MUSIC_DISC = ITEMS.register("borboletas_music_disc",
            () -> new RecordItem(6, ModSounds.BORBOLETAS, new Item.Properties().stacksTo(1), 4060));

    public static final RegistryObject<Item> GARRAFA_MUSIC_DISC = ITEMS.register("garrafa_music_disc",
            () -> new RecordItem(6, ModSounds.GARRAFA, new Item.Properties().stacksTo(1), 4320));

    public static final RegistryObject<Item> DUROU_MUSIC_DISC = ITEMS.register("durou_music_disc",
            () -> new RecordItem(6, ModSounds.DUROU, new Item.Properties().stacksTo(1), 4240));

    public static final RegistryObject<Item> DELA_MUSIC_DISC = ITEMS.register("dela_music_disc",
            () -> new RecordItem(6, ModSounds.DELA, new Item.Properties().stacksTo(1), 3220));

    public static final RegistryObject<Item> BOA_MUSIC_DISC = ITEMS.register("boa_music_disc",
            () -> new RecordItem(6, ModSounds.BOA, new Item.Properties().stacksTo(1), 3960));

    public static final RegistryObject<Item> GRACA_MUSIC_DISC = ITEMS.register("graca_music_disc",
            () -> new RecordItem(6, ModSounds.GRACA, new Item.Properties().stacksTo(1), 3660));

    public static final RegistryObject<Item> ERRADA_MUSIC_DISC = ITEMS.register("errada_music_disc",
            () -> new RecordItem(6, ModSounds.ERRADA, new Item.Properties().stacksTo(1), 4220));

    public static final RegistryObject<Item> NEGAO_MUSIC_DISC = ITEMS.register("negao_music_disc",
            () -> new RecordItem(6, ModSounds.NEGAO, new Item.Properties().stacksTo(1), 5240));

    public static final RegistryObject<Item> SAUDADE_MUSIC_DISC = ITEMS.register("contrariar_music_disc",
            () -> new RecordItem(6, ModSounds.CONTRARIAR, new Item.Properties().stacksTo(1), 4880));

    public static final RegistryObject<Item> BARATA_MUSIC_DISC = ITEMS.register("barata_music_disc",
            () -> new RecordItem(6, ModSounds.BARATA, new Item.Properties().stacksTo(1), 4060));

    public static final RegistryObject<Item> PESCADOR_MUSIC_DISC = ITEMS.register("pescador_music_disc",
            () -> new RecordItem(6, ModSounds.PESCADOR, new Item.Properties().stacksTo(1), 4700));

    public static final RegistryObject<Item> BEN10_MUSIC_DISC = ITEMS.register("ben10_music_disc",
            () -> new RecordItem(6, ModSounds.BEN10, new Item.Properties().stacksTo(1), 1260));

    public static final RegistryObject<Item> MIM_MUSIC_DISC = ITEMS.register("mim_music_disc",
            () -> new RecordItem(6, ModSounds.MIM, new Item.Properties().stacksTo(1), 5040));

    public static final RegistryObject<Item> LIGACAO_MUSIC_DISC = ITEMS.register("ligacao_music_disc",
            () -> new RecordItem(6, ModSounds.LIGACAO, new Item.Properties().stacksTo(1), 4300));

    public static final RegistryObject<Item> FRENTE_MUSIC_DISC = ITEMS.register("frente_music_disc",
            () -> new RecordItem(6, ModSounds.FRENTE, new Item.Properties().stacksTo(1), 3740));

    public static final RegistryObject<Item> NORMAL_MUSIC_DISC = ITEMS.register("normal_music_disc",
            () -> new RecordItem(6, ModSounds.NORMAL, new Item.Properties().stacksTo(1), 4600));

    public static final RegistryObject<Item> REZO_MUSIC_DISC = ITEMS.register("rezo_music_disc",
            () -> new RecordItem(6, ModSounds.REZO, new Item.Properties().stacksTo(1), 5760));

    public static final RegistryObject<Item> ESTIVER_MUSIC_DISC = ITEMS.register("estiver_music_disc",
            () -> new RecordItem(6, ModSounds.ESTIVER, new Item.Properties().stacksTo(1), 4380));

    public static final RegistryObject<Item> TARDE_MUSIC_DISC = ITEMS.register("tarde_music_disc",
            () -> new RecordItem(6, ModSounds.TARDE, new Item.Properties().stacksTo(1), 3940));

    public static final RegistryObject<Item> EMOCOES_MUSIC_DISC = ITEMS.register("emocoes_music_disc",
            () -> new RecordItem(6, ModSounds.EMOCOES, new Item.Properties().stacksTo(1), 4440));

    public static final RegistryObject<Item> ABRIU_MUSIC_DISC = ITEMS.register("abriu_music_disc",
            () -> new RecordItem(6, ModSounds.ABRIU, new Item.Properties().stacksTo(1), 4640));

    public static final RegistryObject<Item> NIGHTMARE_MUSIC_DISC = ITEMS.register("nightmare_music_disc",
            () -> new RecordItem(6, ModSounds.NIGHTMARE, new Item.Properties().stacksTo(1), 7540));

    public static final RegistryObject<Item> AFTERLIFE_MUSIC_DISC = ITEMS.register("afterlife_music_disc",
            () -> new RecordItem(6, ModSounds.AFTERLIFE, new Item.Properties().stacksTo(1), 4880));

    public static final RegistryObject<Item> GOD_MUSIC_DISC = ITEMS.register("god_music_disc",
            () -> new RecordItem(6, ModSounds.GOD, new Item.Properties().stacksTo(1), 5680));

    public static final RegistryObject<Item> HEAVEN_MUSIC_DISC = ITEMS.register("heaven_music_disc",
            () -> new RecordItem(6, ModSounds.HEAVEN, new Item.Properties().stacksTo(1), 9220));

    public static final RegistryObject<Item> AWAY_MUSIC_DISC = ITEMS.register("away_music_disc",
            () -> new RecordItem(6, ModSounds.AWAY, new Item.Properties().stacksTo(1), 6600));

    public static final RegistryObject<Item> SPACE_MUSIC_DISC = ITEMS.register("space_music_disc",
            () -> new RecordItem(6, ModSounds.SPACE, new Item.Properties().stacksTo(1), 5480));

    public static final RegistryObject<Item> ROAR_MUSIC_DISC = ITEMS.register("roar_music_disc",
            () -> new RecordItem(6, ModSounds.ROAR, new Item.Properties().stacksTo(1), 4500));

    public static final RegistryObject<Item> HORSE_MUSIC_DISC = ITEMS.register("horse_music_disc",
            () -> new RecordItem(6, ModSounds.HORSE, new Item.Properties().stacksTo(1), 4540));

    public static final RegistryObject<Item> CHANDELIER_MUSIC_DISC = ITEMS.register("chandelier_music_disc",
            () -> new RecordItem(6, ModSounds.CHANDELIER, new Item.Properties().stacksTo(1), 4660));

    public static final RegistryObject<Item> YEARS_MUSIC_DISC = ITEMS.register("years_music_disc",
            () -> new RecordItem(6, ModSounds.YEARS, new Item.Properties().stacksTo(1), 5780));

    public static final RegistryObject<Item> BASS_MUSIC_DISC = ITEMS.register("bass_music_disc",
            () -> new RecordItem(6, ModSounds.BASS, new Item.Properties().stacksTo(1), 3820));

    public static final RegistryObject<Item> MAYBE_MUSIC_DISC = ITEMS.register("maybe_music_disc",
            () -> new RecordItem(6, ModSounds.MAYBE, new Item.Properties().stacksTo(1), 4020));

    public static final RegistryObject<Item> BLOOD_MUSIC_DISC = ITEMS.register("blood_music_disc",
            () -> new RecordItem(6, ModSounds.BLOOD, new Item.Properties().stacksTo(1), 4920));

    public static final RegistryObject<Item> CYCLONE_MUSIC_DISC = ITEMS.register("cyclone_music_disc",
            () -> new RecordItem(6, ModSounds.CYCLONE, new Item.Properties().stacksTo(1), 5560));

    public static final RegistryObject<Item> LOVE_MUSIC_DISC = ITEMS.register("love_music_disc",
            () -> new RecordItem(6, ModSounds.LOVE, new Item.Properties().stacksTo(1), 4380));

    public static final RegistryObject<Item> FLY_MUSIC_DISC = ITEMS.register("fly_music_disc",
            () -> new RecordItem(6, ModSounds.FLY, new Item.Properties().stacksTo(1), 3940));

    public static final RegistryObject<Item> GIRL_MUSIC_DISC = ITEMS.register("girl_music_disc",
            () -> new RecordItem(6, ModSounds.GIRL, new Item.Properties().stacksTo(1), 5170));



    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));
    public static final RegistryObject<Item> HEAL = ITEMS.register("heal",
            () -> new HealItem(new Item.Properties()));

//    public static final RegistryObject<Item> RHINO_SPANW_EGG = ITEMS.register("rhino_spawn_egg",
//            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
////    public static final ItemStack getScaryBook() {
//////        return BookUtil.createBook("God", "Registry Out", BookUtil.REGISTRY_OUT_PAGES);
////    }
//
//    ItemStack scaryBook = ModItems.getScaryBook();

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
