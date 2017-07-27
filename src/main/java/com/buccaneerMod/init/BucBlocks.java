package com.buccaneerMod.init;



import com.buccaneerMod.BucReference;
import com.buccaneerMod.init.Blocks.LeadBlock;
import com.buccaneerMod.init.Blocks.LeadBlockItem;
import com.buccaneerMod.init.Blocks.LeadOre;
import com.buccaneerMod.init.Blocks.LeadOreItem;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class BucBlocks extends Item{

	public static Block leadblock;
	public static ItemBlock leadblockitem;
	public static Block leadore;
	public static ItemBlock leadoreitem;

	
	public static void init() {
		
		leadblock = new LeadBlock().setUnlocalizedName("leadblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		leadblockitem = (ItemBlock) new LeadBlockItem(leadblock).setUnlocalizedName(leadblock.getUnlocalizedName());
		leadore = new LeadOre().setUnlocalizedName("leadore").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		leadoreitem = (ItemBlock) new LeadOreItem(leadore).setUnlocalizedName(leadore.getUnlocalizedName());

		
	}
	
	public static void register() {
		
		GameRegistry.register(leadblock.setRegistryName("leadblock"));
		GameRegistry.register(leadblockitem.setRegistryName(leadblock.getRegistryName()));
		GameRegistry.register(leadore.setRegistryName("leadore"));
		GameRegistry.register(leadoreitem.setRegistryName(leadore.getRegistryName()));
	
		
	}
	
	public static void registerRenders() {
		
		registerRender(leadblock);
		registerRender(leadore);

	}
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(BucReference.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
		} 
}


