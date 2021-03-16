package blastcraft.common.block;

import net.minecraft.block.GlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockCustomBricks extends GlassBlock {

    public BlockCustomBricks(float hardness, float resistance) {
	super(Properties.create(Material.ROCK, MaterialColor.GRAY).setRequiresTool().hardnessAndResistance(hardness, resistance));
    }

}
