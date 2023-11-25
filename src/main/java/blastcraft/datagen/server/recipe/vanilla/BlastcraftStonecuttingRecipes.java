package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsSingleItemRecipeBuilder;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.crafting.Ingredient;

public class BlastcraftStonecuttingRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.HARDENED_BRICKS), BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem(), 1).complete(References.ID, "stonecutting_base_hardenedbricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.HARDENED_BRICKS), BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.big).asItem(), 1).complete(References.ID, "stonecutting_big_hardenedbricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.smooth)), BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.polished).asItem(), 1).complete(References.ID, "stonecutting_polished_hardenedbricks", consumer);

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.RAW_BLASTPROOF_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem(), 1).complete(References.ID, "stonecutting_base_rawblastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.RAW_BLASTPROOF_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.big).asItem(), 1).complete(References.ID, "stonecutting_big_rawblastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.smooth)), BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.polished).asItem(), 1).complete(References.ID, "stonecutting_polished_rawblastproofwall", consumer);

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.BLASTPROOF_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base).asItem(), 1).complete(References.ID, "stonecutting_base_blastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.BLASTPROOF_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.big).asItem(), 1).complete(References.ID, "stonecutting_big_blastproofwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.smooth)), BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.polished).asItem(), 1).complete(References.ID, "stonecutting_polished_blastproofwall", consumer);

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.CARBON_PLATED_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem(), 1).complete(References.ID, "stonecutting_base_carbonplatedwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.CARBON_PLATED_WALLS), BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.big).asItem(), 1).complete(References.ID, "stonecutting_big_carbonplatedwall", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.smooth)), BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.polished).asItem(), 1).complete(References.ID, "stonecutting_polished_carbonplatedwall", consumer);

		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.CONCRETES), BlastcraftBlocks.getBlock(SubtypeConcrete.regular).asItem(), 1).complete(References.ID, "stonecutting_concrete_regular", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.CONCRETES), BlastcraftBlocks.getBlock(SubtypeConcrete.bricks).asItem(), 1).complete(References.ID, "stonecutting_concrete_bricks", consumer);
		ElectrodynamicsSingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.of(BlastcraftTags.Items.CONCRETES), BlastcraftBlocks.getBlock(SubtypeConcrete.tile).asItem(), 1).complete(References.ID, "stonecutting_concrete_tile", consumer);

	}

}
