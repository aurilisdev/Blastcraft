package blastcraft.common.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockCustomSlab extends SlabBlock {

	public BlockCustomSlab(float resistance, float hardness) {
		super(Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
