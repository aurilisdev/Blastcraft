package blastcraft.client;

import blastcraft.Blastcraft;
import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.registers.BlastcraftFluids;
import blastcraft.registers.BlastcraftTiles;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import voltaic.client.guidebook.ScreenGuidebook;
import voltaic.client.misc.SWBFClientExtensions;
import voltaic.common.fluid.SimpleWaterBasedFluidType;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class BlastcraftClientRegister {

    public static void setup() {
	ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void registerEntities(EntityRenderersEvent.RegisterRenderers event) {
	event.registerBlockEntityRenderer(BlastcraftTiles.TILE_CAMOFLAGE.get(), RenderCamoflage::new);

    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {

	BlastcraftFluids.FLUIDS.getEntries().forEach(fluid -> {
	    event.registerFluidType(new SWBFClientExtensions((SimpleWaterBasedFluidType) fluid.get().getFluidType()),
		    fluid.get().getFluidType());
	});

    }

}
