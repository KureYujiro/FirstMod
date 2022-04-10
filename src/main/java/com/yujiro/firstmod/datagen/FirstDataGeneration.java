package com.yujiro.firstmod.datagen;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.datagen.client.ModBlockStateProvider;
import com.yujiro.firstmod.datagen.client.ModItemModelProvider;
import com.yujiro.firstmod.datagen.client.lang.ModEnUsProvider;
import com.yujiro.firstmod.datagen.server.ModBlockTagsProvider;
import com.yujiro.firstmod.datagen.server.ModItemTagsProvider;
import com.yujiro.firstmod.datagen.server.ModLootTableProvider;
import com.yujiro.firstmod.datagen.server.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Bus.MOD)
public class FirstDataGeneration {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();
		
		if (event.includeClient()) {
			generator.addProvider(new ModBlockStateProvider(generator, helper));
			generator.addProvider(new ModItemModelProvider(generator, helper));
			generator.addProvider(new ModEnUsProvider(generator));
		}	
		
		if (event.includeServer()) {
			
			ModBlockTagsProvider blocktags = new ModBlockTagsProvider(generator, helper);
			
			generator.addProvider(new ModRecipeProvider(generator));
			generator.addProvider(blocktags);
			generator.addProvider(new ModItemTagsProvider(generator, blocktags, helper));
			generator.addProvider(new ModLootTableProvider(generator));
			
		}
	}
}
