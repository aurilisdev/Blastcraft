package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.client.ElectrodynamicsBlockStateProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class BlastcraftBlockStateProvider extends ElectrodynamicsBlockStateProvider {

	public BlastcraftBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, exFileHelper, References.ID);
	}

	@Override
	protected void registerStatesAndModels() {

		for (SubtypeBrick brick : SubtypeBrick.values()) {

			for (RegistryObject<Block> wall : BlastcraftBlocks.bricksMap.get(brick)) {

				simpleBlock(wall.get(), blockLoc(brick.name() + "/" + name(wall.get())), true);

			}

		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {

			simpleBlock(BlastcraftBlocks.getBlock(glass), blockLoc("glass/" + glass.tag()), true);

		}

		simpleBlock(BlastcraftBlocks.blockCamoflage, blockLoc(name(BlastcraftBlocks.blockCamoflage)), true);

		pressurePlateBlock(BlastcraftBlocks.blockGlassPressurePlate, blockLoc("trans"), true);

		crossBlock(BlastcraftBlocks.blockSpike, blockLoc("spike/" + name(BlastcraftBlocks.blockSpike)), true);
		crossBlock(BlastcraftBlocks.blockSpikeFire, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikeFire)), true);
		crossBlock(BlastcraftBlocks.blockSpikePoison, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikePoison)), true);

		horrRotatedBlock(BlastcraftBlocks.blockBlastCompressor, existingBlock(BlastcraftBlocks.blockBlastCompressor), true);

	}

	public void wallBlock(WallBlock block, ResourceLocation texture, boolean registerItem) {
		String baseName = key(block).toString();

		wallBlock(block, texture);

		if (registerItem) {
			blockItem(block, models().wallInventory(baseName, texture));
		}

	}
	
	public void slabBlock(SlabBlock block, ResourceLocation doubleSlabModel, ResourceLocation texture, boolean registerItem) {
		slabBlock(block, doubleSlabModel, texture);
		if(registerItem) {
			blockItem(block, existingBlock(block));
		}
	}
	
	public void stairsBlock(StairsBlock block, ResourceLocation texture, boolean registerItem) {
		stairsBlock(block, texture);
		if(registerItem) {
			blockItem(block, existingBlock(block));
		}
	}

}
