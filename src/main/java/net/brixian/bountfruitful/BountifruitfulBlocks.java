package net.brixian.bountfruitful;


import net.brixian.bountfruitful.block.BountifruitfulBlockKeys;
import net.brixian.bountfruitful.item.BountifruitfulItemKeys;
import net.brixian.bountfruitful.world.tree.BountifruitfulSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BountifruitfulBlocks {




    //Non-Blocks Doesn't really matter for the most part
    //hi


    public static final Block CANTALOUPE_STEM = registerBlockWithoutBlockItem("cantaloupe_stem",
            new StemBlock(
                    BountifruitfulBlockKeys.CANTALOUPE,
                    BountifruitfulBlockKeys.ATTACHED_CANTALOUPE_STEM,
                    BountifruitfulItemKeys.CANTALOUPE_SEEDS,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.STEM)
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block ATTACHED_CANTALOUPE_STEM = registerBlockWithoutBlockItem("attached_cantaloupe_stem",
            new AttachedStemBlock(
                    BountifruitfulBlockKeys.CANTALOUPE,
                    BountifruitfulBlockKeys.CANTALOUPE_STEM,
                    BountifruitfulItemKeys.CANTALOUPE_SEEDS,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.WOOD)
                            .pistonBehavior(PistonBehavior.DESTROY)));

    //Saplings
    public static final Block MANGOSTEEN_SAPLING = registerBlock("mangosteen_sapling",
            new SaplingBlock(BountifruitfulSaplingGenerator.MANGOSTEEN, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block PAPAYA_SAPLING = registerBlock("papaya_sapling",
            new SaplingBlock(BountifruitfulSaplingGenerator.PAPAYA, AbstractBlock.Settings.copy(Blocks.ACACIA_SAPLING)));

    public static final Block FIG_SAPLING = registerBlock("fig_sapling",
            new SaplingBlock(BountifruitfulSaplingGenerator.FIG, AbstractBlock.Settings.copy(Blocks.ACACIA_SAPLING)));

    //Blocks
    public static final Block CANTALOUPE = registerBlock( "cantaloupe",
            new Block(AbstractBlock.Settings.create()));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Bountifruitful.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Bountifruitful.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Bountifruitful.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerBountfruitfulBlocks() {
    Bountifruitful.LOGGER.info("Registering Mod Blocks for " + Bountifruitful.MOD_ID);
    }
}
