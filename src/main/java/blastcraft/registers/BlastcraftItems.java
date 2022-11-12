package blastcraft.registers;

import static blastcraft.registers.BlastcraftBlocks.blockBlastCompressor;
import static blastcraft.registers.BlastcraftBlocks.blockBlastproofWallingGlass;
import static blastcraft.registers.BlastcraftBlocks.blockCamoflage;
import static blastcraft.registers.BlastcraftBlocks.blockCarbonPlatedWallingGlass;
import static blastcraft.registers.BlastcraftBlocks.blockGlassPressurePlate;
import static blastcraft.registers.BlastcraftBlocks.blockHardenedBricksGlass;
import static blastcraft.registers.BlastcraftBlocks.blockRawBlastproofWallingGlass;
import static blastcraft.registers.BlastcraftBlocks.blockSpike;
import static blastcraft.registers.BlastcraftBlocks.blockSpikeFire;
import static blastcraft.registers.BlastcraftBlocks.blockSpikePoison;
import static electrodynamics.registers.UnifiedElectrodynamicsRegister.supplier;

import java.util.ArrayList;

import blastcraft.References;
import blastcraft.common.block.SubtypeBrick;
import electrodynamics.common.blockitem.BlockItemDescriptable;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.ID);

	static {
		for (SubtypeBrick type : SubtypeBrick.values()) {
			ArrayList<RegistryObject<Block>> bricks = BlastcraftBlocks.bricksMap.get(type);

			BlastcraftItems.ITEMS.register("blastproofwalling" + type.tag(), supplier(() -> new BlockItemDescriptable(() -> bricks.get(0).get(), new Item.Properties().tab(References.CORETAB))));
			BlastcraftItems.ITEMS.register("rawblastproofwalling" + type.tag(), supplier(() -> new BlockItemDescriptable(() -> bricks.get(1).get(), new Item.Properties().tab(References.CORETAB))));
			BlastcraftItems.ITEMS.register("carbonplatedwalling" + type.tag(), supplier(() -> new BlockItemDescriptable(() -> bricks.get(2).get(), new Item.Properties().tab(References.CORETAB))));
			BlastcraftItems.ITEMS.register("hardenedbricks" + type.tag(), supplier(() -> new BlockItemDescriptable(() -> bricks.get(3).get(), new Item.Properties().tab(References.CORETAB))));
		}
		ITEMS.register("blastproofwallingglass", supplier(() -> new BlockItemDescriptable(() -> blockBlastproofWallingGlass, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("rawblastproofwallingglass", supplier(() -> new BlockItemDescriptable(() -> blockRawBlastproofWallingGlass, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("carbonplatedwallingglass", supplier(() -> new BlockItemDescriptable(() -> blockCarbonPlatedWallingGlass, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("hardenedbricksglass", supplier(() -> new BlockItemDescriptable(() -> blockHardenedBricksGlass, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("blastcompressor", supplier(() -> new BlockItemDescriptable(() -> blockBlastCompressor, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("camoflage", supplier(() -> new BlockItemDescriptable(() -> blockCamoflage, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("glasspressureplate", supplier(() -> new BlockItemDescriptable(() -> blockGlassPressurePlate, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spike", supplier(() -> new BlockItemDescriptable(() -> blockSpike, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spikefire", supplier(() -> new BlockItemDescriptable(() -> blockSpikeFire, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spikepoison", supplier(() -> new BlockItemDescriptable(() -> blockSpikePoison, new Item.Properties().tab(References.CORETAB))));
		BlockItemDescriptable.addDescription(() -> blockBlastCompressor, "|translate|tooltip.voltage.240");
	}
}