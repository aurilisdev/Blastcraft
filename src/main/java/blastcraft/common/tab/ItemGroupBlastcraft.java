package blastcraft.common.tab;

import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupBlastcraft extends CreativeModeTab {

	public ItemGroupBlastcraft(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base));
	}
}