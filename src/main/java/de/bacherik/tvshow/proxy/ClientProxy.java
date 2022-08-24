package de.bacherik.tvshow.proxy;

import de.bacherik.tvshow.Main;
import de.bacherik.tvshow.block.init.TBlocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, value = Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInitializationEvent(FMLPreInitializationEvent event) {
        super.preInitializationEvent(event);
    }

    @Override
    public void initializationEvent(FMLInitializationEvent event) {
        super.initializationEvent(event);
    }

    @Override
    public void postInitializationEvent(FMLPostInitializationEvent event) {
        super.postInitializationEvent(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        TBlocks.initializeBlockModels();
    }

    @Override
    public void registerRenderers() {
        // TESR
    }
}
