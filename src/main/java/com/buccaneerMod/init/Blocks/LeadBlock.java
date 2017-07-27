package com.buccaneerMod.init.Blocks;

import java.util.Random;

import com.buccaneerMod.init.BucBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LeadBlock extends Block{

	public LeadBlock() {
		super(Material.IRON);
		// TODO Auto-generated constructor stub
		this.setLightLevel(0.0F);
		this.setHardness(5.0F);
		this.setLightOpacity(1);
		this.setHarvestLevel("pickaxe", 5);
	}
	public Item getItemDropped()
    {
        return BucBlocks.leadblockitem;
    }
	 
}

	    

