package blastcraft.registers;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlastcraftCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister
	    .create(Registries.CREATIVE_MODE_TAB, Blastcraft.ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = CREATIVE_TABS.register("main",
	    () -> CreativeModeTab.builder().title(BlastcraftTextUtils.creativeTab("main")).icon(
		    () -> new ItemStack(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base)))
		    .build());

}
