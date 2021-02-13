package blastcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCustomBrickGlass extends Block {

	public BlockCustomBrickGlass(float hardness, float resistance) {
		super(Properties.create(Material.GLASS).setRequiresTool().hardnessAndResistance(hardness, resistance).setOpaque(BlockCustomBrickGlass::isntSolid).notSolid());
	}

	private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
		return false;
	}

	@Override
	@Deprecated
	public VoxelShape getRayTraceShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.empty();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	@Deprecated
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.isIn(this) ? true : super.isSideInvisible(state, adjacentBlockState, side);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	@Deprecated
	public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 1.0F;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
		return true;
	}
}
