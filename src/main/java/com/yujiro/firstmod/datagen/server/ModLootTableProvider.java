package com.yujiro.firstmod.datagen.server;

import com.yujiro.firstmod.datagen.BaseLootTableProvider;
import com.yujiro.firstmod.init.blockinit;

import net.minecraft.data.DataGenerator;

public class ModLootTableProvider extends BaseLootTableProvider{

	public ModLootTableProvider(DataGenerator generator) {
		super(generator);
		
	}

	@Override
	protected void addTables() {
		add(blockinit.EXAMPLE_BLOCK.get(), createSimpleTable(blockinit.EXAMPLE_BLOCK.get().getRegistryName().getPath(), blockinit.EXAMPLE_BLOCK.get()));
	}

}
 