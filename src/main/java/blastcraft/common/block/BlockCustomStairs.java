package blastcraft.common.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BlockCustomStairs extends StairBlock {

    public BlockCustomStairs(BlockState state, float hardness, float resistance) {
	super(state,
		Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
    }

}
