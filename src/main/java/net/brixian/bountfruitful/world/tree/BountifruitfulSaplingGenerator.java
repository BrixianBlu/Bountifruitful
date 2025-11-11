package net.brixian.bountfruitful.world.tree;

import net.brixian.bountfruitful.Bountifruitful;
import net.brixian.bountfruitful.world.BountifruitfulConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class BountifruitfulSaplingGenerator {
    public static final SaplingGenerator MANGOSTEEN = new SaplingGenerator(Bountifruitful.MOD_ID + ":mangosteen",
            Optional.empty(), Optional.of(BountifruitfulConfiguredFeatures.MANGOSTEEN_KEY), Optional.empty());

    public static final SaplingGenerator PAPAYA = new SaplingGenerator(Bountifruitful.MOD_ID + ":papaya",
            Optional.empty(), Optional.of(BountifruitfulConfiguredFeatures.PAPAYA_KEY), Optional.empty());

    public static final SaplingGenerator FIG = new SaplingGenerator(Bountifruitful.MOD_ID + ":fig",
            Optional.empty(), Optional.of(BountifruitfulConfiguredFeatures.FIG_KEY), Optional.empty());
}
