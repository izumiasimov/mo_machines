package com.izumiasimov.mo_machines.util.compat;

import com.izumiasimov.mo_machines.mod_blocks;
import com.izumiasimov.mo_machines.mod_items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
    public static void registerOres(){
        // register ores to oredict
        OreDictionary.registerOre("oreMonazite", mod_blocks.BlockMonaziteOre);
        OreDictionary.registerOre("oreChromium", mod_blocks.BlockChromiumOre);
        // register ingots to oredict
        OreDictionary.registerOre("ingotMonazite", mod_items.ItemMonaziteCompositeIngot);
        OreDictionary.registerOre("ingotChromium", mod_items.ItemChromiumIngot);
        // register dusts to oredict
        OreDictionary.registerOre("dustMonazite", mod_items.ItemMonaziteDust);
    }
}
