package blastcraft;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;

import blastcraft.common.block.BlockBlastCompressor;
import blastcraft.common.block.BlockCamoflage;
import blastcraft.common.block.BlockCustomBrickGlass;
import blastcraft.common.block.BlockCustomBricks;
import blastcraft.common.tile.TileBlastCompressor;
import blastcraft.common.tile.TileCamoflage;
import electrodynamics.common.blockitem.BlockItemDescriptable;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = References.ID, bus = Bus.MOD)
public class DeferredRegisters {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.ID);
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, References.ID);
    public static BlockCustomBricks blockBlastproofWalling;
    public static BlockCustomBricks blockRawBlastproofWalling;
    public static BlockCustomBricks blockCarbonPlatedWalling;
    public static BlockCustomBricks blockHardenedBricks;
    public static BlockCustomBrickGlass blockBlastproofWallingGlass;
    public static BlockCustomBrickGlass blockRawBlastproofWallingGlass;
    public static BlockCustomBrickGlass blockCarbonPlatedWallingGlass;
    public static BlockCustomBrickGlass blockHardenedBricksGlass;
    public static BlockBlastCompressor blockBlastCompressor;
    public static BlockCamoflage blockCamoflage;
    public static PressurePlateBlock blockGlassPressurePlate;

    static {
	BLOCKS.register("blastproofwalling", supplier(blockBlastproofWalling = new BlockCustomBricks(50, 12500)));
	BLOCKS.register("rawblastproofwalling", supplier(blockRawBlastproofWalling = new BlockCustomBricks(2, 50)));
	BLOCKS.register("carbonplatedwalling", supplier(blockCarbonPlatedWalling = new BlockCustomBricks(85, 18000)));
	BLOCKS.register("hardenedbricks", supplier(blockHardenedBricks = new BlockCustomBricks(10, 4000)));
	BLOCKS.register("blastproofwallingglass", supplier(blockBlastproofWallingGlass = new BlockCustomBrickGlass(50, 12500)));
	BLOCKS.register("rawblastproofwallingglass", supplier(blockRawBlastproofWallingGlass = new BlockCustomBrickGlass(2, 50)));
	BLOCKS.register("carbonplatedwallingglass", supplier(blockCarbonPlatedWallingGlass = new BlockCustomBrickGlass(85, 18000)));
	BLOCKS.register("hardenedbricksglass", supplier(blockHardenedBricksGlass = new BlockCustomBrickGlass(10, 4000)));
	BLOCKS.register("blastcompressor", supplier(blockBlastCompressor = new BlockBlastCompressor()));
	BLOCKS.register("camoflage", supplier(blockCamoflage = new BlockCamoflage()));
	BLOCKS.register("glasspressureplate", supplier(blockGlassPressurePlate = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
		AbstractBlock.Properties.create(Material.GLASS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.GLASS))));
	ITEMS.register("blastproofwalling",
		supplier(new BlockItemDescriptable(blockBlastproofWalling, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("rawblastproofwalling",
		supplier(new BlockItemDescriptable(blockRawBlastproofWalling, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("carbonplatedwalling",
		supplier(new BlockItemDescriptable(blockCarbonPlatedWalling, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("hardenedbricks", supplier(new BlockItemDescriptable(blockHardenedBricks, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("blastproofwallingglass",
		supplier(new BlockItemDescriptable(blockBlastproofWallingGlass, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("rawblastproofwallingglass",
		supplier(new BlockItemDescriptable(blockRawBlastproofWallingGlass, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("carbonplatedwallingglass",
		supplier(new BlockItemDescriptable(blockCarbonPlatedWallingGlass, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("hardenedbricksglass",
		supplier(new BlockItemDescriptable(blockHardenedBricksGlass, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("blastcompressor", supplier(new BlockItemDescriptable(blockBlastCompressor, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("camoflage", supplier(new BlockItemDescriptable(blockCamoflage, new Item.Properties().group(References.CORETAB))));
	ITEMS.register("glasspressureplate",
		supplier(new BlockItemDescriptable(blockGlassPressurePlate, new Item.Properties().group(References.CORETAB))));
	BlockItemDescriptable.addDescription(blockBlastCompressor, "|translate|tooltip.blastcompressor.voltage");
    }
    public static final RegistryObject<TileEntityType<TileBlastCompressor>> TILE_BLASTCOMPRESSOR = TILES.register("blastcompressor",
	    () -> new TileEntityType<>(TileBlastCompressor::new, Sets.newHashSet(blockBlastCompressor), null));
    public static final RegistryObject<TileEntityType<TileCamoflage>> TILE_CAMOFLAGE = TILES.register("camoflage",
	    () -> new TileEntityType<>(TileCamoflage::new, Sets.newHashSet(blockCamoflage), null));

    @SubscribeEvent
    public static void onLoadEvent(FMLLoadCompleteEvent event) {
	//MachineRecipes.registerRecipe(TILE_BLASTCOMPRESSOR.get(), new O2OProcessingRecipe(blockRawBlastproofWalling, blockBlastproofWalling));
    }

    private static <T extends IForgeRegistryEntry<T>> Supplier<? extends T> supplier(T entry) {
	return () -> entry;
    }
}
