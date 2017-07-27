package com.buccaneerMod.init;

import com.buccaneerMod.BucReference;
import com.buccaneerMod.init.Items.ItemAle;
import com.buccaneerMod.init.Items.ItemDiamondCutlass;
import com.buccaneerMod.init.Items.ItemGoldCutlass;
import com.buccaneerMod.init.Items.ItemHandle;
import com.buccaneerMod.init.Items.ItemIronCutlass;
//import com.buccaneerMod.init.Items.Musket.ItemFlintlock;
import com.buccaneerMod.init.Items.ItemLeadAxe;
import com.buccaneerMod.init.Items.ItemLeadBar;
import com.buccaneerMod.init.Items.ItemLeadCutlass;
//import com.buccaneerMod.init.Items.Musket.ItemLeadBullet;
import com.buccaneerMod.init.Items.ItemLeadNugget;
import com.buccaneerMod.init.Items.ItemLeadPickaxe;
//import com.buccaneerMod.init.Items.Musket.ItemLeadShot;
import com.buccaneerMod.init.Items.ItemLeadShovel;
import com.buccaneerMod.init.Items.ItemLeadSpade;
import com.buccaneerMod.init.Items.ItemLeadSword;
import com.buccaneerMod.init.Items.ItemPirateArmor;
import com.buccaneerMod.init.Items.ItemStoneCutlass;
import com.buccaneerMod.init.Items.ItemWoodCutlass;
//import com.buccaneerMod.init.Items.Musket.ItemFlintlock;
//import com.buccaneerMod.init.Items.Musket.ItemLeadShot;
//import com.buccaneerMod.init.Items.Musket.ItemLeadShot;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BucItems extends Item{
	
	
	/**Stuff I can't figure out why you have to do it you just do*/
	
	public static Item leadbar;
	public static Item leadnugget;
	public static Item leadbullet;
	public static Item handle;
	
	//Food(and ale, we're not picky)
	public static Item ale;
	
	//Tools/Swords
	public static Item leadsword;
	public static Item leadpickaxe;
	public static Item leadaxe;
	public static Item leadspade;
	public static Item leadshot;
	public static Item leadshovel;
	public static Item flintlock;
	public static Item woodcutlass;
	public static Item stonecutlass;
	public static Item ironcutlass; 
	public static Item leadcutlass;
	public static Item goldcutlass;
	public static Item diamondcutlass;
	
	//Armor
	public static Item piratehat;
	public static Item pirateshirt;
	public static Item piratepants;
	public static Item pirateboots;
	public static Item leadhelmet;
	public static Item leadchestplate;
	public static Item leadleggings;
	public static Item leadboots;
	
	//materials
	public static ToolMaterial lead = EnumHelper.addToolMaterial("lead", 2, 250, 6.0F, 2.0F, 14);
	/// public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", harvestlevel, durability, MiningSpeed, damageVsEntities, enchantability);
	
	public static ArmorMaterial piratearmor = EnumHelper.addArmorMaterial("pirate", "buc:piratearmor", 19, new int[] {3, 7, 6, 3}, 13, null, 0);
	// public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("NAME", texture, durability, damageReduction[], enchantability);
	
	public static ArmorMaterial leadarmor = EnumHelper.addArmorMaterial("leadarmor", "buc:leadarmor", 15, new int[] {2, 6, 5, 2}, 9, null, 0);
	// public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("NAME", texture, durability, damageReduction[], enchantability);
	//public static ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "tutorial:tutorial", 16, new int[] {3, 8, 6, 3}, 30);

	public static void init() {
		//Items
		leadbar = new ItemLeadBar().setCreativeTab(CreativeTabs.MATERIALS).setUnlocalizedName("leadbar");	
		leadnugget = new ItemLeadNugget().setUnlocalizedName("leadnugget");	
	//	leadbullet = new ItemLeadShot().setCreativeTab(CreativeTabs.MATERIALS).setUnlocalizedName("leadbullet");
		handle = new ItemHandle().setCreativeTab(CreativeTabs.MATERIALS).setUnlocalizedName("handle");	
		
		//Food
		ale = new ItemAle().setUnlocalizedName("ale");	

		//Tools/Swords
		leadsword = new ItemLeadSword(lead).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("leadsword");	
		leadpickaxe = new ItemLeadPickaxe(lead).setCreativeTab(CreativeTabs.TOOLS).setUnlocalizedName("leadpickaxe");	
		leadaxe = new ItemLeadAxe(lead).setCreativeTab(CreativeTabs.TOOLS).setUnlocalizedName("leadaxe");	
		leadshovel = new ItemLeadShovel(lead).setCreativeTab(CreativeTabs.TOOLS).setUnlocalizedName("leadshovel");
		leadspade = new ItemLeadSpade(lead).setCreativeTab(CreativeTabs.TOOLS).setUnlocalizedName("leadspade");
		//leadshot = new ItemLeadShot().setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("leadshot");
		//flintlock = new ItemFlintlock().setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("flintlock");
		woodcutlass = new ItemWoodCutlass(Item.ToolMaterial.WOOD).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("woodcutlass");	
		stonecutlass = new ItemStoneCutlass(Item.ToolMaterial.STONE).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("stonecutlass");	
		ironcutlass = new ItemIronCutlass(Item.ToolMaterial.IRON).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("ironcutlass");	
		leadcutlass = new ItemLeadCutlass(lead).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("leadcutlass");	
		goldcutlass = new ItemGoldCutlass(Item.ToolMaterial.GOLD).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("goldcutlass");	
		diamondcutlass = new ItemDiamondCutlass(Item.ToolMaterial.DIAMOND).setCreativeTab(CreativeTabs.COMBAT).setUnlocalizedName("diamondcutlass");	
		
		//Armor
		piratehat = new ItemPirateArmor(piratearmor, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("piratehat").setCreativeTab(CreativeTabs.COMBAT); 
		pirateshirt = new ItemPirateArmor(piratearmor, 2, EntityEquipmentSlot.CHEST).setUnlocalizedName("pirateshirt").setCreativeTab(CreativeTabs.COMBAT); 
		piratepants = new ItemPirateArmor(piratearmor, 3, EntityEquipmentSlot.LEGS).setUnlocalizedName("piratepants").setCreativeTab(CreativeTabs.COMBAT); 
		pirateboots = new ItemPirateArmor(piratearmor, 4, EntityEquipmentSlot.FEET).setUnlocalizedName("pirateboots").setCreativeTab(CreativeTabs.COMBAT); 
		leadhelmet = new ItemLeadArmor(leadarmor, 1, EntityEquipmentSlot.HEAD).setUnlocalizedName("leadhelmet").setCreativeTab(CreativeTabs.COMBAT); 
		leadchestplate = new ItemLeadArmor(leadarmor, 2, EntityEquipmentSlot.CHEST).setUnlocalizedName("leadchestplate").setCreativeTab(CreativeTabs.COMBAT); 
		leadleggings = new ItemLeadArmor(leadarmor, 3, EntityEquipmentSlot.LEGS).setUnlocalizedName("leadleggings").setCreativeTab(CreativeTabs.COMBAT); 
		leadboots = new ItemLeadArmor(leadarmor, 4, EntityEquipmentSlot.FEET).setUnlocalizedName("leadboots").setCreativeTab(CreativeTabs.COMBAT); 


	}

	public static void register() {
		GameRegistry.register(leadbar.setRegistryName("leadbar"));
		GameRegistry.register(leadnugget.setRegistryName("leadnugget"));
	//	GameRegistry.register(leadbullet.setRegistryName("leadbullet"));
		GameRegistry.register(handle.setRegistryName("handle"));
		
		//Food
		GameRegistry.register(ale.setRegistryName("ale"));

		
		//Tools/Swords
		GameRegistry.register(leadsword.setRegistryName("leadsword"));
		GameRegistry.register(leadpickaxe.setRegistryName("leadpickaxe")); 
		GameRegistry.register(leadaxe.setRegistryName("leadaxe"));
		GameRegistry.register(leadshovel.setRegistryName("leadshovel"));
		GameRegistry.register(leadspade.setRegistryName("leadspade"));
		//GameRegistry.register(leadshot.setRegistryName("leadshot"));
		//GameRegistry.register(flintlock.setRegistryName("flintlock"));
		GameRegistry.register(woodcutlass.setRegistryName("woodcutlass"));
		GameRegistry.register(stonecutlass.setRegistryName("stonecutlass"));
		GameRegistry.register(ironcutlass.setRegistryName("ironcutlass"));
		GameRegistry.register(leadcutlass.setRegistryName("leadcutlass"));
		GameRegistry.register(goldcutlass.setRegistryName("goldcutlass"));
		GameRegistry.register(diamondcutlass.setRegistryName("diamondcutlass"));
		
		//Armor
		GameRegistry.register(piratehat.setRegistryName("piratehat"));
		GameRegistry.register(pirateshirt.setRegistryName("pirateshirt"));
		GameRegistry.register(piratepants.setRegistryName("piratepants"));
		GameRegistry.register(pirateboots.setRegistryName("pirateboots"));
		GameRegistry.register(leadhelmet.setRegistryName("leadhelmet"));
		GameRegistry.register(leadchestplate.setRegistryName("leadchestplate"));
		GameRegistry.register(leadleggings.setRegistryName("leadleggings"));
		GameRegistry.register(leadboots.setRegistryName("leadboots"));



		

	}
	
	public static void registerRenders() {
		RegisterRender(leadbar);
		RegisterRender(leadnugget);
		//RegisterRender(leadbullet);
		RegisterRender(handle);
		
		//Food
		RegisterRender(ale);

		
		//Tools/Weapons
		RegisterRender(leadsword);
		RegisterRender(leadpickaxe);
		RegisterRender(leadaxe);
		RegisterRender(leadspade);
		RegisterRender(leadshovel);
//		RegisterRender(flintlock);
		RegisterRender(woodcutlass);
		RegisterRender(stonecutlass);
		RegisterRender(ironcutlass);
		RegisterRender(leadcutlass);
		RegisterRender(goldcutlass);
		RegisterRender(diamondcutlass);
		
		//Armor
		RegisterRender(piratehat);
		RegisterRender(pirateshirt);
		RegisterRender(piratepants);
		RegisterRender(pirateboots);
		RegisterRender(leadhelmet);
		RegisterRender(leadchestplate);
		RegisterRender(leadleggings);
		RegisterRender(leadboots);




	}
	
	private static void RegisterRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(BucReference.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));

/* 
    */
	}
}
