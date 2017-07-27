package com.buccaneerMod.init.Items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemLeadShovel extends ItemSpade{
	//private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.DIRT, Blocks.GRASS, Blocks.CLAY, Blocks.FARMLAND, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SOUL_SAND, Blocks.SNOW, Blocks.SNOW_LAYER});


	public ItemLeadShovel(ToolMaterial material) {
		super(material);
       // this.damageVsEntity = material.getDamageVsEntity();
        
		
    }
	/*
  
    public float getStrVsBlock(ItemStack stack, IBlockState state){
        Material material = state.getMaterial();
        return material != Material.CLAY && material != Material.SAND && material != Material.SNOW ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }*/

}
