package net.brixian.bountfruitful;

import net.brixian.bountfruitful.datagen.BountifruitfulRegistryDataGenerator;
import net.brixian.bountfruitful.world.BountifruitfulConfiguredFeatures;
import net.brixian.bountfruitful.world.BountifruitfulPlacedFeatures;
import net.brixian.bountfruitful.world.gen.BountifruitfulWorldGeneration;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BountifruitfulDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BountifruitfulRegistryDataGenerator::new);
		pack.addProvider(BountifruitfulWorldGeneration::new);

	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BountifruitfulConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BountifruitfulPlacedFeatures::bootstrap);

	}
}
