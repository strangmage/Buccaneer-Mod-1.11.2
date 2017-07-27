package com.buccaneerMod.init.Items;



import com.buccaneerMod.init.BucBlocks;
import com.buccaneerMod.init.BucItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BucRecipies {
	


	public static void BucRecipies() {
		GameRegistry.addSmelting(BucBlocks.leadore, new ItemStack(BucItems.leadbar, 1), 500.0F);
		GameRegistry.addRecipe(new ItemStack(BucItems.handle), " d ", "d d", " d ", 'd', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadsword), " i ", " i ", " d ", 'd', Items.STICK, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadpickaxe), "iii", " d ", " d ", 'd', Items.STICK, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadaxe), "ii ", "id ", " d ", 'd', Items.STICK, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadspade), "ii ", " d ", " d ", 'd', Items.STICK, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadshovel), " i ", " d ", " d ", 'd', Items.STICK, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.woodcutlass), "  i", " i ", "d  ", 'd', BucItems.handle, 'i', Blocks.PLANKS);
		GameRegistry.addRecipe(new ItemStack(BucItems.stonecutlass), "  i", " i ", "d  ", 'd', BucItems.handle, 'i', Blocks.COBBLESTONE);
		GameRegistry.addRecipe(new ItemStack(BucItems.ironcutlass), "  i", " i ", "d  ", 'd', BucItems.handle, 'i', Items.IRON_INGOT);
		GameRegistry.addRecipe(new ItemStack(BucItems.goldcutlass), "  i", " i ", "d  ", 'd', BucItems.handle, 'i', Items.GOLD_INGOT);
		GameRegistry.addRecipe(new ItemStack(BucItems.diamondcutlass), "  i", " i ", "d  ", 'd', BucItems.handle, 'i', Items.DIAMOND);
		GameRegistry.addRecipe(new ItemStack(BucItems.piratehat), "iii", "idi ", "iii", 'd', Items.IRON_HELMET, 'i', Items.LEATHER);
		GameRegistry.addRecipe(new ItemStack(BucItems.pirateshirt), "iii", "idi ", "iii", 'd', Items.IRON_CHESTPLATE, 'i', Items.LEATHER);
		GameRegistry.addRecipe(new ItemStack(BucItems.piratepants), "iii", "idi ", "iii", 'd', Items.IRON_LEGGINGS, 'i', Items.LEATHER);
		GameRegistry.addRecipe(new ItemStack(BucItems.pirateboots), "iii", "idi ", "iii", 'd', Items.IRON_BOOTS, 'i', Items.LEATHER);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadhelmet), "iii", "i i ", "   ", 'd', Items.IRON_BOOTS, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadchestplate), "i i", "iii ", "iii", 'd', Items.IRON_BOOTS, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadleggings), "iii", "i i ", "i i", 'd', Items.IRON_BOOTS, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucItems.leadboots), "   ", "i i ", "i i", 'd', Items.IRON_BOOTS, 'i', BucItems.leadbar);
		GameRegistry.addRecipe(new ItemStack(BucBlocks.leadblock), "iii", "iii", "iii", 'i', BucItems.leadbar);
	}

}



//ItemStack is 