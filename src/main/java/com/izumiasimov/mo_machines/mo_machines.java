package com.izumiasimov.mo_machines;

import com.izumiasimov.mo_machines.blocks.chromiumOre.BlockChromiumOre;
import com.izumiasimov.mo_machines.blocks.condFurnace.BlockCondFurnace;
import com.izumiasimov.mo_machines.blocks.monaziteOre.BlockMonaziteOre;
import com.izumiasimov.mo_machines.items.chromiumIngot.ItemChromiumIngot;
import com.izumiasimov.mo_machines.items.monaziteCompositeIngot.ItemMonaziteCompositeIngot;
import com.izumiasimov.mo_machines.items.monaziteDust.ItemMonaziteDust;
import com.izumiasimov.mo_machines.items.mortarPestle.ItemMortarPestle;
import com.izumiasimov.mo_machines.proxy.*;
import com.izumiasimov.mo_machines.reference.BasicRefs;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = BasicRefs.MOD_ID, name=BasicRefs.MOD_NAME, version=BasicRefs.VERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)

public class mo_machines {

    @Mod.Instance(BasicRefs.MOD_ID)
    public static mo_machines instance;

    @SidedProxy(clientSide = BasicRefs.CLIENT_PROXY_CLASS, serverSide = BasicRefs.SERVER_PROXY_CLASS) // Tells FML that proxy object is defined by arguments
    public static CommonProxy proxy; // Client/ServerProxy extend CommonProxy therefore also of IProxy type through inheritance. OOP gang!
//  Possibly remove?

    public static CreativeTabs creativeTab = new CreativeTabs("mo_machines") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(mod_blocks.BlockCondFurnace);
        }
    };

    public static Logger logger;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
        proxy.preInit(event);
        System.out.println("Now loading " + BasicRefs.MOD_NAME + " version " + BasicRefs.VERSION + ", by IzumiAsimov!");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
        // recipes
        GameRegistry.addSmelting(mod_blocks.BlockChromiumOre, new ItemStack(mod_items.ItemChromiumIngot), 50);
        GameRegistry.addSmelting(mod_blocks.BlockMonaziteOre, new ItemStack(mod_items.ItemMonaziteCompositeIngot), 10);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            event.getRegistry().registerAll(
                    new ItemBlock(mod_blocks.BlockCondFurnace).setRegistryName(BlockCondFurnace.COND_FURNACE),
                    new ItemBlock(mod_blocks.BlockChromiumOre).setRegistryName(BlockChromiumOre.CHROM_ORE),
                    new ItemBlock(mod_blocks.BlockMonaziteOre).setRegistryName(BlockMonaziteOre.MONAZ_ORE),
                    // Regular items.
                    new ItemChromiumIngot(),
                    new ItemMonaziteCompositeIngot(),
                    new ItemMonaziteDust(),
                    new ItemMortarPestle()
            );
        }
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event){
            event.getRegistry().registerAll(
                    new BlockCondFurnace(),
                    new BlockChromiumOre(),
                    new BlockMonaziteOre()
            );
        }
    }
}
