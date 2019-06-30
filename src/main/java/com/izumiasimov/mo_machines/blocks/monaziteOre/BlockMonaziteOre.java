package com.izumiasimov.mo_machines.blocks.monaziteOre;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMonaziteOre extends Block {
    public static final ResourceLocation MONAZ_ORE = new ResourceLocation(BasicRefs.MOD_ID, "monazite_ore");

    public BlockMonaziteOre(){
        super(Material.ROCK);
        // mo_machines:condFurnace
        setRegistryName(MONAZ_ORE);
        setUnlocalizedName(BasicRefs.MOD_ID + ".monazite_ore");
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}