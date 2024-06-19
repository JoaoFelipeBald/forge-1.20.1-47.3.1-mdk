package net.oiariano.tutorialmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.entity.ModEntities;
import net.oiariano.tutorialmod.item.custom.*;
import net.oiariano.tutorialmod.sound.ModSounds;
import net.oiariano.tutorialmod.util.BookUtil;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

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
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.calice_sigel_sigel.tooltip"));
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

    public static final RegistryObject<Item> SUPRIMENTO_DO_FERREIRO = ITEMS.register("suprimento_do_ferreiro",
            () -> new Item(new Item.Properties()));

    

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> HEALER_STAFF1 = ITEMS.register("healer_staff1",
            () -> new HealerStaff(new Item.Properties().durability(100),1));

    public static final RegistryObject<Item> HEALER_STAFF2 = ITEMS.register("healer_staff2",
            () -> new HealerStaff(new Item.Properties().durability(100),4));

    public static final RegistryObject<Item> HEALER_STAFF3 = ITEMS.register("healer_staff3",
            () -> new HealerStaff(new Item.Properties().durability(100),4));

    public static final RegistryObject<Item> HEALER_STAFF4 = ITEMS.register("healer_staff4",
            () -> new HealerStaff(new Item.Properties().durability(100),4));

    public static final RegistryObject<Item> HEALER_STAFF5 = ITEMS.register("healer_staff5",
            () -> new HealerStaff(new Item.Properties().durability(100),4));

    public static final RegistryObject<Item> HEALER_STAFF6 = ITEMS.register("healer_staff6",
            () -> new HealerStaff(new Item.Properties().durability(100),23));


    public static final RegistryObject<Item> ACCEL= ITEMS.register("accel",
            () -> new Item(new Item.Properties().food(ModFoods.ACCEL)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> CORVIVA= ITEMS.register("corviva",
            () -> new Item(new Item.Properties().food(ModFoods.CORVIVA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> ESTELARIS= ITEMS.register("estelaris",
            () -> new Item(new Item.Properties().food(ModFoods.ESTELARIS)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> DINAMITA= ITEMS.register("dinamita",
            () -> new Item(new Item.Properties().food(ModFoods.DINAMITA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> MIRACULA= ITEMS.register("miracula",
            () -> new Item(new Item.Properties().food(ModFoods.MIRACULA)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });
    public static final RegistryObject<Item> DINAMI = ITEMS.register("dinami",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<net.minecraft.network.chat.Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("item.tutorialmod.accel.tooltip"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });


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
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.sapphire_helmet.tooltip"));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE= ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS= ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS= ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ELMO_MINEIRO= ITEMS.register("elmo_mineiro",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.elmo_mineiro.tooltip"));

    public static final RegistryObject<Item> MANI_HELMET= ITEMS.register("mani_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.mani_helmet.tooltip"));
    public static final RegistryObject<Item> MANI_CHESTPLATE= ITEMS.register("mani_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MANI_LEGGINGS= ITEMS.register("mani_leggings",
            () -> new ArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MANI_BOOTS= ITEMS.register("mani_boots",
            () -> new ArmorItem(ModArmorMaterials.MANI, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SIGEL1_HELMET= ITEMS.register("sigel1_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.HELMET, new Item.Properties(),"item.tutorialmod.sigel1_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL1_CHESTPLATE= ITEMS.register("sigel1_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL1_LEGGINGS= ITEMS.register("sigel1_leggings",
            () -> new ArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL1_BOOTS= ITEMS.register("sigel1_boots",
            () -> new ArmorItem(ModArmorMaterials.SIGEL1, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SIGEL2_HELMET= ITEMS.register("sigel2_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.sigel2_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL2_CHESTPLATE= ITEMS.register("sigel2_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL2_LEGGINGS= ITEMS.register("sigel2_leggings",
            () -> new ArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL2_BOOTS= ITEMS.register("sigel2_boots",
            () -> new ArmorItem(ModArmorMaterials.SIGEL2, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SIGEL3_HELMET= ITEMS.register("sigel3_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.sigel3_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL3_CHESTPLATE= ITEMS.register("sigel3_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL3_LEGGINGS= ITEMS.register("sigel3_leggings",
            () -> new ArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SIGEL3_BOOTS= ITEMS.register("sigel3_boots",
            () -> new ArmorItem(ModArmorMaterials.SIGEL3, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SIGEL4_HELMET= ITEMS.register("sigel4_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.HELMET, new Item.Properties(), "item.tutorialmod.sigel1_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL4_CHESTPLATE= ITEMS.register("sigel4_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.CHESTPLATE, new Item.Properties(),"item.tutorialmod.sigel1_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL4_LEGGINGS= ITEMS.register("sigel4_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.LEGGINGS, new Item.Properties(),"item.tutorialmod.sigel1_helmet.tooltip"));
    public static final RegistryObject<Item> SIGEL4_BOOTS= ITEMS.register("sigel4_boots",
            () -> new ModArmorItem(ModArmorMaterials.SIGEL4, ArmorItem.Type.BOOTS, new Item.Properties(),"item.tutorialmod.sigel1_helmet.tooltip"));


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
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));
    public static final RegistryObject<Item> HEAL = ITEMS.register("heal",
            () -> new HealItem(new Item.Properties()));

    public static final RegistryObject<Item> RHINO_SPANW_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final ItemStack getScaryBook() {
        return BookUtil.createBook("God", "Registry Out", BookUtil.REGISTRY_OUT_PAGES);
    }

    ItemStack scaryBook = ModItems.getScaryBook();

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
