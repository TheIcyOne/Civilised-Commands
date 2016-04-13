package headfishindustries.civilisedcommands.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class Coords extends CommandBase {

	@Override
	public String getCommandName(){
		return "Coords";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/Coords";
	}
	
	@Override
	public int getRequiredPermissionLevel(){
		return 0;
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender){
		return true;
	}
	
	@Override
	public List getCommandAliases(){
		ArrayList<String> aliases = new ArrayList<String>();
		aliases.add("COORDS");
		aliases.add("coords");
		aliases.add("coord");
		aliases.add("pos");
		aliases.add("POS");
		return aliases;
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] idontneedthis){
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		player.addChatMessage(new ChatComponentText("Your current cords are    X: " + player.posX + " Y: " + player.posY + " Z: " + player.posZ));

	
}
}
