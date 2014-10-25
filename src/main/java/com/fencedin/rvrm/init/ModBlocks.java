package com.fencedin.rvrm.init;

import com.fencedin.rvrm.block.BlockCinerator;
import com.fencedin.rvrm.block.BlockRvRM;
import com.fencedin.rvrm.reference.Names;
import com.fencedin.rvrm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockRvRM cinerator = new BlockCinerator();

    public static void init()
    {
        GameRegistry.registerBlock(cinerator, Names.Blocks.CINERATOR);
    }
}
