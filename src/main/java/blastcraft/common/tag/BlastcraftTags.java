package blastcraft.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlastcraftTags {

	public static void init() {
		Items.init();
		Blocks.init();
	}

	public static class Items {

		public static final TagKey<Item> HARDENED_BRICKS = forgeTag("hardened_blocks/hardened_bricks");
		public static final TagKey<Item> RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/raw_blastproof_walls");
		public static final TagKey<Item> BLASTPROOF_WALLS = forgeTag("hardened_blocks/blastproof_walls");
		public static final TagKey<Item> CARBON_PLATED_WALLS = forgeTag("hardened_blocks/carbon_plated_walls");

		private static void init() {

		}

		private static TagKey<Item> forgeTag(String name) {
			return ItemTags.create(new ResourceLocation("forge", name));
		}

	}

	public static class Blocks {

		public static final TagKey<Block> HARDENED_BRICKS = forgeTag("hardened_blocks/hardened_bricks");
		public static final TagKey<Block> RAW_BLASTPROOF_WALLS = forgeTag("hardened_blocks/raw_blastproof_walls");
		public static final TagKey<Block> BLASTPROOF_WALLS = forgeTag("hardened_blocks/blastproof_walls");
		public static final TagKey<Block> CARBON_PLATED_WALLS = forgeTag("hardened_blocks/carbon_plated_walls");

		private static void init() {

		}

		private static TagKey<Block> forgeTag(String name) {
			return BlockTags.create(new ResourceLocation("forge", name));
		}

	}

}