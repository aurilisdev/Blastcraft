package blastcraft;

import blastcraft.client.BlastcraftClientRegister;
import blastcraft.common.block.BlastcraftBlockStates;
import blastcraft.common.settings.BlastcraftConstants;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.UnifiedBlastcraftRegister;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import voltaic.prefab.configuration.ConfigurationHandler;

@Mod(Blastcraft.ID)
@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD)
public class Blastcraft {

	public static final String ID = "blastcraft";
	public static final String NAME = "Blastcraft";

	public static final String BALLISTIX_ID = "ballistix";

	public Blastcraft(IEventBus bus) {
		ConfigurationHandler.registerConfig(BlastcraftConstants.class);
		BlastcraftBlockStates.init();
		UnifiedBlastcraftRegister.register(bus);
	}

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		BlastcraftTags.init();
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onClientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			BlastcraftClientRegister.setup();
		});
	}

	@SubscribeEvent
	public static void onLoadEvent(FMLLoadCompleteEvent event) {
	}

	public static final ResourceLocation rl(String path) {
		return ResourceLocation.fromNamespaceAndPath(Blastcraft.ID, path);
	}
}
