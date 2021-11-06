package blastcraft.common.recipe.categories.o2o.specificmachines;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import electrodynamics.common.recipe.categories.o2o.O2ORecipe;
import electrodynamics.common.recipe.recipeutils.CountableIngredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BlastCompressorRecipe extends O2ORecipe {

    public static final String RECIPE_GROUP = "blast_compressor_recipe";
    public static final String MOD_ID = blastcraft.References.ID;
    public static final ResourceLocation RECIPE_ID = new ResourceLocation(MOD_ID, RECIPE_GROUP);

    public BlastCompressorRecipe(ResourceLocation id, CountableIngredient input, ItemStack output) {
	super(id, input, output);
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
