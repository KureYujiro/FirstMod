package com.yujiro.firstmod.datagen.client.lang;

import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.init.ItemInit;
import com.yujiro.firstmod.init.blockinit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider{

	public ModEnUsProvider(DataGenerator gen) {
		super(gen, FirstMod.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		
		//ItemGroups
		add("itemGroup.firstmod", "First Mod Tab");
		
		//Items
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		add(ItemInit.EXAMPLE_AXE.get(), "Example Axe");
		add(ItemInit.EXAMPLE_HOE.get(), "Example Hoe");
		add(ItemInit.EXAMPLE_PICKAXE.get(), "Example Pickaxe");
		add(ItemInit.EXAMPLE_SHOVEL.get(), "Example Shovel");
		add(ItemInit.EXAMPLE_SWORD.get(), "Example Sword");
		
		add(ItemInit.EXAMPLE_STICK.get(), "Example Stick");
		
		add(ItemInit.EXAMPLE_HELMET.get(), "Example Sword");
		add(ItemInit.EXAMPLE_CHESTPLATE.get(), "Example Chestplate");
		add(ItemInit.EXAMPLE_LEGGINGS.get(), "Example Leggings");
		add(ItemInit.EXAMPLE_BOOTS.get(), "Example Boots");
		
		add(ItemInit.EXAMPLE_CUSTOM.get(), "Example Custom");
		
		add(ItemInit.EXAMPLE_BOW.get(), "Example Bow");
		
		add(ItemInit.EXAMPLE_SEEDS.get(), "Example Seeds");
		
		//Blocks
		add(blockinit.EXAMPLE_BLOCK.get(), "Example Block");
		
		add(blockinit.EXAMPLE_ORE.get(), "Example Ore");
		
		add(blockinit.EXAMPLE_LOG.get(), "Example Log");
		add(blockinit.EXAMPLE_WOOD.get(), "Example Wood");
		add(blockinit.EXAMPLE_PLANKS.get(), "Example Planks");
		add(blockinit.STRIPPED_EXAMPLE_LOG.get(), "Stripped Example Log");
		add(blockinit.STRIPPED_EXAMPLE_WOOD.get(), "Stripped Example Wood");
		
		add(blockinit.EXAMPLE_PLANT.get(), "Example Plant");
	}

}
