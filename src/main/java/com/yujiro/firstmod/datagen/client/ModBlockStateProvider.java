package com.yujiro.firstmod.datagen.client;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.init.blockinit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider{

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, FirstMod.MOD_ID, exFileHelper);
		
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(blockinit.EXAMPLE_BLOCK.get());
		
		simpleBlock(blockinit.EXAMPLE_ORE.get());
	}

}
