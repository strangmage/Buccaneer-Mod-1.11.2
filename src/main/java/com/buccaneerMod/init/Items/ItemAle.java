package com.buccaneerMod.init.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class ItemAle extends ItemFood{


	public ItemAle() {
		super(1, 2, false);
		// TODO Auto-generated constructor stub
	}
	
	 public boolean hasEffect(ItemStack stack)
	    {
	        return super.hasEffect(stack) || stack.getMetadata() > 0;
	    }

	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {
            if (stack.getMetadata() > 0)
            {
                player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 4000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 300, 1));
            }
            else
            {
                player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 4000, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 300, 1));
                
            }
        }
    }	
}
