package com.yujiro.firstmod.world;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.world.gen.OreGeneration;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID)
public class WorldEvents {
	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		OreGeneration.generateOres(event);

	}
}