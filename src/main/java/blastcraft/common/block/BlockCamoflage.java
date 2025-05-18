package blastcraft.common.block;

import blastcraft.common.tile.TileCamoflauge;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.StateContainer;
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
import voltaic.prefab.block.GenericEntityBlock;

public class BlockCamoflage extends GenericEntityBlock {

    public BlockCamoflage() {
        super(Properties.copy(Blocks.WHITE_WOOL).strength(0.3f, 1.0f).sound(SoundType.WOOL).isRedstoneConductor((a, b, c) -> false).noOcclusion());
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext pContext) {
        return super.getStateForPlacement(pContext).setValue(BlastcraftBlockStates.HASCAMOFLAUGE, false).setValue(BlastcraftBlockStates.ISWALKTHROUGHABLE, false);
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.is(this) || super.skipRendering(state, adjacentBlockState, side);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return state.getValue(BlastcraftBlockStates.ISWALKTHROUGHABLE) ? VoxelShapes.empty() : super.getShape(state, worldIn, pos, context);
    }

    @Override
    public float getShadeBrightness(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader level, BlockPos pos) {
        if (!state.getValue(BlastcraftBlockStates.HASCAMOFLAUGE)) {
            return false;
        }
        TileEntity tileentity = level.getBlockEntity(pos);
        if (tileentity instanceof TileCamoflauge) {
        	TileCamoflauge camo = (TileCamoflauge) tileentity;
            if (camo.isCamoAir()) {
                return false;
            }
            return camo.getCamoBlock().propagatesSkylightDown(level, pos);
        }

        return false;
    }

    @Override
	public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hitResult) {
    	ItemStack stack = player.getItemInHand(hand);
        if (stack.isEmpty()) {
            return super.use(state, level, pos, player, hand, hitResult);
        }
        TileEntity tileentity = level.getBlockEntity(pos);
        // require block in hand and camo block
        if (!(stack.getItem() instanceof BlockItem) || !(tileentity instanceof TileCamoflauge)) {

        	return super.use(state, level, pos, player, hand, hitResult);

        }
        Block block = ((BlockItem) stack.getItem()).getBlock();

        if (block == BlastcraftBlocks.BLOCK_CAMOFLAGE.get()) {
        	return super.use(state, level, pos, player, hand, hitResult);
        }

        BlockItemUseContext newCtx = new BlockItemUseContext(player, hand, stack, hitResult);
        TileCamoflauge camo = (TileCamoflauge) tileentity;

        if (state.getValue(BlastcraftBlockStates.HASCAMOFLAUGE)) {

            if (camo.getCamoBlock().is(block)) {
            	return super.use(state, level, pos, player, hand, hitResult);
            }
            if (!level.isClientSide) {
                camo.setCamoBlock(block.getStateForPlacement(newCtx));
                level.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
                level.getChunkSource().getLightEngine().checkBlock(pos);
            }
            return ActionResultType.CONSUME;
        }
        if (!level.isClientSide) {
            state = state.setValue(BlastcraftBlockStates.HASCAMOFLAUGE, true);
            camo.setCamoBlock(block.getStateForPlacement(newCtx));
            level.playSound(null, pos, block.defaultBlockState().getSoundType().getPlaceSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
            level.setBlockAndUpdate(pos, state);
            level.getChunkSource().getLightEngine().checkBlock(pos);
        }
        return ActionResultType.CONSUME;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BlastcraftBlockStates.HASCAMOFLAUGE, BlastcraftBlockStates.ISWALKTHROUGHABLE);
    }

    @Override
    public BlockRenderType getRenderShape(BlockState state) {
        return state.getValue(BlastcraftBlockStates.HASCAMOFLAUGE) ? BlockRenderType.INVISIBLE : super.getRenderShape(state);
    }
    
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    	return new TileCamoflauge();
    }

    @Override
	public boolean isPathfindable(BlockState state, IBlockReader world, BlockPos pos, PathType pathComputationType) {
        if (state.getValue(BlastcraftBlockStates.ISWALKTHROUGHABLE) || pathComputationType == PathType.WATER) {
            return false;
        }
        return super.isPathfindable(state, world, pos, pathComputationType);
    }

    @Override
    public void onPickup(ItemStack stack, BlockPos pos, PlayerEntity player) {

        World world = player.level;
        BlockState state = world.getBlockState(pos);
        TileEntity tileentity = world.getBlockEntity(pos);
        if (tileentity instanceof TileCamoflauge) {
            ((TileCamoflauge) tileentity).setCamoBlock(Blocks.AIR.defaultBlockState());
        }

        player.level.setBlockAndUpdate(pos, state.setValue(BlastcraftBlockStates.HASCAMOFLAUGE, false));
    }

    @Override
    public void onRotate(ItemStack stack, BlockPos pos, PlayerEntity player) {

        World world = player.level;
        BlockState state = world.getBlockState(pos);

        world.setBlockAndUpdate(pos, state.setValue(BlastcraftBlockStates.ISWALKTHROUGHABLE, !state.getValue(BlastcraftBlockStates.ISWALKTHROUGHABLE)));

    }
}
