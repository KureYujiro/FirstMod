package com.yujiro.firstmod.item;

import com.yujiro.firstmod.init.ItemInit;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {

	public static final ForgeTier EXAMPLE = new ForgeTier(2, 1400, 1.5f, 2f, 22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ItemInit.EXAMPLE_ITEM.get()));
}
