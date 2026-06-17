package blastcraft.datagen.server.recipe.vanilla;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.crafting.Ingredient;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;
import voltaic.datagen.utils.server.recipe.SingleItemRecipeBuilder;

public class BlastcraftStonecuttingRecipes extends AbstractRecipeGenerator {

    @Override
    public void addRecipes(RecipeOutput output) {

	/* HARDENED BRICKS */

	// BASE

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base), 1)
		.complete(Blastcraft.ID, "stonecutting_base_hardenedbricks").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_base_hardenedbricks_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_base_hardenedbricks_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_base_hardenedbricks_slab").save(output);

	// BIG

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big), 1)
		.complete(Blastcraft.ID, "stonecutting_big_hardenedbricks").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_big_hardenedbricks_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_big_hardenedbricks_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_big_hardenedbricks_slab").save(output);

	// SMOOTH

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_hardenedbricks_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_hardenedbricks_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_smooth_hardenedbricks_slab").save(output);

	// POLISHED

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_hardenedbricks").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_hardenedbricks_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_hardenedbricks_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS),
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_polished_hardenedbricks_slab").save(output);

	/* RAW BLASTPROOF WALL */

	// BASE

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base), 1)
		.complete(Blastcraft.ID, "stonecutting_base_rawblastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_base_rawblastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_base_rawblastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_base_rawblastproofwall_slab").save(output);

	// BIG

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big), 1)
		.complete(Blastcraft.ID, "stonecutting_big_rawblastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_big_rawblastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_big_rawblastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_big_rawblastproofwall_slab").save(output);

	// SMOOTH

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_rawblastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_rawblastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_smooth_rawblastproofwall_slab").save(output);

	// POLISHED

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_rawblastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_rawblastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_rawblastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_polished_rawblastproofwall_slab").save(output);

	/* BLASTPROOF WALL */

	// BASE

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base), 1)
		.complete(Blastcraft.ID, "stonecutting_base_blastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_base_blastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_base_blastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_base_blastproofwall_slab").save(output);

	// BIG

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big), 1)
		.complete(Blastcraft.ID, "stonecutting_big_blastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_big_blastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_big_blastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_big_blastproofwall_slab").save(output);

	// SMOOTH

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_blastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_blastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_smooth_blastproofwall_slab").save(output);

	// POLISHED

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_blastproofwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_blastproofwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_blastproofwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS),
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_polished_blastproofwall_slab").save(output);

	/* CARBON PLATED WALL */

	// BASE

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base), 1)
		.complete(Blastcraft.ID, "stonecutting_base_carbonplatedwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_base_carbonplatedwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_base_carbonplatedwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_base_carbonplatedwall_slab").save(output);

	// BIG

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big), 1)
		.complete(Blastcraft.ID, "stonecutting_big_carbonplatedwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_big_carbonplatedwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_big_carbonplatedwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_big_carbonplatedwall_slab").save(output);

	// SMOOTH

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_carbonplatedwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_smooth_carbonplatedwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_smooth_carbonplatedwall_slab").save(output);

	// POLISHED

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_carbonplatedwall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_carbonplatedwall_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_polished_carbonplatedwall_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS),
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_polished_carbonplatedwall_slab").save(output);

	/* CONCRETE */

	// REGULAR

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_regular").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_regular_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_regular_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_concrete_regular_slab").save(output);

	// BRICKS

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_bricks").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_bricks_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_bricks_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_concrete_bricks_slab").save(output);

	// TILE

	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_tile").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_stairs), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_tile_stairs").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_wall), 1)
		.complete(Blastcraft.ID, "stonecutting_concrete_tile_wall").save(output);
	SingleItemRecipeBuilder
		.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES),
			BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile_slab), 2)
		.complete(Blastcraft.ID, "stonecutting_concrete_tile_slab").save(output);

    }

}
