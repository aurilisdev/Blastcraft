package blastcraft.common.tab;

import blastcraft.DeferredRegisters;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupBlastcraft extends ItemGroup {

	public ItemGroupBlastcraft(String label) {
		super(label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(DeferredRegisters.blockBlastproofWalling);
	}
}