package eu.gir.basics.command;

import eu.gir.basics.GIRMain;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class OpenEditor extends CommandBase {

	@Override
	public String getName() {
		return "openeditor";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "command.editor.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		Thread th = new Thread(() -> {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer player = mc.player;
			server.addScheduledTask(() -> {
				player.openGui(GIRMain.MODID, 0, null, 0, 0, 0);
			});
		});
		th.start();

	}

}
