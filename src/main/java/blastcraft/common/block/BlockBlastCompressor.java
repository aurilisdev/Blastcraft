package blastcraft.common.block;

import blastcraft.common.tile.TileBlastCompressor;
import electrodynamics.common.block.BlockGenericMachine;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.ComponentType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockBlastCompressor extends BlockGenericMachine {
    @Override
    public BlockEntity createTileEntity(BlockState state, BlockGetter world) {
	return new TileBlastCompressor();
    }

    @Deprecated
    @Override
    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
	BlockEntity tile = worldIn.getBlockEntity(pos);
	if (tile instanceof GenericTile) {
	    Containers.dropContents(worldIn, pos, ((GenericTile) tile).getComponent(ComponentType.Inventory));
	}
	super.onRemove(state, worldIn, pos, newState, isMoving);
    }
}
