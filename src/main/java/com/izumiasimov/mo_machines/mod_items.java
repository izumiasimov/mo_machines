package com.izumiasimov.mo_machines;

import com.izumiasimov.mo_machines.items.chromiumIngot.ItemChromiumIngot;
import com.izumiasimov.mo_machines.items.monaziteCompositeIngot.ItemMonaziteCompositeIngot;
import com.izumiasimov.mo_machines.items.monaziteDust.ItemMonaziteDust;
import com.izumiasimov.mo_machines.items.mortarPestle.ItemMortarPestle;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class mod_items {
    @GameRegistry.ObjectHolder("mo_machines:chromium_ingot")
    public static ItemChromiumIngot ItemChromiumIngot;

    @GameRegistry.ObjectHolder("mo_machines:monazite_ingot")
    public static ItemMonaziteCompositeIngot ItemMonaziteCompositeIngot;

    @GameRegistry.ObjectHolder("mo_machines:monazite_dust")
    public static ItemMonaziteDust ItemMonaziteDust;

    @GameRegistry.ObjectHolder("mo_machines:mortarpestle")
    public static ItemMortarPestle ItemMortarPestle;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        ItemChromiumIngot.initModel();
        ItemMonaziteCompositeIngot.initModel();
        ItemMonaziteDust.initModel();
        ItemMortarPestle.initModel();
    }
}
