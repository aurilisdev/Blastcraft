package blastcraft.datagen.server.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import blastcraft.datagen.server.recipe.custom.item2item.BlastcraftBlastCompressorRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftCraftingTableRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftSmeltingRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftStonecuttingRecipes;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

public class BlastcraftRecipeProvider extends RecipeProvider {

	public final List<AbstractRecipeGenerator> GENERATORS = new ArrayList<>();

	public BlastcraftRecipeProvider(DataGenerator gen) {
		super(gen);
		addRecipes();
	}

	public void addRecipes() {
		GENERATORS.add(new BlastcraftCraftingTableRecipes());
		GENERATORS.add(new BlastcraftSmeltingRecipes());
		GENERATORS.add(new BlastcraftStonecuttingRecipes());
		GENERATORS.add(new BlastcraftBlastCompressorRecipes());
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		for (AbstractRecipeGenerator generator : GENERATORS) {
			generator.addRecipes(consumer);
		}
	}

}
