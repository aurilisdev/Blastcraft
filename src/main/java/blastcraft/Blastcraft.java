package blastcraft;

import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.common.block.BlockCustomBrickGlass;
import blastcraft.common.settings.Constants;
import electrodynamics.prefab.configuration.ConfigurationHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(References.ID)
@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class Blastcraft {

    public Blastcraft() {
	ConfigurationHandler.registerConfig(Constants.class);
	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	DeferredRegisters.BLOCKS.register(bus);
	DeferredRegisters.ITEMS.register(bus);
	DeferredRegisters.TILES.register(bus);
	SoundRegister.SOUNDS.register(bus);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onClientSetup(FMLClientSetupEvent event) {
	for (RegistryObject<Block> block : DeferredRegisters.BLOCKS.getEntries()) {
	    if (block.get() instanceof BlockCustomBrickGlass) {
		RenderTypeLookup.setRenderLayer(block.get(), RenderType.getCutout());
	    }
	}
	RenderTypeLookup.setRenderLayer(DeferredRegisters.blockCamoflage, RenderType.getCutout());
	RenderTypeLookup.setRenderLayer(DeferredRegisters.blockGlassPressurePlate, RenderType.getTranslucent());
	ClientRegistry.bindTileEntityRenderer(DeferredRegisters.TILE_CAMOFLAGE.get(), RenderCamoflage::new);
    }

    @SubscribeEvent
    public static void onLoadEvent(FMLLoadCompleteEvent event) {
    }
}
