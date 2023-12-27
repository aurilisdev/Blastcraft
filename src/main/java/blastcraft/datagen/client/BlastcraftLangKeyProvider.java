package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.client.ElectrodynamicsLangKeyProvider;
import net.minecraft.data.DataGenerator;

public class BlastcraftLangKeyProvider extends ElectrodynamicsLangKeyProvider {

	public BlastcraftLangKeyProvider(DataGenerator gen, Locale locale) {
		super(gen, locale, References.ID);
	}

	@Override
	protected void addTranslations() {

		switch (locale) {
		case EN_US:
		default:

			add("itemGroup.itemgroupblastcraft", "Blastcraft");

			addBlock(BlastcraftBlocks.blockBlastCompressor, "Blast Compressor");

			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base), "Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base), "Raw Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base), "Carbon Plated Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base), "Hardened Bricks");

			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.polished), "Polished Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.polished), "Polished Raw Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.polished), "Polished Carbon Plated Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.polished), "Polished Hardened Bricks");

			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.smooth), "Smooth Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.smooth), "Smooth Raw Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.smooth), "Smooth Carbon Plated Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.smooth), "Smooth Hardened Bricks");

			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.big), "Big Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.big), "Big Raw Blast Proof Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.big), "Big Carbon Plated Walling");
			addBlock(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.big), "Big Hardened Bricks");

			// GLASS

			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.blastproofwalling), "Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.rawblastproofwalling), "Raw Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.carbonplatedwalling), "Carbon Plated Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.hardenedbricks), "Hardened Brick Glass");

			addBlock(BlastcraftBlocks.blockCamoflage, "Camoflage");
			addBlock(BlastcraftBlocks.blockGlassPressurePlate, "Glass Pressure Plate");

			addBlock(BlastcraftBlocks.blockSpike, "Spike");
			addBlock(BlastcraftBlocks.blockSpikeFire, "Fire Spike");
			addBlock(BlastcraftBlocks.blockSpikePoison, "Poison Spike");

			addContainer("blastcompressor", "Blast Compressor");

			addTooltip("concretemix", "What Minecraft is made of");

			addGuidebook(References.ID, "Blastcraft");

			addGuidebook("chapter.blocks", "Blocks");
			addGuidebook("chapter.blocks.camoflage1", "Camoflage can be disguised as any block in the game by Right-Clicking on it with said block in hand. Note, it will only copy the appearance of the block, and none of its other properties! Camoflage will also allow daylight to pass through it.");
			addGuidebook("chapter.blocks.blastprooftitle", "Walls");
			addGuidebook("chapter.blocks.blastproof1", "Blastcraft adds several blast-resistant blocks for you to defend your base with. These include:");
			addGuidebook("chapter.blocks.hardened", "Hardened");
			addGuidebook("chapter.blocks.rawblastproof", "Raw Blastproof");
			addGuidebook("chapter.blocks.blastproof", "Blastproof");
			addGuidebook("chapter.blocks.carbonplated", "Carbon Plated");
			addGuidebook("chapter.blocks.hardness", "Hardness: %s");
			addGuidebook("chapter.blocks.strength", "Strength: %s");
			addGuidebook("chapter.blocks.blastproof2", "The blocks also come in several decorative forms, allowing you to be somewhat creative with them!");

			addJei(BlastCompressorRecipe.RECIPE_GROUP, "Blast Compressor");

		}

	}

}
