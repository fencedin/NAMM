package com.fencedin.rvrm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "RvRM", name = "Risk vs Reward Mod", version = "1.7.10-0.1")

public class RvRM
{
    @Mod.Instance("RvRM")
    public static RvRM instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //load network handling, mod config, items, blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register GUI, recipes, tile entities, general handlers
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //other, stuff after other mods
    }
}
