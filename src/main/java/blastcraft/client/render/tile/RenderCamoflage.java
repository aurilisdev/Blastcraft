package blastcraft.client.render.tile;

import com.mojang.blaze3d.vertex.PoseStack;

import blastcraft.common.tile.TileCamoflage;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class RenderCamoflage implements BlockEntityRenderer<TileCamoflage> {

	public RenderCamoflage(BlockEntityRendererProvider.Context context) {
	}

	@Override
	public void render(TileCamoflage tileEntityIn, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		if (tileEntityIn.block != null && tileEntityIn.block != BlastcraftBlocks.blockCamoflage) {
			BlockPos s = tileEntityIn.getBlockPos().relative(Direction.UP);
			BlockState state = tileEntityIn.block.getStateForPlacement(new BlockPlaceContext(Minecraft.getInstance().player, InteractionHand.MAIN_HAND, ItemStack.EMPTY, new BlockHitResult(new Vec3(s.getX(), s.getY(), s.getZ()), Direction.UP, s.relative(Direction.DOWN), false)));
			if (state != null) {
				Minecraft.getInstance().getBlockRenderer().renderSingleBlock(state, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
			}
		}
	}

}
