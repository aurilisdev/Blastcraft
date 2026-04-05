package blastcraft.common.block;

import net.minecraft.world.level.block.Block;
import voltaic.common.block.states.VoltaicMaterials;

public class BlockCustomBricks extends Block {

	public BlockCustomBricks(float hardness, float resistance) {
		super(VoltaicMaterials.metal().requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
