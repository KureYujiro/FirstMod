package com.yujiro.firstmod.datagen.server;

import java.util.function.Consumer;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.init.ItemInit;
import com.yujiro.firstmod.init.TagInit;
import com.yujiro.firstmod.init.blockinit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModRecipeProvider extends RecipeProvider{

	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		
		//Ore to block
		ShapedRecipeBuilder.shaped(blockinit.EXAMPLE_BLOCK.get())
			.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
			.pattern("aaa").pattern("aaa").pattern("aaa")
			.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
			.save(consumer, new ResourceLocation(FirstMod.MOD_ID, blockinit.EXAMPLE_BLOCK.get().getRegistryName().getPath()));
		
		
		//Block to ore
		ShapelessRecipeBuilder.shapeless(ItemInit.EXAMPLE_ITEM.get().asItem(), 9)
			.requires(blockinit.EXAMPLE_BLOCK.get())
			.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
			.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath()));
		
		
		//Stick
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_STICK.get())
		.define('a', blockinit.EXAMPLE_PLANKS.get().asItem())
		.pattern("a  ").pattern("a  ")
		.unlockedBy("has_" + blockinit.EXAMPLE_PLANKS.get().getRegistryName().getPath(), has(blockinit.EXAMPLE_PLANKS.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_STICK.get().getRegistryName().getPath()));
		
		//Tools
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_SWORD.get())
		.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
		.define('b', ItemInit.EXAMPLE_STICK.get().asItem() )
		.pattern(" a ").pattern(" a ").pattern(" b ")
		.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_SWORD.get().getRegistryName().getPath()));
		
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_PICKAXE.get())
		.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
		.define('b', ItemInit.EXAMPLE_STICK.get().asItem() )
		.pattern("aaa").pattern(" b ").pattern(" b ")
		.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_PICKAXE.get().getRegistryName().getPath()));
		
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_AXE.get())
		.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
		.define('b', ItemInit.EXAMPLE_STICK.get().asItem() )
		.pattern("aa ").pattern("ab ").pattern(" b ")
		.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_AXE.get().getRegistryName().getPath()));
		
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_SHOVEL.get())
		.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
		.define('b', ItemInit.EXAMPLE_STICK.get().asItem() )
		.pattern(" a ").pattern(" b ").pattern(" b ")
		.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_SHOVEL.get().getRegistryName().getPath()));
		
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_HOE.get())
		.define('a', ItemInit.EXAMPLE_ITEM.get().asItem())
		.define('b', ItemInit.EXAMPLE_STICK.get().asItem() )
		.pattern("aa ").pattern(" b ").pattern(" b ")
		.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
		.save(consumer, new ResourceLocation(FirstMod.MOD_ID, ItemInit.EXAMPLE_HOE.get().getRegistryName().getPath()));
		
		
	
	}

}












