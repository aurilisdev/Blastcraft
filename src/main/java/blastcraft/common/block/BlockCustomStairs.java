package blastcraft.common.block;

import java.util.function.Supplier;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BlockCustomStairs extends StairBlock {

	public BlockCustomStairs(Supplier<BlockState> state, float hardness, float resistance) {
		super(state, Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
