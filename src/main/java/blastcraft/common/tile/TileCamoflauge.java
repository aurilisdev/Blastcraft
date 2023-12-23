package blastcraft.common.tile;

import blastcraft.registers.BlastcraftBlockTypes;
import electrodynamics.prefab.properties.Property;
import electrodynamics.prefab.properties.PropertyType;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.IComponentType;
import electrodynamics.prefab.tile.components.type.ComponentPacketHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TileCamoflauge extends GenericTile {

	public final Property<BlockState> camoflaugedBlock = property(new Property<>(PropertyType.Blockstate, "camoblock", Blocks.AIR.defaultBlockState()).onChange((prop, oldState) -> {
		level.getChunkSource().getLightEngine().checkBlock(worldPosition);
	}));

	public TileCamoflauge(BlockPos worldPosition, BlockState blockState) {
		super(BlastcraftBlockTypes.TILE_CAMOFLAGE.get(), worldPosition, blockState);
		addComponent(new ComponentPacketHandler(this));
	}

	public void setCamoBlock(BlockState block) {
		camoflaugedBlock.set(block);
		setChanged();
	}

	public BlockState getCamoBlock() {
		return camoflaugedBlock.get();
	}

	public boolean isCamoAir() {
		return getCamoBlock().isAir();
	}

	@Override
	public void onPlace(BlockState oldState, boolean isMoving) {
		super.onPlace(oldState, isMoving);
		if (!level.isClientSide) {
			this.<ComponentPacketHandler>getComponent(IComponentType.PacketHandler).sendProperties();
		}

	}

	@Override
	public InteractionResult use(Player arg0, InteractionHand arg1, BlockHitResult arg2) {
		return InteractionResult.PASS;
	}
}