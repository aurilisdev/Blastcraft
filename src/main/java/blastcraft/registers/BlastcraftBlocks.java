package blastcraft.registers;


import static electrodynamics.registers.UnifiedElectrodynamicsRegister.supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import blastcraft.References;
import blastcraft.common.block.BlockCamoflage;
import blastcraft.common.block.BlockCustomBricks;
import blastcraft.common.block.BlockSpike;
import blastcraft.common.block.BlockSpike.BlockSpikeFire;
import blastcraft.common.block.BlockSpike.BlockSpikePoison;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tile.TileBlastCompressor;
import electrodynamics.api.ISubtype;
import electrodynamics.common.block.BlockCustomGlass;
import electrodynamics.prefab.block.GenericMachineBlock;
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

	public static final HashMap<SubtypeBrick, ArrayList<RegistryObject<Block>>> bricksMap = new HashMap<>();
	public static final HashMap<ISubtype, RegistryObject<Block>> SUBTYPEBLOCKREGISTER_MAPPINGS = new HashMap<>();

	public static GenericMachineBlock blockBlastCompressor;
	public static BlockCamoflage blockCamoflage;
	public static PressurePlateBlock blockGlassPressurePlate;
	public static BlockSpike blockSpike;
	public static BlockSpikeFire blockSpikeFire;
	public static BlockSpikePoison blockSpikePoison;
	static {
		for (SubtypeBrick type : SubtypeBrick.values()) {
			ArrayList<RegistryObject<Block>> bricks = new ArrayList<>();
			bricksMap.put(type, bricks);
			for (SubtypeWalling wall : SubtypeWalling.values()) {
				bricks.add(BLOCKS.register(wall.tag() + type.tag(), () -> new BlockCustomBricks(wall.hardness, wall.resistance)));
			}
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {
			SUBTYPEBLOCKREGISTER_MAPPINGS.put(glass, BLOCKS.register(glass.tag(), supplier(() -> new BlockCustomGlass(glass.hardness, glass.resistance))));
		}

		BLOCKS.register("blastcompressor", supplier(() -> blockBlastCompressor = new GenericMachineBlock(TileBlastCompressor::new)));
		BLOCKS.register("camoflage", supplier(() -> blockCamoflage = new BlockCamoflage()));
		BLOCKS.register("glasspressureplate", supplier(() -> blockGlassPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.GLASS).noCollission().strength(0.5F).sound(SoundType.GLASS))));
		BLOCKS.register("spike", supplier(() -> blockSpike = new BlockSpike()));
		BLOCKS.register("spikefire", supplier(() -> blockSpikeFire = new BlockSpikeFire()));
		BLOCKS.register("spikepoison", supplier(() -> blockSpikePoison = new BlockSpikePoison()));

	}

	public static Block getWallForType(SubtypeWalling wall, SubtypeBrick brick) {
		return bricksMap.get(brick).get(wall.ordinal()).get();
	}

	public static Block[] getAllWalls(SubtypeWalling wall) {

		Block[] blocks = new Block[SubtypeBrick.values().length];

		int wallingOrdinal = wall.ordinal();
		int i = 0;
		for (SubtypeBrick brick : SubtypeBrick.values()) {

			blocks[i] = bricksMap.get(brick).get(wallingOrdinal).get();
			i++;
		}

		return blocks;

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
