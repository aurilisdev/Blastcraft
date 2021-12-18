package blastcraft.common.tab;

import blastcraft.DeferredRegisters;
import blastcraft.common.block.SubtypeBrick;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupBlastcraft extends CreativeModeTab {

	public ItemGroupBlastcraft(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(DeferredRegisters.bricksMap.get(SubtypeBrick.base).get(0));
	}
}