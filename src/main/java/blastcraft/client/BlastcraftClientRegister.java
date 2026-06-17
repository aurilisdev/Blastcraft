package blastcraft.client;

import blastcraft.Blastcraft;
import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.registers.BlastcraftTiles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import voltaic.client.guidebook.ScreenGuidebook;

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

}
