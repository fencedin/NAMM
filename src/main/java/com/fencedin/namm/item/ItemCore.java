package com.fencedin.namm.item;

import com.fencedin.namm.item.ItemNAMM;
import com.fencedin.namm.reference.Names;

public class ItemCore extends ItemNAMM
{
    public ItemCore()
    {
        super();
        this.maxStackSize = 64;
        this.setUnlocalizedName(Names.Items.CORE);
    }
}
