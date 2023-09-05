package blastcraft.registers;

import static blastcraft.registers.BlastcraftBlocks.blockBlastCompressor;
import static blastcraft.registers.BlastcraftBlocks.blockCamoflage;
import static blastcraft.registers.BlastcraftBlocks.blockGlassPressurePlate;
import static blastcraft.registers.BlastcraftBlocks.blockSpike;
import static blastcraft.registers.BlastcraftBlocks.blockSpikeFire;
import static blastcraft.registers.BlastcraftBlocks.blockSpikePoison;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import electrodynamics.common.blockitem.types.BlockItemDescriptable;
import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import electrodynamics.api.ISubtype;
import electrodynamics.api.creativetab.CreativeTabSupplier;
import electrodynamics.common.item.ItemDescriptable;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.ID);
	
	public static final HashMap<ISubtype, RegistryObject<Item>> SUBTYPEITEMREGISTER_MAPPINGS = new HashMap<>();


	static {
		for (SubtypeBlastproofWall wall : SubtypeBlastproofWall.values()) {
			SUBTYPEITEMREGISTER_MAPPINGS.put(wall, ITEMS.register(wall.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(wall), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));
		}
		
		for (SubtypeRawBlastproofWall wall : SubtypeRawBlastproofWall.values()) {
			SUBTYPEITEMREGISTER_MAPPINGS.put(wall, ITEMS.register(wall.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(wall), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));
		}
		
		for (SubtypeCarbonPlatedWall wall : SubtypeCarbonPlatedWall.values()) {
			SUBTYPEITEMREGISTER_MAPPINGS.put(wall, ITEMS.register(wall.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(wall), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));
		}
		
		for (SubtypeHardenedBricks wall : SubtypeHardenedBricks.values()) {
			SUBTYPEITEMREGISTER_MAPPINGS.put(wall, ITEMS.register(wall.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(wall), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));
		}

		for (SubtypeWallingGlass glass : SubtypeWallingGlass.values()) {

			SUBTYPEITEMREGISTER_MAPPINGS.put(glass, ITEMS.register(glass.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(glass), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));

		}

		for (SubtypeConcrete concrete : SubtypeConcrete.values()) {

			SUBTYPEITEMREGISTER_MAPPINGS.put(concrete, ITEMS.register(concrete.tag(), () -> new BlockItemDescriptable(() -> BlastcraftBlocks.getBlock(concrete), new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get())));

		}

		ITEMS.register("blastcompressor", () -> new BlockItemDescriptable(() -> blockBlastCompressor, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));
		ITEMS.register("camoflage", () -> new BlockItemDescriptable(() -> blockCamoflage, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));
		ITEMS.register("glasspressureplate", () -> new BlockItemDescriptable(() -> blockGlassPressurePlate, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));
		ITEMS.register("spike", () -> new BlockItemDescriptable(() -> blockSpike, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));
		ITEMS.register("spikefire", () -> new BlockItemDescriptable(() -> blockSpikeFire, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));
		ITEMS.register("spikepoison", () -> new BlockItemDescriptable(() -> blockSpikePoison, new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get()));

	}

	public static final RegistryObject<Item> ITEM_CONCRETEMIX = ITEMS.register("concretemix", () -> new ItemDescriptable(new Item.Properties(), () -> BlastcraftCreativeTabs.MAIN.get(), BlastcraftTextUtils.tooltip("concretemix").withStyle(ChatFormatting.GRAY)));
	
	public static Item[] getAllItemForSubtype(ISubtype[] values) {
		List<Item> list = new ArrayList<>();
		for (ISubtype value : values) {
			list.add(SUBTYPEITEMREGISTER_MAPPINGS.get(value).get());
		}
		return list.toArray(new Item[] {});
	}

	public static Item getItem(ISubtype value) {
		return SUBTYPEITEMREGISTER_MAPPINGS.get(value).get();
	}
	
	@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = References.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class ElectroCreativeRegistry {

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
