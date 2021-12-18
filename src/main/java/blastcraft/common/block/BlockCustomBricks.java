package blastcraft.common.block;

import java.util.Arrays;
import java.util.List;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.storage.loot.LootContext.Builder;

public class BlockCustomBricks extends GlassBlock {

	public BlockCustomBricks(float hardness, float resistance) {
		super(Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(hardness, resistance));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, Builder builder) {
		return Arrays.asList(new ItemStack(this));
	}

}
