package blastcraft.common.block;

import blastcraft.common.tile.TileBlastCompressor;
import electrodynamics.prefab.block.GenericMachineBlock;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.ComponentType;
import electrodynamics.prefab.tile.components.type.ComponentInventory;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockBlastCompressor extends GenericMachineBlock {

	public BlockBlastCompressor() {
		super(TileBlastCompressor::new);
	}

	@Override
	public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		BlockEntity tile = worldIn.getBlockEntity(pos);
		if (tile instanceof GenericTile g) {
			Containers.dropContents(worldIn, pos, g.<ComponentInventory>getComponent(ComponentType.Inventory));
		}
		super.onRemove(state, worldIn, pos, newState, isMoving);
	}
}
