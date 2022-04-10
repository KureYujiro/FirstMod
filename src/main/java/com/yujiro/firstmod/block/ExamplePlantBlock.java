package com.yujiro.firstmod.block;

import com.yujiro.firstmod.init.ItemInit;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ExamplePlantBlock extends CropBlock{

	public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

	public ExamplePlantBlock(Properties properties) {
		super(properties);
	}

	@Override
	public int getMaxAge() {
		return 5;
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return ItemInit.EXAMPLE_SEEDS.get();
	}

}
