package com.shiffman.mod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
    public static Item shiffmanItem;

    public static final void init() {
    	shiffmanItem = new Item();
    	shiffmanItem.setUnlocalizedName("shiffman");
    	shiffmanItem.setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(shiffmanItem, "shiffman");
    }
}
