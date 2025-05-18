package blastcraft.client.render.tile;

import com.mojang.blaze3d.matrix.MatrixStack;

import blastcraft.common.tile.TileCamoflauge;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import voltaic.client.render.AbstractTileRenderer;

public class RenderCamoflage extends AbstractTileRenderer<TileCamoflauge> {

	public RenderCamoflage(TileEntityRendererDispatcher context) {
		super(context);
	}

	@Override
	public void render(TileCamoflauge tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {

		if (tile.isCamoAir()) {
			return;
		}

		minecraft().getBlockRenderer().renderSingleBlock(tile.getCamoBlock(), matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	}

}
