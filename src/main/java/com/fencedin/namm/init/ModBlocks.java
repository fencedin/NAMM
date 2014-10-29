package com.fencedin.namm.init;

import com.fencedin.namm.block.BlockCinerator;
import com.fencedin.namm.block.BlockNAMM;
import com.fencedin.namm.reference.Names;
import com.fencedin.namm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockNAMM cinerator = new BlockCinerator();

    public static void init()
    {
        GameRegistry.registerBlock(cinerator, Names.Blocks.CINERATOR);
    }
}
