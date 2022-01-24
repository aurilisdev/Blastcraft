package blastcraft.compatibility.jei;

import java.util.Objects;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.compatibility.jei.recipecategories.item2item.specificmachines.BlastCompressorRecipeCategory;
import electrodynamics.client.screen.tile.ScreenO2OProcessor;
import electrodynamics.common.recipe.categories.item2item.Item2ItemRecipe;
import electrodynamics.compatibility.jei.ElectrodynamicsJEIPlugin;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

@JeiPlugin
public class BlastCraftJEIPlugin implements IModPlugin {

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(blastcraft.References.ID, "jei");
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(BlastCompressorRecipeCategory.INPUT_MACHINE, BlastCompressorRecipeCategory.UID);
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		Minecraft mc = Minecraft.getInstance();
		ClientLevel world = Objects.requireNonNull(mc.level);
		RecipeManager recipeManager = world.getRecipeManager();

		// Blast Compressor
		Set<Item2ItemRecipe> blastCompressorRecipes = ImmutableSet.copyOf(recipeManager.getAllRecipesFor(BlastCraftRecipeInit.BLAST_COMPRESSOR_TYPE));
		registration.addRecipes(blastCompressorRecipes, BlastCompressorRecipeCategory.UID);

	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new BlastCompressorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration registry) {
		registry.addRecipeClickArea(ScreenO2OProcessor.class, 48, 35, 22, 15, ElectrodynamicsJEIPlugin.O2O_CLICK_AREAS.toArray(new ResourceLocation[ElectrodynamicsJEIPlugin.O2O_CLICK_AREAS.size()]));
	}

}
