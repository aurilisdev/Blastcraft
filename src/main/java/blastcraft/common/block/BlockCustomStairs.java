package blastcraft.common.block;

import java.util.function.Supplier;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class BlockCustomStairs extends StairsBlock {

	public BlockCustomStairs(Supplier<BlockState> state, float hardness, float resistance) {
		super(state, Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
