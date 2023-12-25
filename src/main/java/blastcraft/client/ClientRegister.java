package blastcraft.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
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
			RenderTypeLookup.setRenderLayer(BlastcraftBlocks.getBlock(glass), RenderType.cutout());
		}
		
		ClientRegistry.bindTileEntityRenderer(BlastcraftBlockTypes.TILE_CAMOFLAGE.get(), RenderCamoflage::new);
		
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.blockCamoflage, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.blockSpike, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.blockSpikeFire, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.blockSpikePoison, RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlastcraftBlocks.blockGlassPressurePlate, RenderType.translucent());
		
		ScreenGuidebook.addGuidebookModule(new ModuleBlastcraft());
	}

}