package blastcraft.common.block;

import java.util.function.Supplier;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockCustomStairs extends StairBlock {

	public BlockCustomStairs(Supplier<BlockState> state, float hardness, float resistance) {
		super(state, Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

}
