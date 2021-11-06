package blastcraft.common.block;

import java.util.Arrays;
import java.util.List;

import blastcraft.common.tile.TileCamoflage;
import electrodynamics.prefab.tile.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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

public class BlockCamoflage extends Block implements IWrenchable {
    public static BooleanProperty PROP = BooleanProperty.create("isself");
    public static BooleanProperty ISWALKTHROUGHABLE = BooleanProperty.create("canwalk");

    public BlockCamoflage() {
	super(Properties.of(Material.WOOL).strength(0.3f, 1.0f).sound(SoundType.WOOL).isRedstoneConductor(BlockCamoflage::isntSolid).noOcclusion());
    }

    private static boolean isntSolid(BlockState state, BlockGetter reader, BlockPos pos) {
	return false;
    }

    @Override
    @Deprecated
    public List<ItemStack> getDrops(BlockState state, net.minecraft.world.level.storage.loot.LootContext.Builder builder) {
	return Arrays.asList(new ItemStack(this));
    }

    @Override
    @Deprecated
    public VoxelShape getVisualShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
	return Shapes.empty();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    @Deprecated
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
	return adjacentBlockState.is(this) || super.skipRendering(state, adjacentBlockState, side);
    }

    @Override
    @Deprecated
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
	return state.getValue(ISWALKTHROUGHABLE) == Boolean.TRUE ? super.getShape(state, worldIn, pos, context) : Shapes.empty();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    @Deprecated
    public float getShadeBrightness(BlockState state, BlockGetter worldIn, BlockPos pos) {
	return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
	return true;
    }

    @Override
    @Deprecated
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
	ItemStack stack = player.getItemBySlot(handIn == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
	if (!stack.isEmpty()) {
	    Item item = stack.getItem();
	    if (item instanceof BlockItem) {
		Block block = ((BlockItem) item).getBlock();
		if (block.getRenderShape(block.defaultBlockState()) == RenderShape.MODEL) {
		    TileCamoflage tile = (TileCamoflage) worldIn.getBlockEntity(pos);
		    if (tile != null) {
			if (tile.block != block) {
			    if (block == this) {
				worldIn.setBlockAndUpdate(pos, state.setValue(PROP, true));
			    } else if (tile.block == this) {
				worldIn.setBlockAndUpdate(pos, state.setValue(PROP, false));
			    }
			}
			tile.block = block;
		    }
		}
	    }
	}
	return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
	super.createBlockStateDefinition(builder);
	builder.add(PROP);
	builder.add(ISWALKTHROUGHABLE);
    }

    @Override
    @Deprecated
    public RenderShape getRenderShape(BlockState state) {
	return state.getValue(PROP) == Boolean.TRUE ? RenderShape.MODEL : RenderShape.INVISIBLE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
	return true;
    }

    @Override
    @Deprecated
    public BlockEntity createTileEntity(BlockState state, BlockGetter world) {
	return new TileCamoflage();
    }

    @Override
    @Deprecated
    public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
	return !state.getValue(ISWALKTHROUGHABLE) || super.isPathfindable(state, worldIn, pos, type);
    }

    @Override
    public void onPickup(ItemStack arg0, BlockPos arg1, Player arg) {
	arg.level.setBlockAndUpdate(arg1,
		arg.level.getBlockState(arg1).setValue(ISWALKTHROUGHABLE, !arg.level.getBlockState(arg1).getValue(ISWALKTHROUGHABLE)));
    }

    @Override
    public void onRotate(ItemStack arg0, BlockPos arg1, Player arg2) {
	// Doesnt rotate.
    }
}
