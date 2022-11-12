package blastcraft.registers;

import blastcraft.References;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class UnifiedBlastcraftRegister {

	public static void register(IEventBus bus) {
		BlastcraftBlocks.BLOCKS.register(bus);
		BlastcraftItems.ITEMS.register(bus);
		BlastcraftBlockTypes.BLOCK_ENTITY_TYPES.register(bus);
		BlastcraftSounds.SOUNDS.register(bus);
	}

}
