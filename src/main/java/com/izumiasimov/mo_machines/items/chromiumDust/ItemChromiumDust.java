package com.izumiasimov.mo_machines.items.chromiumDust;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemChromiumDust extends Item {
    public static final ResourceLocation CHROM_DUST = new ResourceLocation(BasicRefs.MOD_ID, "chromium_dust");

    public ItemChromiumDust(){
        setRegistryName(CHROM_DUST);
        setUnlocalizedName(BasicRefs.MOD_ID + ".chromium_dust");
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
