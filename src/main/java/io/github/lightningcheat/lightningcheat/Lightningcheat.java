package io.github.lightningcheat.lightningcheat;

import io.github.lightningcheat.lightningcheat.gui.config.ConfigClass;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.ThreadPoolExecutor;

@Mod(
        modid = Lightningcheat.MOD_ID,
        name = Lightningcheat.MOD_NAME,
        version = Lightningcheat.VERSION,
        guiFactory = "io.github.lightningcheat.lightningcheat.gui.config.ConfigGui"
)
public class Lightningcheat {

    public static final String MOD_ID = "lightningcheat";
    public static final String MOD_NAME = "LightningCheat";
    public static final String VERSION = "b1";
    public static Logger logger;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Lightningcheat INSTANCE;
    private static File dir;

    static {
        dir = new File(Minecraft.getMinecraft().gameDir, MOD_NAME);
        if (!Files.exists(dir.toPath())) {
            try {
                Files.createDirectories(dir.toPath());
            } catch (IOException ignored) {}
        }
    }


    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        if (ConfigClass.useMod){

        }else if (!ConfigClass.useMod){
            logger.error(MOD_NAME+" Is Disable Config:UseMOD = false");
        }
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if (ConfigClass.useMod){

        }else if (!ConfigClass.useMod){
            logger.error(MOD_NAME+" Is Disable Config:UseMOD = false");
        }
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        if (ConfigClass.useMod){

        }else if (!ConfigClass.useMod){
            logger.error(MOD_NAME+" Is Disable Config:UseMOD = false");
        }
    }

    /*DEL
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
        }

        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
        }
    }
    public static class MySpecialItem extends Item {

    }

    public static class MySpecialBlock extends Block {

    }
    */
}
