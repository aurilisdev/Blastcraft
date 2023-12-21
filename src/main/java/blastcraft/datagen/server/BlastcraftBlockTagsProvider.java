package blastcraft.datagen.server;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftBlockTagsProvider extends BlockTagsProvider {

	public BlastcraftBlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, References.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		TagAppender<Block> pickaxe = tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlastcraftBlocks.blockGlassPressurePlate, BlastcraftBlocks.blockBlastCompressor, BlastcraftBlocks.blockCamoflage, BlastcraftBlocks.blockSpike, BlastcraftBlocks.blockSpikeFire, BlastcraftBlocks.blockSpikePoison);

		for (SubtypeBrick brick : SubtypeBrick.values()) {
			for (RegistryObject<Block> reg : BlastcraftBlocks.bricksMap.get(brick)) {
				pickaxe = pickaxe.add(reg.get());
			}
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			pickaxe = pickaxe.add(BlastcraftBlocks.getBlock(glass));
		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {
			pickaxe = pickaxe.add(BlastcraftBlocks.getBlock(concrete));
		}

		TagAppender<Block> minableWithStone = tag(BlockTags.NEEDS_STONE_TOOL).add(BlastcraftBlocks.blockGlassPressurePlate, BlastcraftBlocks.blockBlastCompressor, BlastcraftBlocks.blockCamoflage, BlastcraftBlocks.blockSpike, BlastcraftBlocks.blockSpikeFire, BlastcraftBlocks.blockSpikePoison);

		for (SubtypeBrick brick : SubtypeBrick.values()) {
			for (RegistryObject<Block> reg : BlastcraftBlocks.bricksMap.get(brick)) {
				minableWithStone = minableWithStone.add(reg.get());
			}
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			minableWithStone = minableWithStone.add(BlastcraftBlocks.getBlock(glass));
		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {
			minableWithStone = minableWithStone.add(BlastcraftBlocks.getBlock(concrete));
		}

		TagAppender<Block> blastproofWalls = tag(BlastcraftTags.Blocks.BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.blastproofwalling)) {
			blastproofWalls = blastproofWalls.add(block);
		}

		TagAppender<Block> rawBlastproofWalls = tag(BlastcraftTags.Blocks.RAW_BLASTPROOF_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.rawblastproofwalling)) {
			rawBlastproofWalls = rawBlastproofWalls.add(block);
		}

		TagAppender<Block> carbonPlatedWalls = tag(BlastcraftTags.Blocks.CARBON_PLATED_WALLS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.carbonplatedwalling)) {
			carbonPlatedWalls = carbonPlatedWalls.add(block);
		}

		TagAppender<Block> hardenedBricks = tag(BlastcraftTags.Blocks.HARDENED_BRICKS);

		for (Block block : BlastcraftBlocks.getAllWalls(SubtypeWalling.hardenedbricks)) {
			hardenedBricks = hardenedBricks.add(block);
		}

		tag(BlastcraftTags.Blocks.CONCRETES).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeConcrete.values()));

	}

}
