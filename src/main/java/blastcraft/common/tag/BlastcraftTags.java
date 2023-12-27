package blastcraft.common.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;

public class BlastcraftTags {

	public static void init() {
		Items.init();
		Blocks.init();
	}

	public static class Items {

		public static final IOptionalNamedTag<Item> HARDENED_BRICKS = forgeTag("hardened_blocks/hardened_bricks");
		public static final IOptionalNamedTag<Item> RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/raw_blastproof_walls");
		public static final IOptionalNamedTag<Item> BLASTPROOF_WALLS = forgeTag("hardened_blocks/blastproof_walls");
		public static final IOptionalNamedTag<Item> CARBON_PLATED_WALLS = forgeTag("hardened_blocks/carbon_plated_walls");

		private static void init() {

		}

		private static IOptionalNamedTag<Item> forgeTag(String name) {
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}

	}

	public static class Blocks {

		public static final IOptionalNamedTag<Block> HARDENED_BRICKS = forgeTag("hardened_blocks/hardened_bricks");
		public static final IOptionalNamedTag<Block> RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/raw_blastproof_walls");
		public static final IOptionalNamedTag<Block> BLASTPROOF_WALLS = forgeTag("hardened_blocks/blastproof_walls");
		public static final IOptionalNamedTag<Block> CARBON_PLATED_WALLS = forgeTag("hardened_blocks/carbon_plated_walls");

		private static void init() {

		}

		private static IOptionalNamedTag<Block> forgeTag(String name) {
			return BlockTags.createOptional(new ResourceLocation("forge", name));
		}

	}

}