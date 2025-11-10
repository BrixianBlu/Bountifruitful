package net.brixian.bountfruitful.world.tree;

import net.brixian.bountfruitful.Bountifruitful;
import net.brixian.bountfruitful.world.BountifruitfulConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class BountifruitfulSaplingGenerator {
    public static final SaplingGenerator MANGOSTEEN = new SaplingGenerator(Bountifruitful.MOD_ID + ":mangosteen_tree",
            Optional.empty(), Optional.of(BountifruitfulConfiguredFeatures.MANGOSTEEN_KEY), Optional.empty());
}
