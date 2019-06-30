package com.izumiasimov.mo_machines;

import com.izumiasimov.mo_machines.blocks.condFurnace.BlockCondFurnace;
import com.izumiasimov.mo_machines.blocks.chromiumOre.BlockChromiumOre;
import com.izumiasimov.mo_machines.blocks.monaziteOre.BlockMonaziteOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class mod_blocks {
    @GameRegistry.ObjectHolder("mo_machines:cond_furnace")
    public static BlockCondFurnace BlockCondFurnace;

    @GameRegistry.ObjectHolder("mo_machines:chromium_ore")
    public static BlockChromiumOre BlockChromiumOre;

    @GameRegistry.ObjectHolder("mo_machines:monazite_ore")
    public static BlockMonaziteOre BlockMonaziteOre;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        BlockChromiumOre.initModel();
        BlockCondFurnace.initModel();
        BlockMonaziteOre.initModel();
    }
}
