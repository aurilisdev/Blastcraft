package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import blastcraft.registers.BlastcraftFluids;
import blastcraft.registers.BlastcraftItems;
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

			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.blastproofwalling), "Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.rawblastproofwalling), "Raw Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.carbonplatedwalling), "Carbon Plated Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.hardenedbricks), "Hardened Brick Glass");
			
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.regular), "Reinforced Concrete");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks), "Reinforced Concrete Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.tile), "Reinforced Concrete Tile");

			addBlock(BlastcraftBlocks.blockCamoflage, "Camoflage");
			addBlock(BlastcraftBlocks.blockGlassPressurePlate, "Glass Pressure Plate");

			addBlock(BlastcraftBlocks.blockSpike, "Spike");
			addBlock(BlastcraftBlocks.blockSpikeFire, "Fire Spike");
			addBlock(BlastcraftBlocks.blockSpikePoison, "Poison Spike");
			
			addItem(BlastcraftItems.ITEM_CONCRETEMIX, "Blastcrete");
			
			addFluid(BlastcraftFluids.fluidConcrete, "Concrete Slurry");

			addContainer("blastcompressor", "Blast Compressor");

			addTooltip("voltage.240", "Voltage: 240 Volts");
			addTooltip("concretemix", "What Minecraft is made of");

			addGuidebook(References.ID, "Blastcraft");

			addGuidebook("chapter.blocks", "Blocks");
			addGuidebook("chapter.blocks.camtitle", "Camoflage");
			addGuidebook("chapter.blocks.p1l1", "    Camoflage can be disguised ");
			addGuidebook("chapter.blocks.p1l2", "as any block in the game by    ");
			addGuidebook("chapter.blocks.p1l3", "right-clicking on it with said ");
			addGuidebook("chapter.blocks.p1l4", "block in hand. Note, it will only");
			addGuidebook("chapter.blocks.p1l5", "copy the appearance of the     ");
			addGuidebook("chapter.blocks.p1l6", "block, and none of its other   ");
			addGuidebook("chapter.blocks.p1l7", "properties!                    ");
			addGuidebook("chapter.blocks.tier", "Tier, %s");
			addGuidebook("chapter.blocks.resistance", "Resistance, %s");

		}

	}

}
