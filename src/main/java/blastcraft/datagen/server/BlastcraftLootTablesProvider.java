package blastcraft.datagen.server;

import java.util.List;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import blastcraft.registers.BlastcraftTiles;
import net.minecraft.world.level.block.Block;
import voltaic.datagen.utils.server.loottable.BaseLootTablesProvider;

public class BlastcraftLootTablesProvider extends BaseLootTablesProvider {

    public BlastcraftLootTablesProvider() {
	super(Blastcraft.ID);
    }

    @Override
    protected void generate() {

	for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall));
	}

	for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall));
	}

	for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall));
	}

	for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall));
	}

	for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(glass));
	}

	for (SubtypeConcrete concrete : SubtypeConcrete.values()) {
	    addSimpleBlock(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(concrete));
	}

	addSimpleBlock(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE);
	addSimpleBlock(BlastcraftBlocks.BLOCK_CAMOFLAGE);

	addSimpleBlock(BlastcraftBlocks.BLOCK_SPIKE);
	addSimpleBlock(BlastcraftBlocks.BLOCK_FIRESPIKE);
	addSimpleBlock(BlastcraftBlocks.BLOCK_POISONSPIKE);

	addMachineTable(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(), BlastcraftTiles.TILE_BLASTCOMPRESSOR, true, false,
		false, true, false);

    }

    @Override
    public List<Block> getExcludedBlocks() {
	return List.of();
    }

}
