package blastcraft.registers;

import static blastcraft.registers.BlastcraftBlocks.blockBlastCompressor;
import static blastcraft.registers.BlastcraftBlocks.blockCamoflage;
import static blastcraft.registers.BlastcraftBlocks.blockGlassPressurePlate;
import static blastcraft.registers.BlastcraftBlocks.blockSpike;
import static blastcraft.registers.BlastcraftBlocks.blockSpikeFire;
import static blastcraft.registers.BlastcraftBlocks.blockSpikePoison;
import static electrodynamics.registers.UnifiedElectrodynamicsRegister.supplier;

import java.util.ArrayList;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
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
			for (SubtypeWalling wall : SubtypeWalling.values()) {
				ITEMS.register(wall.tag() + type.tag(), supplier(() -> new BlockItemDescriptable(() -> bricks.get(wall.ordinal()).get(), new Item.Properties().tab(References.CORETAB))));
			}
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {

			ITEMS.register(glass.tag(), supplier(() -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(glass), new Item.Properties().tab(References.CORETAB))));

		}

		ITEMS.register("blastcompressor", supplier(() -> new BlockItemDescriptable(() -> blockBlastCompressor, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("camoflage", supplier(() -> new BlockItemDescriptable(() -> blockCamoflage, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("glasspressureplate", supplier(() -> new BlockItemDescriptable(() -> blockGlassPressurePlate, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spike", supplier(() -> new BlockItemDescriptable(() -> blockSpike, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spikefire", supplier(() -> new BlockItemDescriptable(() -> blockSpikeFire, new Item.Properties().tab(References.CORETAB))));
		ITEMS.register("spikepoison", supplier(() -> new BlockItemDescriptable(() -> blockSpikePoison, new Item.Properties().tab(References.CORETAB))));

	}

}
