package blastcraft.datagen.server;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import voltaic.common.block.BlockCustomGlass;

public class BlastcraftBlockTagsProvider extends BlockTagsProvider {

	public BlastcraftBlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, Blastcraft.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
				//
				BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(),
				//
				BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(),
				//
				BlastcraftBlocks.BLOCK_CAMOFLAGE.get(),
				//
				BlastcraftBlocks.BLOCK_SPIKE.get(),
				//
				BlastcraftBlocks.BLOCK_FIRESPIKE.get(),
				//
				BlastcraftBlocks.BLOCK_POISONSPIKE.get()
		//
		).add(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getAllValuesArray(new BlockCustomGlass[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_CONCRETE.getAllValuesArray(new Block[0]));

		tag(BlockTags.NEEDS_STONE_TOOL).add(
				//
				BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(),
				//
				BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(),
				//
				BlastcraftBlocks.BLOCK_CAMOFLAGE.get(),
				//
				BlastcraftBlocks.BLOCK_SPIKE.get(),
				//
				BlastcraftBlocks.BLOCK_FIRESPIKE.get(),
				//
				BlastcraftBlocks.BLOCK_POISONSPIKE.get()
		//
		).add(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getAllValuesArray(new Block[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getAllValuesArray(new BlockCustomGlass[0]))
				//
				.add(BlastcraftBlocks.BLOCKS_CONCRETE.getAllValuesArray(new Block[0]));

		tag(BlastcraftTags.Blocks.SOLID_BLASTPROOF_WALLS).add(
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Blocks.SOLID_RAW_BLASTPROOF_WALLS).add(
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Blocks.SOLID_CARBON_PLATED_WALLS).add(
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth)
		//
		);

		tag(BlastcraftTags.Blocks.SOLID_HARDENED_BRICKS).add(
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth)
		//
		);

		tag(BlastcraftTags.Blocks.SOLID_CONCRETES).add(
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular),
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks),
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile)
		//
		);

		tag(BlockTags.WALLS).add(
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_wall),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_wall),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_wall),
				//
				BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_wall),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_wall),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_wall),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_wall),
				//
				BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_wall),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_wall),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_wall),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_wall),
				//
				BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_wall),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_wall),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_wall),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_wall),
				//
				BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_wall),
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular_wall),
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks_wall),
				//
				BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile_wall)
		//
		);

	}

}
