package blastcraft.client.render.tile;

import com.mojang.blaze3d.matrix.MatrixStack;

import blastcraft.DeferredRegisters;
import blastcraft.common.tile.TileCamoflage;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;

public class RenderCamoflage extends TileEntityRenderer<TileCamoflage> {

    public RenderCamoflage(TileEntityRendererDispatcher rendererDispatcherIn) {
	super(rendererDispatcherIn);
    }

    @Override
    @Deprecated
    public void render(TileCamoflage tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn,
	    int combinedOverlayIn) {
	if (tileEntityIn.block != null && tileEntityIn.block != DeferredRegisters.blockCamoflage) {
	    BlockPos s = tileEntityIn.getPos().offset(Direction.UP);
	    BlockState state = tileEntityIn.block
		    .getStateForPlacement(new BlockItemUseContext(Minecraft.getInstance().player, Hand.MAIN_HAND, ItemStack.EMPTY,
			    new BlockRayTraceResult(new Vector3d(s.getX(), s.getY(), s.getZ()), Direction.UP, s.offset(Direction.DOWN), false)));
	    if (state != null) {
		Minecraft.getInstance().getBlockRendererDispatcher().renderBlock(state, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
	    }
	}
    }

}
