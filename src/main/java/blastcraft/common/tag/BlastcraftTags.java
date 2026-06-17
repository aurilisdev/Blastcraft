package blastcraft.common.tag;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import voltaic.Voltaic;

public class BlastcraftTags {

    public static void init() {
	Items.init();
	Blocks.init();
	Fluids.init();
    }

    public static class Items {

	public static final TagKey<Item> DUST_POISON = forgeTag("dusts/poison");

	public static final TagKey<Item> SOLID_HARDENED_BRICKS = forgeTag("hardened_blocks/solid_hardened_bricks");
	public static final TagKey<Item> SOLID_RAW_BLASTPROOF_WALLS = forgeTag(
		"hardened_blocks/solid_raw_blastproof_walls");
	public static final TagKey<Item> SOLID_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_blastproof_walls");
	public static final TagKey<Item> SOLID_CARBON_PLATED_WALLS = forgeTag(
		"hardened_blocks/solid_carbon_plated_walls");
	public static final TagKey<Item> SOLID_CONCRETES = forgeTag("hardened_blocks/solid_concretes");

	public static final TagKey<Item> SMOOTH_SOLID_HARDENED_BRICKS = forgeTag(
		"hardened_blocks/smooth_solid_hardened_bricks");
	public static final TagKey<Item> SMOOTH_SOLID_RAW_BLASTPROOF_WALLS = forgeTag(
		"hardened_blocks/smooth_solid_raw_blastproof_walls");
	public static final TagKey<Item> SMOOTH_SOLID_BLASTPROOF_WALLS = forgeTag(
		"hardened_blocks/smooth_solid_blastproof_walls");
	public static final TagKey<Item> SMOOTH_SOLID_CARBON_PLATED_WALLS = forgeTag(
		"hardened_blocks/smooth_solid_carbon_plated_walls");

	private static void init() {

	}

	private static TagKey<Item> forgeTag(String name) {
	    return ItemTags.create(Voltaic.commonrl(name));
	}

    }

    public static class Blocks {

	public static final TagKey<Block> SOLID_HARDENED_BRICKS = forgeTag("hardened_blocks/solid_hardened_bricks");
	public static final TagKey<Block> SOLID_RAW_BLASTPROOF_WALLS = forgeTag(
		"hardened_blocks/solid_raw_blastproof_walls");
	public static final TagKey<Block> SOLID_BLASTPROOF_WALLS = forgeTag("hardened_blocks/solid_blastproof_walls");
	public static final TagKey<Block> SOLID_CARBON_PLATED_WALLS = forgeTag(
		"hardened_blocks/solid_carbon_plated_walls");
	public static final TagKey<Block> SOLID_CONCRETES = forgeTag("hardened_blocks/solid_concretes");

	private static void init() {

	}

	private static TagKey<Block> forgeTag(String name) {
	    return BlockTags.create(Voltaic.commonrl(name));
	}

    }

    public static class Fluids {

	public static final TagKey<Fluid> CONCRETE = forgeTag("concrete");

	private static void init() {

	}

	private static TagKey<Fluid> forgeTag(String name) {
	    return FluidTags.create(Voltaic.commonrl(name));
	}

    }

}
