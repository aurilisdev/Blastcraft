package blastcraft.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import blastcraft.References;
import blastcraft.client.guidebook.ModuleBlastcraft;
import blastcraft.client.render.tile.RenderCamoflage;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlockTypes;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.client.guidebook.ScreenGuidebook;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = References.ID, bus = Bus.MOD, value = { Dist.CLIENT })
public class ClientRegister {

	public static void setup() {
		
		for(SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.getBlock(glass), RenderType.cutout());
		}
		
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.blockCamoflage, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.blockSpike, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.blockSpikeFire, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.blockSpikePoison, RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlastcraftBlocks.blockGlassPressurePlate, RenderType.translucent());
		
		ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void registerEntities(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BlastcraftBlockTypes.TILE_CAMOFLAGE.get(), RenderCamoflage::new);

	}

}