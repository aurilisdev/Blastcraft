package blastcraft.registers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import blastcraft.References;
import blastcraft.common.block.BlockBlastCompressor;
import blastcraft.common.block.BlockCamoflage;
import blastcraft.common.block.BlockCustomBricks;
import blastcraft.common.block.BlockCustomSlab;
import blastcraft.common.block.BlockCustomStairs;
import blastcraft.common.block.BlockCustomWall;
import blastcraft.common.block.BlockSpike;
import blastcraft.common.block.BlockSpike.BlockSpikeFire;
import blastcraft.common.block.BlockSpike.BlockSpikePoison;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import electrodynamics.api.ISubtype;
import electrodynamics.common.block.BlockCustomGlass;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.ID);

	public static final HashMap<ISubtype, RegistryObject<Block>> SUBTYPEBLOCKREGISTER_MAPPINGS = new HashMap<>();

	public static BlockBlastCompressor blockBlastCompressor;
	public static BlockCamoflage blockCamoflage;
	public static PressurePlateBlock blockGlassPressurePlate;
	public static BlockSpike blockSpike;
	public static BlockSpikeFire blockSpikeFire;
	public static BlockSpikePoison blockSpikePoison;
	static {
		for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomWall(wall.hardness, wall.resistance)));
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomSlab(wall.hardness / 2.0F, wall.resistance / 2.0F)));
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomStairs(() -> BlastcraftBlocks.getBlock(SubtypeBlastproofWall.valueOf(wall.name().split("_")[0])).defaultBlockState(), wall.hardness, wall.resistance)));
				break;
			default:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomBricks(wall.hardness, wall.resistance)));
			}

		}

		for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomWall(wall.hardness, wall.resistance)));
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomSlab(wall.hardness / 2.0F, wall.resistance / 2.0F)));
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomStairs(() -> BlastcraftBlocks.getBlock(SubtypeRawBlastproofWall.valueOf(wall.name().split("_")[0])).defaultBlockState(), wall.hardness, wall.resistance)));
				break;
			default:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomBricks(wall.hardness, wall.resistance)));
			}

		}

		for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomWall(wall.hardness, wall.resistance)));
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomSlab(wall.hardness / 2.0F, wall.resistance / 2.0F)));
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomStairs(() -> BlastcraftBlocks.getBlock(SubtypeCarbonPlatedWall.valueOf(wall.name().split("_")[0])).defaultBlockState(), wall.hardness, wall.resistance)));
				break;
			default:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomBricks(wall.hardness, wall.resistance)));
			}

		}

		for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {

			switch (wall) {

			case base_wall, big_wall, polished_wall, smooth_wall:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomWall(wall.hardness, wall.resistance)));
				break;
			case base_slab, big_slab, polished_slab, smooth_slab:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomSlab(wall.hardness / 2.0F, wall.resistance / 2.0F)));
				break;
			case base_stairs, big_stairs, polished_stairs, smooth_stairs:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomStairs(() -> BlastcraftBlocks.getBlock(SubtypeHardenedBricks.valueOf(wall.name().split("_")[0])).defaultBlockState(), wall.hardness, wall.resistance)));
				break;
			default:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(wall, BLOCKS.register(wall.tag(), () -> new BlockCustomBricks(wall.hardness, wall.resistance)));
			}

		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			SUBTYPEBLOCKREGISTER_MAPPINGS.put(glass, BLOCKS.register(glass.tag(), () -> new BlockCustomGlass(glass.hardness, glass.resistance)));
		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {
			
			switch (concrete) {

			case bricks_wall, regular_wall, tile_wall:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(concrete, BLOCKS.register(concrete.tag(), () -> new BlockCustomWall(concrete.hardness, concrete.resistance)));
				break;
			case bricks_slab, regular_slab, tile_slab:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(concrete, BLOCKS.register(concrete.tag(), () -> new BlockCustomSlab(concrete.hardness / 2.0F, concrete.resistance / 2.0F)));
				break;
			case bricks_stairs, regular_stairs, tile_stairs:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(concrete, BLOCKS.register(concrete.tag(), () -> new BlockCustomStairs(() -> BlastcraftBlocks.getBlock(SubtypeConcrete.valueOf(concrete.name().split("_")[0])).defaultBlockState(), concrete.hardness, concrete.resistance)));
				break;
			default:
				SUBTYPEBLOCKREGISTER_MAPPINGS.put(concrete, BLOCKS.register(concrete.tag(), () -> new BlockCustomBricks(concrete.hardness, concrete.resistance)));
			}
			
		}

		BLOCKS.register("blastcompressor", () -> blockBlastCompressor = new BlockBlastCompressor());
		BLOCKS.register("camoflage", () -> blockCamoflage = new BlockCamoflage());
		BLOCKS.register("glasspressureplate", () -> blockGlassPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.GLASS).noCollission().strength(0.5F).sound(SoundType.GLASS)));
		BLOCKS.register("spike", () -> blockSpike = new BlockSpike());
		BLOCKS.register("spikefire", () -> blockSpikeFire = new BlockSpikeFire());
		BLOCKS.register("spikepoison", () -> blockSpikePoison = new BlockSpikePoison());

	}

	public static Block[] getAllBlockForSubtype(ISubtype[] values) {
		List<Block> list = new ArrayList<>();
		for (ISubtype value : values) {
			list.add(SUBTYPEBLOCKREGISTER_MAPPINGS.get(value).get());
		}
		return list.toArray(new Block[] {});
	}

	public static Block getBlock(ISubtype value) {
		return SUBTYPEBLOCKREGISTER_MAPPINGS.get(value).get();
	}

}
