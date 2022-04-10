package com.yujiro.firstmod.item;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CustomExampleItem extends Item{

	public CustomExampleItem(Properties properties) {
		super(properties);
		
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		if (context.getLevel().isClientSide()) {
			BlockPos positionClicked = context.getClickedPos();
			Player player = context.getPlayer();
			Block clickedBlock = context.getLevel().getBlockState(positionClicked).getBlock();
			
			if (clickedBlock == Blocks.GRASS_BLOCK) {
				player.sendMessage(new TextComponent("touch grass outside dumbass"), player.getUUID());
			}
		}
		
		
		return super.useOn(context);
	}

}
