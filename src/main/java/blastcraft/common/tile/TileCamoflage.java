package blastcraft.common.tile;

import blastcraft.DeferredRegisters;
import electrodynamics.api.tile.GenericTileTicking;
import electrodynamics.api.tile.components.ComponentType;
import electrodynamics.api.tile.components.type.ComponentPacketHandler;
import electrodynamics.api.tile.components.type.ComponentTickable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class TileCamoflage extends GenericTileTicking {

    public Block block = DeferredRegisters.blockCamoflage;

    @Deprecated
    public TileCamoflage() {
	super(DeferredRegisters.TILE_CAMOFLAGE.get());
	addComponent(new ComponentTickable().addTickCommon(this::tickCommon));
	addComponent(new ComponentPacketHandler().addCustomPacketReader(this::readCustomPacket).addCustomPacketWriter(this::writeCustomPacket));
    }

    @Override
    @Deprecated
    public CompoundNBT write(CompoundNBT compound) {
	compound.putString("blockId", block == null ? "null" : Registry.BLOCK.getKey(block).toString());
	return super.write(compound);
    }

    @Override
    @Deprecated
    public void read(BlockState state, CompoundNBT compound) {
	super.read(state, compound);
	String read = compound.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.getOrDefault(new ResourceLocation(read));
	}
    }

    @Deprecated
    public void readCustomPacket(CompoundNBT nbt) {
	String read = nbt.getString("blockId");
	if (!read.equals("null")) {
	    block = Registry.BLOCK.getOrDefault(new ResourceLocation(read));
	}
    }

    @Deprecated
    public void writeCustomPacket(CompoundNBT nbt) {
	write(nbt);
    }

    public void tickCommon(ComponentTickable component) {
	if (component.getTicks() % 20 == 0) {
	    this.<ComponentPacketHandler>getComponent(ComponentType.PacketHandler).sendCustomPacket();
	}
    }
}
