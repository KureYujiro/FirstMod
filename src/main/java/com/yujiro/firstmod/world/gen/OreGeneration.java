package com.yujiro.firstmod.world.gen;

import java.util.List;

import com.yujiro.firstmod.world.feature.PlacedFeatures;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

	   public static void generateOres(final BiomeLoadingEvent event) {
	        List<Holder<PlacedFeature>> base =
	                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

	        base.add(PlacedFeatures.EXAMPLE_ORE_PLACED);
	    }
	   
}
