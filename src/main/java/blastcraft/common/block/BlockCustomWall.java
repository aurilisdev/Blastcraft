package blastcraft.common.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WallBlock;

public class BlockCustomWall extends WallBlock {

    public BlockCustomWall(float hardness, float resistance) {
	super(Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(hardness, resistance));
    }

}
