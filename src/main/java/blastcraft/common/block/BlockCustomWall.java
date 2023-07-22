package blastcraft.common.block;

import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockCustomWall extends WallBlock {

	public BlockCustomWall(float resistance, float hardness) {
		super(Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
