package io.github.lightningcheat.lightningcheat.gui.config;

import io.github.lightningcheat.lightningcheat.Lightningcheat;
import net.minecraftforge.common.config.Config;

@Config(modid = Lightningcheat.MOD_ID)
@Config.LangKey("config."+Lightningcheat.MOD_ID+".general")
public class ConfigClass {

    @Config.Comment("Allow Mod Runing On Minecraft")
    @Config.LangKey("config."+Lightningcheat.MOD_ID+".general.usemod")
    @Config.Name("UseLightningCheatMod")
    public static boolean useMod = true;
}
