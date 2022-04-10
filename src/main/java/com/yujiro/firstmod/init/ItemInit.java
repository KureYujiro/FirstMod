package com.yujiro.firstmod.init;

import com.google.common.base.Supplier;
import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.item.CustomExampleItem;
import com.yujiro.firstmod.item.ModArmorMaterials;
import com.yujiro.firstmod.item.Tiers;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item>ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
	
	
	
	
    public static final RegistryObject<Item> EXAMPLE_SEEDS = register("example_seeds",
            () -> new ItemNameBlockItem(blockinit.EXAMPLE_PLANT.get(),
                    new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
    public static final RegistryObject<Item>EXAMPLE_STICK= register("example_stick", () -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
    
	public static final RegistryObject<Item>EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_SWORD = register("example_sword", () -> new SwordItem(Tiers.EXAMPLE, 2, 3f, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Item>EXAMPLE_PICKAXE = register("example_pickaxe", () -> new PickaxeItem(Tiers.EXAMPLE, 2, 3f, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Item>EXAMPLE_SHOVEL = register("example_shovel", () -> new ShovelItem(Tiers.EXAMPLE, 2, 3f, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_AXE = register("example_axe", () -> new AxeItem(Tiers.EXAMPLE, 2, 3f, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_HOE = register("example_hoe", () -> new HoeItem(Tiers.EXAMPLE, 2, 3f, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	
	public static final RegistryObject<Item>EXAMPLE_HELMET = register("example_helmet", () -> new ArmorItem(ModArmorMaterials.EXAMPLE, EquipmentSlot.HEAD, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_CHESTPLATE = register("example_chestplate", () -> new ArmorItem(ModArmorMaterials.EXAMPLE, EquipmentSlot.CHEST, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Item>EXAMPLE_LEGGINGS = register("example_leggings", () -> new ArmorItem(ModArmorMaterials.EXAMPLE, EquipmentSlot.LEGS, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_BOOTS = register("example_boots", () -> new ArmorItem(ModArmorMaterials.EXAMPLE, EquipmentSlot.FEET, new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_CUSTOM = register("example_custom", () -> new CustomExampleItem(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item>EXAMPLE_BOW = register("example_bow", () -> new BowItem(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	

	
	public static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
			return ITEMS.register(name, item);
			
	}

}
