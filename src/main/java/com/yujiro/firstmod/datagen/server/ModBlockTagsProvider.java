package com.yujiro.firstmod.datagen.server;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.init.TagInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider{

	public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, FirstMod.MOD_ID, helper);
		
	}

	@Override
	protected void addTags() {
	}
}
