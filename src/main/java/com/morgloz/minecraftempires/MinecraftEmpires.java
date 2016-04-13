package com.morgloz.minecraftempires;

import com.morgloz.minecraftempires.handler.ConfigurationHandler;
import com.morgloz.minecraftempires.proxy.IProxy;
import com.morgloz.minecraftempires.reference.Reference;
import com.morgloz.minecraftempires.utility.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MinecraftEmpires
{

    @Mod.Instance("MinecraftEmpires")
    public static MinecraftEmpires instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        LogHelper.info("PreInitialization complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization complete");
    }
}
