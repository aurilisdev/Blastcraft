package blastcraft.common.recipe.categories.item2item.specificmachines;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import electrodynamics.common.recipe.categories.item2item.Item2ItemRecipe;
import electrodynamics.common.recipe.recipeutils.CountableIngredient;
import electrodynamics.common.recipe.recipeutils.ProbableItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class BlastCompressorRecipe extends Item2ItemRecipe {

	public static final String RECIPE_GROUP = "blast_compressor_recipe";
	public static final String MOD_ID = blastcraft.References.ID;
	public static final ResourceLocation RECIPE_ID = new ResourceLocation(MOD_ID, RECIPE_GROUP);

	public BlastCompressorRecipe(ResourceLocation id, CountableIngredient[] inputs, ItemStack output) {
		super(id, inputs, output);
	}
	
	public BlastCompressorRecipe(ResourceLocation id, CountableIngredient[] input, ItemStack output, ProbableItem[] itemBiproducts) {
    	super(id, input, output, itemBiproducts);
    }

	@Override
	public RecipeSerializer<?> getSerializer() {
		return BlastCraftRecipeInit.BLAST_COMPRESSOR_SERIALIZER.get();
	}

	@Override
	public RecipeType<?> getType() {
		return Registry.RECIPE_TYPE.get(RECIPE_ID);
	}

}
