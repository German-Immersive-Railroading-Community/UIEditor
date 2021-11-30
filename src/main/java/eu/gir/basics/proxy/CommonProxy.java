package eu.gir.basics.proxy;

import eu.gir.basics.GIRMain;
import eu.gir.basics.command.GuiHandler;
import eu.gir.basics.init.GIRInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		GIRInit.init();
		MinecraftForge.EVENT_BUS.register(GIRInit.class);
		NetworkRegistry.INSTANCE.registerGuiHandler(GIRMain.MODID, new GuiHandler());
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postinit(FMLPostInitializationEvent event) {

	}

}
