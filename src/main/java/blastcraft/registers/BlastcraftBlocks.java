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
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import voltaic.api.registration.BulkDeferredHolder;
import voltaic.common.block.BlockCustomGlass;
import voltaic.common.block.voxelshapes.VoxelShapeProvider;
import voltaic.prefab.block.GenericMachineBlock;

public class BlastcraftBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Blastcraft.ID);

    public static final DeferredHolder<Block, GenericMachineBlock> BLOCK_BLASTCOMPRESSOR = BLOCKS.register("blastcompressor", () -> new GenericMachineBlock(TileBlastCompressor::new, VoxelShapeProvider.DEFAULT));
    public static final DeferredHolder<Block, BlockCamoflage> BLOCK_CAMOFLAGE = BLOCKS.register("camoflage", BlockCamoflage::new);
    public static final BulkDeferredHolder<Block, Block, SubtypeBlastproofWall> BLOCKS_BLASTPROOFWALL = new BulkDeferredHolder<>(SubtypeBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

                case base_wall, big_wall, polished_wall, smooth_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
                case base_slab, big_slab, polished_slab, smooth_slab -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
                case base_stairs, big_stairs, polished_stairs, smooth_stairs -> new BlockCustomStairs(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
                default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
            }
    ));
    public static final BulkDeferredHolder<Block, Block, SubtypeRawBlastproofWall> BLOCKS_RAW_BLASTPROOFWALL = new BulkDeferredHolder<>(SubtypeRawBlastproofWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

                case base_wall, big_wall, polished_wall, smooth_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
                case base_slab, big_slab, polished_slab, smooth_slab -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
                case base_stairs, big_stairs, polished_stairs, smooth_stairs -> new BlockCustomStairs(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
                default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
            }
    ));
    public static final BulkDeferredHolder<Block, Block, SubtypeCarbonPlatedWall> BLOCKS_CARBONPLATEDWALL = new BulkDeferredHolder<>(SubtypeCarbonPlatedWall.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

                case base_wall, big_wall, polished_wall, smooth_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
                case base_slab, big_slab, polished_slab, smooth_slab -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
                case base_stairs, big_stairs, polished_stairs, smooth_stairs -> new BlockCustomStairs(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
                default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
            }
    ));
    public static final BulkDeferredHolder<Block, Block, SubtypeHardenedBricks> BLOCKS_HARDENEDBRICKS = new BulkDeferredHolder<>(SubtypeHardenedBricks.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

                case base_wall, big_wall, polished_wall, smooth_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
                case base_slab, big_slab, polished_slab, smooth_slab -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
                case base_stairs, big_stairs, polished_stairs, smooth_stairs -> new BlockCustomStairs(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
                default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
            }
    ));

    public static final BulkDeferredHolder<Block, Block, SubtypeConcrete> BLOCKS_CONCRETE = new BulkDeferredHolder<>(SubtypeConcrete.values(), subtype -> BLOCKS.register(subtype.tag(), () -> switch (subtype) {

                case bricks_wall, regular_wall, tile_wall -> new BlockCustomWall(subtype.hardness, subtype.resistance);
                case bricks_slab, regular_slab, tile_slab -> new BlockCustomSlab(subtype.hardness / 2.0F, subtype.resistance / 2.0F);
                case bricks_stairs, regular_stairs, tile_stairs -> new BlockCustomStairs(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.valueOf(subtype.name().split("_")[0])).defaultBlockState(), subtype.hardness, subtype.resistance);
                default -> new BlockCustomBricks(subtype.hardness, subtype.resistance);
            }
    ));
    public static final BulkDeferredHolder<Block, BlockCustomGlass, SubtypeWallingGlass> BLOCKS_WALLINGGLASS = new BulkDeferredHolder<>(SubtypeWallingGlass.values(), subtype -> BLOCKS.register(subtype.tag(), () -> new BlockCustomGlass(subtype.hardness, subtype.resistance)));
    public static final DeferredHolder<Block, PressurePlateBlock> BLOCK_GLASSPRESSUREPLATE = BLOCKS.register("glasspressureplate", () -> new PressurePlateBlock(BlockSetType.STONE, Blocks.GLASS.properties().noCollission().strength(0.5F).sound(SoundType.GLASS)));
    public static final DeferredHolder<Block, BlockSpike> BLOCK_SPIKE = BLOCKS.register("spike", BlockSpike::new);
    public static final DeferredHolder<Block, BlockSpikeFire> BLOCK_FIRESPIKE = BLOCKS.register("spikefire", BlockSpikeFire::new);
    public static final DeferredHolder<Block, BlockSpikePoison> BLOCK_POISONSPIKE = BLOCKS.register("spikepoison", BlockSpikePoison::new);


}
