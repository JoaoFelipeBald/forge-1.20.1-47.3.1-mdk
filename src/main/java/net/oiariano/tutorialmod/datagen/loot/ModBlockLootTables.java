package net.oiariano.tutorialmod.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.oiariano.tutorialmod.block.ModBlocks;
import net.oiariano.tutorialmod.block.custom.AcellCropBlock;
import net.oiariano.tutorialmod.block.custom.CorvivaCropBlock;
import net.oiariano.tutorialmod.block.custom.DinamiCropBlock;
import net.oiariano.tutorialmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.dropSelf(ModBlocks.BSIGEL_PRINCIPAL.get());
        this.dropSelf(ModBlocks.BSIGEL_ARMEIRO.get());
        this.dropSelf(ModBlocks.BSIGEL_COLECIONADOR.get());
        this.dropSelf(ModBlocks.BSIGEL_FERREIRO.get());
        //dropself ele se dropa e createCopperLike ele é afetado por fortuna
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));

        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ACELL_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AcellCropBlock.AGE, 5));
        this.add(ModBlocks.ACELL_CROP.get(), createCropDrops(ModBlocks.ACELL_CROP.get(), ModItems.ACCEL.get(),
                ModItems.ACELL_SEEDS.get(), lootitemcondition$builder));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORVIVA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CorvivaCropBlock.AGE, 5));
        this.add(ModBlocks.CORVIVA_CROP.get(), createCropDrops(ModBlocks.CORVIVA_CROP.get(), ModItems.CORVIVA.get(),
                ModItems.CORVIVA_SEEDS.get(), lootitemcondition$builder2));

        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ESTELARIS_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CorvivaCropBlock.AGE, 5));
        this.add(ModBlocks.ESTELARIS_CROP.get(), createCropDrops(ModBlocks.ESTELARIS_CROP.get(), ModItems.ESTELARIS.get(),
                ModItems.ESTELARIS_SEEDS.get(), lootitemcondition$builder4));

        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.MIRACULA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CorvivaCropBlock.AGE, 5));
        this.add(ModBlocks.MIRACULA_CROP.get(), createCropDrops(ModBlocks.MIRACULA_CROP.get(), ModItems.MIRACULA.get(),
                ModItems.MIRACULA_SEEDS.get(), lootitemcondition$builder5));

        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.DINAMI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DinamiCropBlock.AGE, 7))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.DINAMI_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DinamiCropBlock.AGE, 8)));

        this.add(ModBlocks.DINAMI_CROP.get(), createCropDrops(ModBlocks.DINAMI_CROP.get(), ModItems.DINAMI.get(),
                ModItems.DINAMI.get(), lootitemcondition$builder3));

        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8));

        this.dropSelf(ModBlocks.CATMINT.get());
        this.add(ModBlocks.POTTED_CATMINT.get(), createPotFlowerItemTable(ModBlocks.CATMINT.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}