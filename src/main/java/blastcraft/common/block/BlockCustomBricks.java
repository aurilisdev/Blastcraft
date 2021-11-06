package blastcraft.common.block;

import java.util.Arrays;
import java.util.List;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext.Builder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BlockCustomBricks extends GlassBlock {

    public BlockCustomBricks(float hardness, float resistance) {
	super(Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(hardness,
		resistance));
    }

    @Override
    @Deprecated
    public List<ItemStack> getDrops(BlockState state, Builder builder) {
	return Arrays.asList(new ItemStack(this));
    }

}
