package blastcraft.common.recipe.categories.item2item.specificmachines;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import electrodynamics.common.recipe.categories.item2item.Item2ItemRecipe;
import electrodynamics.common.recipe.recipeutils.CountableIngredient;
import electrodynamics.common.recipe.recipeutils.ProbableFluid;
import electrodynamics.common.recipe.recipeutils.ProbableItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class BlastCompressorRecipe extends Item2ItemRecipe {

	public static final String RECIPE_GROUP = "blast_compressor_recipe";
	public static final String MOD_ID = blastcraft.References.ID;
	public static final ResourceLocation RECIPE_ID = new ResourceLocation(MOD_ID, RECIPE_GROUP);

	public BlastCompressorRecipe(ResourceLocation id, CountableIngredient[] inputs, ItemStack output, double experience, int ticks, double usagePerTick, ProbableItem[] itemBiproducts, ProbableFluid[] fluidBiproudcts) {
		super(id, inputs, output, experience, ticks, usagePerTick, itemBiproducts, fluidBiproudcts);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return BlastCraftRecipeInit.BLAST_COMPRESSOR_SERIALIZER.get();
	}

	@Override
	public RecipeType<?> getType() {
		return BlastCraftRecipeInit.BLAST_COMPRESSOR_TYPE.get();
	}

}
