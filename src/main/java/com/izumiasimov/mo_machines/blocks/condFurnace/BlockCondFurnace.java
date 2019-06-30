package com.izumiasimov.mo_machines.blocks.condFurnace;

import com.izumiasimov.mo_machines.mo_machines;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCondFurnace extends Block {
    public static final ResourceLocation COND_FURNACE = new ResourceLocation(BasicRefs.MOD_ID, "cond_furnace");

    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public BlockCondFurnace() {
        super(Material.IRON);
        // mo_machines:condFurnace
        setRegistryName(COND_FURNACE);
        setUnlocalizedName(BasicRefs.MOD_ID + ".cond_furnace");
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(mo_machines.creativeTab);

        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()); // EnumFacing.getDirectionFromEntityLiving(pos, placer)
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7)); // Gets front side of our meta, uses 3 of 4 bits to represent facing, can store 8 values but we only need 6.
    }

    @Override
    public int getMetaFromState(IBlockState state) { return state.getValue(FACING).getIndex(); }

    @Override
    protected BlockStateContainer createBlockState() { return new BlockStateContainer(this, FACING); }
}
