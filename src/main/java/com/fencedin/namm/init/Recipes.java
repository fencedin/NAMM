package com.fencedin.namm.init;

import com.fencedin.namm.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.core), "p p", " s ", "p p", 'p', "plankWood", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cinerator), "   ", "lll", "lcl", 'l', "logWood", 'c', new ItemStack(ModItems.core)));
    }
}
