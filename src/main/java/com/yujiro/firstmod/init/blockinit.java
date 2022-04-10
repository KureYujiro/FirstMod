package com.yujiro.firstmod.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.yujiro.firstmod.FirstMod;
import com.yujiro.firstmod.block.ExamplePlantBlock;
import com.yujiro.firstmod.block.FlammableRotatedPillarBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockinit {

	public static final DeferredRegister<Block>BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);
	public static final DeferredRegister<Item>ITEMS = ItemInit.ITEMS;


	public static final RegistryObject<Block> EXAMPLE_PLANT = registerBlock("example_plant",
			() -> new ExamplePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Block> EXAMPLE_ORE = register("example_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f).requiresCorrectToolForDrops()), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));


	public static final RegistryObject<Block> EXAMPLE_LOG = register("example_log",
			() -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Block> EXAMPLE_WOOD = register("example_wood",
			() -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Block> STRIPPED_EXAMPLE_LOG = register("stripped_example_log",
			() -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));

	public static final RegistryObject<Block> STRIPPED_EXAMPLE_WOOD = register("stripped_example_wood",
			() -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));


	public static final RegistryObject<Block> EXAMPLE_PLANKS = register("example_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			}, object -> () -> 
			new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));


	public static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}

	public static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, 
			Function<RegistryObject<T>, Supplier<? extends Item>>item){
		RegistryObject<T>obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}

}
