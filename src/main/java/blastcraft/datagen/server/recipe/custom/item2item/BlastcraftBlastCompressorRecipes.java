package blastcraft.datagen.server.recipe.custom.item2item;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.recipe.BlastCraftRecipeInit;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.common.recipe.recipeutils.ProbableItem;
import electrodynamics.datagen.utils.recipe.AbstractElectrodynamicsFinishedRecipe.RecipeCategory;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.FinishedRecipeItemOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class BlastcraftBlastCompressorRecipes extends AbstractRecipeGenerator {

	public static double BLASTCOMPRESSOR_USAGE_PER_TICK = 100.0;
	public static int BLASTCOMPRESSOR_REQUIRED_TICKS = 220;

	private final String modID;

	public BlastcraftBlastCompressorRecipes(String modID) {
		this.modID = modID;
	}

	public BlastcraftBlastCompressorRecipes() {
		this(References.ID);
	}

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		newRecipe(new ItemStack(BlastcraftItems.getItem(SubtypeBlastproofWall.base)), 0.1F, 220, 100, "blastproofwalling")
				//
				.addItemTagInput(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS, 1)
				//
				.addItemBiproduct(new ProbableItem(new ItemStack(Items.GUNPOWDER), 0.3))
				//
				.complete(consumer);

	}

	public FinishedRecipeItemOutput newRecipe(ItemStack stack, float xp, int ticks, double usagePerTick, String name) {
		return FinishedRecipeItemOutput.of(BlastCraftRecipeInit.BLAST_COMPRESSOR_SERIALIZER.get(), stack, xp, ticks, usagePerTick).name(RecipeCategory.ITEM_2_ITEM, modID, "blast_compressor/" + name);
	}

}
