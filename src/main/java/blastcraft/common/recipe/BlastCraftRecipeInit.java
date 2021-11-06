package blastcraft.common.recipe;

import blastcraft.common.recipe.categories.o2o.O2ORecipeTypes;
import blastcraft.common.recipe.categories.o2o.specificmachines.BlastCompressorRecipe;
import electrodynamics.common.recipe.ElectrodynamicsRecipeInit;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastCraftRecipeInit {

    public static DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS,
	    blastcraft.References.ID);

    /* RECIPE TYPES */

    // O2O
    public static final RecipeType<BlastCompressorRecipe> BLAST_COMPRESSOR_TYPE = ElectrodynamicsRecipeInit
	    .registerType(BlastCompressorRecipe.RECIPE_ID);

    /* RECIPE SERIALIZERS */

    // O2O
    public static final RegistryObject<RecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER
	    .register(BlastCompressorRecipe.RECIPE_GROUP, () -> O2ORecipeTypes.BLAST_COMPRESSOR_JSON_SERIALIZER);
}
