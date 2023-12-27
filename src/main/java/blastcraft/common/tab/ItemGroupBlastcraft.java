package blastcraft.common.tab;

import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupBlastcraft extends ItemGroup {

	public ItemGroupBlastcraft(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(BlastcraftBlocks.bricksMap.get(SubtypeBrick.base).get(0).get());
	}
}