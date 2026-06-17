package blastcraft.datagen.server.recipe.vanilla;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.recipes.RecipeOutput;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;
import voltaic.datagen.utils.server.recipe.CustomCookingRecipe;

public class BlastcraftSmeltingRecipes extends AbstractRecipeGenerator {

    @Override
    public void addRecipes(RecipeOutput output) {

	CustomCookingRecipe
		.smeltingRecipe(Blastcraft.rl("smooth_blastproofwalling_smelting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 0.1F, 200)
		//
		.input(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.blastingRecipe(Blastcraft.rl("smooth_blastproofwalling_blasting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth), 0.1F, 100)
		//
		.input(BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.smeltingRecipe(Blastcraft.rl("smooth_rawblastproofwalling_smelting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 0.1F, 200)
		//
		.input(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.blastingRecipe(Blastcraft.rl("smooth_rawblastproofwalling_blasting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth), 0.1F, 100)
		//
		.input(BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.smeltingRecipe(Blastcraft.rl("smooth_carbonplatedwalling_smelting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 0.1F, 200)
		//
		.input(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.blastingRecipe(Blastcraft.rl("smooth_carbonplatedwalling_blasting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth), 0.1F, 100)
		//
		.input(BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base))
		//
		.save(output);

	CustomCookingRecipe
		.smeltingRecipe(Blastcraft.rl("smooth_hardenedbricks_smelting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 0.1F, 200)
		//
		.input(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
		//
		.save(output);

	CustomCookingRecipe
		.blastingRecipe(Blastcraft.rl("smooth_hardenedbricks_blasting"), Blastcraft.ID,
			BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth), 0.1F, 100)
		//
		.input(BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base))
		//
		.save(output);

    }

}
