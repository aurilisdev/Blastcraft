package blastcraft.common.block;

import blastcraft.common.tile.TileBlastCompressor;
import electrodynamics.api.tile.GenericTile;
import electrodynamics.api.tile.components.ComponentType;
import electrodynamics.common.block.BlockGenericMachine;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockBlastCompressor extends BlockGenericMachine {
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
	return new TileBlastCompressor();
    }

    @Deprecated
    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
	TileEntity tile = worldIn.getTileEntity(pos);
	if (tile instanceof GenericTile) {
	    InventoryHelper.dropInventoryItems(worldIn, pos, ((GenericTile) tile).getComponent(ComponentType.Inventory));
	}
	super.onReplaced(state, worldIn, pos, newState, isMoving);
    }
}
