package blastcraft.common.tile;

import blastcraft.registers.BlastcraftBlockTypes;
import electrodynamics.prefab.properties.Property;
import electrodynamics.prefab.properties.PropertyType;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.IComponentType;
import electrodynamics.prefab.tile.components.type.ComponentPacketHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;

public class TileCamoflage extends GenericTile {

	public final Property<BlockState> camoflaugedBlock = property(new Property<>(PropertyType.Blockstate, "camoblock", Blocks.AIR.defaultBlockState()).onChange((prop, oldState) -> {
		level.getChunkSource().getLightEngine().checkBlock(worldPosition);
	}));

	public TileCamoflage() {
		super(BlastcraftBlockTypes.TILE_CAMOFLAGE.get());
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
	public ActionResultType use(PlayerEntity arg0, Hand arg1, BlockRayTraceResult arg2) {
		return ActionResultType.PASS;
	}
}