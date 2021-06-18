package blastcraft.common.recipe;

import blastcraft.common.recipe.categories.o2o.O2ORecipeTypes;
import electrodynamics.common.recipe.ElectrodynamicsRecipeInit;
import blastcraft.common.recipe.categories.o2o.specificmachines.BlastCompressorRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastCraftRecipeInit {
	
	public static DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER = 
			DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS,blastcraft.References.ID);
	
	/*RECIPE TYPES*/
	
	//O2O
	public static final IRecipeType<BlastCompressorRecipe> BLAST_COMPRESSOR_TYPE = ElectrodynamicsRecipeInit.registerType(BlastCompressorRecipe.RECIPE_ID);
	
	
	/*RECIPE SERIALIZERS*/

	//O2O
	public static final RegistryObject<IRecipeSerializer<?>> WIRE_MILL_SERIALIZER =
			RECIPE_SERIALIZER.register(BlastCompressorRecipe.RECIPE_GROUP,() -> O2ORecipeTypes.BLAST_COMPRESSOR_JSON_SERIALIZER);
}
