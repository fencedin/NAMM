package com.fencedin.namm;

import com.fencedin.namm.handler.ConfigHandler;
import com.fencedin.namm.init.ModBlocks;
import com.fencedin.namm.init.ModItems;
import com.fencedin.namm.init.Recipes;
import com.fencedin.namm.proxy.IProxy;
import com.fencedin.namm.reference.Reference;
import com.fencedin.namm.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,
     name = Reference.MOD_NAME,
     version = Reference.VERSION,
     guiFactory = Reference.GUI_FACTORY_CLASS
)

public class NAMM
{
    @Mod.Instance(Reference.MOD_ID)
    public static NAMM instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //load network handling, mod config, items, blocks
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("******PreInit Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register GUI, recipes, tile entities, general handlers
        Recipes.init();

        LogHelper.info("******Init Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //other, stuff after other mods

        LogHelper.info("******PostInit Complete");
    }
}
