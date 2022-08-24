package de.bacherik.tvshow.proxy;

import de.bacherik.tvshow.Main;
import de.bacherik.tvshow.block.init.TBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = Main.MOD_ID)
public class CommonProxy {
    public void preInitializationEvent(FMLPreInitializationEvent event) {

    }

    public void initializationEvent(FMLInitializationEvent event) {

    }

    public void postInitializationEvent(FMLPostInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        TBlocks.registerItemBlocks(event);
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        TBlocks.registerBlocks(event);
    }

    public void registerRenderers() {

    }

    public void registerRecipes() {

    }
}
