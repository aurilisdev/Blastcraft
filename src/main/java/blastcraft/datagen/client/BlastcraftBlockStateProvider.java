package blastcraft.datagen.client;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.registers.BlastcraftBlocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseBlockstateProvider;

public class BlastcraftBlockStateProvider extends BaseBlockstateProvider {

	public BlastcraftBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, exFileHelper, Blastcraft.ID);
	}

	@Override
	protected void registerStatesAndModels() {

		for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {

			switch (wall) {

			case base_wall:
			case big_wall:
			case polished_wall:
			case smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_slab:
			case big_slab:
			case polished_slab:
			case smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall), blockLoc(name(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall)).split("_")[0]), blockLoc("blastproofwall/" + name(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_stairs:
			case big_stairs:
			case polished_stairs:
			case smooth_stairs:
				stairsBlock((StairsBlock) BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall), blockLoc("blastproofwall/" + name(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(wall))), true);
			}

		}

		for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {

			switch (wall) {

			case base_wall:
			case big_wall:
			case polished_wall:
			case smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_slab:
			case big_slab:
			case polished_slab:
			case smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall), blockLoc(name(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall)).split("_")[0]), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_stairs:
			case big_stairs:
			case polished_stairs:
			case smooth_stairs:
				stairsBlock((StairsBlock) BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall), blockLoc("rawblastproofwall/" + name(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(wall))), true);
			}
		}

		for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {

			switch (wall) {

			case base_wall:
			case big_wall:
			case polished_wall:
			case smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_slab:
			case big_slab:
			case polished_slab:
			case smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall), blockLoc(name(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall)).split("_")[0]), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall)).split("_")[0]), true);
				break;
			case base_stairs:
			case big_stairs:
			case polished_stairs:
			case smooth_stairs:
				stairsBlock((StairsBlock) BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall), blockLoc("carbonplatedwall/" + name(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(wall))), true);
			}

		}

		for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {

			switch (wall) {

			case base_wall:
			case big_wall:
			case polished_wall:
			case smooth_wall:
				wallBlock((WallBlock) BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall)).split("_")[0]), true);
				break;
			case base_slab:
			case big_slab:
			case polished_slab:
			case smooth_slab:
				slabBlock((SlabBlock) BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall), blockLoc(name(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall)).split("_")[0]), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall)).split("_")[0]), true);
				break;
			case base_stairs:
			case big_stairs:
			case polished_stairs:
			case smooth_stairs:
				stairsBlock((StairsBlock) BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall)).split("_")[0]), true);
				break;
			default:
				simpleBlock(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall), blockLoc("hardenedbricks/" + name(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(wall))), true);
			}

		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {

			simpleBlock(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(glass), blockLoc("glass/" + glass.tag()), true);

		}
		
		simpleBlock(BlastcraftBlocks.BLOCK_CAMOFLAGE, blockLoc(name(BlastcraftBlocks.BLOCK_CAMOFLAGE.get())), true);

		pressurePlateBlock(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(), blockLoc("trans"), true);

		crossBlock(BlastcraftBlocks.BLOCK_SPIKE, blockLoc("spike/" + name(BlastcraftBlocks.BLOCK_SPIKE.get())), true);
		crossBlock(BlastcraftBlocks.BLOCK_FIRESPIKE, blockLoc("spike/" + name(BlastcraftBlocks.BLOCK_FIRESPIKE.get())), true);
		crossBlock(BlastcraftBlocks.BLOCK_POISONSPIKE, blockLoc("spike/" + name(BlastcraftBlocks.BLOCK_POISONSPIKE.get())), true);

		horrRotatedBlock(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR, existingBlock(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR), true);

	}

	public void wallBlock(WallBlock block, ResourceLocation texture, boolean registerItem) {
		String baseName = key(block).toString();

		String path = texture.getPath();

		if (path.contains("base")) {
			path = path.replaceAll("base", "");
		}

		texture = new ResourceLocation(texture.getNamespace(), path);

		wallBlock(block, texture);

		if (registerItem) {
			blockItem(block, models().wallInventory(baseName, texture));
		}

	}

	public void slabBlock(SlabBlock block, ResourceLocation doubleSlabModel, ResourceLocation texture, boolean registerItem) {

		String path = texture.getPath();

		if (path.contains("base")) {
			path = path.replaceAll("base", "");
		}

		texture = new ResourceLocation(texture.getNamespace(), path);
		
		String model = doubleSlabModel.getPath();
		
		if(model.contains("base")) {
			model = model.replaceAll("base", "");
		}
		
		doubleSlabModel = new ResourceLocation(doubleSlabModel.getNamespace(), model);

		slabBlock(block, doubleSlabModel, texture);
		if (registerItem) {
			blockItem(block, existingBlock(block));
		}
	}

	public void stairsBlock(StairsBlock block, ResourceLocation texture, boolean registerItem) {

		String path = texture.getPath();

		if (path.contains("base")) {
			path = path.replaceAll("base", "");
		}

		texture = new ResourceLocation(texture.getNamespace(), path);

		stairsBlock(block, texture);
		if (registerItem) {
			blockItem(block, existingBlock(block));
		}
	}

}
