package blastcraft.registers;

import java.util.ArrayList;
import java.util.List;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import voltaic.api.creativetab.CreativeTabSupplier;
import voltaic.api.registration.BulkRegistryObject;
import voltaic.common.blockitem.BlockItemDescriptable;
import voltaic.common.item.ItemDescriptable;

public class BlastcraftItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Blastcraft.ID);

    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeHardenedBricks> ITEMS_HARDENEDBRICKS = new BulkRegistryObject<>(
	    SubtypeHardenedBricks.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeConcrete> ITEMS_CONCRETE = new BulkRegistryObject<>(
	    SubtypeConcrete.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeRawBlastproofWall> ITEMS_RAW_BLASTPROOFWALL = new BulkRegistryObject<>(
	    SubtypeRawBlastproofWall.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeBlastproofWall> ITEMS_BLASTPROOFWALL = new BulkRegistryObject<>(
	    SubtypeBlastproofWall.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeCarbonPlatedWall> ITEMS_CARBONPLATEDWALL = new BulkRegistryObject<>(
	    SubtypeCarbonPlatedWall.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeWallingGlass> ITEMS_WALLINGGLASS = new BulkRegistryObject<>(
	    SubtypeWallingGlass.values(),
	    subtype -> ITEMS.register(subtype.tag(),
		    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(subtype),
			    new Item.Properties(), BlastcraftCreativeTabs.MAIN)));

    public static final RegistryObject<BlockItemDescriptable> ITEM_BLASTCOMPRESSOR = ITEMS.register("blastcompressor",
	    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(), new Item.Properties(),
		    BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_CAMOFLAGE = ITEMS.register("camoflage",
	    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_CAMOFLAGE.get(), new Item.Properties(),
		    BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_GLASSPRESSUREPLATE = ITEMS.register(
	    "glasspressureplate", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(),
		    new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_SPIKE = ITEMS.register("spike",
	    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_SPIKE.get(), new Item.Properties(),
		    BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_FIRESPIKE = ITEMS.register("spikefire",
	    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_FIRESPIKE.get(), new Item.Properties(),
		    BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_POISONSPIKE = ITEMS.register("spikepoison",
	    () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_POISONSPIKE.get(), new Item.Properties(),
		    BlastcraftCreativeTabs.MAIN));

    public static final RegistryObject<Item> ITEM_CONCRETEMIX = ITEMS.register("concretemix",
	    () -> new ItemDescriptable(new Item.Properties(), BlastcraftCreativeTabs.MAIN,
		    BlastcraftTextUtils.tooltip("concretemix").withStyle(ChatFormatting.DARK_GRAY)));

    @EventBusSubscriber(value = Dist.CLIENT, modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD)
    private static class BlastcraftCreativeRegistry {

	@SubscribeEvent
	public static void registerItems(BuildCreativeModeTabContentsEvent event) {

	    ITEMS.getEntries().forEach(reg -> {

		CreativeTabSupplier supplier = (CreativeTabSupplier) reg.get();

		if (supplier.hasCreativeTab() && supplier.isAllowedInCreativeTab(event.getTab())) {
		    List<ItemStack> toAdd = new ArrayList<>();
		    supplier.addCreativeModeItems(event.getTab(), toAdd);
		    event.acceptAll(toAdd);
		}

	    });

	}

    }

}
