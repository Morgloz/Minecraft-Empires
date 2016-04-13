package com.morgloz.minecraftempires.client.gui;


import com.morgloz.minecraftempires.handler.ConfigurationHandler;
import com.morgloz.minecraftempires.reference.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGUIConfig extends GuiConfig
{
    public ModGUIConfig(GuiScreen guiScreen)
    {
        //GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                "Minecraft Empires Configuration"
        );
    }
}
