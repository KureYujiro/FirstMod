package com.yujiro.firstmod.init;

import com.yujiro.firstmod.FirstMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class TagInit {

	public static final class Blocks{
		
		public static final TagKey<Block>COOL_BLOCKS = mod("cool_blocks");
		
		private static TagKey<Block> mod(String path){
			return BlockTags.create(new ResourceLocation(FirstMod.MOD_ID, path));
		}
		
	}
	
	public static final class Items{
		
		public static final TagKey<Item>COOL_ITEMS = mod("cool_items");
		
		private static TagKey<Item> mod(String path){
			return ItemTags.create(new ResourceLocation(FirstMod.MOD_ID, path));
		}
	}
	
	public static final class ExampleTools{
		
		public static final TagKey<Item>EXAMPLE_TOOLS = mod("example_tools");
		
		private static TagKey<Item>mod(String path){
			return ItemTags.create(new ResourceLocation(FirstMod.MOD_ID, path));
		}
	}
}
