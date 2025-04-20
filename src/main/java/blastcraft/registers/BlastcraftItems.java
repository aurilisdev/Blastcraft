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
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import voltaic.Voltaic;
import voltaic.api.creativetab.CreativeTabSupplier;
import voltaic.api.registration.BulkDeferredHolder;
import voltaic.common.blockitem.BlockItemDescriptable;
import voltaic.common.item.ItemDescriptable;
import voltaic.common.item.ItemUpgrade;
import voltaic.common.item.subtype.SubtypeItemUpgrade;

public class BlastcraftItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Blastcraft.ID);

    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeHardenedBricks> ITEMS_HARDENEDBRICKS = new BulkDeferredHolder<>(SubtypeHardenedBricks.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeConcrete> ITEMS_CONCRETE = new BulkDeferredHolder<>(SubtypeConcrete.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_CONCRETE.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeRawBlastproofWall> ITEMS_RAW_BLASTPROOFWALL = new BulkDeferredHolder<>(SubtypeRawBlastproofWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeBlastproofWall> ITEMS_BLASTPROOFWALL = new BulkDeferredHolder<>(SubtypeBlastproofWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeCarbonPlatedWall> ITEMS_CARBONPLATEDWALL = new BulkDeferredHolder<>(SubtypeCarbonPlatedWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));
    public static final BulkDeferredHolder<Item, BlockItemDescriptable, SubtypeWallingGlass> ITEMS_WALLINGGLASS = new BulkDeferredHolder<>(SubtypeWallingGlass.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(subtype), new Item.Properties(), BlastcraftCreativeTabs.MAIN)));

    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_BLASTCOMPRESSOR = ITEMS.register("blastcompressor", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_CAMOFLAGE = ITEMS.register("camoflage", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_CAMOFLAGE.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_GLASSPRESSUREPLATE = ITEMS.register("glasspressureplate", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_SPIKE = ITEMS.register("spike", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_SPIKE.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_FIRESPIKE = ITEMS.register("spikefire", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_FIRESPIKE.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));
    public static final DeferredHolder<Item, BlockItemDescriptable> ITEM_POISONSPIKE = ITEMS.register("spikepoison", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_POISONSPIKE.get(), new Item.Properties(), BlastcraftCreativeTabs.MAIN));

    public static final DeferredHolder<Item, Item> ITEM_CONCRETEMIX = ITEMS.register("concretemix", () -> new ItemDescriptable(new Item.Properties(), BlastcraftCreativeTabs.MAIN, BlastcraftTextUtils.tooltip("concretemix").withStyle(ChatFormatting.DARK_GRAY)));

    public static final DeferredHolder<Item, ItemUpgrade> ITEM_SPEEDUPGRADE_BASIC = ITEMS.register("upgradebasicspeed", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.basicspeed, BlastcraftCreativeTabs.MAIN) {
        @Override
        public void addCreativeModeItems(CreativeModeTab tab, List<ItemStack> items) {
            if(Voltaic.isElectroLoaded()) {
                return;
            }
            super.addCreativeModeItems(tab, items);
        }
    });

    public static final DeferredHolder<Item, ItemUpgrade> ITEM_SPEEDUPGRADE_ADVANCED = ITEMS.register("upgradeadvancedpeed", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.advancedspeed, BlastcraftCreativeTabs.MAIN) {
        @Override
        public void addCreativeModeItems(CreativeModeTab tab, List<ItemStack> items) {
            if(Voltaic.isElectroLoaded()) {
                return;
            }
            super.addCreativeModeItems(tab, items);
        }
    });

    public static final DeferredHolder<Item, ItemUpgrade> ITEM_UPGRADEITEMINPUT = ITEMS.register("upgradeiteminput", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.iteminput, BlastcraftCreativeTabs.MAIN) {
        @Override
        public void addCreativeModeItems(CreativeModeTab tab, List<ItemStack> items) {
            if(Voltaic.isElectroLoaded()) {
                return;
            }
            super.addCreativeModeItems(tab, items);
        }
    });

    public static final DeferredHolder<Item, ItemUpgrade> ITEM_UPGRADEITEMOUTPUT = ITEMS.register("upgradeitemoutput", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.itemoutput, BlastcraftCreativeTabs.MAIN) {
        @Override
        public void addCreativeModeItems(CreativeModeTab tab, List<ItemStack> items) {
            if(Voltaic.isElectroLoaded()) {
                return;
            }
            super.addCreativeModeItems(tab, items);
        }
    });

    public static final DeferredHolder<Item, ItemUpgrade> ITEM_UPGRADERANGE = ITEMS.register("upgraderange", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.range, BlastcraftCreativeTabs.MAIN) {
        @Override
        public void addCreativeModeItems(CreativeModeTab tab, List<ItemStack> items) {
            if(Voltaic.isElectroLoaded()) {
                return;
            }
            super.addCreativeModeItems(tab, items);
        }
    });

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
