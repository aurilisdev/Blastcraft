package blastcraft.common.recipe.categories.item2item.specificmachines;

import java.util.List;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftRecipies;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import voltaic.common.recipe.categories.item2item.Item2ItemRecipe;
import voltaic.common.recipe.recipeutils.CountableIngredient;
import voltaic.common.recipe.recipeutils.ProbableFluid;
import voltaic.common.recipe.recipeutils.ProbableItem;

public class BlastCompressorRecipe extends Item2ItemRecipe {

	public static final String RECIPE_GROUP = "blast_compressor_recipe";
	public static final ResourceLocation RECIPE_ID = Blastcraft.rl(RECIPE_GROUP);

	public BlastCompressorRecipe(ResourceLocation id, List<CountableIngredient> inputs, ItemStack output, double experience, int ticks, double usagePerTick, List<ProbableItem> itemBiproducts, List<ProbableFluid> fluidBiproducts) {
		super(id, inputs, output, experience, ticks, usagePerTick, itemBiproducts, fluidBiproducts);
	}

	@Override
	public IRecipeSerializer<?> getSerializer() {
		return BlastcraftRecipies.BLAST_COMPRESSOR_SERIALIZER.get();
	}

	@Override
	public IRecipeType<?> getType() {
		return BlastcraftRecipies.BLAST_COMPRESSOR_TYPE;
	}

}
