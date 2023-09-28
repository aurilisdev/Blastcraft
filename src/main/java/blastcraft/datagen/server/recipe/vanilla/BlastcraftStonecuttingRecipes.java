package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsSingleItemRecipeBuilder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.crafting.Ingredient;

public class BlastcraftStonecuttingRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		/* HARDENED BRICKS */

		// BASE

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.base), 1).complete(References.ID, "stonecutting_base_hardenedbricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.base_stairs), 1).complete(References.ID, "stonecutting_base_hardenedbricks_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.base_wall), 1).complete(References.ID, "stonecutting_base_hardenedbricks_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.base_slab), 2).complete(References.ID, "stonecutting_base_hardenedbricks_slab", consumer);

		// BIG

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.big), 1).complete(References.ID, "stonecutting_big_hardenedbricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.big_stairs), 1).complete(References.ID, "stonecutting_big_hardenedbricks_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.big_wall), 1).complete(References.ID, "stonecutting_big_hardenedbricks_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.big_slab), 2).complete(References.ID, "stonecutting_big_hardenedbricks_slab", consumer);

		// SMOOTH

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_stairs), 1).complete(References.ID, "stonecutting_smooth_hardenedbricks_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_wall), 1).complete(References.ID, "stonecutting_smooth_hardenedbricks_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_slab), 2).complete(References.ID, "stonecutting_smooth_hardenedbricks_slab", consumer);

		// POLISHED

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.polished), 1).complete(References.ID, "stonecutting_polished_hardenedbricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.polished_stairs), 1).complete(References.ID, "stonecutting_polished_hardenedbricks_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.polished_wall), 1).complete(References.ID, "stonecutting_polished_hardenedbricks_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS), BlastcraftItems.getItem(SubtypeHardenedBricks.polished_slab), 2).complete(References.ID, "stonecutting_polished_hardenedbricks_slab", consumer);

		/* RAW BLASTPROOF WALL */

		// BASE

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 1).complete(References.ID, "stonecutting_base_rawblastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_stairs), 1).complete(References.ID, "stonecutting_base_rawblastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_wall), 1).complete(References.ID, "stonecutting_base_rawblastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_slab), 2).complete(References.ID, "stonecutting_base_rawblastproofwall_slab", consumer);

		// BIG

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), 1).complete(References.ID, "stonecutting_big_rawblastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_stairs), 1).complete(References.ID, "stonecutting_big_rawblastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_wall), 1).complete(References.ID, "stonecutting_big_rawblastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_slab), 2).complete(References.ID, "stonecutting_big_rawblastproofwall_slab", consumer);

		// SMOOTH

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_stairs), 1).complete(References.ID, "stonecutting_smooth_rawblastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_wall), 1).complete(References.ID, "stonecutting_smooth_rawblastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_slab), 2).complete(References.ID, "stonecutting_smooth_rawblastproofwall_slab", consumer);

		// POLISHED

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), 1).complete(References.ID, "stonecutting_polished_rawblastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_stairs), 1).complete(References.ID, "stonecutting_polished_rawblastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_wall), 1).complete(References.ID, "stonecutting_polished_rawblastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_slab), 2).complete(References.ID, "stonecutting_polished_rawblastproofwall_slab", consumer);

		/* BLASTPROOF WALL */

		// BASE

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.base), 1).complete(References.ID, "stonecutting_base_blastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.base_stairs), 1).complete(References.ID, "stonecutting_base_blastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.base_wall), 1).complete(References.ID, "stonecutting_base_blastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.base_slab), 2).complete(References.ID, "stonecutting_base_blastproofwall_slab", consumer);

		// BIG

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.big), 1).complete(References.ID, "stonecutting_big_blastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.big_stairs), 1).complete(References.ID, "stonecutting_big_blastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.big_wall), 1).complete(References.ID, "stonecutting_big_blastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.big_slab), 2).complete(References.ID, "stonecutting_big_blastproofwall_slab", consumer);

		// SMOOTH

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_stairs), 1).complete(References.ID, "stonecutting_smooth_blastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_wall), 1).complete(References.ID, "stonecutting_smooth_blastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_slab), 2).complete(References.ID, "stonecutting_smooth_blastproofwall_slab", consumer);

		// POLISHED

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.polished), 1).complete(References.ID, "stonecutting_polished_blastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.polished_stairs), 1).complete(References.ID, "stonecutting_polished_blastproofwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.polished_wall), 1).complete(References.ID, "stonecutting_polished_blastproofwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS), BlastcraftItems.getItem(SubtypeBlastproofWall.polished_slab), 2).complete(References.ID, "stonecutting_polished_blastproofwall_slab", consumer);

		/* CARBON PLATED WALL */

		// BASE

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 1).complete(References.ID, "stonecutting_base_carbonplatedwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_stairs), 1).complete(References.ID, "stonecutting_base_carbonplatedwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_wall), 1).complete(References.ID, "stonecutting_base_carbonplatedwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_slab), 2).complete(References.ID, "stonecutting_base_carbonplatedwall_slab", consumer);

		// BIG

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), 1).complete(References.ID, "stonecutting_big_carbonplatedwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_stairs), 1).complete(References.ID, "stonecutting_big_carbonplatedwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_wall), 1).complete(References.ID, "stonecutting_big_carbonplatedwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_slab), 2).complete(References.ID, "stonecutting_big_carbonplatedwall_slab", consumer);

		// SMOOTH

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_stairs), 1).complete(References.ID, "stonecutting_smooth_carbonplatedwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_wall), 1).complete(References.ID, "stonecutting_smooth_carbonplatedwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_slab), 2).complete(References.ID, "stonecutting_smooth_carbonplatedwall_slab", consumer);

		// POLISHED

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), 1).complete(References.ID, "stonecutting_polished_carbonplatedwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_stairs), 1).complete(References.ID, "stonecutting_polished_carbonplatedwall_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_wall), 1).complete(References.ID, "stonecutting_polished_carbonplatedwall_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_slab), 2).complete(References.ID, "stonecutting_polished_carbonplatedwall_slab", consumer);

		/* CONCRETE */

		// REGULAR

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.regular), 1).complete(References.ID, "stonecutting_concrete_regular", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.regular_stairs), 1).complete(References.ID, "stonecutting_concrete_regular_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.regular_wall), 1).complete(References.ID, "stonecutting_concrete_regular_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.regular_slab), 2).complete(References.ID, "stonecutting_concrete_regular_slab", consumer);

		// BRICKS

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.bricks), 1).complete(References.ID, "stonecutting_concrete_bricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.bricks_stairs), 1).complete(References.ID, "stonecutting_concrete_bricks_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.bricks_wall), 1).complete(References.ID, "stonecutting_concrete_bricks_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.bricks_slab), 2).complete(References.ID, "stonecutting_concrete_bricks_slab", consumer);

		// TILE

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.tile), 1).complete(References.ID, "stonecutting_concrete_tile", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.tile_stairs), 1).complete(References.ID, "stonecutting_concrete_tile_stairs", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.tile_wall), 1).complete(References.ID, "stonecutting_concrete_tile_wall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.SOLID_CONCRETES), BlastcraftItems.getItem(SubtypeConcrete.tile_slab), 2).complete(References.ID, "stonecutting_concrete_tile_slab", consumer);

	}

}
