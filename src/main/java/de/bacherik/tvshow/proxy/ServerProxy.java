package de.bacherik.tvshow.proxy;

import de.bacherik.tvshow.Main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, value = Side.SERVER)
public class ServerProxy extends CommonProxy {

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
}
