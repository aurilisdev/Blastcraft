package blastcraft.registers;

import com.google.common.collect.Sets;

import blastcraft.References;
import blastcraft.common.tile.TileBlastCompressor;
import blastcraft.common.tile.TileCamoflage;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastcraftBlockTypes {
	public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, References.ID);

	public static final RegistryObject<TileEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = BLOCK_ENTITY_TYPES.register("blastcompressor", () -> new TileEntityType<>(TileBlastCompressor::new, Sets.newHashSet(BlastcraftBlocks.blockBlastCompressor), null));
	public static final RegistryObject<TileEntityType<TileCamoflage>> TILE_CAMOFLAGE = BLOCK_ENTITY_TYPES.register("camoflage", () -> new TileEntityType<>(TileCamoflage::new, Sets.newHashSet(BlastcraftBlocks.blockCamoflage), null));

}
