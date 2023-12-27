package blastcraft.datagen.server;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftItemTagsProvider extends ItemTagsProvider {

	public BlastcraftItemTagsProvider(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
		super(generator, provider, References.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		Builder<Item> blastproofWalls = tag(BlastcraftTags.Items.BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.blastproofwalling)) {
			blastproofWalls = blastproofWalls.add(block.asItem());
		}

		Builder<Item> rawBlastproofWalls = tag(BlastcraftTags.Items.RAW_BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.rawblastproofwalling)) {
			rawBlastproofWalls = rawBlastproofWalls.add(block.asItem());
		}

		Builder<Item> carbonPlatedWalls = tag(BlastcraftTags.Items.CARBON_PLATED_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.carbonplatedwalling)) {
			carbonPlatedWalls = carbonPlatedWalls.add(block.asItem());
		}

		Builder<Item> hardenedBricks = tag(BlastcraftTags.Items.HARDENED_BRICKS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.hardenedbricks)) {
			hardenedBricks = hardenedBricks.add(block.asItem());
		}

	}

}
