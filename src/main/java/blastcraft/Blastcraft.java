package blastcraft;

import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.common.settings.Constants;
import electrodynamics.client.guidebook.ScreenGuidebook;
import electrodynamics.common.block.BlockCustomGlass;
import electrodynamics.prefab.configuration.ConfigurationHandler;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

@Mod(References.ID)
@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class Blastcraft {

	public Blastcraft() {
		ConfigurationHandler.registerConfig(Constants.class);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		DeferredRegisters.BLOCKS.register(bus);
		DeferredRegisters.ITEMS.register(bus);
		DeferredRegisters.TILES.register(bus);
		BlastCraftRecipeInit.RECIPE_SERIALIZER.register(bus);
		SoundRegister.SOUNDS.register(bus);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onClientSetup(FMLClientSetupEvent event) {
		for (RegistryObject<Block> block : DeferredRegisters.BLOCKS.getEntries()) {
			if (block.get() instanceof BlockCustomGlass) {
				ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutout());
			}
		}
		ItemBlockRenderTypes.setRenderLayer(DeferredRegisters.blockCamoflage, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DeferredRegisters.blockSpike, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DeferredRegisters.blockSpikeFire, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DeferredRegisters.blockSpikePoison, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(DeferredRegisters.blockGlassPressurePlate, RenderType.translucent());
		ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void registerEntities(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(DeferredRegisters.TILE_CAMOFLAGE.get(), RenderCamoflage::new);

	}

	@SubscribeEvent
	public static void onLoadEvent(FMLLoadCompleteEvent event) {
	}
}
