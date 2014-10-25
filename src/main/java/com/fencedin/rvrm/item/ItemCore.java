package com.fencedin.rvrm.item;

import com.fencedin.rvrm.item.ItemRvRM;
import com.fencedin.rvrm.reference.Names;

public class ItemCore extends ItemRvRM
{
    public ItemCore()
    {
        super();
        this.maxStackSize = 64;
        this.setUnlocalizedName(Names.Items.CORE);
    }
}
