package blastcraft.datagen.server;

import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlockTypes;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.server.ElectrodynamicsLootTablesProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftLootTablesProvider extends ElectrodynamicsLootTablesProvider {

	public BlastcraftLootTablesProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void addTables() {
		
		for(SubtypeBrick brick : SubtypeBrick.values()) {
			for(RegistryObject<Block> reg : BlastcraftBlocks.bricksMap.get(brick)) {
				addSimpleBlock(reg.get());
			}
		}
		
		for(SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(glass));
		}
		
		for(SubtypeConcrete concrete : SubtypeConcrete.values()) {
			addSimpleBlock(BlastcraftBlocks.getBlock(concrete));
		}
		
		addSimpleBlock(BlastcraftBlocks.blockGlassPressurePlate);
		addSimpleBlock(BlastcraftBlocks.blockCamoflage);
		
		addSimpleBlock(BlastcraftBlocks.blockSpike);
		addSimpleBlock(BlastcraftBlocks.blockSpikeFire);
		addSimpleBlock(BlastcraftBlocks.blockSpikePoison);
		
		addIETable(BlastcraftBlocks.blockBlastCompressor, BlastcraftBlockTypes.TILE_BLASTCOMPRESSOR);
		
	}
	

}
