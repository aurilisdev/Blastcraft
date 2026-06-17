package blastcraft.registers;

import blastcraft.Blastcraft;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import voltaic.prefab.tile.GenericTile;
import voltaic.registers.VoltaicCapabilities;

@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD)
public class BlastcraftCapabilities {

    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {

	BlastcraftTiles.BLOCK_ENTITY_TYPES.getEntries().forEach(entry -> {
	    event.registerBlockEntity(VoltaicCapabilities.CAPABILITY_ELECTRODYNAMIC_BLOCK,
		    (BlockEntityType<? extends GenericTile>) entry.get(),
		    GenericTile::getElectrodynamicCapability);
	    event.registerBlockEntity(Capabilities.FluidHandler.BLOCK,
		    (BlockEntityType<? extends GenericTile>) entry.get(),
		    GenericTile::getFluidHandlerCapability);
	    event.registerBlockEntity(VoltaicCapabilities.CAPABILITY_GASHANDLER_BLOCK,
		    (BlockEntityType<? extends GenericTile>) entry.get(),
		    GenericTile::getGasHandlerCapability);
	    event.registerBlockEntity(Capabilities.ItemHandler.BLOCK,
		    (BlockEntityType<? extends GenericTile>) entry.get(),
		    GenericTile::getItemHandlerCapability);
	    event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK,
		    (BlockEntityType<? extends GenericTile>) entry.get(),
		    GenericTile::getForgeEnergyCapability);
	});

    }

}