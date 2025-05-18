package blastcraft.common.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class BlockCustomWall extends WallBlock {

	public BlockCustomWall(float resistance, float hardness) {
		super(Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
