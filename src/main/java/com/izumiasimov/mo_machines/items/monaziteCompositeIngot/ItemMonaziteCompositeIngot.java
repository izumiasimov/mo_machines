package com.izumiasimov.mo_machines.items.monaziteCompositeIngot;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemMonaziteCompositeIngot extends Item {
    public static final ResourceLocation MONAZ_INGOT = new ResourceLocation(BasicRefs.MOD_ID, "monazite_ingot");

    public ItemMonaziteCompositeIngot(){
        setRegistryName(MONAZ_INGOT);
        setUnlocalizedName(BasicRefs.MOD_ID + ".monazite_ingot");
        setCreativeTab(mo_machines.creativeTab);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Few industrial uses, can be used for tools.");
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
