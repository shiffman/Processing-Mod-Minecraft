package com.shiffman.mod;

import com.shiffman.mod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ShiffmanMod.MODID, version = ShiffmanMod.VERSION)
public class ShiffmanMod
{
    public static final String MODID = "shiffmanmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        ModItems.init();
    }
}


