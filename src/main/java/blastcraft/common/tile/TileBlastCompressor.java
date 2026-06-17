package blastcraft.common.tile;

import blastcraft.registers.BlastcraftRecipies;
import blastcraft.registers.BlastcraftSounds;
import blastcraft.registers.BlastcraftTiles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.state.BlockState;
import voltaic.common.inventory.container.ContainerO2OProcessor;
import voltaic.prefab.sound.ITickableSound;
import voltaic.prefab.sound.SoundBarrierMethods;
import voltaic.prefab.tile.GenericTile;
import voltaic.prefab.tile.components.IComponentType;
import voltaic.prefab.tile.components.type.ComponentContainerProvider;
import voltaic.prefab.tile.components.type.ComponentElectrodynamic;
import voltaic.prefab.tile.components.type.ComponentForgeEnergy;
import voltaic.prefab.tile.components.type.ComponentInventory;
import voltaic.prefab.tile.components.type.ComponentPacketHandler;
import voltaic.prefab.tile.components.type.ComponentProcessor;
import voltaic.prefab.tile.components.type.ComponentTickable;
import voltaic.prefab.utilities.BlockEntityUtils;
import voltaic.registers.VoltaicCapabilities;

public class TileBlastCompressor extends GenericTile implements ITickableSound {

    private boolean isPlaying = false;

    public TileBlastCompressor(BlockPos worldPosition, BlockState blockState) {
	super(BlastcraftTiles.TILE_BLASTCOMPRESSOR.get(), worldPosition, blockState);
	addComponent(new ComponentPacketHandler(this));
	addComponent(new ComponentTickable(this).tickClient(this::tickClient));
	addComponent(new ComponentElectrodynamic(this, false, true).voltage(VoltaicCapabilities.DEFAULT_VOLTAGE * 2)
		.setInputDirections(BlockEntityUtils.MachineDirection.BACK));
	addComponent(new ComponentInventory(this,
		ComponentInventory.InventoryBuilder.newInv().processors(1, 1, 1, 1).upgrades(3))
		//
		.setDirectionsBySlot(0, BlockEntityUtils.MachineDirection.TOP, BlockEntityUtils.MachineDirection.RIGHT)
		//
		.setDirectionsBySlot(1, BlockEntityUtils.MachineDirection.BOTTOM,
			BlockEntityUtils.MachineDirection.LEFT)
		//
		.setDirectionsBySlot(2, BlockEntityUtils.MachineDirection.BOTTOM,
			BlockEntityUtils.MachineDirection.LEFT)
		.validUpgrades(ContainerO2OProcessor.VALID_UPGRADES).valid(machineValidator()));
	addComponent(new ComponentProcessor(this)
		.canProcess((component, procNumber) -> component.canProcessItem2ItemRecipe(procNumber,
			BlastcraftRecipies.BLAST_COMPRESSOR_TYPE.get()))
		.process(ComponentProcessor::processItem2ItemRecipe));
	addComponent(new ComponentContainerProvider("blastcompressor", this)
		.createMenu((id, player) -> new ContainerO2OProcessor(id, player,
			getComponent(IComponentType.Inventory), getCoordsArray())));
	addComponent(new ComponentForgeEnergy(this));
    }

    protected void tickClient(ComponentTickable tickable) {
	boolean running = shouldPlaySound();
	if (running && level.random.nextDouble() < 0.15) {
	    Direction direction = getFacing();
	    double d4 = level.random.nextDouble();
	    double d5 = direction.getAxis() == Direction.Axis.X
		    ? direction.getStepX() * (direction.getStepX() == -1 ? 0 : 1)
		    : d4;
	    double d6 = level.random.nextDouble();
	    double d7 = direction.getAxis() == Direction.Axis.Z
		    ? direction.getStepZ() * (direction.getStepZ() == -1 ? 0 : 1)
		    : d4;
	    level.addParticle(ParticleTypes.SMOKE, worldPosition.getX() + d5, worldPosition.getY() + d6,
		    worldPosition.getZ() + d7, 0.0D, 0.0D, 0.0D);
	}
	if (running && !isPlaying) {
	    isPlaying = true;
	    SoundBarrierMethods.playTileSound(BlastcraftSounds.SOUND_BLASTCOMPRESSOR.get(), this, true);
	}
    }

    @Override
    public void setNotPlaying() {
	isPlaying = false;
    }

    @Override
    public boolean shouldPlaySound() {
	return this.<ComponentProcessor>getComponent(IComponentType.Processor).isActive(0);
    }

    @Override
    public int getComparatorSignal() {
	return this.<ComponentProcessor>getComponent(IComponentType.Processor).isActive(0) ? 15 : 0;
    }

}