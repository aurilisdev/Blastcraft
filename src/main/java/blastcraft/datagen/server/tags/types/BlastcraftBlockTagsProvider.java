package blastcraft.datagen.server.tags.types;

import java.util.concurrent.CompletableFuture;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftBlockTagsProvider extends BlockTagsProvider {

	public BlastcraftBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, References.ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlastcraftBlocks.blockGlassPressurePlate, BlastcraftBlocks.blockBlastCompressor, BlastcraftBlocks.blockCamoflage, BlastcraftBlocks.blockSpike, BlastcraftBlocks.blockSpikeFire, BlastcraftBlocks.blockSpikePoison).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeBlastproofWall.values()))
				.add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeRawBlastproofWall.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeCarbonPlatedWall.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeHardenedBricks.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeWallingGlass.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeConcrete.values()));

		tag(BlockTags.NEEDS_STONE_TOOL).add(BlastcraftBlocks.blockGlassPressurePlate, BlastcraftBlocks.blockBlastCompressor, BlastcraftBlocks.blockCamoflage, BlastcraftBlocks.blockSpike, BlastcraftBlocks.blockSpikeFire, BlastcraftBlocks.blockSpikePoison).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeBlastproofWall.values()))
				.add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeRawBlastproofWall.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeCarbonPlatedWall.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeHardenedBricks.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeWallingGlass.values())).add(BlastcraftBlocks.getAllBlockForSubtype(SubtypeConcrete.values()));

		tag(BlastcraftTags.Blocks.SOLID_BLASTPROOF_WALLS).add(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth));

		tag(BlastcraftTags.Blocks.SOLID_RAW_BLASTPROOF_WALLS).add(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth));

		tag(BlastcraftTags.Blocks.SOLID_CARBON_PLATED_WALLS).add(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth));

		tag(BlastcraftTags.Blocks.SOLID_HARDENED_BRICKS).add(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth));

		tag(BlastcraftTags.Blocks.SOLID_CONCRETES).add(BlastcraftBlocks.getBlock(SubtypeConcrete.regular), BlastcraftBlocks.getBlock(SubtypeConcrete.bricks), BlastcraftBlocks.getBlock(SubtypeConcrete.tile));

		tag(BlockTags.WALLS).add(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base_wall), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big_wall), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished_wall), BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth_wall), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base_wall),
				BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big_wall), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished_wall), BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth_wall), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base_wall), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big_wall), BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished_wall),
				BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth_wall), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base_wall), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big_wall), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished_wall), BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth_wall), BlastcraftBlocks.getBlock(SubtypeConcrete.regular_wall),
				BlastcraftBlocks.getBlock(SubtypeConcrete.bricks_wall), BlastcraftBlocks.getBlock(SubtypeConcrete.tile_wall));

	}

}
