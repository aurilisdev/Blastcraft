package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import electrodynamics.prefab.tile.GenericTileTicking;
import electrodynamics.prefab.tile.components.ComponentType;
import electrodynamics.prefab.tile.components.type.ComponentPacketHandler;
import electrodynamics.prefab.tile.components.type.ComponentTickable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class TileCamoflage extends GenericTileTicking {

    public Block block = DeferredRegisters.blockCamoflage;

    public TileCamoflage() {
	super(DeferredRegisters.TILE_CAMOFLAGE.get());
	addComponent(new ComponentTickable().tickCommon(this::tickCommon));
	addComponent(new ComponentPacketHandler().customPacketReader(this::readCustomPacket).customPacketWriter(this::writeCustomPacket));
    }

    @Override
    @Deprecated
    public CompoundTag save(CompoundTag compound) {
	compound.putString("blockId", block == null ? "null" : Registry.BLOCK.getKey(block).toString());
	return super.save(compound);
    }

    @Override
    @Deprecated
    public void load(BlockState state, CompoundTag compound) {
	super.load(state, compound);
	String read = compound.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.get(new ResourceLocation(read));
	}
    }

    @Deprecated
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
