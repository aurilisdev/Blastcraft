package blastcraft.common.tile;

import blastcraft.registers.BlastcraftTiles;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;
import voltaic.prefab.properties.types.PropertyTypes;
import voltaic.prefab.properties.variant.SingleProperty;
import voltaic.prefab.tile.GenericTile;
import voltaic.prefab.tile.components.type.ComponentPacketHandler;

public class TileCamoflauge extends GenericTile {

	public final SingleProperty<BlockState> camoflaugedBlock = property(new SingleProperty<>(PropertyTypes.BLOCK_STATE, "camoblock", Blocks.AIR.defaultBlockState()).onChange((prop, oldState) -> {
		if(level == null) {
			return;
		}
		level.getChunkSource().getLightEngine().checkBlock(worldPosition);
	}).setShouldUpdateOnChange());

	public TileCamoflauge() {
		super(BlastcraftTiles.TILE_CAMOFLAGE.get());
		addComponent(new ComponentPacketHandler(this));
	}

	public void setCamoBlock(BlockState block) {
		camoflaugedBlock.setValue(block);
		setChanged();
	}

	public BlockState getCamoBlock() {
		return camoflaugedBlock.getValue();
	}

	public boolean isCamoAir() {
		return getCamoBlock().isAir();
	}

	@Override
	public ActionResultType use(PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
		return ActionResultType.PASS;
	}
}
