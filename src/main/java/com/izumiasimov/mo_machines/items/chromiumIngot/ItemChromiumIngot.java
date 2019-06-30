package com.izumiasimov.mo_machines.items.chromiumIngot;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemChromiumIngot extends Item {
    public static final ResourceLocation CHROM_INGOT = new ResourceLocation(BasicRefs.MOD_ID, "chromium_ingot");

    public ItemChromiumIngot(){
        setRegistryName(CHROM_INGOT);
        setUnlocalizedName(BasicRefs.MOD_ID + ".chromium_ingot");
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
