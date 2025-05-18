package blastcraft.common.tag;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ItemTags;
import voltaic.Voltaic;

public class BlastcraftTags {

	public static void init() {
		Items.init();
		Blocks.init();
		Fluids.init();
	}

	public static class Items {

		public static final INamedTag<Item> DUST_POISON = forgeTag("dusts/poison");

		public static final INamedTag<Item> SOLID_HARDENED_BRICKS = forgeTag("hardened_blocks/solid_hardened_bricks");
		public static final INamedTag<Item> SOLID_RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_raw_blastproof_walls");
		public static final INamedTag<Item> SOLID_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_blastproof_walls");
		public static final INamedTag<Item> SOLID_CARBON_PLATED_WALLS = forgeTag("hardened_blocks/solid_carbon_plated_walls");
		public static final INamedTag<Item> SOLID_CONCRETES = forgeTag("hardened_blocks/solid_concretes");

		public static final INamedTag<Item> SMOOTH_SOLID_HARDENED_BRICKS = forgeTag("hardened_blocks/smooth_solid_hardened_bricks");
		public static final INamedTag<Item> SMOOTH_SOLID_RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/smooth_solid_raw_blastproof_walls");
		public static final INamedTag<Item> SMOOTH_SOLID_BLASTPROOF_WALLS = forgeTag("hardened_blocks/smooth_solid_blastproof_walls");
		public static final INamedTag<Item> SMOOTH_SOLID_CARBON_PLATED_WALLS = forgeTag("hardened_blocks/smooth_solid_carbon_plated_walls");

		private static void init() {

		}

		private static INamedTag<Item> forgeTag(String name) {
			return ItemTags.createOptional(Voltaic.forgerl(name));
		}

	}

	public static class Blocks {

		public static final INamedTag<Block> SOLID_HARDENED_BRICKS = forgeTag("hardened_blocks/solid_hardened_bricks");
		public static final INamedTag<Block> SOLID_RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_raw_blastproof_walls");
		public static final INamedTag<Block> SOLID_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_blastproof_walls");
		public static final INamedTag<Block> SOLID_CARBON_PLATED_WALLS = forgeTag("hardened_blocks/solid_carbon_plated_walls");
		public static final INamedTag<Block> SOLID_CONCRETES = forgeTag("hardened_blocks/solid_concretes");

		private static void init() {

		}

		private static INamedTag<Block> forgeTag(String name) {
			return BlockTags.createOptional(Voltaic.forgerl(name));
		}

	}

	public static class Fluids {

		public static final INamedTag<Fluid> CONCRETE = forgeTag("concrete");

		private static void init() {

		}

		private static INamedTag<Fluid> forgeTag(String name) {
			return FluidTags.createOptional(Voltaic.forgerl(name));
		}

	}

}
