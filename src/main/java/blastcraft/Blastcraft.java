package blastcraft;

import blastcraft.client.BlastcraftClientRegister;
import blastcraft.common.block.BlastcraftBlockStates;
import blastcraft.common.settings.BlastcraftConstants;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftRecipies;
import blastcraft.registers.UnifiedBlastcraftRegister;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import voltaic.prefab.configuration.ConfigurationHandler;

@Mod(Blastcraft.ID)
@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD)
public class Blastcraft {

	public static final String ID = "blastcraft";
	public static final String NAME = "Blastcraft";

	public static final String BALLISTIX_ID = "ballistix";

	public Blastcraft() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
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
		return new ResourceLocation(Blastcraft.ID, path);
	}
}
