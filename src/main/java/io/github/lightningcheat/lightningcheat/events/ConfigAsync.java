package io.github.lightningcheat.lightningcheat.events;

import io.github.lightningcheat.lightningcheat.Lightningcheat;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Lightningcheat.MOD_ID)
public class ConfigAsync {
    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Lightningcheat.MOD_ID)) {
            ConfigManager.sync(Lightningcheat.MOD_ID, Config.Type.INSTANCE);
        }
    }
}
