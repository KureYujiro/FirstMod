package com.yujiro.firstmod.world.feature;

import com.yujiro.firstmod.world.feature.OrePlacement.ModOrePlacement;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatures {

	    public static final Holder<PlacedFeature> EXAMPLE_ORE_PLACED = PlacementUtils.register("example_ore_placed",
	            ConfiguredFeatures.EXAMPLE_ORE, ModOrePlacement.commonOrePlacement(30, // VeinsPerChunk
	                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
