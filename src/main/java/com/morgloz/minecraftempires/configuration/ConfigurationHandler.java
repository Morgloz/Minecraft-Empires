package com.morgloz.minecraftempires.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            configuration.load();
            //Configuration.CATEGORY_GENERAL
            configValue = configuration.get("TEST","configValue",true,"This is a example config value").getBoolean(true);
        }
        catch(Exception e)
        {
            //Log the exception
        }
        finally
        {
            configuration.save();
        }

        System.out.println(configValue);
    }
}
