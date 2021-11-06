package blastcraft.common.recipe.categories.o2o;

import blastcraft.common.recipe.categories.o2o.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.categories.o2o.O2ORecipeSerializer;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class O2ORecipeTypes {

    public static final RecipeSerializer<BlastCompressorRecipe> BLAST_COMPRESSOR_JSON_SERIALIZER = new O2ORecipeSerializer<>(
	    BlastCompressorRecipe.class);
}
