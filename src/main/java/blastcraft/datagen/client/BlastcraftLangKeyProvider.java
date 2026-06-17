package blastcraft.datagen.client;

import blastcraft.Blastcraft;
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
import blastcraft.registers.BlastcraftSounds;
import net.minecraft.data.PackOutput;
import voltaic.datagen.utils.client.BaseLangKeyProvider;

public class BlastcraftLangKeyProvider extends BaseLangKeyProvider {

    public BlastcraftLangKeyProvider(PackOutput output, Locale locale) {
	super(output, locale, Blastcraft.ID);
    }

    @Override
    protected void addTranslations() {

	switch (locale) {
	case EN_US:
	default:

	    addCreativeTab("main", "Blastcraft");

	    addBlock(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR, "Blast Compressor");

	    // BASE

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), "Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base),
		    "Raw Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base),
		    "Carbon Plated Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), "Hardened Bricks");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_stairs),
		    "Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_stairs),
		    "Raw Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_stairs),
		    "Carbon Plated Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_stairs),
		    "Hardened Brick Stairs");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_wall),
		    "Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_wall),
		    "Raw Blast Proof Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_wall),
		    "Carbon Plated Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_wall),
		    "Hardened Brick Wall");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_slab),
		    "Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_slab),
		    "Raw Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_slab),
		    "Carbon Plated Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_slab),
		    "Hardened Brick Slab");

	    // POLISHED

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished),
		    "Polished Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished),
		    "Polished Raw Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished),
		    "Polished Carbon Plated Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished),
		    "Polished Hardened Bricks");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_stairs),
		    "Polished Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_stairs),
		    "Polished Raw Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_stairs),
		    "Polished Carbon Plated Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_stairs),
		    "Polished Hardened Brick Stairs");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_wall),
		    "Polished Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_wall),
		    "Polished Raw Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_wall),
		    "Polished Carbon Plated Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_wall),
		    "Polished Hardened Brick Wall");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_slab),
		    "Polished Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_slab),
		    "Polished Raw Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_slab),
		    "Polished Carbon Plated Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_slab),
		    "Polished Hardened Brick Slab");

	    // SMOOTH

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth),
		    "Smooth Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth),
		    "Smooth Raw Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth),
		    "Smooth Carbon Plated Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth),
		    "Smooth Hardened Bricks");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_stairs),
		    "Smooth Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_stairs),
		    "Smooth Raw Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_stairs),
		    "Smooth Carbon Plated Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_stairs),
		    "Smooth Hardened Brick Stairs");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_wall),
		    "Smooth Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_wall),
		    "Smooth Raw Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_wall),
		    "Smooth Carbon Plated Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_wall),
		    "Smooth Hardened Brick Wall");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_slab),
		    "Smooth Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_slab),
		    "Smooth Raw Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_slab),
		    "Smooth Carbon Plated Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_slab),
		    "Smooth Hardened Brick Slab");

	    // BIG

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big),
		    "Big Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big),
		    "Big Raw Blast Proof Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big),
		    "Big Carbon Plated Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), "Big Hardened Bricks");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_stairs),
		    "Big Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_stairs),
		    "Big Raw Blast Proof Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_stairs),
		    "Big Carbon Plated Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_stairs),
		    "Big Hardened Brick Stairs");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_wall),
		    "Big Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_wall),
		    "Big Raw Blast Proof Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_wall),
		    "Big Carbon Plated Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_wall),
		    "Big Hardened Brick Wall");

	    addBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_slab),
		    "Big Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_slab),
		    "Big Raw Blast Proof Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_slab),
		    "Big Carbon Plated Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_slab),
		    "Big Hardened Brick Slab");

	    // GLASS

	    addBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(SubtypeWallingGlass.blastproofwalling),
		    "Blast Proof Walling Glass");
	    addBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(SubtypeWallingGlass.rawblastproofwalling),
		    "Raw Blast Proof Walling Glass");
	    addBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(SubtypeWallingGlass.carbonplatedwalling),
		    "Carbon Plated Walling Glass");
	    addBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(SubtypeWallingGlass.hardenedbricks),
		    "Hardened Brick Glass");

	    // CONCRETE

	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular), "Reinforced Concrete");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks), "Reinforced Concrete Bricks");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile), "Reinforced Concrete Tile");

	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular_stairs),
		    "Reinforced Concrete Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks_stairs),
		    "Reinforced Concrete Brick Stairs");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile_stairs),
		    "Reinforced Concrete Tile Stairs");

	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular_wall),
		    "Reinforced Concrete Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks_wall),
		    "Reinforced Concrete Brick Wall");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile_wall),
		    "Reinforced Concrete Tile Wall");

	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.regular_slab),
		    "Reinforced Concrete Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.bricks_slab),
		    "Reinforced Concrete Brick Slab");
	    addBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(SubtypeConcrete.tile_slab),
		    "Reinforced Concrete Tile Slab");

	    addBlock(BlastcraftBlocks.BLOCK_CAMOFLAGE, "Camoflage");
	    addBlock(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE, "Glass Pressure Plate");

	    addBlock(BlastcraftBlocks.BLOCK_SPIKE, "Spike");
	    addBlock(BlastcraftBlocks.BLOCK_FIRESPIKE, "Fire Spike");
	    addBlock(BlastcraftBlocks.BLOCK_POISONSPIKE, "Poison Spike");

	    addItem(BlastcraftItems.ITEM_CONCRETEMIX, "Blastcrete");
	    // addItem(BlastcraftItems.ITEM_SPEEDUPGRADE_BASIC, "Basic Speed Upgrade");
	    // addItem(BlastcraftItems.ITEM_SPEEDUPGRADE_ADVANCED, "Advanced Speed
	    // Upgrade");
	    // addItem(BlastcraftItems.ITEM_UPGRADEITEMOUTPUT, "Auto-Ejector Upgrade");
	    // addItem(BlastcraftItems.ITEM_UPGRADEITEMINPUT, "Auto-Injector Upgrade");
	    // addItem(BlastcraftItems.ITEM_UPGRADERANGE, "Range Upgrade");

	    addFluid(BlastcraftFluids.FLUID_CONCRETE, "Concrete Slurry");

	    addContainer("blastcompressor", "Blast Compressor");

	    addTooltip("concretemix", "What Minecraft is made of");

	    addGuidebook(Blastcraft.ID, "Blastcraft");

	    addSubtitle(BlastcraftSounds.SOUND_BLASTCOMPRESSOR, "Blast Compressor Compresses");

	    addGuidebook("chapter.blocks", "Blocks");
	    addGuidebook("chapter.blocks.camoflage1",
		    "Camoflage can be disguised as any block in the game by Right-Clicking on it with said block in hand. Note, it will only copy the appearance of the block, and none of its other properties! Camoflage will also allow daylight to pass through it.");
	    addGuidebook("chapter.blocks.blastprooftitle", "Walls");
	    addGuidebook("chapter.blocks.blastproof1",
		    "Blastcraft adds several blast-resistant blocks for you to defend your base with. These include:");
	    addGuidebook("chapter.blocks.hardened", "Hardened");
	    addGuidebook("chapter.blocks.concrete", "Concrete");
	    addGuidebook("chapter.blocks.rawblastproof", "Raw Blastproof");
	    addGuidebook("chapter.blocks.blastproof", "Blastproof");
	    addGuidebook("chapter.blocks.carbonplated", "Carbon Plated");
	    addGuidebook("chapter.blocks.hardness", "Hardness: %s");
	    addGuidebook("chapter.blocks.strength", "Strength: %s");
	    addGuidebook("chapter.blocks.blastproof2",
		    "The blocks also come in several decorative forms, allowing you to be somewhat creative with them!");

	    addJei(BlastCompressorRecipe.RECIPE_GROUP, "Blast Compressor");

	    addConfiguration("common", "Common");
	}

    }

}
