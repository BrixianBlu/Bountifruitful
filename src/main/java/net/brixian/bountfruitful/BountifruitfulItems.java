package net.brixian.bountfruitful;

import net.brixian.bountfruitful.item.BountifruitfulFoodComponents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BountifruitfulItems {

    //Fruits & Plants

    public static final Item MANGOSTEEN = registerItem("mangosteen", new Item(new Item.Settings().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true).food(BountifruitfulFoodComponents.MANGOSTEEN)));
    public static final Item UNFRUITZIABUL = registerItem("unfruitziabul", new Item(new Item.Settings()));
    public static final Item GHAST_PEPPER = registerItem("ghast_pepper", new Item(new Item.Settings()));

    //Seeds
    public static final Item SPROUTED_BEAN = registerItem("sprouted_bean", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item CANTALOUPE_SEEDS = registerItem("cantaloupe_seeds", new AliasedBlockItem(BountifruitfulBlocks.CANTALOUPE_STEM, new Item.Settings()));
    public static final Item GHAST_PEPPER_SEEDS = registerItem("ghast_pepper_seeds", new AliasedBlockItem(BountifruitfulBlocks.GHAST_PEPPER_CROP, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bountifruitful.MOD_ID, name), item);
    }

    public static void registerBountfruitfulItems() {
    Bountifruitful.LOGGER.info("Registering Mod Items for " + Bountifruitful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BountifruitfulItems.MANGOSTEEN);
            fabricItemGroupEntries.add(UNFRUITZIABUL);
            fabricItemGroupEntries.add(CANTALOUPE_SEEDS);
        });



    }
}
