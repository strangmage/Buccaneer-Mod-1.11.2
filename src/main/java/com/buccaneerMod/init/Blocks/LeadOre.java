package com.buccaneerMod.init.Blocks;

import java.util.Random;

import com.buccaneerMod.init.BucBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LeadOre extends Block{

	public LeadOre() {
		super(Material.IRON);
		// TODO Auto-generated constructor stub
		this.setLightLevel(0.0F);
		this.setHardness(5.0F);
		this.setLightOpacity(1);
		this.setHarvestLevel("pickaxe", 5);
	}
	public Item getItemDropped(BlockStateContainer blockState, Random random, int fortune) {
	    return this.getItemDropped(blockState, random, fortune);
	}

	

	

	
}
