package blastcraft.common.block;

import java.util.Arrays;
import java.util.List;

import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext.Builder;
import net.minecraftforge.common.ToolType;

public class BlockCustomBricks extends GlassBlock {

    public BlockCustomBricks(float hardness, float resistance) {
	super(Properties.create(Material.ROCK, MaterialColor.GRAY).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(hardness,
		resistance));
    }

    @Override
    @Deprecated
    public List<ItemStack> getDrops(BlockState state, Builder builder) {
	return Arrays.asList(new ItemStack(this));
    }

}
