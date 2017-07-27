package com.buccaneerMod;

import com.buccaneerMod.init.BucBlocks;
import com.buccaneerMod.init.BucItems;
import com.buccaneerMod.init.BucWorldGen;
import com.buccaneerMod.init.Items.BucRecipies;
import com.buccaneerMod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = BucReference.MOD_ID, name = BucReference.NAME, version = BucReference.VERSION, acceptedMinecraftVersions = BucReference.ACCEPTED_VERSIONS )
	
public class BucMain {

	@Instance
	public static BucMain instance;
	
	@SidedProxy(clientSide = BucReference.CLIENT_PROXY_ClASS, serverSide = BucReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BucItems.init();  
		BucItems.register();
		BucBlocks.init();  
		BucBlocks.register();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		GameRegistry.registerWorldGenerator(new BucWorldGen(), 0);
		BucRecipies.BucRecipies();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}

