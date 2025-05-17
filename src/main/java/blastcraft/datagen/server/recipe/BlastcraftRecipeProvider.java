package blastcraft.datagen.server.recipe;

import blastcraft.datagen.server.recipe.custom.fluid2item.BlastcraftChemicalCrystallizerRecipes;
import blastcraft.datagen.server.recipe.custom.fluiditem2fluid.BlastcraftChemicalMixerRecipes;
import blastcraft.datagen.server.recipe.custom.item2item.BlastcraftBlastCompressorRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftCraftingTableRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftSmeltingRecipes;
import blastcraft.datagen.server.recipe.vanilla.BlastcraftStonecuttingRecipes;
import net.minecraft.data.PackOutput;
import voltaic.datagen.utils.server.recipe.BaseRecipeProvider;

public class BlastcraftRecipeProvider extends BaseRecipeProvider {

	public BlastcraftRecipeProvider(PackOutput output) {
		super(output);
	}

	public void addRecipes() {
		generators.add(new BlastcraftCraftingTableRecipes());
		generators.add(new BlastcraftSmeltingRecipes());
		generators.add(new BlastcraftStonecuttingRecipes());
		generators.add(new BlastcraftBlastCompressorRecipes());
		generators.add(new BlastcraftChemicalMixerRecipes());
		generators.add(new BlastcraftChemicalCrystallizerRecipes());
	}

}
