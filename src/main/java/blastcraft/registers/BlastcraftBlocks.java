package blastcraft.registers;

import java.util.function.Supplier;

import blastcraft.Blastcraft;
import blastcraft.common.block.BlockCamoflage;
import blastcraft.common.block.BlockCustomBricks;
import blastcraft.common.block.BlockCustomSlab;
import blastcraft.common.block.BlockCustomStairs;
import blastcraft.common.block.BlockCustomWall;
import blastcraft.common.block.BlockSpike;
import blastcraft.common.block.BlockSpike.BlockSpikeFire;
import blastcraft.common.block.BlockSpike.BlockSpikePoison;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tile.TileBlastCompressor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import voltaic.api.registration.BulkRegistryObject;
import voltaic.common.block.BlockCustomGlass;
import voltaic.common.block.voxelshapes.VoxelShapeProvider;
import voltaic.prefab.block.GenericMachineBlock;

public class BlastcraftBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Blastcraft.ID);

	public static final RegistryObject<GenericMachineBlock> BLOCK_BLASTCOMPRESSOR = BLOCKS.register("blastcompressor", () -> new GenericMachineBlock(TileBlastCompressor::new, VoxelShapeProvider.DEFAULT));
	public static final RegistryObject<BlockCamoflage> BLOCK_CAMOFLAGE = BLOCKS.register("camoflage", BlockCamoflage::new);
	public static final BulkRegistryObject<Block, SubtypeBlastproofWall> BLOCKS_BLASTPROOFWALL = new BulkRegistryObject<>(SubtypeBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), makeBlastproof(subtype)));
	public static final BulkRegistryObject<Block, SubtypeRawBlastproofWall> BLOCKS_RAW_BLASTPROOFWALL = new BulkRegistryObject<>(SubtypeRawBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), makeRawBlastproof(subtype)));
	public static final BulkRegistryObject<Block, SubtypeCarbonPlatedWall> BLOCKS_CARBONPLATEDWALL = new BulkRegistryObject<>(SubtypeCarbonPlatedWall.values(), subtype -> BLOCKS.register(subtype.tag(), makeCarbonPlated(subtype)));
	public static final BulkRegistryObject<Block, SubtypeHardenedBricks> BLOCKS_HARDENEDBRICKS = new BulkRegistryObject<>(SubtypeHardenedBricks.values(), subtype -> BLOCKS.register(subtype.tag(), makeHardened(subtype)));

	public static final BulkRegistryObject<BlockCustomGlass, SubtypeWallingGlass> BLOCKS_WALLINGGLASS = new BulkRegistryObject<>(SubtypeWallingGlass.values(), subtype -> BLOCKS.register(subtype.tag(), () -> new BlockCustomGlass(subtype.hardness, subtype.resistance)));
	public static final RegistryObject<PressurePlateBlock> BLOCK_GLASSPRESSUREPLATE = BLOCKS.register("glasspressureplate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.GLASS).noCollission().strength(0.5F).sound(SoundType.GLASS)));
	public static final RegistryObject<BlockSpike> BLOCK_SPIKE = BLOCKS.register("spike", BlockSpike::new);
	public static final RegistryObject<BlockSpikeFire> BLOCK_FIRESPIKE = BLOCKS.register("spikefire", BlockSpikeFire::new);
	public static final RegistryObject<BlockSpikePoison> BLOCK_POISONSPIKE = BLOCKS.register("spikepoison", BlockSpikePoison::new);

	private static final Supplier<Block> makeBlastproof(SubtypeBlastproofWall subtype) {
		switch (subtype) {

		case base_wall:
		case big_wall:
		case polished_wall:
		case smooth_wall:
			return () -> new BlockCustomWall(subtype.hardness, subtype.resistance);
		case base_slab:
		case big_slab:
		case polished_slab:
		case smooth_slab:
			return () -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
		case base_stairs:
		case big_stairs:
		case polished_stairs:
		case smooth_stairs:
			return () -> new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
		default:
			return () -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
		}
	}

	private static final Supplier<Block> makeRawBlastproof(SubtypeRawBlastproofWall subtype) {
		switch (subtype) {

		case base_wall:
		case big_wall:
		case polished_wall:
		case smooth_wall:
			return () -> new BlockCustomWall(subtype.hardness, subtype.resistance);
		case base_slab:
		case big_slab:
		case polished_slab:
		case smooth_slab:
			return () -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
		case base_stairs:
		case big_stairs:
		case polished_stairs:
		case smooth_stairs:
			return () -> new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
		default:
			return () -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
		}
	}

	private static final Supplier<Block> makeCarbonPlated(SubtypeCarbonPlatedWall subtype) {
		switch (subtype) {

		case base_wall:
		case big_wall:
		case polished_wall:
		case smooth_wall:
			return () -> new BlockCustomWall(subtype.hardness, subtype.resistance);
		case base_slab:
		case big_slab:
		case polished_slab:
		case smooth_slab:
			return () -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
		case base_stairs:
		case big_stairs:
		case polished_stairs:
		case smooth_stairs:
			return () -> new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
		default:
			return () -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
		}
	}
	
	private static final Supplier<Block> makeHardened(SubtypeHardenedBricks subtype) {
		switch (subtype) {

		case base_wall:
		case big_wall:
		case polished_wall:
		case smooth_wall:
			return () -> new BlockCustomWall(subtype.hardness, subtype.resistance);
		case base_slab:
		case big_slab:
		case polished_slab:
		case smooth_slab:
			return () -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
		case base_stairs:
		case big_stairs:
		case polished_stairs:
		case smooth_stairs:
			return () -> new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
		default:
			return () -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
		}
	}

}
