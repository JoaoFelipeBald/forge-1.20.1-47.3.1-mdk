package net.oiariano.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.item.ModItems;
import net.oiariano.tutorialmod.loot.AddItemModifier;

import java.util.Arrays;
import java.util.List;


public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, TutorialMod.MOD_ID);
    }

    @Override
    protected void start() {
        // List of chest loot tables to target
        List<String> chestLootTables = Arrays.asList(
                "chests/stronghold_crossing",
                "chests/jungle_temple",
                "chests/stronghold_library",
                "chests/underwater_ruin_big",
                "chests/pillager_outpost",
                "chests/abandoned_mineshaft",
                "chests/simple_dungeon",
                "chests/bastion_hoglin_stable",
                "chests/ancient_city",
                "chests/nether_bridge",
                "chests/bastion_bridge",
                "chests/igloo_chest",
                "chests/ancient_city_ice_box",
                "chests/village/village_fisher",
                "chests/stronghold_corridor",
                "chests/woodland_mansion",
                "chests/end_city_treasure",
                "chests/buried_treasure",
                "chests/village/village_weaponsmith",
                "chests/bastion_treasure",
                "chests/village/village_butcher",
                "chests/village/village_snowy_house",
                "chests/village/village_tannery",
                "chests/village/village_taiga_house",
                "chests/village/village_desert_house",
                "chests/village/village_toolsmith",
                "chests/village/village_fletcher",
                "chests/village/village_armorer",
                "chests/village/village_temple",
                "chests/village/village_cartographer",
                "chests/village/village_savanna_house",
                "chests/village/village_mason",
                "chests/desert_pyramid"
        );

        List<Item> itemsToAdd = Arrays.asList(
                ModItems.POTE_SIGEL.get(),
                ModItems.JORNAL_MANI.get(),
                ModItems.MAPA_SIGEL.get(),
                ModItems.LANTERNA_MANI.get(),
                ModItems.PERGAMINHO_SIGEL.get(),
                ModItems.FACA_MANI.get(),
                ModItems.AMULETO_SIGEL.get(),
                ModItems.AMULETO_MANI.get(),
                ModItems.CALICE_SIGEL.get(),
                ModItems.RELOGIO_MANI.get()
       //         ModItems.MIRACULA.get()
        );

        for (int i = 0; i < itemsToAdd.size(); i++) {
            Item item = itemsToAdd.get(i);
            int chance = (int) Math.floor((i/2+1)*1.5);
      //      if (item==ModItems.MIRACULA.get()){chance=1;}

            for (String chest : chestLootTables) {
                addItemToChest(chest, item, chance);
            }
        }
    }

    private void addItemToChest(String chestLootTable, Item item, int chance) {
        add(item.getDescriptionId() + "_in_" + chestLootTable.replace("/", "_"),
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(new ResourceLocation(chestLootTable)).build(),
                        LootItemRandomChanceCondition.randomChance(1f/chance).build()
                }, item));
    }
}