package com.yujiro.firstmod;

import com.yujiro.firstmod.init.ItemInit;
import com.yujiro.firstmod.init.blockinit;
import com.yujiro.firstmod.util.ModItemProperties;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firstmod")
public class FirstMod {

	public static final String MOD_ID = "firstmod";
	
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
		
	};
	
	public FirstMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(bus);
		blockinit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		bus.addListener(this::clientSetup);
		
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		
		ItemBlockRenderTypes.setRenderLayer(blockinit.EXAMPLE_PLANT.get(), RenderType.cutout());
		
		ModItemProperties.addCustomItemProperties();
	}
}

