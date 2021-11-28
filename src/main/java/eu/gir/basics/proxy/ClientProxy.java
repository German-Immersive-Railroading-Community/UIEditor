package eu.gir.basics.proxy;

import eu.gir.basics.init.GIRInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		MinecraftForge.EVENT_BUS.register(ClientProxy.class);
	}

	@SubscribeEvent
	public static void modelEvents(final ModelRegistryEvent event) {
		GIRInit.itemsToRegister.forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory")));
		GIRInit.blocksToRegister.forEach(block -> {
			final Item item = Item.getItemFromBlock(block);
			ModelLoader.setCustomModelResourceLocation(item, 0,
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		});
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);

	}

}
