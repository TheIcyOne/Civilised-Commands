package headfishindustries.civilisedcommands.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.apache.http.util.TextUtils;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class Help extends CommandBase{

	@Override
	public String getCommandName(){
		return "CivilisedHelp";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/Civilisedhelp";
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
		aliases.add("civilisedhelp");
		aliases.add("CIVILISEDHELP");
		aliases.add("CHELP");
		aliases.add("chelp");
		aliases.add("Chelp");
		return aliases;
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] idontneedthis){
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		player.addChatMessage(new ChatComponentText("Civilised commands adds many useful commands to improve your minecraft day"));
		player.addChatMessage(new ChatComponentText("/GetDim will give you the current dimension that you are in"));
		player.addChatMessage(new ChatComponentText("/Cal is a build in calculator command it allows for decimals too for example /cal 1.1 + 1 it excepts /,*,-,+"));
		player.addChatMessage(new ChatComponentText("/Coords will tell  you your coords encase you dont have a minimap"));
		player.addChatMessage(new ChatComponentText("/shrug is one of the simplest commands it just prints ¯\\_(ツ)_/¯"));
		player.addChatMessage(new ChatComponentText("/TotalArmor is a command that will print your total armor level in chat"));


	}
}
