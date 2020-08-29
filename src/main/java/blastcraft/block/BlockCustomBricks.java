package blastcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockCustomBricks extends Block {

	public BlockCustomBricks(float hardness, float resistance) {
		super(Properties.create(Material.ROCK, MaterialColor.GRAY).setRequiresTool().hardnessAndResistance(hardness, resistance));
	}

}
