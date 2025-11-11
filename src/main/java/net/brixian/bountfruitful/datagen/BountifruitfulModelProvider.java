package net.brixian.bountfruitful.datagen;

import net.brixian.bountfruitful.BountifruitfulBlocks;
import net.brixian.bountfruitful.block.GhastPepperCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class BountifruitfulModelProvider extends FabricModelProvider {
    public BountifruitfulModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Crops
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(BountifruitfulBlocks.GHAST_PEPPER_CROP, BlockStateModelGenerator.TintType.NOT_TINTED,
                GhastPepperCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        //Saplings
        blockStateModelGenerator.registerTintableCrossBlockState(BountifruitfulBlocks.FIG_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(BountifruitfulBlocks.MANGOSTEEN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(BountifruitfulBlocks.PAPAYA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
