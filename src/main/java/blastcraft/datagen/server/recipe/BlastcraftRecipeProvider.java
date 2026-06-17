package blastcraft.datagen.server.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import blastcraft.datagen.server.recipe.custom.fluid2item.BlastcraftChemicalCrystallizerRecipes;
import blastcraft.datagen.server.recipe.custom.fluiditem2fluid.BlastcraftChemicalMixerRecipes;
import blastcraft.datagen.server.recipe.custom.item2item.BlastcraftBlastCompressorRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftCraftingTableRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftSmeltingRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftStonecuttingRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;

public class BlastcraftRecipeProvider extends RecipeProvider {

    public final List<AbstractRecipeGenerator> GENERATORS = new ArrayList<>();

    @SuppressWarnings("unused")
    private final CompletableFuture<HolderLookup.Provider> lookupProvider;

    public BlastcraftRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
	super(output, lookupProvider);
	this.lookupProvider = lookupProvider;
	addRecipes();
    }

    public void addRecipes() {
	GENERATORS.add(new BlastcraftCraftingTableRecipes());
	GENERATORS.add(new BlastcraftSmeltingRecipes());
	GENERATORS.add(new BlastcraftStonecuttingRecipes());
	GENERATORS.add(new BlastcraftBlastCompressorRecipes());
	GENERATORS.add(new BlastcraftChemicalMixerRecipes());
	GENERATORS.add(new BlastcraftChemicalCrystallizerRecipes());
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
	for (AbstractRecipeGenerator generator : GENERATORS) {
	    generator.addRecipes(output);
	}
    }

}
