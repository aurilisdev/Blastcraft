package blastcraft.common.block;

import blastcraft.common.tile.TileCamoflauge;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.prefab.block.GenericEntityBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCamoflage extends GenericEntityBlock {

	public static final BooleanProperty HASCAMOFLAUGE = BooleanProperty.create("isself");
	public static final BooleanProperty ISWALKTHROUGHABLE = BooleanProperty.create("canwalk");

	public BlockCamoflage() {
		super(Properties.of(Material.WOOL).strength(0.3f, 1.0f).sound(SoundType.WOOL).isRedstoneConductor((a, b, c) -> false).noOcclusion());
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		return super.getStateForPlacement(pContext).setValue(HASCAMOFLAUGE, false).setValue(ISWALKTHROUGHABLE, false);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.is(this) || super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return state.getValue(ISWALKTHROUGHABLE) ? Shapes.empty() : super.getShape(state, worldIn, pos, context);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public float getShadeBrightness(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1.0F;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter level, BlockPos pos) {
		if (!state.getValue(HASCAMOFLAUGE)) {
			return false;
		}

		if (level.getBlockEntity(pos) instanceof TileCamoflauge camo) {
			if (camo.isCamoAir()) {
				return false;
			}
			return camo.getCamoBlock().getBlock().propagatesSkylightDown(camo.getCamoBlock(), level, pos);
		}

		return false;
	}

	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

		ItemStack stack = player.getItemInHand(hand);

		if (stack.isEmpty()) {
			return super.use(state, world, pos, player, hand, hit);
		}

		if (stack.getItem() instanceof BlockItem blockItem && world.getBlockEntity(pos) instanceof TileCamoflauge camo) {

			Block block = blockItem.getBlock();

			if (block == BlastcraftBlocks.blockCamoflage) {
				return super.use(state, world, pos, player, hand, hit);
			}

			BlockPlaceContext newCtx = new BlockPlaceContext(player, hand, stack, hit);

			if (state.getValue(HASCAMOFLAUGE)) {

				if (camo.getCamoBlock().is(block)) {
					return super.use(state, world, pos, player, hand, hit);
				} else {
					if (!world.isClientSide) {
						camo.setCamoBlock(block.getStateForPlacement(newCtx));
						world.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
						world.getChunkSource().getLightEngine().checkBlock(pos);
					}
					return InteractionResult.CONSUME;
				}
			} else {

				if (!world.isClientSide) {
					state = state.setValue(HASCAMOFLAUGE, true);
					camo.setCamoBlock(block.getStateForPlacement(newCtx));
					world.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
					world.setBlockAndUpdate(pos, state);
					world.getChunkSource().getLightEngine().checkBlock(pos);
				}
				return InteractionResult.CONSUME;
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
	public RenderShape getRenderShape(BlockState state) {
		return state.getValue(HASCAMOFLAUGE) ? RenderShape.INVISIBLE : super.getRenderShape(state);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new TileCamoflauge(pos, state);
	}

	@Override
	public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {

		if (state.getValue(ISWALKTHROUGHABLE)) {
			return false;
		}

		if (worldIn.getBlockEntity(pos) instanceof TileCamoflauge camo) {

			if (camo.isCamoAir()) {
				return super.isPathfindable(state, worldIn, pos, type);
			} else {
				return camo.getCamoBlock().isPathfindable(worldIn, pos, type);
			}

		}

		return super.isPathfindable(state, worldIn, pos, type);
	}

	@Override
	public void onPickup(ItemStack stack, BlockPos pos, Player player) {

		Level world = player.level;
		BlockState state = world.getBlockState(pos);

		if (world.getBlockEntity(pos) instanceof TileCamoflauge camo) {
			camo.setCamoBlock(Blocks.AIR.defaultBlockState());
		}

		player.level.setBlockAndUpdate(pos, state.setValue(HASCAMOFLAUGE, false));
	}

	@Override
	public void onRotate(ItemStack stack, BlockPos pos, Player player) {

		Level world = player.level;
		BlockState state = world.getBlockState(pos);

		world.setBlockAndUpdate(pos, state.setValue(ISWALKTHROUGHABLE, !state.getValue(ISWALKTHROUGHABLE)));

	}
}
