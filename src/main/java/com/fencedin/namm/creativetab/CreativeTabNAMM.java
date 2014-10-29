package com.fencedin.namm.creativetab;

import com.fencedin.namm.init.ModItems;
import com.fencedin.namm.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNAMM
{
    public static final CreativeTabs NAMM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.core;
        }
    };
}
