package blastcraft.client;

import blastcraft.Blastcraft;
import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.registers.BlastcraftBlocks;
import blastcraft.registers.BlastcraftTiles;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
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
		
		for(Block block : BlastcraftBlocks.BLOCKS_WALLINGGLASS.getAllValues()) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}
		
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.BLOCK_SPIKE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.BLOCK_FIRESPIKE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.BLOCK_POISONSPIKE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.BLOCK_CAMOFLAGE.get(), RenderType.cutout());
	}


	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void registerEntities(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BlastcraftTiles.TILE_CAMOFLAGE.get(), RenderCamoflage::new);

	}

}
