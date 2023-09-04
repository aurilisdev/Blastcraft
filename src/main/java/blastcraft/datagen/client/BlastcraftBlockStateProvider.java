package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.client.ElectrodynamicsBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftBlockStateProvider extends ElectrodynamicsBlockStateProvider {

	public BlastcraftBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, exFileHelper, References.ID);
	}

	@Override
	protected void registerStatesAndModels() {

		for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.getBlock(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.getBlock(wall), blockLoc(name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), blockLoc("blastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				stairsBlock((StairBlock) BlastcraftBlocks.getBlock(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.getBlock(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.getBlock(wall))), true);
			}

		}

		for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.getBlock(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.getBlock(wall), blockLoc(name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				stairsBlock((StairBlock) BlastcraftBlocks.getBlock(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.getBlock(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.getBlock(wall))), true);
			}
		}

		for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.getBlock(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.getBlock(wall), blockLoc(name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				stairsBlock((StairBlock) BlastcraftBlocks.getBlock(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.getBlock(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.getBlock(wall))), true);
			}

		}

		for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.getBlock(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.getBlock(wall), blockLoc(name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				stairsBlock((StairBlock) BlastcraftBlocks.getBlock(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.getBlock(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.getBlock(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.getBlock(wall))), true);
			}

		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {

			glassBlock(BlastcraftBlocks.getBlock(glass), blockLoc("glass/" + glass.tag()), true);

		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {

			switch (concrete) {

			case bricks_wall, regular_wall, tile_wall:
				wallBlock((WallBlock) BlastcraftBlocks.getBlock(concrete), blockLoc("concrete/" + name(BlastcraftBlocks.getBlock(concrete)).split("_")[0]), true);
				break;
			case bricks_slab, regular_slab, tile_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.getBlock(concrete), blockLoc(name(BlastcraftBlocks.getBlock(concrete)).split("_")[0]), blockLoc("concrete/" + name(BlastcraftBlocks.getBlock(concrete)).split("_")[0]), true);
				break;
			case bricks_stairs, regular_stairs, tile_stairs:
				stairsBlock((StairBlock) BlastcraftBlocks.getBlock(concrete), blockLoc("concrete/" + name(BlastcraftBlocks.getBlock(concrete)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.getBlock(concrete), blockLoc("concrete/" + name(BlastcraftBlocks.getBlock(concrete))), true);
			}

		}

		simpleBlockCustomRenderType(BlastcraftBlocks.blockCamoflage, blockLoc(name(BlastcraftBlocks.blockCamoflage)), new ResourceLocation("cutout"), true);

		pressurePlateBlock(BlastcraftBlocks.blockGlassPressurePlate, blockLoc("trans"), new ResourceLocation("cutout"), true);

		crossBlock(BlastcraftBlocks.blockSpike, blockLoc("spike/" + name(BlastcraftBlocks.blockSpike)), new ResourceLocation("cutout"), true);
		crossBlock(BlastcraftBlocks.blockSpikeFire, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikeFire)), new ResourceLocation("cutout"), true);
		crossBlock(BlastcraftBlocks.blockSpikePoison, blockLoc("spike/" + name(BlastcraftBlocks.blockSpikePoison)), new ResourceLocation("cutout"), true);

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
	
	public void stairsBlock(StairBlock block, ResourceLocation texture, boolean registerItem) {
		stairsBlock(block, texture);
		if(registerItem) {
			blockItem(block, existingBlock(block));
		}
	}

}
