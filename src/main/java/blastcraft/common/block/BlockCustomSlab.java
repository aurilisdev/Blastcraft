package blastcraft.common.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class BlockCustomSlab extends SlabBlock {

	public BlockCustomSlab(float resistance, float hardness) {
		super(Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
