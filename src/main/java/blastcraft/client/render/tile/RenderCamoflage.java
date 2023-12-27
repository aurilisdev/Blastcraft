package blastcraft.client.render.tile;

import com.mojang.blaze3d.matrix.MatrixStack;

import blastcraft.common.tile.TileCamoflage;
import electrodynamics.client.render.tile.AbstractTileRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

public class RenderCamoflage extends AbstractTileRenderer<TileCamoflage> {

	public RenderCamoflage(TileEntityRendererDispatcher context) {
		super(context);
	}

	@Override
	public void render(TileCamoflage tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		
		if(tile.isCamoAir()) {
			return;
		}
		
		minecraft().getBlockRenderer().renderSingleBlock(tile.getCamoBlock(), matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	}

}