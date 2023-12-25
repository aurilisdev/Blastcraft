package blastcraft.datagen.server;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftBlockTagsProvider extends BlockTagsProvider {

	public BlastcraftBlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, References.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		Builder<Block> blastproofWalls = tag(BlastcraftTags.Blocks.BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.blastproofwalling)) {
			blastproofWalls = blastproofWalls.add(block);
		}

		Builder<Block> rawBlastproofWalls = tag(BlastcraftTags.Blocks.RAW_BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.rawblastproofwalling)) {
			rawBlastproofWalls = rawBlastproofWalls.add(block);
		}

		Builder<Block> carbonPlatedWalls = tag(BlastcraftTags.Blocks.CARBON_PLATED_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.carbonplatedwalling)) {
			carbonPlatedWalls = carbonPlatedWalls.add(block);
		}

		Builder<Block> hardenedBricks = tag(BlastcraftTags.Blocks.HARDENED_BRICKS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.hardenedbricks)) {
			hardenedBricks = hardenedBricks.add(block);
		}

	}

}
