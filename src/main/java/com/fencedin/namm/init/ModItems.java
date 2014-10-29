package com.fencedin.namm.init;


import com.fencedin.namm.item.ItemCore;
import com.fencedin.namm.item.ItemNAMM;
import com.fencedin.namm.reference.Names;
import com.fencedin.namm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemNAMM core = new ItemCore();

    public static void init()
    {
        GameRegistry.registerItem(core, Names.Items.CORE);
    }
}
