package blastcraft.datagen.server.recipe.custom.fluid2item;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.datagen.server.recipe.types.custom.fluid2item.ElectrodynamicsChemicalCrystallizerRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

public class BlastcraftChemicalCrystallizerRecipes extends ElectrodynamicsChemicalCrystallizerRecipes {

	public BlastcraftChemicalCrystallizerRecipes() {
		super(References.ID);
	}

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		newRecipe(new ItemStack(BlastcraftBlocks.getBlock(SubtypeConcrete.regular)), 0, CHEMICALCRYSTALLIZER_REQUIRED_TICKS, CHEMICALCRYSTALLIZER_USAGE_PER_TICK, "concrete_regular")
				//
				.addFluidTagInput(BlastcraftTags.Fluids.CONCRETE, 1000)
				//
				.complete(consumer);

	}

}
