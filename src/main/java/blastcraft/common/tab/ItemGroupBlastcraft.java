package blastcraft.common.tab;

import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupBlastcraft extends ItemGroup {

	public ItemGroupBlastcraft(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base));
	}
}