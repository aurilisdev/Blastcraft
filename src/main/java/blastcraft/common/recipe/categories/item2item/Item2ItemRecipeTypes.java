package blastcraft.common.recipe.categories.item2item;

import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.categories.item2item.Item2ItemRecipeSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;

public class Item2ItemRecipeTypes {

	public static final IRecipeSerializer<BlastCompressorRecipe> BLAST_COMPRESSOR_JSON_SERIALIZER = new Item2ItemRecipeSerializer<>(BlastCompressorRecipe.class);
}
