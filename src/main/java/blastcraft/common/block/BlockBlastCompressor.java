package blastcraft.common.block;

import blastcraft.common.tile.TileBlastCompressor;
import electrodynamics.prefab.block.GenericMachineBlock;

public class BlockBlastCompressor extends GenericMachineBlock {

	public BlockBlastCompressor() {
		super(TileBlastCompressor::new);
	}

}
