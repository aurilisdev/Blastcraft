package blastcraft.registers;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import voltaic.Voltaic;
import voltaic.api.registration.BulkRegistryObject;
import voltaic.common.blockitem.BlockItemDescriptable;
import voltaic.common.item.ItemUpgrade;
import voltaic.common.item.subtype.SubtypeItemUpgrade;

public class BlastcraftItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Blastcraft.ID);

    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeHardenedBricks> ITEMS_HARDENEDBRICKS = new BulkRegistryObject<>(SubtypeHardenedBricks.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_HARDENEDBRICKS.getValue(subtype), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeRawBlastproofWall> ITEMS_RAW_BLASTPROOFWALL = new BulkRegistryObject<>(SubtypeRawBlastproofWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_RAW_BLASTPROOFWALL.getValue(subtype), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeBlastproofWall> ITEMS_BLASTPROOFWALL = new BulkRegistryObject<>(SubtypeBlastproofWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_BLASTPROOFWALL.getValue(subtype), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeCarbonPlatedWall> ITEMS_CARBONPLATEDWALL = new BulkRegistryObject<>(SubtypeCarbonPlatedWall.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_CARBONPLATEDWALL.getValue(subtype), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN)));
    public static final BulkRegistryObject<BlockItemDescriptable, SubtypeWallingGlass> ITEMS_WALLINGGLASS = new BulkRegistryObject<>(SubtypeWallingGlass.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCKS_WALLINGGLASS.getValue(subtype), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN)));

    public static final RegistryObject<BlockItemDescriptable> ITEM_BLASTCOMPRESSOR = ITEMS.register("blastcompressor", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_BLASTCOMPRESSOR.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_CAMOFLAGE = ITEMS.register("camoflage", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_CAMOFLAGE.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_GLASSPRESSUREPLATE = ITEMS.register("glasspressureplate", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_GLASSPRESSUREPLATE.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_SPIKE = ITEMS.register("spike", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_SPIKE.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_FIRESPIKE = ITEMS.register("spikefire", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_FIRESPIKE.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));
    public static final RegistryObject<BlockItemDescriptable> ITEM_POISONSPIKE = ITEMS.register("spikepoison", () -> new BlockItemDescriptable(BlastcraftBlocks.BLOCK_POISONSPIKE.get(), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN));

    public static final RegistryObject<ItemUpgrade> ITEM_SPEEDUPGRADE_BASIC = ITEMS.register("upgradebasicspeed", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.basicspeed, () -> BlastcraftCreativeTabs.MAIN) {
        @Override
        public boolean allowdedIn(ItemGroup tab) {
            return Voltaic.isElectroLoaded() ? false : super.allowdedIn(tab);
        }
    });

    public static final RegistryObject<ItemUpgrade> ITEM_SPEEDUPGRADE_ADVANCED = ITEMS.register("upgradeadvancedpeed", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.advancedspeed, () -> BlastcraftCreativeTabs.MAIN) {
    	@Override
        public boolean allowdedIn(ItemGroup tab) {
            return Voltaic.isElectroLoaded() ? false : super.allowdedIn(tab);
        }
    });

    public static final RegistryObject<ItemUpgrade> ITEM_UPGRADEITEMINPUT = ITEMS.register("upgradeiteminput", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.iteminput, () -> BlastcraftCreativeTabs.MAIN) {
    	@Override
        public boolean allowdedIn(ItemGroup tab) {
            return Voltaic.isElectroLoaded() ? false : super.allowdedIn(tab);
        }
    });

    public static final RegistryObject<ItemUpgrade> ITEM_UPGRADEITEMOUTPUT = ITEMS.register("upgradeitemoutput", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.itemoutput, () -> BlastcraftCreativeTabs.MAIN) {
    	@Override
        public boolean allowdedIn(ItemGroup tab) {
            return Voltaic.isElectroLoaded() ? false : super.allowdedIn(tab);
        }
    });

    public static final RegistryObject<ItemUpgrade> ITEM_UPGRADERANGE = ITEMS.register("upgraderange", () -> new ItemUpgrade(new Item.Properties(), SubtypeItemUpgrade.range, () -> BlastcraftCreativeTabs.MAIN) {
    	@Override
        public boolean allowdedIn(ItemGroup tab) {
            return Voltaic.isElectroLoaded() ? false : super.allowdedIn(tab);
        }
    });

}
