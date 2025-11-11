package net.brixian.bountfruitful.datagen;

import net.brixian.bountfruitful.BountifruitfulBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BountifruitfulLootTableProvider extends FabricBlockLootTableProvider {
    public BountifruitfulLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BountifruitfulBlocks.CANTALOUPE);
    }
}
