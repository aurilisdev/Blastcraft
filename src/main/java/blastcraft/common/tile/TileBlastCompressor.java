package blastcraft.common.tile;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.registers.BlastcraftBlockTypes;
import blastcraft.registers.BlastcraftSounds;
import electrodynamics.api.capability.ElectrodynamicsCapabilities;
import electrodynamics.common.inventory.container.tile.ContainerO2OProcessor;
import electrodynamics.prefab.sound.SoundBarrierMethods;
import electrodynamics.prefab.sound.utils.ITickableSoundTile;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.ComponentType;
import electrodynamics.prefab.tile.components.type.ComponentContainerProvider;
import electrodynamics.prefab.tile.components.type.ComponentDirection;
import electrodynamics.prefab.tile.components.type.ComponentElectrodynamic;
import electrodynamics.prefab.tile.components.type.ComponentInventory;
import electrodynamics.prefab.tile.components.type.ComponentPacketHandler;
import electrodynamics.prefab.tile.components.type.ComponentProcessor;
import electrodynamics.prefab.tile.components.type.ComponentTickable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.state.BlockState;

public class TileBlastCompressor extends GenericTile implements ITickableSoundTile {

	private boolean isPlaying = false;

	public TileBlastCompressor(BlockPos worldPosition, BlockState blockState) {
		super(BlastcraftBlockTypes.TILE_BLASTCOMPRESSOR.get(), worldPosition, blockState);
		addComponent(new ComponentDirection());
		addComponent(new ComponentPacketHandler());
		addComponent(new ComponentTickable().tickClient(this::tickClient));
		addComponent(new ComponentElectrodynamic(this).voltage(ElectrodynamicsCapabilities.DEFAULT_VOLTAGE * 2).relativeInput(Direction.NORTH));
		addComponent(new ComponentInventory(this).size(6).faceSlots(Direction.UP, 0).faceSlots(Direction.DOWN, 1).relativeFaceSlots(Direction.EAST, 1).relativeFaceSlots(Direction.WEST, 2).inputs(1).outputs(1).upgrades(3).processors(1).processorInputs(1).biproducts(1).validUpgrades(ContainerO2OProcessor.VALID_UPGRADES).valid(machineValidator()));
		addProcessor(new ComponentProcessor(this).canProcess(component -> component.canProcessItem2ItemRecipe(component, BlastCraftRecipeInit.BLAST_COMPRESSOR_TYPE.get())).process(component -> component.processItem2ItemRecipe(component)));
		addComponent(new ComponentContainerProvider("container.blastcompressor").createMenu((id, player) -> new ContainerO2OProcessor(id, player, getComponent(ComponentType.Inventory), getCoordsArray())));
	}

	protected void tickClient(ComponentTickable tickable) {
		boolean running = shouldPlaySound();
		if (running && level.random.nextDouble() < 0.15) {
			Direction direction = this.<ComponentDirection>getComponent(ComponentType.Direction).getDirection();
			double d4 = level.random.nextDouble();
			double d5 = direction.getAxis() == Direction.Axis.X ? direction.getStepX() * (direction.getStepX() == -1 ? 0 : 1) : d4;
			double d6 = level.random.nextDouble();
			double d7 = direction.getAxis() == Direction.Axis.Z ? direction.getStepZ() * (direction.getStepZ() == -1 ? 0 : 1) : d4;
			level.addParticle(ParticleTypes.SMOKE, worldPosition.getX() + d5, worldPosition.getY() + d6, worldPosition.getZ() + d7, 0.0D, 0.0D, 0.0D);
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
		return getProcessor(0).operatingTicks.get() > 0;
	}
}