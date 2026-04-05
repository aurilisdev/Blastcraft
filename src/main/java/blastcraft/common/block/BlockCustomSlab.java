package blastcraft.common.block;

import net.minecraft.world.level.block.SlabBlock;
import voltaic.common.block.states.VoltaicMaterials;

public class BlockCustomSlab extends SlabBlock {

	public BlockCustomSlab(float resistance, float hardness) {
		super(VoltaicMaterials.metal().requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
