package com.izumiasimov.mo_machines.blocks.chromiumOre;

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

public class BlockChromiumOre extends Block {
    public static final ResourceLocation CHROM_ORE = new ResourceLocation(BasicRefs.MOD_ID, "chromium_ore");

    public BlockChromiumOre(){
        super(Material.ROCK);
        // mo_machines:condFurnace
        setRegistryName(CHROM_ORE);
        setUnlocalizedName(BasicRefs.MOD_ID + ".chromium_ore");
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(mo_machines.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
