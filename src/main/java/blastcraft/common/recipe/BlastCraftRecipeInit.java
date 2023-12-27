package blastcraft.common.recipe;

import blastcraft.common.recipe.categories.item2item.Item2ItemRecipeTypes;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.ElectrodynamicsRecipeInit;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastCraftRecipeInit {

	public static DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, blastcraft.References.ID);

	/* RECIPE TYPES */

	// ITEM2ITEM
	public static final IRecipeType<BlastCompressorRecipe> BLAST_COMPRESSOR_TYPE = ElectrodynamicsRecipeInit.registerType(BlastCompressorRecipe.RECIPE_ID);

	/* RECIPE SERIALIZERS */

	// O2O
	public static final RegistryObject<IRecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER.register(BlastCompressorRecipe.RECIPE_GROUP, () -> Item2ItemRecipeTypes.BLAST_COMPRESSOR_JSON_SERIALIZER);
}
