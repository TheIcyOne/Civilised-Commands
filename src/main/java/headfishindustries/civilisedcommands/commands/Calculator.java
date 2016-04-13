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
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class Calculator extends CommandBase{
	public static String playerinput1;
	public  ICommandSender sendername;
	@Override
	public String getCommandName(){
		return "calculator";
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender){
		return "/calculator";
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
		aliases.add("calculator");
		aliases.add("Calculator");
		aliases.add("CALULATOR");
		aliases.add("cal");
		aliases.add("Cal");
		aliases.add("CAL");
		aliases.add("calc");
		aliases.add("Calc");
		aliases.add("CALC");
		return aliases;
	}
@Override	
public void processCommand(ICommandSender sender, String[] PlayerInput1)throws CommandException, ArrayIndexOutOfBoundsException{
		EntityPlayer player = getCommandSenderAsPlayer(sender);
		sendername = sender;
		int PlayerInputInt = PlayerInput1.length;
		
		if(PlayerInputInt != 3){
			player.addChatMessage(new ChatComponentText("the standard format for the /cal command is /cal 1 + 1"));
			return;
		}
		
		String X1 = PlayerInput1[0];
		String Operator = PlayerInput1[1];
		String X3 = PlayerInput1[2];
		
		
		double Math1 = Double.parseDouble(X1);
		double Math2 = Double.parseDouble(X3);
		
		
		
		player.addChatMessage(new ChatComponentText(Math1 + Operator + Math2));

		switch ( Operator ) {
		case "+":
			double Printplus =	Math1 + Math2;
			player.addChatMessage(new ChatComponentText("the answer is " + Printplus));
			break;
		case "-":
			double Printsub =	Math1 - Math2;
			player.addChatMessage(new ChatComponentText("the answer is " + Printsub));
			break;
		case "*":
			double Printtimes =	Math1 * Math2;
			player.addChatMessage(new ChatComponentText("the answer is " + Printtimes));
			break;
		case "/":
			double Printdivide =	Math1 / Math2;
			player.addChatMessage(new ChatComponentText("the answer is " + Printdivide));
			break;
		}
	}
}

