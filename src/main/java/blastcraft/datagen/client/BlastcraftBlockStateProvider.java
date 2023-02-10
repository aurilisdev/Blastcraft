package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.client.ElectrodynamicsBlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

			glassBlock(BlastcraftBlocks.getBlock(glass), blockLoc("glass/" + glass.tag()), true);

		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {

			simpleBlock(BlastcraftBlocks.getBlock(concrete), blockLoc("concrete/" + name(BlastcraftBlocks.getBlock(concrete))), true);

		}

		simpleBlockCustomRenderType(BlastcraftBlocks.blockCamoflage, blockLoc(name(BlastcraftBlocks.blockCamoflage)), new ResourceLocation("cutout"), true);

		pressurePlateBlock(BlastcraftBlocks.blockGlassPressurePlate, blockLoc("trans"), new ResourceLocation("cutout"), true);

		crossBlock(BlastcraftBlocks.blockSpike, blockLoc("spike/" + name(BlastcraftBlocks.blockSpike)), new ResourceLocation("cutout"), true);
		crossBlock(BlastcraftBlocks.blockSpikeFire, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikeFire)), new ResourceLocation("cutout"), true);
		crossBlock(BlastcraftBlocks.blockSpikePoison, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikePoison)), new ResourceLocation("cutout"), true);

		horrRotatedBlock(BlastcraftBlocks.blockBlastCompressor, existingBlock(BlastcraftBlocks.blockBlastCompressor), true);

	}

}
