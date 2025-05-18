package blastcraft.compatibility.jei;

import java.util.List;
import java.util.Objects;

import blastcraft.Blastcraft;
import blastcraft.common.recipe.categories.item2item.specificmachines.BlastCompressorRecipe;
import blastcraft.compatibility.jei.recipecategories.item2item.specificmachines.BlastCompressorRecipeCategory;
import blastcraft.registers.BlastcraftRecipies;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class BlastCraftJEIPlugin implements IModPlugin {

    public static final ResourceLocation ID = Blastcraft.rl("jei");
    
    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(BlastCompressorRecipeCategory.INPUT_MACHINE, BlastCompressorRecipeCategory.RECIPE_TYPE.getUid());
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        Minecraft mc = Minecraft.getInstance();
        ClientWorld world = Objects.requireNonNull(mc.level);
        RecipeManager recipeManager = world.getRecipeManager();

        // Blast Compressor
        List<BlastCompressorRecipe> blastCompressorRecipes = recipeManager.getAllRecipesFor(BlastcraftRecipies.BLAST_COMPRESSOR_TYPE);
        registration.addRecipes(blastCompressorRecipes, BlastCompressorRecipeCategory.RECIPE_TYPE.getUid());

    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new BlastCompressorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registry) {

    }

}
