package blastcraft.common.block;

import net.minecraft.world.level.block.WallBlock;
import voltaic.common.block.states.VoltaicMaterials;

public class BlockCustomWall extends WallBlock {

	public BlockCustomWall(float resistance, float hardness) {
		super(VoltaicMaterials.metal().requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
