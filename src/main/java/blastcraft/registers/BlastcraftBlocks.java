package blastcraft.registers;

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
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tile.TileBlastCompressor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import voltaic.api.registration.BulkRegistryObject;
import voltaic.common.block.BlockCustomGlass;
import voltaic.common.block.voxelshapes.VoxelShapeProvider;
import voltaic.prefab.block.GenericMachineBlock;

public class BlastcraftBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Blastcraft.ID);

    public static final RegistryObject<GenericMachineBlock> BLOCK_BLASTCOMPRESSOR = BLOCKS.register("blastcompressor",
	    () -> new GenericMachineBlock(TileBlastCompressor::new, VoxelShapeProvider.DEFAULT));
    public static final RegistryObject<BlockCamoflage> BLOCK_CAMOFLAGE = BLOCKS.register("camoflage",
	    BlockCamoflage::new);
    public static final BulkRegistryObject<Block, SubtypeBlastproofWall> BLOCKS_BLASTPROOFWALL = new BulkRegistryObject<>(
	    SubtypeBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

	    case base_wall, big_wall, polished_wall, smooth_wall ->
		new BlockCustomWall(subtype.hardness, subtype.resistance);
	    case base_slab, big_slab, polished_slab, smooth_slab ->
		new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
	    case base_stairs, big_stairs, polished_stairs,
		    smooth_stairs ->
		new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_BLASTPROOFWALL
			.getValue(SubtypeBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(),
			subtype.hardness, subtype.resistance);
	    default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
	    }));
    public static final BulkRegistryObject<Block, SubtypeRawBlastproofWall> BLOCKS_RAW_BLASTPROOFWALL = new BulkRegistryObject<>(
	    SubtypeRawBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

	    case base_wall, big_wall, polished_wall, smooth_wall ->
		new BlockCustomWall(subtype.hardness, subtype.resistance);
	    case base_slab, big_slab, polished_slab, smooth_slab ->
		new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
	    case base_stairs, big_stairs, polished_stairs, smooth_stairs ->
		new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL
			.getValue(SubtypeRawBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(),
			subtype.hardness, subtype.resistance);
	    default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
	    }));
    public static final BulkRegistryObject<Block, SubtypeCarbonPlatedWall> BLOCKS_CARBONPLATEDWALL = new BulkRegistryObject<>(
	    SubtypeCarbonPlatedWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

	    case base_wall, big_wall, polished_wall, smooth_wall ->
		new BlockCustomWall(subtype.hardness, subtype.resistance);
	    case base_slab, big_slab, polished_slab, smooth_slab ->
		new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
	    case base_stairs, big_stairs, polished_stairs, smooth_stairs ->
		new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL
			.getValue(SubtypeCarbonPlatedWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(),
			subtype.hardness, subtype.resistance);
	    default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
	    }));
    public static final BulkRegistryObject<Block, SubtypeHardenedBricks> BLOCKS_HARDENEDBRICKS = new BulkRegistryObject<>(
	    SubtypeHardenedBricks.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

	    case base_wall, big_wall, polished_wall, smooth_wall ->
		new BlockCustomWall(subtype.hardness, subtype.resistance);
	    case base_slab, big_slab, polished_slab, smooth_slab ->
		new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
	    case base_stairs, big_stairs, polished_stairs,
		    smooth_stairs ->
		new BlockCustomStairs(() -> BlastcraftBlocks.BLOCKS_HARDENEDBRICKS
			.getValue(SubtypeHardenedBricks.valueOf(subtype.name().split("_")[0])).defaultBlockState(),
			subtype.hardness, subtype.resistance);
	    default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
	    }));

    public static final BulkRegistryObject<Block, SubtypeConcrete> BLOCKS_CONCRETE = new BulkRegistryObject<>(
	    SubtypeConcrete.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

	    case bricks_wall, regular_wall, tile_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
	    case bricks_slab, regular_slab, tile_slab ->
		new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
	    case bricks_stairs, regular_stairs, tile_stairs -> new BlockCustomStairs(
		    () -> BlastcraftBlocks.BLOCKS_CONCRETE
			    .getValue(SubtypeConcrete.valueOf(subtype.name().split("_")[0])).defaultBlockState(),
		    subtype.hardness, subtype.resistance);
	    default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
	    }));
    public static final BulkRegistryObject<BlockCustomGlass, SubtypeWallingGlass> BLOCKS_WALLINGGLASS = new BulkRegistryObject<>(
	    SubtypeWallingGlass.values(), subtype -> BLOCKS.register(subtype.tag(),
		    () -> new BlockCustomGlass(subtype.hardness, subtype.resistance)));
    public static final RegistryObject<PressurePlateBlock> BLOCK_GLASSPRESSUREPLATE = BLOCKS.register(
	    "glasspressureplate",
	    () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
		    BlockBehaviour.Properties.copy(Blocks.GLASS).noCollission().strength(0.5F).sound(SoundType.GLASS),
		    BlockSetType.STONE));
    public static final RegistryObject<BlockSpike> BLOCK_SPIKE = BLOCKS.register("spike", BlockSpike::new);
    public static final RegistryObject<BlockSpikeFire> BLOCK_FIRESPIKE = BLOCKS.register("spikefire",
	    BlockSpikeFire::new);
    public static final RegistryObject<BlockSpikePoison> BLOCK_POISONSPIKE = BLOCKS.register("spikepoison",
	    BlockSpikePoison::new);

}
