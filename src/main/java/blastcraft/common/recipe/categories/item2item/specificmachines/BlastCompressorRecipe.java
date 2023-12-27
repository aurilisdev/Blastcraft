package blastcraft.common.recipe.categories.item2item.specificmachines;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import electrodynamics.common.recipe.categories.item2item.Item2ItemRecipe;
import electrodynamics.common.recipe.recipeutils.CountableIngredient;
import electrodynamics.common.recipe.recipeutils.ProbableFluid;
import electrodynamics.common.recipe.recipeutils.ProbableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;

public class BlastCompressorRecipe extends Item2ItemRecipe {

	public static final String RECIPE_GROUP = "blast_compressor_recipe";
	public static final String MOD_ID = blastcraft.References.ID;
	public static final ResourceLocation RECIPE_ID = new ResourceLocation(MOD_ID, RECIPE_GROUP);

	public BlastCompressorRecipe(ResourceLocation id, CountableIngredient[] inputs, ItemStack output, double experience, int ticks, double usagePerTick, ProbableItem[] itemBiproducts, ProbableFluid[] fluidBiproudcts) {
		super(id, inputs, output, experience, ticks, usagePerTick, itemBiproducts, fluidBiproudcts);
	}

	@Override
	public IRecipeSerializer<?> getSerializer() {
		return BlastCraftRecipeInit.BLAST_COMPRESSOR_SERIALIZER.get();
	}

	@Override
	public IRecipeType<?> getType() {
		return BlastCraftRecipeInit.BLAST_COMPRESSOR_TYPE;
	}

}
