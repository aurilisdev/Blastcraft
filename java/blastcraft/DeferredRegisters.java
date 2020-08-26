package blastcraft;

import com.google.common.base.Supplier;

import blastcraft.block.BlockCustomBricks;
import electrodynamics.common.blockitem.BlockItemDescriptable;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class DeferredRegisters {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.ID);
	public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, References.ID);
	public static BlockCustomBricks blockBlastproofWalling;
	public static BlockCustomBricks blockRawBlastproofWalling;
	public static BlockCustomBricks blockCarbonPlatedWalling;
	public static BlockCustomBricks blockHardenedBricks;

	static {
		BLOCKS.register("blastproofwalling", supplier(blockBlastproofWalling = new BlockCustomBricks(50, 6000000)));
		BLOCKS.register("rawblastproofwalling", supplier(blockRawBlastproofWalling = new BlockCustomBricks(2, 0)));
		BLOCKS.register("carbonplatedwalling", supplier(blockCarbonPlatedWalling = new BlockCustomBricks(85, 6000000)));
		BLOCKS.register("hardenedbricks", supplier(blockHardenedBricks = new BlockCustomBricks(10, 0)));
		ITEMS.register("blastproofwalling", supplier(new BlockItemDescriptable(blockBlastproofWalling, new Item.Properties().group(References.CORETAB))));
		ITEMS.register("rawblastproofwalling", supplier(new BlockItemDescriptable(blockRawBlastproofWalling, new Item.Properties().group(References.CORETAB))));
		ITEMS.register("carbonplatedwalling", supplier(new BlockItemDescriptable(blockCarbonPlatedWalling, new Item.Properties().group(References.CORETAB))));
		ITEMS.register("hardenedbricks", supplier(new BlockItemDescriptable(blockHardenedBricks, new Item.Properties().group(References.CORETAB))));
	}

	private static <T extends IForgeRegistryEntry<T>> Supplier<? extends T> supplier(T entry) {
		return () -> entry;
	}
}
