package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import electrodynamics.api.tile.ITickableTileBase;
import electrodynamics.common.tile.generic.GenericTileBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class TileCamoflage extends GenericTileBase implements ITickableTileBase {

    public Block block = DeferredRegisters.blockCamoflage;

    public TileCamoflage() {
	super(DeferredRegisters.TILE_CAMOFLAGE.get());
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
	compound.putString("blockId", block == null ? "null" : Registry.BLOCK.getKey(block).toString());
	return super.write(compound);
    }

    @Override
    public void read(BlockState state, CompoundNBT compound) {
	super.read(state, compound);
	String read = compound.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.getOrDefault(new ResourceLocation(read));
	}
    }

    @Override
    public void handleUpdatePacket(CompoundNBT nbt) {
	super.handleUpdatePacket(nbt);
	String read = nbt.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.getOrDefault(new ResourceLocation(read));
	}
    }

    @Override
    public void tick() {
	if (world.getWorldInfo().getGameTime() % 40 == 0) {
	    sendUpdatePacket();
	}
    }

    @Override
    public CompoundNBT createUpdateTag() {
	CompoundNBT nbt = super.createUpdateTag();
	write(nbt);
	return nbt;
    }
}
