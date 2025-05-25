package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.NotCondition;
import voltaic.common.tags.VoltaicTags;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;
import voltaic.datagen.utils.server.recipe.CustomShapedCraftingRecipe;
import voltaic.datagen.utils.server.recipe.CustomShapelessCraftingRecipe;

public class BlastcraftCraftingTableRecipes extends AbstractRecipeGenerator {

	private static final ModLoadedCondition ELECTRO_LOADED = new ModLoadedCondition("electrodynamics");
	private static final NotCondition ELECTRO_NOT_LOADED = new NotCondition(ELECTRO_LOADED);

	@Override
	public void addRecipes(Consumer<FinishedRecipe> output) {

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_CAMOFLAGE.get(), 12)
				//
				.addPattern("WGW")
				//
				.addPattern("GWG")
				//
				.addPattern("WGW")
				//
				.addKey('W', ItemTags.WOOL)
				//
				.addKey('G', Tags.Items.GLASS)
				//
				.complete(Blastcraft.ID, "camoflage", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_GLASSPRESSUREPLATE.get(), 1)
				//
				.addPattern("GG")
				//
				.addKey('G', Tags.Items.GLASS)
				//
				.complete(Blastcraft.ID, "glass_pressureplate", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_SPIKE.get(), 6)
				//
				.addPattern("CGC")
				//
				.addPattern("PPP")
				//
				.addKey('C', Items.CACTUS)
				//
				.addKey('G', Items.GRASS)
				//
				.addKey('P', VoltaicTags.Items.PLATE_BRONZE)
				//
				.addConditions(ELECTRO_LOADED)
				//
				.complete(Blastcraft.ID, "spikes_regular_electro", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_SPIKE.get(), 6)
				//
				.addPattern("CGC")
				//
				.addPattern("PPP")
				//
				.addKey('C', Items.CACTUS)
				//
				.addKey('G', Items.GRASS)
				//
				.addKey('P', Tags.Items.INGOTS_COPPER)
				//
				.addConditions(ELECTRO_NOT_LOADED)
				//
				.complete(Blastcraft.ID, "spikes_regular_noelectro", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEM_FIRESPIKE.get(), 1)
				//
				.addIngredient(BlastcraftItems.ITEM_SPIKE.get())
				//
				.addIngredient(Items.FIRE_CHARGE)
				//
				.complete(Blastcraft.ID, "spikes_fire", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEM_POISONSPIKE.get(), 1)
				//
				.addIngredient(BlastcraftItems.ITEM_SPIKE.get())
				//
				.addIngredient(Items.SPIDER_EYE)
				//
				.addConditions(new NotCondition(new ModLoadedCondition(Blastcraft.BALLISTIX_ID)))
				//
				.complete(Blastcraft.ID, "spikes_poison_spidereye", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEM_POISONSPIKE.get(), 1)
				//
				.addIngredient(BlastcraftItems.ITEM_SPIKE.get())
				//
				.addIngredient(BlastcraftTags.Items.DUST_POISON)
				//
				.addConditions(new ModLoadedCondition(Blastcraft.BALLISTIX_ID))
				//
				.complete(Blastcraft.ID, "spikes_poison_poisondust", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_CONCRETEMIX.get(), 4)
				//
				.addPattern("SGS")
				//
				.addPattern("GMG")
				//
				.addPattern("SGS")
				//
				.addKey('S', ItemTags.SAND)
				//
				.addKey('G', Tags.Items.GRAVEL)
				//
				.addKey('M', VoltaicTags.Items.SLAG)
				//
				.addConditions(ELECTRO_LOADED)
				//
				.complete(Blastcraft.ID, "concretemix_slag_electro", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_CONCRETEMIX.get(), 4)
				//
				.addPattern("SGS")
				//
				.addPattern("GMG")
				//
				.addPattern("SGS")
				//
				.addKey('S', ItemTags.SAND)
				//
				.addKey('G', Tags.Items.GRAVEL)
				//
				.addKey('M', Tags.Items.NUGGETS_IRON)
				//
				.addConditions(ELECTRO_NOT_LOADED)
				//
				.complete(Blastcraft.ID, "concretemix_ironnug_noelectro", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_CONCRETEMIX.get(), 10)
				//
				.addPattern("SGS")
				//
				.addPattern("GMG")
				//
				.addPattern("SGS")
				//
				.addKey('S', ItemTags.SAND)
				//
				.addKey('G', Tags.Items.GRAVEL)
				//
				.addKey('M', VoltaicTags.Items.DUST_NETHERITE)
				//
				.addConditions(ELECTRO_LOADED)
				//
				.complete(Blastcraft.ID, "concretemix_netherite_electro", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.ITEM_CONCRETEMIX.get())
				//
				.addIngredient(Items.WATER_BUCKET)
				//
				.addConditions(ELECTRO_NOT_LOADED)
				//
				.complete(Blastcraft.ID, "concrete_regular_noelectro", output);

		addMachines(output);

		addHardenedBricks(output);

		addRawBlastproofWalls(output);

		addBlastproofWalls(output);

		addCarbonPlatedWalls(output);

		addConcrete(output);

		// GLASS BRICKS

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_WALLINGGLASS.getValue(SubtypeWallingGlass.blastproofwalling), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.complete(Blastcraft.ID, "glass_blastproofwalling", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_WALLINGGLASS.getValue(SubtypeWallingGlass.rawblastproofwalling), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS)
				//
				.complete(Blastcraft.ID, "glass_rawblastproofwalling", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_WALLINGGLASS.getValue(SubtypeWallingGlass.carbonplatedwalling), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS)
				//
				.complete(Blastcraft.ID, "glass_carbonplatedwalling", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_WALLINGGLASS.getValue(SubtypeWallingGlass.hardenedbricks), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.complete(Blastcraft.ID, "glass_hardenedbricks", output);

	}

	private static void addMachines(Consumer<FinishedRecipe> output) {

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_BLASTCOMPRESSOR.get(), 1)
				//
				.addPattern("SFS")
				//
				.addPattern("PCP")
				//
				.addPattern("SSS")
				//
				.addKey('S', VoltaicTags.Items.PLATE_STEEL)
				//
				.addKey('F', Items.FURNACE)
				//
				.addKey('P', Items.PISTON)
				//
				.addKey('C', VoltaicTags.Items.CIRCUITS_ADVANCED)
				//
				.addConditions(ELECTRO_LOADED)
				//
				.complete(Blastcraft.ID, "blastcompressor_electro", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEM_BLASTCOMPRESSOR.get(), 1)
				//
				.addPattern("SFS")
				//
				.addPattern("PCP")
				//
				.addPattern("SSS")
				//
				.addKey('S', Tags.Items.INGOTS_IRON)
				//
				.addKey('F', Items.FURNACE)
				//
				.addKey('P', Items.PISTON)
				//
				.addKey('C', Tags.Items.INGOTS_GOLD)
				//
				.addConditions(ELECTRO_NOT_LOADED)
				//
				.complete(Blastcraft.ID, "blastcompressor_noelectro", output);

	}

	private static void addHardenedBricks(Consumer<FinishedRecipe> output) {

		// BASE BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 6)
				//
				.addPattern("OBO")
				//
				.addPattern("OBO")
				//
				.addPattern("OBO")
				//
				.addKey('O', Tags.Items.OBSIDIAN)
				//
				.addKey('B', Items.BRICKS)
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_obsidian", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 6)
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addKey('C', BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.addKey('B', Items.BRICKS)
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_concrete", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_stairs))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_wall))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_slab))
				//
				.complete(Blastcraft.ID, "base_hardenedbricks_slabreset", output);

		// BIG BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base)))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_stairs))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_wall))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_slab))
				//
				.complete(Blastcraft.ID, "big_hardenedbricks_slabreset", output);

		// SMOOTH

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_stairs))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_wall))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_slab))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_slabreset", output);

		// POLISHED BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth)))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_stairs))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_wall))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_slab))
				//
				.complete(Blastcraft.ID, "polished_hardenedbricks_slabreset", output);

		// RESET BRICKS

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.complete(Blastcraft.ID, "reset_hardenedbricks", output);

	}

	private static void addRawBlastproofWalls(Consumer<FinishedRecipe> output) {

		// BASE BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 3)
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addKey('H', BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.addKey('O', Tags.Items.OBSIDIAN)
				//
				.complete(Blastcraft.ID, "base_rawblastproofwalling_obsidian", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 3)
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addKey('H', BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.addKey('C', BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.complete(Blastcraft.ID, "base_rawblastproofwalling_concrete", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_stairs))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_wall))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_slab))
				//
				.complete(Blastcraft.ID, "base_rawblastproofwall_slabreset", output);

		// BIG BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base)))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_stairs))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_wall))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_slab))
				//
				.complete(Blastcraft.ID, "big_rawblastproofwall_slabreset", output);

		// SMOOTH

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_stairs))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_wall))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_slab))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwall_slabreset", output);

		// POLISHED BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth)))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_stairs))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_wall))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_slab))
				//
				.complete(Blastcraft.ID, "polished_rawblastproofwall_slabreset", output);

		// RESET BRICKS

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS)
				//
				.complete(Blastcraft.ID, "reset_rawblastproofwalling", output);

	}

	private static void addBlastproofWalls(Consumer<FinishedRecipe> output) {

		// BASE BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_stairs))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_wall))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_slab))
				//
				.complete(Blastcraft.ID, "base_blastproofwall_slabreset", output);

		// BIG BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base)))
				//
				.complete(Blastcraft.ID, "big_blastproofwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_stairs))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_wall))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_slab))
				//
				.complete(Blastcraft.ID, "big_blastproofwall_slabreset", output);

		// SMOOTH

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_stairs))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_wall))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_slab))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwall_slabreset", output);

		// POLISHED BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth)))
				//
				.complete(Blastcraft.ID, "polished_blastproofwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_stairs))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_wall))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_slab))
				//
				.complete(Blastcraft.ID, "polished_blastproofwall_slabreset", output);

		// RESET BRICKS

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.complete(Blastcraft.ID, "reset_blastproofwalling", output);

	}

	private static void addCarbonPlatedWalls(Consumer<FinishedRecipe> output) {

		// BASE BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 3)
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addKey('W', BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.addKey('C', ItemTags.COALS)
				//
				.complete(Blastcraft.ID, "base_carbonplatedwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_stairs))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_wall))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_slab))
				//
				.complete(Blastcraft.ID, "base_carbonplatedwall_slabreset", output);

		// BIG BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base)))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_stairs))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_wall))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_slab))
				//
				.complete(Blastcraft.ID, "big_carbonplatedwall_slabreset", output);

		// SMOOTH

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_stairs))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_wall))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_slab))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwall_slabreset", output);

		// POLISHED BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth)))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwalling", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_stairs))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_wall))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_slab))
				//
				.complete(Blastcraft.ID, "polished_carbonplatedwall_slabreset", output);

		// RESET BRICKS

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS)
				//
				.complete(Blastcraft.ID, "reset_carbonplatedwalling", output);
	}

	private static void addConcrete(Consumer<FinishedRecipe> output) {

		// REGULAR

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular))
				//
				.complete(Blastcraft.ID, "regular_concrete_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_stairs))
				//
				.complete(Blastcraft.ID, "regular_concrete_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular))
				//
				.complete(Blastcraft.ID, "regular_concrete_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_wall))
				//
				.complete(Blastcraft.ID, "regular_concrete_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular))
				//
				.complete(Blastcraft.ID, "regular_concrete_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_slab))
				//
				.complete(Blastcraft.ID, "regular_concrete_slabreset", output);

		// BRICKS

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks), 4)
				//
				.addPattern("CC")
				//
				.addPattern("CC")
				//
				.addKey('C', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular))
				//
				.complete(Blastcraft.ID, "bricks_concrete", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks))
				//
				.complete(Blastcraft.ID, "bricks_concrete_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_stairs))
				//
				.complete(Blastcraft.ID, "bricks_concrete_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks))
				//
				.complete(Blastcraft.ID, "bricks_concrete_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_wall))
				//
				.complete(Blastcraft.ID, "bricks_concrete_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks))
				//
				.complete(Blastcraft.ID, "bricks_concrete_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_slab))
				//
				.complete(Blastcraft.ID, "bricks_concrete_slabreset", output);

		// TILE

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile), 4)
				//
				.addPattern("CC")
				//
				.addPattern("CC")
				//
				.addKey('C', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks))
				//
				.complete(Blastcraft.ID, "tile_concrete", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile))
				//
				.complete(Blastcraft.ID, "tile_concrete_stairs", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_stairs))
				//
				.complete(Blastcraft.ID, "tile_concrete_stairsreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile))
				//
				.complete(Blastcraft.ID, "tile_concrete_wall", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_wall))
				//
				.complete(Blastcraft.ID, "tile_concrete_wallreset", output);

		CustomShapedCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile))
				//
				.complete(Blastcraft.ID, "tile_concrete_slab", output);

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_slab))
				//
				.addIngredient(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_slab))
				//
				.complete(Blastcraft.ID, "tile_concrete_slabreset", output);

		// RESET

		CustomShapelessCraftingRecipe.start(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.complete(Blastcraft.ID, "reset_concrete", output);
	}

}
