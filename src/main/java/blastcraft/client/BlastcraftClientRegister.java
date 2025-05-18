package blastcraft.client;

import blastcraft.Blastcraft;
import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.registers.BlastcraftBlocks;
import blastcraft.registers.BlastcraftTiles;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import voltaic.client.guidebook.ScreenGuidebook;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class BlastcraftClientRegister {

	public static void setup() {
		ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
		
		for(Block block : BlastcraftBlocks.BLOCKS_WALLINGGLASS.getAllValues()) {
			RenderTypeLookup.setRenderLayer(block, RenderType.cutout());
		}
		
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.BLOCK_SPIKE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.BLOCK_FIRESPIKE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.BLOCK_POISONSPIKE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.BLOCK_CAMOFLAGE.get(), RenderType.cutout());
		
		ClientRegistry.bindTileEntityRenderer(BlastcraftTiles.TILE_CAMOFLAGE.get(), RenderCamoflage::new);
	}

}
