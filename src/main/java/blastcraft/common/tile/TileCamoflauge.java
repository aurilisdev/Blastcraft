package blastcraft.common.tile;

import blastcraft.registers.BlastcraftTiles;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import voltaic.prefab.properties.types.PropertyTypes;
import voltaic.prefab.properties.variant.SingleProperty;
import voltaic.prefab.tile.GenericTile;
import voltaic.prefab.tile.components.type.ComponentPacketHandler;

public class TileCamoflauge extends GenericTile {

    public final SingleProperty<BlockState> camoflaugedBlock = property(
	    new SingleProperty<>(PropertyTypes.BLOCK_STATE, "camoblock", Blocks.AIR.defaultBlockState())
		    .onChange((prop, oldState) -> {
			if (level == null) {
			    return;
			}
			level.getChunkSource().getLightEngine().checkBlock(worldPosition);
		    }).setShouldUpdateOnChange());

    public TileCamoflauge(BlockPos worldPosition, BlockState blockState) {
	super(BlastcraftTiles.TILE_CAMOFLAGE.get(), worldPosition, blockState);
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
    public InteractionResult useWithoutItem(Player player, BlockHitResult hit) {
	return InteractionResult.PASS;
    }

    @Override
    public ItemInteractionResult useWithItem(ItemStack used, Player player, InteractionHand hand, BlockHitResult hit) {
	return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
