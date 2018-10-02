package com.jarhax.sevtechores.proxy;

import com.jarhax.sevtechores.client.render.RenderTileOre;
import com.jarhax.sevtechores.tileentities.TileEntityOre;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy {

	public void registerRenders () {

		ClientRegistry.registerTileEntity(TileEntityOre.class, "oreRender", new RenderTileOre());
	}
}