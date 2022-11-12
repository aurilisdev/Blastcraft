package blastcraft.registers;

import static electrodynamics.registers.UnifiedElectrodynamicsRegister.supplier;

import java.util.ArrayList;
import java.util.HashMap;

import blastcraft.References;
import blastcraft.common.block.BlockBlastCompressor;
import blastcraft.common.block.BlockCamoflage;
import blastcraft.common.block.BlockCustomBricks;
import blastcraft.common.block.BlockSpike;
import blastcraft.common.block.BlockSpike.BlockSpikeFire;
import blastcraft.common.block.BlockSpike.BlockSpikePoison;
import blastcraft.common.block.SubtypeBrick;
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
	public static final HashMap<SubtypeBrick, ArrayList<RegistryObject<Block>>> bricksMap = new HashMap<>();
	public static BlockCustomGlass blockBlastproofWallingGlass;
	public static BlockCustomGlass blockRawBlastproofWallingGlass;
	public static BlockCustomGlass blockCarbonPlatedWallingGlass;
	public static BlockCustomGlass blockHardenedBricksGlass;
	public static BlockBlastCompressor blockBlastCompressor;
	public static BlockCamoflage blockCamoflage;
	public static PressurePlateBlock blockGlassPressurePlate;
	public static BlockSpike blockSpike;
	public static BlockSpikeFire blockSpikeFire;
	public static BlockSpikePoison blockSpikePoison;
	static {
		for (SubtypeBrick type : SubtypeBrick.values()) {
			ArrayList<RegistryObject<Block>> bricks = new ArrayList<>();
			bricksMap.put(type, bricks);
			RegistryObject<Block> obj = BLOCKS.register("blastproofwalling" + type.tag(), () -> new BlockCustomBricks(50, 12500));
			bricks.add(obj);
			RegistryObject<Block> obj1 = BLOCKS.register("rawblastproofwalling" + type.tag(), () -> new BlockCustomBricks(2, 50));
			bricks.add(obj1);
			RegistryObject<Block> obj2 = BLOCKS.register("carbonplatedwalling" + type.tag(), () -> new BlockCustomBricks(85, 18000));
			bricks.add(obj2);
			RegistryObject<Block> obj3 = BLOCKS.register("hardenedbricks" + type.tag(), () -> new BlockCustomBricks(10, 4000));
			bricks.add(obj3);
		}
		BLOCKS.register("blastproofwallingglass", supplier(() -> blockBlastproofWallingGlass = new BlockCustomGlass(50, 12500)));
		BLOCKS.register("rawblastproofwallingglass", supplier(() -> blockRawBlastproofWallingGlass = new BlockCustomGlass(2, 50)));
		BLOCKS.register("carbonplatedwallingglass", supplier(() -> blockCarbonPlatedWallingGlass = new BlockCustomGlass(85, 18000)));
		BLOCKS.register("hardenedbricksglass", supplier(() -> blockHardenedBricksGlass = new BlockCustomGlass(10, 4000)));
		BLOCKS.register("blastcompressor", supplier(() -> blockBlastCompressor = new BlockBlastCompressor()));
		BLOCKS.register("camoflage", supplier(() -> blockCamoflage = new BlockCamoflage()));
		BLOCKS.register("glasspressureplate", supplier(() -> blockGlassPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.GLASS).noCollission().strength(0.5F).sound(SoundType.GLASS))));
		BLOCKS.register("spike", supplier(() -> blockSpike = new BlockSpike()));
		BLOCKS.register("spikefire", supplier(() -> blockSpikeFire = new BlockSpikeFire()));
		BLOCKS.register("spikepoison", supplier(() -> blockSpikePoison = new BlockSpikePoison()));

	}
}
