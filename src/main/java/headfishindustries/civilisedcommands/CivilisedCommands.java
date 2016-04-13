package headfishindustries.civilisedcommands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Check all the classes for (hopefully) detailed descriptions of what it does. There will also be tidbits of comments throughout the codebase.
 * If you wish to add a description to a class, or extend/change an existing one, submit a PR with your changes.
 */

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import headfishindustries.civilisedcommands.ConfigHandler;
import headfishindustries.civilisedcommands.proxies.CommonProxy;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION, dependencies = ModInformation.DEPEND)
public class CivilisedCommands {

    @SidedProxy(clientSide = ModInformation.CLIENTPROXY, serverSide = ModInformation.COMMONPROXY)
    public static CommonProxy proxy;

    public static Logger logger = LogManager.getLogger(ModInformation.NAME);

    @Mod.Instance
    public static CivilisedCommands instance;

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		ICommandManager cmdManage = event.getServer().getCommandManager();
		ServerCommandManager svrCommandManage = ((ServerCommandManager)cmdManage);
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.GetDim());
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.Calculator());
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.Help());
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.Shrug());
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.TotalArmorCount());
		svrCommandManage.registerCommand(new headfishindustries.civilisedcommands.commands.Coords());
	}
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
