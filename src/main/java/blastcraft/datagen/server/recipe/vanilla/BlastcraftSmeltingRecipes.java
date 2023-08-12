package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsCookingRecipe;
import net.minecraft.data.recipes.FinishedRecipe;

public class BlastcraftSmeltingRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.getItem(SubtypeBlastproofWall.base))
				//
				.complete(References.ID, "smooth_blastproofwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.getItem(SubtypeBlastproofWall.base))
				//
				.complete(References.ID, "smooth_blastproofwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base))
				//
				.complete(References.ID, "smooth_rawblastproofwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base))
				//
				.complete(References.ID, "smooth_rawblastproofwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base))
				//
				.complete(References.ID, "smooth_carbonplatedwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base))
				//
				.complete(References.ID, "smooth_carbonplatedwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth), 0.1F, 200)
				//
				.input(BlastcraftItems.getItem(SubtypeHardenedBricks.base))
				//
				.complete(References.ID, "smooth_hardenedbricks_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth), 0.1F, 100)
				//
				.input(BlastcraftItems.getItem(SubtypeHardenedBricks.base))
				//
				.complete(References.ID, "smooth_hardenedbricks_blasting", consumer);

	}

}
