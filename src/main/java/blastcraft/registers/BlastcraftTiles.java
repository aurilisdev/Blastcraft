package blastcraft.registers;

import blastcraft.Blastcraft;
import com.google.common.collect.Sets;

import blastcraft.common.tile.TileBlastCompressor;
import blastcraft.common.tile.TileCamoflauge;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlastcraftTiles {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Blastcraft.ID);

	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = BLOCK_ENTITY_TYPES.register("blastcompressor", () -> new BlockEntityType<>(TileBlastCompressor::new, Sets.newHashSet(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get()), null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TileCamoflauge>> TILE_CAMOFLAGE = BLOCK_ENTITY_TYPES.register("camoflage", () -> new BlockEntityType<>(TileCamoflauge::new, Sets.newHashSet(BlastcraftBlocks.BLOCK_CAMOFLAGE.get()), null));

}
