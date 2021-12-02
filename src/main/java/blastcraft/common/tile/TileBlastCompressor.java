package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import blastcraft.SoundRegister;
import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import blastcraft.common.settings.Constants;
import electrodynamics.api.electricity.CapabilityElectrodynamic;
import electrodynamics.api.sound.SoundAPI;
import electrodynamics.common.inventory.container.ContainerO2OProcessor;
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
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.state.BlockState;

public class TileBlastCompressor extends GenericTile {
    
	private static int inputSlots = 1;
    private static int outputSize = 1;
    private static int itemBiSize = 0;
    private static int inputBucketSlots = 0;
    private static int outputBucketSlots = 0;
    private static int upgradeSlots = 3;
    
    private static int processorCount = 1;
    private static int inputPerProc = 1;
    
    private static int invSize = 
    	inputSlots + outputSize + inputBucketSlots + outputBucketSlots + upgradeSlots + itemBiSize;
	
	public TileBlastCompressor(BlockPos worldPosition, BlockState blockState) {
		super(DeferredRegisters.TILE_BLASTCOMPRESSOR.get(), worldPosition, blockState);
		addComponent(new ComponentDirection());
		addComponent(new ComponentPacketHandler());
		addComponent(new ComponentTickable().tickClient(this::tickClient));
		addComponent(new ComponentElectrodynamic(this).voltage(CapabilityElectrodynamic.DEFAULT_VOLTAGE * 2).relativeInput(Direction.NORTH));
		addComponent(new ComponentInventory(this).size(5).faceSlots(Direction.UP, 0).faceSlots(Direction.DOWN, 1).relativeFaceSlots(Direction.EAST, 1)
			.relativeFaceSlots(Direction.WEST, 2)
			.slotSizes(inputSlots, outputSize, itemBiSize, upgradeSlots, inputBucketSlots, outputBucketSlots, processorCount, inputPerProc)
			.valid(getPredicate(inputSlots, outputSize, itemBiSize,inputBucketSlots + outputBucketSlots, upgradeSlots, invSize)));
		addProcessor(new ComponentProcessor(this).setProcessorNumber(0)
			.canProcess(component -> component.canProcessItem2ItemRecipe(component, BlastCompressorRecipe.class,
				BlastCraftRecipeInit.BLAST_COMPRESSOR_TYPE))
			.process(component -> component.processItem2ItemRecipe(component, BlastCompressorRecipe.class))
			.requiredTicks(Constants.BLASTCOMPRESSOR_REQUIRED_TICKS).usage(Constants.BLASTCOMPRESSOR_USAGE_PER_TICK));
		addComponent(new ComponentContainerProvider("container.blastcompressor")
			.createMenu((id, player) -> new ContainerO2OProcessor(id, player, getComponent(ComponentType.Inventory), getCoordsArray())));
    }

    protected void tickClient(ComponentTickable tickable) {
	boolean running = getProcessor(0).operatingTicks > 0;
	if (running && level.random.nextDouble() < 0.15) {
	    Direction direction = this.<ComponentDirection>getComponent(ComponentType.Direction).getDirection();
	    double d4 = level.random.nextDouble();
	    double d5 = direction.getAxis() == Direction.Axis.X ? direction.getStepX() * (direction.getStepX() == -1 ? 0 : 1) : d4;
	    double d6 = level.random.nextDouble();
	    double d7 = direction.getAxis() == Direction.Axis.Z ? direction.getStepZ() * (direction.getStepZ() == -1 ? 0 : 1) : d4;
	    level.addParticle(ParticleTypes.SMOKE, worldPosition.getX() + d5, worldPosition.getY() + d6, worldPosition.getZ() + d7, 0.0D, 0.0D, 0.0D);
	}
	if (running && tickable.getTicks() % 100 == 0) {
	    SoundAPI.playSound(SoundRegister.SOUND_BLASTCOMPRESSOR.get(), SoundSource.BLOCKS, 1, 1, worldPosition);
	}
    }
}