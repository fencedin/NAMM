package com.fencedin.rvrm.init;


import com.fencedin.rvrm.item.ItemCore;
import com.fencedin.rvrm.item.ItemRvRM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemRvRM core = new ItemCore();

    public static void init()
    {
        GameRegistry.registerItem(core, "core");
    }
}
