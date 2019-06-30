package com.izumiasimov.mo_machines.items.mortarPestle;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMortarPestle extends Item {
    public static final ResourceLocation MORTARPESTLE = new ResourceLocation(BasicRefs.MOD_ID, "mortarpestle");

    public ItemMortarPestle(){
        setRegistryName(MORTARPESTLE);
        setUnlocalizedName(BasicRefs.MOD_ID + ".mortarpestle");
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}