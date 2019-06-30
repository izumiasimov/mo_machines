package com.izumiasimov.mo_machines.items.monaziteDust;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMonaziteDust extends Item {
    public static final ResourceLocation MONAZ_DUST = new ResourceLocation(BasicRefs.MOD_ID, "monazite_dust");

    public ItemMonaziteDust(){
        setRegistryName(MONAZ_DUST);
        setUnlocalizedName(BasicRefs.MOD_ID + ".monazite_dust");
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}

