package blastcraft.registers;

import blastcraft.Blastcraft;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import voltaic.common.recipe.VoltaicRecipeType;
import voltaic.common.recipe.categories.item2item.Item2ItemRecipeSerializer;

public class BlastcraftRecipies {

	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Blastcraft.ID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registry.RECIPE_TYPE.key(), Blastcraft.ID);

	/* RECIPE TYPES */

	// ITEM2ITEM
	public static final RegistryObject<RecipeType<BlastCompressorRecipe>> BLAST_COMPRESSOR_TYPE = RECIPE_TYPES.register(BlastCompressorRecipe.RECIPE_GROUP, VoltaicRecipeType::new);

	/* RECIPE SERIALIZERS */

	// O2O
	public static final RegistryObject<RecipeSerializer<?>> BLAST_COMPRESSOR_SERIALIZER = RECIPE_SERIALIZER.register(BlastCompressorRecipe.RECIPE_GROUP, () -> new Item2ItemRecipeSerializer<>(BlastCompressorRecipe::new));
}
