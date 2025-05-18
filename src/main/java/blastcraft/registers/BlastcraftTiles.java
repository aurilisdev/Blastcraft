package blastcraft.registers;

import blastcraft.Blastcraft;
import com.google.common.collect.Sets;

import blastcraft.common.tile.TileBlastCompressor;
import blastcraft.common.tile.TileCamoflauge;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastcraftTiles {
	public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Blastcraft.ID);

	public static final RegistryObject<TileEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = BLOCK_ENTITY_TYPES.register("blastcompressor", () -> new TileEntityType<>(TileBlastCompressor::new, Sets.newHashSet(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get()), null));
	public static final RegistryObject<TileEntityType<TileCamoflauge>> TILE_CAMOFLAGE = BLOCK_ENTITY_TYPES.register("camoflage", () -> new TileEntityType<>(TileCamoflauge::new, Sets.newHashSet(BlastcraftBlocks.BLOCK_CAMOFLAGE.get()), null));

}
