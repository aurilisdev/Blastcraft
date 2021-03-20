package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import blastcraft.common.settings.Constants;
import electrodynamics.api.electricity.CapabilityElectrodynamic;
import electrodynamics.api.tile.GenericTileTicking;
import electrodynamics.api.tile.components.ComponentType;
import electrodynamics.api.tile.components.type.ComponentContainerProvider;
import electrodynamics.api.tile.components.type.ComponentDirection;
import electrodynamics.api.tile.components.type.ComponentElectrodynamic;
import electrodynamics.api.tile.components.type.ComponentInventory;
import electrodynamics.api.tile.components.type.ComponentPacketHandler;
import electrodynamics.api.tile.components.type.ComponentProcessor;
import electrodynamics.api.tile.components.type.ComponentProcessorType;
import electrodynamics.api.tile.components.type.ComponentTickable;
import electrodynamics.common.inventory.container.ContainerO2OProcessor;
import electrodynamics.common.item.ItemProcessorUpgrade;
import electrodynamics.common.recipe.MachineRecipes;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;

public class TileBlastCompressor extends GenericTileTicking {
    public TileBlastCompressor() {
	super(DeferredRegisters.TILE_BLASTCOMPRESSOR.get());
	addComponent(new ComponentDirection());
	addComponent(new ComponentInventory(this).size(5).faceSlots(Direction.UP, 0).faceSlots(Direction.DOWN, 1).relativeFaceSlots(Direction.EAST, 1)
		.relativeFaceSlots(Direction.WEST, 2)
		.valid((slot, stack) -> slot == 0 || slot > 2 && stack.getItem() instanceof ItemProcessorUpgrade));
	addComponent(new ComponentPacketHandler());
	addComponent(new ComponentTickable().tickClient(this::tickClient));
	addComponent(new ComponentElectrodynamic(this).voltage(CapabilityElectrodynamic.DEFAULT_VOLTAGE * 2).relativeInput(Direction.NORTH));
	addComponent(new ComponentProcessor(this).upgradeSlots(2, 3, 4).usage(Constants.BLASTCOMPRESSOR_USAGE_PER_TICK)
		.requiredTicks(Constants.BLASTCOMPRESSOR_REQUIRED_TICKS).canProcess(component -> MachineRecipes.canProcess(this))
		.process(component -> MachineRecipes.process(this)).type(ComponentProcessorType.ObjectToObject));
	addComponent(new ComponentContainerProvider("container.blastcompressor")
		.createMenu((id, player) -> new ContainerO2OProcessor(id, player, getComponent(ComponentType.Inventory), getCoordsArray())));
    }

    protected void tickClient(ComponentTickable tickable) {
	if (this.<ComponentProcessor>getComponent(ComponentType.Processor).operatingTicks > 0 && world.rand.nextDouble() < 0.15) {
	    Direction direction = this.<ComponentDirection>getComponent(ComponentType.Direction).getDirection();
	    double d4 = world.rand.nextDouble();
	    double d5 = direction.getAxis() == Direction.Axis.X ? direction.getXOffset() * (direction.getXOffset() == -1 ? 0 : 1) : d4;
	    double d6 = world.rand.nextDouble();
	    double d7 = direction.getAxis() == Direction.Axis.Z ? direction.getZOffset() * (direction.getZOffset() == -1 ? 0 : 1) : d4;
	    world.addParticle(ParticleTypes.SMOKE, pos.getX() + d5, pos.getY() + d6, pos.getZ() + d7, 0.0D, 0.0D, 0.0D);
	}
    }
}
