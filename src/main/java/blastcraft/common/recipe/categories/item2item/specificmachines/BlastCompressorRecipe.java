package blastcraft.common.recipe.categories.item2item.specificmachines;

import java.util.List;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftRecipies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import voltaic.common.recipe.categories.item2item.Item2ItemRecipe;
import voltaic.common.recipe.recipeutils.CountableIngredient;
import voltaic.common.recipe.recipeutils.ProbableFluid;
import voltaic.common.recipe.recipeutils.ProbableGas;
import voltaic.common.recipe.recipeutils.ProbableItem;

public class BlastCompressorRecipe extends Item2ItemRecipe {

    public static final String RECIPE_GROUP = "blast_compressor_recipe";
    public static final ResourceLocation RECIPE_ID = Blastcraft.rl(RECIPE_GROUP);

    public BlastCompressorRecipe(ResourceLocation id, List<CountableIngredient> inputs, ItemStack output,
	    double experience, int ticks, double usagePerTick, List<ProbableItem> itemBiproducts,
	    List<ProbableFluid> fluidBiproducts, List<ProbableGas> gasBiproducts) {
	super(id, inputs, output, experience, ticks, usagePerTick, itemBiproducts, fluidBiproducts, gasBiproducts);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
	return BlastcraftRecipies.BLAST_COMPRESSOR_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
	return BlastcraftRecipies.BLAST_COMPRESSOR_TYPE.get();
    }

}
