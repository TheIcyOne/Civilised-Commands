package headfishindustries.civilisedcommands.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class GetDim extends CommandBase {
	@Override
	public String getCommandName(){
		return "getDim";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/getDim";
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
		aliases.add("getdim");
		aliases.add("GetDim");
		aliases.add("GETDIM");
		aliases.add("getCurrentDim");
		aliases.add("getDimension");
		return aliases;
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] idontneedthis){
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		player.addChatMessage(new ChatComponentText("You are in dimension number " + player.dimension));
	}
}
