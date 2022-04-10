package com.yujiro.firstmod.datagen.server;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.init.ItemInit;
import com.yujiro.firstmod.init.TagInit;
import com.yujiro.firstmod.init.blockinit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider{

	public ModItemTagsProvider(DataGenerator genetator, BlockTagsProvider provider,
			ExistingFileHelper helper) {
		super(genetator, provider, FirstMod.MOD_ID, helper);
		}

	@Override
	protected void addTags() {
		tag(TagInit.ExampleTools.EXAMPLE_TOOLS).add(ItemInit.EXAMPLE_AXE.get().asItem());
		tag(TagInit.ExampleTools.EXAMPLE_TOOLS).add(ItemInit.EXAMPLE_HOE.get().asItem());
		tag(TagInit.ExampleTools.EXAMPLE_TOOLS).add(ItemInit.EXAMPLE_PICKAXE.get().asItem());
		tag(TagInit.ExampleTools.EXAMPLE_TOOLS).add(ItemInit.EXAMPLE_SHOVEL.get().asItem());
		tag(TagInit.ExampleTools.EXAMPLE_TOOLS).add(ItemInit.EXAMPLE_SWORD.get().asItem());
	}
}
