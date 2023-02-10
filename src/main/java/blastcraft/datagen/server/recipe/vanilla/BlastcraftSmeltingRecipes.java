package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsCookingRecipe;
import net.minecraft.data.recipes.FinishedRecipe;

public class BlastcraftSmeltingRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.smooth).asItem(), 0.1F, 200)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_blastproofwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.smooth).asItem(), 0.1F, 100)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_blastproofwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.smooth).asItem(), 0.1F, 200)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_rawblastproofwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.smooth).asItem(), 0.1F, 100)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_rawblastproofwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.smooth).asItem(), 0.1F, 200)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_carbonplatedwalling_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.smooth).asItem(), 0.1F, 100)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_carbonplatedwalling_blasting", consumer);

		ElectrodynamicsCookingRecipe.smeltingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.smooth).asItem(), 0.1F, 200)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_hardenedbricks_smelting", consumer);

		ElectrodynamicsCookingRecipe.blastingRecipe(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.smooth).asItem(), 0.1F, 100)
				//
				.input(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem())
				//
				.complete(References.ID, "smooth_hardenedbricks_blasting", consumer);

	}

}
