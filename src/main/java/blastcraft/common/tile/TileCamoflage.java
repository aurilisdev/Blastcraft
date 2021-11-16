package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import electrodynamics.prefab.tile.GenericTile;
import electrodynamics.prefab.tile.components.ComponentType;
import electrodynamics.prefab.tile.components.type.ComponentPacketHandler;
import electrodynamics.prefab.tile.components.type.ComponentTickable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class TileCamoflage extends GenericTile {

    public Block block = DeferredRegisters.blockCamoflage;

    public TileCamoflage(BlockPos worldPosition, BlockState blockState) {
	super(DeferredRegisters.TILE_CAMOFLAGE.get(), worldPosition, blockState);
	addComponent(new ComponentTickable().tickCommon(this::tickCommon));
	addComponent(new ComponentPacketHandler().customPacketReader(this::readCustomPacket).customPacketWriter(this::writeCustomPacket));
    }

    @Override
    public CompoundTag save(CompoundTag compound) {
	compound.putString("blockId", block == null ? "null" : Registry.BLOCK.getKey(block).toString());
	return super.save(compound);
    }

    @Override
    public void load(CompoundTag compound) {
	super.load(compound);
	String read = compound.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.get(new ResourceLocation(read));
	}
    }

    public void readCustomPacket(CompoundTag nbt) {
	String read = nbt.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.get(new ResourceLocation(read));
	}
    }

    public void writeCustomPacket(CompoundTag nbt) {
	save(nbt);
    }

    public void tickCommon(ComponentTickable component) {
	if (component.getTicks() % 20 == 0) {
	    this.<ComponentPacketHandler>getComponent(ComponentType.PacketHandler).sendCustomPacket();
	}
    }
}
