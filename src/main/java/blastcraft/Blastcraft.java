package blastcraft;

import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.common.settings.Constants;
import blastcraft.registers.BlastcraftBlockTypes;
import blastcraft.registers.UnifiedBlastcraftRegister;
import electrodynamics.client.guidebook.ScreenGuidebook;
import electrodynamics.prefab.configuration.ConfigurationHandler;
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

@Mod(References.ID)
@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class Blastcraft {

	public Blastcraft() {
		ConfigurationHandler.registerConfig(Constants.class);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		UnifiedBlastcraftRegister.register(bus);
		BlastCraftRecipeInit.RECIPE_SERIALIZER.register(bus);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onClientSetup(FMLClientSetupEvent event) {
		ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void registerEntities(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BlastcraftBlockTypes.TILE_CAMOFLAGE.get(), RenderCamoflage::new);

	}

	@SubscribeEvent
	public static void onLoadEvent(FMLLoadCompleteEvent event) {
	}
}
