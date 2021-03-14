package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import blastcraft.common.settings.Constants;
import electrodynamics.api.tile.electric.CapabilityElectrodynamic;
import electrodynamics.common.inventory.container.ContainerO2OProcessor;
import electrodynamics.common.item.ItemProcessorUpgrade;
import electrodynamics.common.recipe.MachineRecipes;
import electrodynamics.common.tile.generic.GenericTileTicking;
import electrodynamics.common.tile.generic.component.ComponentType;
import electrodynamics.common.tile.generic.component.type.ComponentContainerProvider;
import electrodynamics.common.tile.generic.component.type.ComponentDirection;
import electrodynamics.common.tile.generic.component.type.ComponentElectrodynamic;
import electrodynamics.common.tile.generic.component.type.ComponentInventory;
import electrodynamics.common.tile.generic.component.type.ComponentPacketHandler;
import electrodynamics.common.tile.generic.component.type.ComponentProcessor;
import electrodynamics.common.tile.generic.component.type.ComponentProcessorType;
import electrodynamics.common.tile.generic.component.type.ComponentTickable;
import net.minecraft.util.Direction;

public class TileBlastCompressor extends GenericTileTicking {
    public TileBlastCompressor() {
	super(DeferredRegisters.TILE_BLASTCOMPRESSOR.get());
	addComponent(new ComponentDirection());
	addComponent(new ComponentInventory().setInventorySize(5).addSlotsOnFace(Direction.UP, 0)
		.addSlotsOnFace(Direction.DOWN, 1).addRelativeSlotsOnFace(Direction.EAST, 1)
		.addRelativeSlotsOnFace(Direction.WEST, 2).setItemValidPredicate(
			(slot, stack) -> slot == 0 || slot > 2 && stack.getItem() instanceof ItemProcessorUpgrade));
	addComponent(new ComponentPacketHandler());
	addComponent(new ComponentTickable());
	addComponent(new ComponentElectrodynamic(this).setVoltage(CapabilityElectrodynamic.DEFAULT_VOLTAGE * 2)
		.addRelativeInputDirection(Direction.NORTH));
	addComponent(new ComponentProcessor(this).addUpgradeSlots(2, 3, 4)
		.setJoulesPerTick(Constants.BLASTCOMPRESSOR_USAGE_PER_TICK)
		.setRequiredTicks(Constants.BLASTCOMPRESSOR_REQUIRED_TICKS)
		.setCanProcess(component -> MachineRecipes.canProcess(this))
		.setProcess(component -> MachineRecipes.process(this)).setType(ComponentProcessorType.ObjectToObject));
	addComponent(new ComponentContainerProvider("container.blastcompressor")
		.setCreateMenuFunction((id, player) -> new ContainerO2OProcessor(id, player,
			getComponent(ComponentType.Inventory), getCoordsArray())));
    }
}
