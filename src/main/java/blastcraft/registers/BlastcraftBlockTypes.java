package blastcraft.registers;

import com.google.common.collect.Sets;

import blastcraft.References;
import blastcraft.common.tile.TileBlastCompressor;
import blastcraft.common.tile.TileCamoflauge;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftBlockTypes {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, References.ID);

	public static final RegistryObject<BlockEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = BLOCK_ENTITY_TYPES.register("blastcompressor", () -> new BlockEntityType<>(TileBlastCompressor::new, Sets.newHashSet(BlastcraftBlocks.blockBlastCompressor), null));
	public static final RegistryObject<BlockEntityType<TileCamoflauge>> TILE_CAMOFLAGE = BLOCK_ENTITY_TYPES.register("camoflage", () -> new BlockEntityType<>(TileCamoflauge::new, Sets.newHashSet(BlastcraftBlocks.blockCamoflage), null));

}
