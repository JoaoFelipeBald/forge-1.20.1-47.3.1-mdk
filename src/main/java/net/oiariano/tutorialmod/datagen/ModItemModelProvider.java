package net.oiariano.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.FRAGMENTO_SIGEL);
        simpleItem(ModItems.UPGRADE_SIGEL);
        simpleItem(ModItems.RAW_SAPPHIRE);

        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.ACCEL);
        simpleItem(ModItems.ESTELARIS);
        simpleItem(ModItems.MIRACULA);
        simpleItem(ModItems.DINAMITA);
        simpleItem(ModItems.CORVIVA);
        simpleItem(ModItems.DINAMI);
        simpleItem(ModItems.PIRARUCU);
        simpleItem(ModItems.ENERGY);
        simpleItem(ModItems.PAMONHA);
        simpleItem(ModItems.DINHEIRO_PEIXE);

        simpleItem(ModItems.RALUQUEI_MUSIC_DISC);
        simpleItem(ModItems.SKIBIDI_MUSIC_DISC);
        simpleItem(ModItems.TRACER_MUSIC_DISC);
        simpleItem(ModItems.MERCY_MUSIC_DISC);

        simpleItem(ModItems.PERGAMINHO_SIGEL);
        simpleItem(ModItems.MAPA_SIGEL);
        simpleItem(ModItems.CALICE_SIGEL);
        simpleItem(ModItems.POTE_SIGEL);
        simpleItem(ModItems.AMULETO_SIGEL);
        simpleItem(ModItems.DINHEIRO_SIGEL);
        simpleItem(ModItems.RELOGIO_MANI);
        simpleItem(ModItems.FACA_MANI);
        simpleItem(ModItems.JORNAL_MANI);
        simpleItem(ModItems.LANTERNA_MANI);
        simpleItem(ModItems.AMULETO_MANI);
        simpleItem(ModItems.DINHEIRO_MANI);

        simpleItem(ModItems.CUSTOM_ENCHANTED_BOOK);
        simpleItem(ModItems.CUSTOM_ENCHANTED_BOOK2);

        simpleItem(ModItems.SUPRIMENTO_DO_FERREIRO);

        simpleItem(ModItems.MANI_HELMET);
        simpleItem(ModItems.MANI_CHESTPLATE);
        simpleItem(ModItems.MANI_LEGGINGS);
        simpleItem(ModItems.MANI_BOOTS);

        simpleItem(ModItems.ELMO_MINEIRO);
        simpleItem(ModItems.HEALER_STAFF1);
        simpleItem(ModItems.HEALER_STAFF2);
        simpleItem(ModItems.HEALER_STAFF3);
        simpleItem(ModItems.HEALER_STAFF4);
        simpleItem(ModItems.HEALER_STAFF5);
        simpleItem(ModItems.HEALER_STAFF6);

        simpleItem(ModItems.SIGEL1_HELMET);
        simpleItem(ModItems.SIGEL1_CHESTPLATE);
        simpleItem(ModItems.SIGEL1_LEGGINGS);
        simpleItem(ModItems.SIGEL1_BOOTS);

        simpleItem(ModItems.SIGEL2_HELMET);
        simpleItem(ModItems.SIGEL2_CHESTPLATE);
        simpleItem(ModItems.SIGEL2_LEGGINGS);
        simpleItem(ModItems.SIGEL2_BOOTS);

        simpleItem(ModItems.SIGEL3_HELMET);
        simpleItem(ModItems.SIGEL3_CHESTPLATE);
        simpleItem(ModItems.SIGEL3_LEGGINGS);
        simpleItem(ModItems.SIGEL3_BOOTS);

        simpleItem(ModItems.SIGEL4_HELMET);
        simpleItem(ModItems.SIGEL4_CHESTPLATE);
        simpleItem(ModItems.SIGEL4_LEGGINGS);
        simpleItem(ModItems.SIGEL4_BOOTS);


        simpleItem(ModItems.ACELL_SEEDS);
        simpleItem(ModItems.ESTELARIS_SEEDS);
        simpleItem(ModItems.MIRACULA_SEEDS);
        simpleItem(ModItems.DINAMI_SEEDS);
        simpleItem(ModItems.CORVIVA_SEEDS);

        simpleItem(ModItems.BAR_BRAWL_MUSIC_DISC);

        simpleItem(ModItems.PRACA_MUSIC_DISC);
        simpleItem(ModItems.EVIDENCIAS_MUSIC_DISC);
        simpleItem(ModItems.RECOMECAR_MUSIC_DISC);
        simpleItem(ModItems.LEMBRAR_MUSIC_DISC);
        simpleItem(ModItems.ESTRANHA_MUSIC_DISC);
        simpleItem(ModItems.COMIGO_MUSIC_DISC);
        simpleItem(ModItems.VAGALUMES_MUSIC_DISC);
        simpleItem(ModItems.ELA_MUSIC_DISC);
        simpleItem(ModItems.BORBOLETAS_MUSIC_DISC);
        simpleItem(ModItems.GARRAFA_MUSIC_DISC);
        simpleItem(ModItems.DUROU_MUSIC_DISC);
        simpleItem(ModItems.DELA_MUSIC_DISC);
        simpleItem(ModItems.BOA_MUSIC_DISC);
        simpleItem(ModItems.GRACA_MUSIC_DISC);
        simpleItem(ModItems.ERRADA_MUSIC_DISC);
        simpleItem(ModItems.NEGAO_MUSIC_DISC);
        simpleItem(ModItems.SAUDADE_MUSIC_DISC);
        simpleItem(ModItems.BARATA_MUSIC_DISC);
        simpleItem(ModItems.PESCADOR_MUSIC_DISC);
        simpleItem(ModItems.BEN10_MUSIC_DISC);

        simpleItem(ModItems.MIM_MUSIC_DISC);
        simpleItem(ModItems.LIGACAO_MUSIC_DISC);
        simpleItem(ModItems.FRENTE_MUSIC_DISC);
        simpleItem(ModItems.NORMAL_MUSIC_DISC);
        simpleItem(ModItems.REZO_MUSIC_DISC);
        simpleItem(ModItems.ESTIVER_MUSIC_DISC);
        simpleItem(ModItems.TARDE_MUSIC_DISC);
        simpleItem(ModItems.EMOCOES_MUSIC_DISC);
        simpleItem(ModItems.ABRIU_MUSIC_DISC);
        simpleItem(ModItems.NIGHTMARE_MUSIC_DISC);
        simpleItem(ModItems.AFTERLIFE_MUSIC_DISC);
        simpleItem(ModItems.GOD_MUSIC_DISC);
        simpleItem(ModItems.HEAVEN_MUSIC_DISC);
        simpleItem(ModItems.AWAY_MUSIC_DISC);
        simpleItem(ModItems.SPACE_MUSIC_DISC);
        simpleItem(ModItems.ROAR_MUSIC_DISC);
        simpleItem(ModItems.HORSE_MUSIC_DISC);
        simpleItem(ModItems.CHANDELIER_MUSIC_DISC);
        simpleItem(ModItems.YEARS_MUSIC_DISC);
        simpleItem(ModItems.BASS_MUSIC_DISC);
        simpleItem(ModItems.MAYBE_MUSIC_DISC);
        simpleItem(ModItems.BLOOD_MUSIC_DISC);
        simpleItem(ModItems.CYCLONE_MUSIC_DISC);
        simpleItem(ModItems.LOVE_MUSIC_DISC);
        simpleItem(ModItems.FLY_MUSIC_DISC);
        simpleItem(ModItems.GIRL_MUSIC_DISC);

        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);

        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        handheldItem(ModItems.SAPPHIRE_SWORD);
        handheldItem(ModItems.SAPPHIRE_PICKAXE);
        handheldItem(ModItems.SAPPHIRE_AXE);
        handheldItem(ModItems.SAPPHIRE_SHOVEL);
        handheldItem(ModItems.SAPPHIRE_HOE);

        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);

        trimmedArmorItem(ModItems.SAPPHIRE_HELMET);
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS);

        simpleBlockItemBlockTexture(ModBlocks.CATMINT);

        simpleItem(ModItems.DICE);
        simpleItem(ModItems.HEAL);

     //   withExistingParent(ModItems.RHINO_SPANW_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = TutorialMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(TutorialMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(TutorialMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(TutorialMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TutorialMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID,"block/" + item.getId().getPath()));
    }
}