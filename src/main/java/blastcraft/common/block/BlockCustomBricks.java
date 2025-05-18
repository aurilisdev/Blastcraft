package blastcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockCustomBricks extends Block {

	public BlockCustomBricks(float hardness, float resistance) {
		super(Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
