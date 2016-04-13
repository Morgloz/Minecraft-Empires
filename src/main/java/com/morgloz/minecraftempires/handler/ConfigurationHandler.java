package com.morgloz.minecraftempires.handler;


import com.morgloz.minecraftempires.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;
    public static boolean configValue = false;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
            loadConfiguration();
    }

    private static void loadConfiguration()
    {
        configValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue",true,"This is a example config value").getBoolean(true);

        if(configuration.hasChanged())
            configuration.save();
    }
}
