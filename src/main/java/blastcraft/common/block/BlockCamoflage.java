package blastcraft.common.block;

import blastcraft.common.tile.TileCamoflage;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.prefab.block.GenericEntityBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCamoflage extends GenericEntityBlock {

	public static final BooleanProperty HASCAMOFLAUGE = BooleanProperty.create("isself");
	public static final BooleanProperty ISWALKTHROUGHABLE = BooleanProperty.create("canwalk");

	public BlockCamoflage() {
		super(Properties.of(Material.WOOL).strength(0.3f, 1.0f).sound(SoundType.WOOL).isRedstoneConductor((a, b, c) -> false).noOcclusion());
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext pContext) {
		return super.getStateForPlacement(pContext).setValue(HASCAMOFLAUGE, false).setValue(ISWALKTHROUGHABLE, false);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.empty();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.is(this) || super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return state.getValue(ISWALKTHROUGHABLE) ? VoxelShapes.empty() : super.getShape(state, worldIn, pos, context);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public float getShadeBrightness(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 1.0F;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader level, BlockPos pos) {
		if (!state.getValue(HASCAMOFLAUGE)) {
			return false;
		}

		TileEntity tile = level.getBlockEntity(pos);
		if (tile instanceof TileCamoflage) {
			TileCamoflage camo = (TileCamoflage) tile;
			if (camo.isCamoAir()) {
				return false;
			}
			return camo.getCamoBlock().getBlock().propagatesSkylightDown(camo.getCamoBlock(), level, pos);
		}

		return false;
	}

	@Override
	public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {

		ItemStack stack = player.getItemInHand(hand);

		if (stack.isEmpty()) {
			return super.use(state, world, pos, player, hand, hit);
		}

		TileEntity tile = world.getBlockEntity(pos);
		
		if (stack.getItem() instanceof BlockItem && tile instanceof TileCamoflage) {
			TileCamoflage camo = (TileCamoflage) tile;
			BlockItem blockItem = (BlockItem) stack.getItem();
			
			Block block = blockItem.getBlock();

			if (block == BlastcraftBlocks.blockCamoflage) {
				return super.use(state, world, pos, player, hand, hit);
			}

			BlockItemUseContext newCtx = new BlockItemUseContext(player, hand, stack, hit);

			if (state.getValue(HASCAMOFLAUGE)) {

				if (camo.getCamoBlock().is(block)) {
					return super.use(state, world, pos, player, hand, hit);
				} else {
					if (!world.isClientSide) {
						camo.setCamoBlock(block.getStateForPlacement(newCtx));
						world.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
						world.getChunkSource().getLightEngine().checkBlock(pos);
					}
					return ActionResultType.CONSUME;
				}
			} else {

				if (!world.isClientSide) {
					state = state.setValue(HASCAMOFLAUGE, true);
					camo.setCamoBlock(block.getStateForPlacement(newCtx));
					world.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
					world.setBlockAndUpdate(pos, state);
					world.getChunkSource().getLightEngine().checkBlock(pos);
				}
				return ActionResultType.CONSUME;
			}

		} else {

			return super.use(state, world, pos, player, hand, hit);

		}

	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(HASCAMOFLAUGE, ISWALKTHROUGHABLE);
	}

	@Override
	public BlockRenderType getRenderShape(BlockState state) {
		return state.getValue(HASCAMOFLAUGE) ? BlockRenderType.INVISIBLE : super.getRenderShape(state);
	}

	@Override
	public TileEntity createTileEntity(BlockState arg0, IBlockReader arg1) {
		return new TileCamoflage();
	}

	@Override
	public boolean isPathfindable(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {

		if (state.getValue(ISWALKTHROUGHABLE)) {
			return false;
		}

		TileEntity tile = worldIn.getBlockEntity(pos);
		if (tile instanceof TileCamoflage) {
			TileCamoflage camo = (TileCamoflage) tile;
			if (camo.isCamoAir()) {
				return super.isPathfindable(state, worldIn, pos, type);
			} else {
				return camo.getCamoBlock().isPathfindable(worldIn, pos, type);
			}

		}

		return super.isPathfindable(state, worldIn, pos, type);
	}

	@Override
	public void onPickup(ItemStack stack, BlockPos pos, PlayerEntity player) {

		World world = player.level;
		BlockState state = world.getBlockState(pos);

		TileEntity tile = world.getBlockEntity(pos);
		if (tile instanceof TileCamoflage) {
			TileCamoflage camo = (TileCamoflage) tile;
			camo.setCamoBlock(Blocks.AIR.defaultBlockState());
		}

		player.level.setBlockAndUpdate(pos, state.setValue(HASCAMOFLAUGE, false));
	}

	@Override
	public void onRotate(ItemStack stack, BlockPos pos, PlayerEntity player) {

		World world = player.level;
		BlockState state = world.getBlockState(pos);

		world.setBlockAndUpdate(pos, state.setValue(ISWALKTHROUGHABLE, !state.getValue(ISWALKTHROUGHABLE)));

	}
}