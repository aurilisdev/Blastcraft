package blastcraft.common.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;

public class BlockCustomSlab extends SlabBlock {

    public BlockCustomSlab(float hardness, float resistance) {
	super(Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(hardness, resistance));
    }

}
