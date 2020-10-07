package io.github.lightningcheat.lightningcheat.gui.config;

import io.github.lightningcheat.lightningcheat.Lightningcheat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.GuiConfig;

import java.util.Collections;
import java.util.Set;

public class ConfigGui implements IModGuiFactory {
    @Override
    public void initialize(Minecraft mc) {
    }

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parent) {
        return new GuiConfig(parent, ConfigElement.from(ConfigClass.class).getChildElements(), Lightningcheat.MOD_ID, false, false, I18n.format("config."+Lightningcheat.MOD_ID+".line1"), I18n.format("config."+Lightningcheat.MOD_ID+".line2"));
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return Collections.emptySet();
    }

}