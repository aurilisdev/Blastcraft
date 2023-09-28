package blastcraft.datagen.server;

import java.util.List;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlockTypes;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.server.ElectrodynamicsLootTablesProvider;
import net.minecraft.world.level.block.Block;

public class BlastcraftLootTablesProvider extends ElectrodynamicsLootTablesProvider {

	public BlastcraftLootTablesProvider() {
		super(References.ID);
	}

	@Override
	protected void generate() {

		for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(wall));
		}

		for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(wall));
		}

		for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(wall));
		}

		for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(wall));
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(glass));
		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(concrete));
		}

		addSimpleBlock(BlastcraftBlocks.blockGlassPressurePlate);
		addSimpleBlock(BlastcraftBlocks.blockCamoflage);

		addSimpleBlock(BlastcraftBlocks.blockSpike);
		addSimpleBlock(BlastcraftBlocks.blockSpikeFire);
		addSimpleBlock(BlastcraftBlocks.blockSpikePoison);

		addMachineTable(BlastcraftBlocks.blockBlastCompressor, BlastcraftBlockTypes.TILE_BLASTCOMPRESSOR, true, false, false, true, false);

	}

	@Override
	public List<Block> getExcludedBlocks() {
		return List.of();
	}

}
