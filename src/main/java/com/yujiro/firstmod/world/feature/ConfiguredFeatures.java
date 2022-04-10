package com.yujiro.firstmod.world.feature;

import java.util.List;

import com.yujiro.firstmod.init.blockinit;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class ConfiguredFeatures {

	public static final List<OreConfiguration.TargetBlockState> OVERWORLD_EXAMPLE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, blockinit.EXAMPLE_ORE.get().defaultBlockState()));
	
	 public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EXAMPLE_ORE = FeatureUtils.register("example_ore",
	            Feature.ORE, new OreConfiguration(OVERWORLD_EXAMPLE_ORES, 30));
}
