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

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class Shrug extends CommandBase{

	@Override
	public String getCommandName(){
		return "Shrug";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/shrug";
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
		aliases.add("SHRUG");
		aliases.add("shrug");
		return aliases;
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] idontneedthis){
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		String shrug = "¯\\_(ツ)_/¯";
		player.addChatMessage(new ChatComponentText(shrug));

	}
}
