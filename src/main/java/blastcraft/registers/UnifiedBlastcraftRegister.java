package blastcraft.registers;

import net.minecraftforge.eventbus.api.IEventBus;
import voltaic.common.blockitem.BlockItemDescriptable;
import voltaic.prefab.utilities.VoltaicTextUtils;

public class UnifiedBlastcraftRegister {

	public static void register(IEventBus bus) {
		BlastcraftBlocks.BLOCKS.register(bus);
		BlastcraftFluids.FLUIDS.register(bus);
		BlastcraftFluidTypes.FLUID_TYPES.register(bus);
		BlastcraftItems.ITEMS.register(bus);
		BlastcraftTiles.BLOCK_ENTITY_TYPES.register(bus);
		BlastcraftSounds.SOUNDS.register(bus);
		BlastcraftCreativeTabs.CREATIVE_TABS.register(bus);
		BlastcraftRecipies.RECIPE_TYPES.register(bus);
		BlastcraftRecipies.RECIPE_SERIALIZER.register(bus);
	}

	static {
		BlockItemDescriptable.addDescription(() -> BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(), VoltaicTextUtils.voltageTooltip(240));
	}

}
