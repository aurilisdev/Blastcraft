package blastcraft.client.render.tile;

import com.mojang.blaze3d.vertex.PoseStack;

import blastcraft.common.tile.TileCamoflauge;
import electrodynamics.client.render.tile.AbstractTileRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class RenderCamoflage extends AbstractTileRenderer<TileCamoflauge> {

	public RenderCamoflage(BlockEntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	public void render(TileCamoflauge tile, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		
		if(tile.isCamoAir()) {
			return;
		}
		
		minecraft().getBlockRenderer().renderSingleBlock(tile.getCamoBlock(), matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	}

}
