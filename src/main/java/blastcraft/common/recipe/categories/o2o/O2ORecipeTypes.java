package blastcraft.common.recipe.categories.o2o;

import blastcraft.common.recipe.categories.o2o.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.categories.o2o.O2ORecipeSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;

public class O2ORecipeTypes {

    public static final IRecipeSerializer<BlastCompressorRecipe> BLAST_COMPRESSOR_JSON_SERIALIZER = new O2ORecipeSerializer<>(
	    BlastCompressorRecipe.class);
}