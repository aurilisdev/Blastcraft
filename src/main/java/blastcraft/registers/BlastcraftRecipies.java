package blastcraft.registers;

import blastcraft.Blastcraft;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import voltaic.common.recipe.VoltaicRecipeType;
import voltaic.common.recipe.categories.item2item.Item2ItemRecipeSerializer;

public class BlastcraftRecipies {

	public static DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Blastcraft.ID);

	/* RECIPE TYPES */

	// ITEM2ITEM
	public static final IRecipeType<BlastCompressorRecipe> BLAST_COMPRESSOR_TYPE = registerType(BlastCompressorRecipe.RECIPE_ID, new VoltaicRecipeType<>());

	/* RECIPE SERIALIZERS */

	// O2O
	public static final RegistryObject<IRecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER.register(BlastCompressorRecipe.RECIPE_GROUP, () -> new Item2ItemRecipeSerializer<>(BlastCompressorRecipe::new));
	
	private static <T extends IRecipeType<?>> T registerType(ResourceLocation recipeTypeId, VoltaicRecipeType<?> type) {
		return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, type);
	}
	
	public static void init() {
		
	}
}
