package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.recipes.FinishedRecipe;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;
import voltaic.datagen.utils.server.recipe.CustomCookingRecipe;

public class BlastcraftSmeltingRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		CustomCookingRecipe.smeltingRecipe(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwalling_smelting", consumer);

		CustomCookingRecipe.blastingRecipe(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "smooth_blastproofwalling_blasting", consumer);

		CustomCookingRecipe.smeltingRecipe(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwalling_smelting", consumer);

		CustomCookingRecipe.blastingRecipe(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
				//
				.complete(Blastcraft.ID, "smooth_rawblastproofwalling_blasting", consumer);

		CustomCookingRecipe.smeltingRecipe(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwalling_smelting", consumer);

		CustomCookingRecipe.blastingRecipe(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
				//
				.complete(Blastcraft.ID, "smooth_carbonplatedwalling_blasting", consumer);

		CustomCookingRecipe.smeltingRecipe(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_smelting", consumer);

		CustomCookingRecipe.blastingRecipe(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
				//
				.complete(Blastcraft.ID, "smooth_hardenedbricks_blasting", consumer);

	}

}
