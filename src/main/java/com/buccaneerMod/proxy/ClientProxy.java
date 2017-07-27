package com.buccaneerMod.proxy;

import com.buccaneerMod.init.BucBlocks;
import com.buccaneerMod.init.BucItems;

public class ClientProxy implements CommonProxy {

	
	@Override
	public void registerRenders() {
		BucItems.registerRenders();
		BucBlocks.registerRenders();

	}
	
		
}

