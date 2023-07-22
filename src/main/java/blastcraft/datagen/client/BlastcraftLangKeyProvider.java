package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
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

			// BASE

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base), "Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base), "Raw Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base), "Carbon Plated Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base), "Hardened Bricks");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base_stairs), "Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base_stairs), "Raw Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base_stairs), "Carbon Plated Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base_stairs), "Hardened Brick Stairs");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base_wall), "Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base_wall), "Raw Blast Proof Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base_wall), "Carbon Plated Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base_wall), "Hardened Brick Wall");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.base_slab), "Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.base_slab), "Raw Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.base_slab), "Carbon Plated Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.base_slab), "Hardened Brick Slab");

			// POLISHED

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished), "Polished Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished), "Polished Raw Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished), "Polished Carbon Plated Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished), "Polished Hardened Bricks");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished_stairs), "Polished Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished_stairs), "Polished Raw Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished_stairs), "Polished Carbon Plated Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished_stairs), "Polished Hardened Brick Stairs");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished_wall), "Polished Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished_wall), "Polished Raw Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished_wall), "Polished Carbon Plated Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished_wall), "Polished Hardened Brick Wall");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.polished_slab), "Polished Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.polished_slab), "Polished Raw Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.polished_slab), "Polished Carbon Plated Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.polished_slab), "Polished Hardened Brick Slab");

			// SMOOTH

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth), "Smooth Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth), "Smooth Raw Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth), "Smooth Carbon Plated Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth), "Smooth Hardened Bricks");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth_stairs), "Smooth Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth_stairs), "Smooth Raw Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth_stairs), "Smooth Carbon Plated Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth_stairs), "Smooth Hardened Brick Stairs");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth_wall), "Smooth Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth_wall), "Smooth Raw Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth_wall), "Smooth Carbon Plated Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth_wall), "Smooth Hardened Brick Wall");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.smooth_slab), "Smooth Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.smooth_slab), "Smooth Raw Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.smooth_slab), "Smooth Carbon Plated Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.smooth_slab), "Smooth Hardened Brick Slab");

			// BIG

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big), "Big Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big), "Big Raw Blast Proof Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big), "Big Carbon Plated Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big), "Big Hardened Bricks");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big_stairs), "Big Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big_stairs), "Big Raw Blast Proof Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big_stairs), "Big Carbon Plated Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big_stairs), "Big Hardened Brick Stairs");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big_wall), "Big Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big_wall), "Big Raw Blast Proof Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big_wall), "Big Carbon Plated Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big_wall), "Big Hardened Brick Wall");

			addBlock(BlastcraftBlocks.getBlock(SubtypeBlastproofWall.big_slab), "Big Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.big_slab), "Big Raw Blast Proof Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.big_slab), "Big Carbon Plated Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeHardenedBricks.big_slab), "Big Hardened Brick Slab");

			// GLASS

			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.blastproofwalling), "Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.rawblastproofwalling), "Raw Blast Proof Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.carbonplatedwalling), "Carbon Plated Walling Glass");
			addBlock(BlastcraftBlocks.getBlock(SubtypeWallingGlass.hardenedbricks), "Hardened Brick Glass");

			//CONCRETE
			
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.regular), "Reinforced Concrete");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks), "Reinforced Concrete Bricks");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.tile), "Reinforced Concrete Tile");
			
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.regular_stairs), "Reinforced Concrete Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks_stairs), "Reinforced Concrete Brick Stairs");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.tile_stairs), "Reinforced Concrete Tile Stairs");
			
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.regular_wall), "Reinforced Concrete Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks_wall), "Reinforced Concrete Brick Wall");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.tile_wall), "Reinforced Concrete Tile Wall");
			
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.regular_slab), "Reinforced Concrete Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks_slab), "Reinforced Concrete Brick Slab");
			addBlock(BlastcraftBlocks.getBlock(SubtypeConcrete.tile_slab), "Reinforced Concrete Tile Slab");

			addBlock(BlastcraftBlocks.blockCamoflage, "Camoflage");
			addBlock(BlastcraftBlocks.blockGlassPressurePlate, "Glass Pressure Plate");

			addBlock(BlastcraftBlocks.blockSpike, "Spike");
			addBlock(BlastcraftBlocks.blockSpikeFire, "Fire Spike");
			addBlock(BlastcraftBlocks.blockSpikePoison, "Poison Spike");

			addItem(BlastcraftItems.ITEM_CONCRETEMIX, "Blastcrete");

			addFluid(BlastcraftFluids.fluidConcrete, "Concrete Slurry");

			addContainer("blastcompressor", "Blast Compressor");

			addTooltip("concretemix", "What Minecraft is made of");

			addGuidebook(References.ID, "Blastcraft");

			addGuidebook("chapter.blocks", "Blocks");
			addGuidebook("chapter.blocks.camoflage1", "Camoflage can be disguised as any block in the game by Right-Clicking on it with said block in hand. Note, it will only copy the appearance of the block, and none of its other properties! Camoflage will also allow daylight to pass through it.");
			addGuidebook("chapter.blocks.blastprooftitle", "Walls");
			addGuidebook("chapter.blocks.blastproof1", "Blastcraft adds several blast-resistant blocks for you to defend your base with. These include:");
			addGuidebook("chapter.blocks.hardened", "Hardened");
			addGuidebook("chapter.blocks.concrete", "Concrete");
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
