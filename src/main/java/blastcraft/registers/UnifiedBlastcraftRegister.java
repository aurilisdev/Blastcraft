package blastcraft.registers;

import static blastcraft.registers.BlastcraftBlocks.blockBlastCompressor;

import blastcraft.References;
import electrodynamics.common.blockitem.BlockItemDescriptable;
import electrodynamics.prefab.utilities.ElectroTextUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class UnifiedBlastcraftRegister {

	public static void register(IEventBus bus) {
		BlastcraftBlocks.BLOCKS.register(bus);
		BlastcraftFluids.FLUIDS.register(bus);
		BlastcraftItems.ITEMS.register(bus);
		BlastcraftBlockTypes.BLOCK_ENTITY_TYPES.register(bus);
		BlastcraftSounds.SOUNDS.register(bus);
	}

	static {
		BlockItemDescriptable.addDescription(() -> blockBlastCompressor, ElectroTextUtils.voltageTooltip(240));
	}

}
