package blastcraft;

//import java.util.ArrayList;
//import java.util.HashMap;
//
//import com.google.common.base.Supplier;
//import com.google.common.collect.Sets;
//
//import blastcraft.common.block.BlockBlastCompressor;
//import blastcraft.common.block.BlockCamoflage;
//import blastcraft.common.block.BlockCustomBricks;
//import blastcraft.common.block.BlockSpike;
//import blastcraft.common.block.BlockSpike.BlockSpikeFire;
//import blastcraft.common.block.BlockSpike.BlockSpikePoison;
//import blastcraft.common.block.SubtypeBrick;
//import blastcraft.common.tile.TileBlastCompressor;
//import blastcraft.common.tile.TileCamoflage;
//import electrodynamics.common.block.BlockCustomGlass;
//import electrodynamics.common.blockitem.BlockItemDescriptable;
//import net.minecraft.block.AbstractBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.PressurePlateBlock;
//import net.minecraft.block.SoundType;
//import net.minecraft.block.material.Material;
//import net.minecraft.item.Item;
//import net.minecraft.tileentity.TileEntityType;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
//import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.IForgeRegistryEntry;
//
//@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class DeferredRegisters {
//	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.ID);
//	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.ID);
//	public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, References.ID);
//	public static final HashMap<SubtypeBrick, ArrayList<BlockCustomBricks>> bricksMap = new HashMap<>();
//	public static BlockCustomGlass blockBlastproofWallingGlass;
//	public static BlockCustomGlass blockRawBlastproofWallingGlass;
//	public static BlockCustomGlass blockCarbonPlatedWallingGlass;
//	public static BlockCustomGlass blockHardenedBricksGlass;
//	public static BlockBlastCompressor blockBlastCompressor;
//	public static BlockCamoflage blockCamoflage;
//	public static PressurePlateBlock blockGlassPressurePlate;
//	public static BlockSpike blockSpike;
//	public static BlockSpikeFire blockSpikeFire;
//	public static BlockSpikePoison blockSpikePoison;
//
//	static {
//		for (SubtypeBrick type : SubtypeBrick.values()) {
//			ArrayList<BlockCustomBricks> bricks = new ArrayList<>();
//			bricksMap.put(type, bricks);
//			BlockCustomBricks brick = new BlockCustomBricks(50, 12500);
//			bricks.add(brick);
//			BLOCKS.register("blastproofwalling" + type.tag(), supplier(brick));
//			ITEMS.register("blastproofwalling" + type.tag(), supplier(new BlockItemDescriptable(brick, new Item.Properties().group(References.CORETAB))));
//			brick = new BlockCustomBricks(2, 50);
//			bricks.add(brick);
//			BLOCKS.register("rawblastproofwalling" + type.tag(), supplier(brick));
//			ITEMS.register("rawblastproofwalling" + type.tag(), supplier(new BlockItemDescriptable(brick, new Item.Properties().group(References.CORETAB))));
//			brick = new BlockCustomBricks(85, 18000);
//			bricks.add(brick);
//			BLOCKS.register("carbonplatedwalling" + type.tag(), supplier(brick));
//			ITEMS.register("carbonplatedwalling" + type.tag(), supplier(new BlockItemDescriptable(brick, new Item.Properties().group(References.CORETAB))));
//			brick = new BlockCustomBricks(10, 4000);
//			bricks.add(brick);
//			BLOCKS.register("hardenedbricks" + type.tag(), supplier(brick));
//			ITEMS.register("hardenedbricks" + type.tag(), supplier(new BlockItemDescriptable(brick, new Item.Properties().group(References.CORETAB))));
//		}
//		BLOCKS.register("blastproofwallingglass", supplier(blockBlastproofWallingGlass = new BlockCustomGlass(50, 12500)));
//		BLOCKS.register("rawblastproofwallingglass", supplier(blockRawBlastproofWallingGlass = new BlockCustomGlass(2, 50)));
//		BLOCKS.register("carbonplatedwallingglass", supplier(blockCarbonPlatedWallingGlass = new BlockCustomGlass(85, 18000)));
//		BLOCKS.register("hardenedbricksglass", supplier(blockHardenedBricksGlass = new BlockCustomGlass(10, 4000)));
//		BLOCKS.register("blastcompressor", supplier(blockBlastCompressor = new BlockBlastCompressor()));
//		BLOCKS.register("camoflage", supplier(blockCamoflage = new BlockCamoflage()));
//		BLOCKS.register("glasspressureplate", supplier(blockGlassPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.GLASS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.GLASS))));
//		BLOCKS.register("spike", supplier(blockSpike = new BlockSpike()));
//		BLOCKS.register("spikefire", supplier(blockSpikeFire = new BlockSpikeFire()));
//		BLOCKS.register("spikepoison", supplier(blockSpikePoison = new BlockSpikePoison()));
//
//		ITEMS.register("blastproofwallingglass", supplier(new BlockItemDescriptable(blockBlastproofWallingGlass, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("rawblastproofwallingglass", supplier(new BlockItemDescriptable(blockRawBlastproofWallingGlass, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("carbonplatedwallingglass", supplier(new BlockItemDescriptable(blockCarbonPlatedWallingGlass, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("hardenedbricksglass", supplier(new BlockItemDescriptable(blockHardenedBricksGlass, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("blastcompressor", supplier(new BlockItemDescriptable(blockBlastCompressor, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("camoflage", supplier(new BlockItemDescriptable(blockCamoflage, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("glasspressureplate", supplier(new BlockItemDescriptable(blockGlassPressurePlate, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("spike", supplier(new BlockItemDescriptable(blockSpike, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("spikefire", supplier(new BlockItemDescriptable(blockSpikeFire, new Item.Properties().group(References.CORETAB))));
//		ITEMS.register("spikepoison", supplier(new BlockItemDescriptable(blockSpikePoison, new Item.Properties().group(References.CORETAB))));
//		BlockItemDescriptable.addDescription(blockBlastCompressor, "|translate|tooltip.blastcompressor.voltage");
//	}
//	public static final RegistryObject<TileEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = TILES.register("blastcompressor", () -> new TileEntityType<>(TileBlastCompressor::new, Sets.newHashSet(blockBlastCompressor), null));
//	public static final RegistryObject<TileEntityType<TileCamoflage>> TILE_CAMOFLAGE = TILES.register("camoflage", () -> new TileEntityType<>(TileCamoflage::new, Sets.newHashSet(blockCamoflage), null));
//
//	@SubscribeEvent
//	public static void onLoadEvent(FMLLoadCompleteEvent event) {
//	}
//
//	private static <T extends IForgeRegistryEntry<T>> Supplier<? extends T> supplier(T entry) {
//		return () -> entry;
//	}
}
