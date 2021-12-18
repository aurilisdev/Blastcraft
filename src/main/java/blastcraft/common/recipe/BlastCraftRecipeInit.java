package blastcraft.common.recipe;

import blastcraft.common.recipe.categories.item2item.Item2ItemRecipeTypes;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.ElectrodynamicsRecipeInit;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastCraftRecipeInit {

	public static DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS,
			blastcraft.References.ID);

	/* RECIPE TYPES */

	// ITEM2ITEM
	public static final RecipeType<BlastCompressorRecipe> BLAST_COMPRESSOR_TYPE = ElectrodynamicsRecipeInit
			.registerType(BlastCompressorRecipe.RECIPE_ID);

	/* RECIPE SERIALIZERS */

	// O2O
	public static final RegistryObject<RecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER
			.register(BlastCompressorRecipe.RECIPE_GROUP, () -> Item2ItemRecipeTypes.BLAST_COMPRESSOR_JSON_SERIALIZER);
}
