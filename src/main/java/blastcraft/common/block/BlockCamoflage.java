package blastcraft.common.block;

import blastcraft.common.tile.TileCamoflage;
import electrodynamics.api.tile.IWrenchable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockCamoflage extends Block implements IWrenchable {
    public static BooleanProperty PROP = BooleanProperty.create("isself");
    public static BooleanProperty ISWALKTHROUGHABLE = BooleanProperty.create("canwalk");

    public BlockCamoflage() {
	super(Properties.create(Material.WOOL).hardnessAndResistance(0.3f, 1.0f).sound(SoundType.CLOTH).setOpaque(BlockCamoflage::isntSolid)
		.notSolid());
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
	return adjacentBlockState.isIn(this) || super.isSideInvisible(state, adjacentBlockState, side);
    }

    @Override
    @Deprecated
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	return state.get(ISWALKTHROUGHABLE) == Boolean.TRUE ? super.getShape(state, worldIn, pos, context) : VoxelShapes.empty();
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

    @Override
    @Deprecated
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn,
	    BlockRayTraceResult hit) {
	ItemStack stack = player.getItemStackFromSlot(handIn == Hand.MAIN_HAND ? EquipmentSlotType.MAINHAND : EquipmentSlotType.OFFHAND);
	if (!stack.isEmpty()) {
	    Item item = stack.getItem();
	    if (item instanceof BlockItem) {
		Block block = ((BlockItem) item).getBlock();
		if (block.getRenderType(block.getDefaultState()) == BlockRenderType.MODEL) {
		    TileCamoflage tile = (TileCamoflage) worldIn.getTileEntity(pos);
		    if (tile != null) {
			if (tile.block != block) {
			    if (block == this) {
				worldIn.setBlockState(pos, state.with(PROP, true));
			    } else if (tile.block == this && block != this) {
				worldIn.setBlockState(pos, state.with(PROP, false));
			    }
			}
			tile.block = block;
		    }
		}
	    }
	}
	return ActionResultType.SUCCESS;
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
	super.fillStateContainer(builder);
	builder.add(PROP);
	builder.add(ISWALKTHROUGHABLE);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
	return state.get(PROP) == true ? BlockRenderType.MODEL : BlockRenderType.INVISIBLE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
	return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
	return new TileCamoflage();
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
	return state.get(ISWALKTHROUGHABLE) ? super.allowsMovement(state, worldIn, pos, type) : true;
    }

    @Override
    public void onPickup(ItemStack arg0, BlockPos arg1, PlayerEntity arg) {
	arg.world.setBlockState(arg1, arg.world.getBlockState(arg1).with(ISWALKTHROUGHABLE, !arg.world.getBlockState(arg1).get(ISWALKTHROUGHABLE)));
    }

    @Override
    public void onRotate(ItemStack arg0, BlockPos arg1, PlayerEntity arg2) {
    }
}
