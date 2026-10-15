package blastcraft.common.tile;

import blastcraft.registers.BlastcraftTiles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import voltaic.prefab.properties.types.PropertyTypes;
import voltaic.prefab.properties.variant.SingleProperty;
import voltaic.prefab.tile.GenericTile;

public class TileCamoflauge extends GenericTile {

    public final SingleProperty<BlockState> camoflaugedBlock = property(new SingleProperty<>(getPropertyManager(),
	    PropertyTypes.BLOCK_STATE, "camoblock", Blocks.AIR.defaultBlockState()).onChange((prop, oldState) -> {
		Level level = getLevel();
		if (level == null) {
		    return;
		}
		level.getChunkSource().getLightEngine().checkBlock(worldPosition);
	    }).setShouldUpdateOnChange());

    public final SingleProperty<Integer> glassFaces = property(
	    new SingleProperty<>(getPropertyManager(), PropertyTypes.INTEGER, "glassfaces", 0)
		    .setShouldUpdateOnChange());

    public TileCamoflauge(BlockPos worldPosition, BlockState blockState) {
	super(BlastcraftTiles.TILE_CAMOFLAGE.get(), worldPosition, blockState);
    }

    public void setCamoBlock(BlockState block) {
	camoflaugedBlock.setValue(block);
	setChanged();
    }

    public BlockState getCamoBlock() {
	return camoflaugedBlock.getValue();
    }

    public boolean isGlassFace(Direction dir) {
	return (glassFaces.getValue() & (1 << dir.ordinal())) != 0;
    }

    public void toggleGlassFace(Direction dir) {
	glassFaces.setValue(glassFaces.getValue() ^ (1 << dir.ordinal()));
	setChanged();
    }

    public boolean isCamoAir() {
	return getCamoBlock().isAir();
    }

    @Override
    public InteractionResult useWithoutItem(Level level, Player player, BlockHitResult hit) {
	return InteractionResult.PASS;
    }

    @Override
    public ItemInteractionResult useWithItem(Level level, ItemStack used, Player player, InteractionHand hand,
	    BlockHitResult hit) {
	return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
