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
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class locate extends CommandBase{
	public static String playerinput1;
	@Override
	public String getCommandName(){
		return "Locate";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/Locate";
	}
	
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
		aliases.add("LOCATE");
		aliases.add("locate");
		return aliases;
	}
@Override	
public void processCommand(ICommandSender sender, String[] PlayerInput1){
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		String X1 = PlayerInput1[0];
	//	final EntityPlayerMP pt = (EntityPlayerMP) X1.getPlayerEntityByName(playerinput1[0]);
	}
	}


