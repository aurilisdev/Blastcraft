package blastcraft.client.render.tile;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import blastcraft.common.tile.TileCamoflauge;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.data.ModelData;
import voltaic.client.render.AbstractTileRenderer;

public class RenderCamoflage extends AbstractTileRenderer<TileCamoflauge> {

    public RenderCamoflage(BlockEntityRendererProvider.Context context) {
	super(context);
    }

    @Override
    public void render(TileCamoflauge tile, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn,
	    int combinedLightIn, int combinedOverlayIn) {

	if (tile.isCamoAir()) {
	    return;
	}
	Level level = tile.getLevel();
	if (level == null) {
	    return;
	}

	BlockState camo = tile.getCamoBlock();
	BlockState glass = Blocks.GLASS.defaultBlockState();

	int light = combinedLightIn;
	if (level.isLoaded(tile.getBlockPos())) {
	    light = LevelRenderer.getLightColor(level, tile.getBlockPos());
	}
	int emission = camo.getLightEmission(level, tile.getBlockPos());
	if (emission > 0) {
	    int block = Math.max(LightTexture.block(light), emission);
	    light = LightTexture.pack(block, LightTexture.sky(light));
	}

	for (Direction dir : Direction.values()) {
	    if (tile.isGlassFace(dir)) {
		renderFace(tile, level, glass, dir, matrixStackIn, bufferIn, light, combinedOverlayIn);
	    } else {
		renderFace(tile, level, camo, dir, matrixStackIn, bufferIn, light, combinedOverlayIn);
	    }
	}
	renderFace(tile, level, camo, null, matrixStackIn, bufferIn, light, combinedOverlayIn);
    }

    private void renderFace(TileCamoflauge tile, Level level, BlockState state, @Nullable Direction dir,
	    PoseStack stack, MultiBufferSource buffer, int light, int overlay) {
	BakedModel model = minecraft().getBlockRenderer().getBlockModel(state);
	RandomSource random = RandomSource.create(42);
	for (RenderType type : model.getRenderTypes(state, random, ModelData.EMPTY)) {
	    VertexConsumer consumer = buffer.getBuffer(type);
	    for (BakedQuad quad : model.getQuads(state, dir, random, ModelData.EMPTY, type)) {
		float r = 1.0F, g = 1.0F, b = 1.0F;
		if (quad.isTinted()) {
		    int color = minecraft().getBlockColors().getColor(state, level, tile.getBlockPos(),
			    quad.getTintIndex());
		    r = (color >> 16 & 255) / 255.0F;
		    g = (color >> 8 & 255) / 255.0F;
		    b = (color & 255) / 255.0F;
		}
		float shade = level.getShade(quad.getDirection(), quad.isShade());
		consumer.putBulkData(stack.last(), quad, r * shade, g * shade, b * shade, 1.0F, light, overlay, true);
	    }
	}
    }

}
