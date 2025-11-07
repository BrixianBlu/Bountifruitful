package net.brixian.bountfruitful.block;

import net.brixian.bountfruitful.Bountifruitful;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class BountifruitfulBlockKeys {
    public static final RegistryKey<Block> CANTALOUPE = of("cantaloupe");
    public static final RegistryKey<Block> CANTALOUPE_STEM = of("cantaloupe_stem");
    public static final RegistryKey<Block> ATTACHED_CANTALOUPE_STEM = of("attached_cantaloupe_stem");

    private static RegistryKey<Block> of(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Bountifruitful.MOD_ID, id));
    }
}
