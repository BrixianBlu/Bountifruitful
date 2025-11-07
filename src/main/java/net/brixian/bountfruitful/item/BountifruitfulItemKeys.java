package net.brixian.bountfruitful.item;

import net.brixian.bountfruitful.Bountifruitful;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class BountifruitfulItemKeys {

    public static final RegistryKey<Item> CANTALOUPE_SEEDS = ofBountfruitiful("cantaloupe_seeds");


    private static RegistryKey<Item> ofBountfruitiful(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bountifruitful.MOD_ID, id))
    ;}
}
