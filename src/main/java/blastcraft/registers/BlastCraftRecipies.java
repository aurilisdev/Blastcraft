package blastcraft.registers;

import blastcraft.Blastcraft;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import voltaic.common.recipe.VoltaicRecipeType;
import voltaic.common.recipe.categories.item2item.Item2ItemRecipeSerializer;

public class BlastCraftRecipies {

	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(Registries.RECIPE_SERIALIZER, blastcraft.Blastcraft.ID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, Blastcraft.ID);

	/* RECIPE TYPES */

	// ITEM2ITEM
	public static final DeferredHolder<RecipeType<?>, RecipeType<BlastCompressorRecipe>> BLAST_COMPRESSOR_TYPE = RECIPE_TYPES.register(BlastCompressorRecipe.RECIPE_GROUP, VoltaicRecipeType::new);

	/* RECIPE SERIALIZERS */

	// O2O
	public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER.register(BlastCompressorRecipe.RECIPE_GROUP, () -> new Item2ItemRecipeSerializer<>(BlastCompressorRecipe::new));
}
