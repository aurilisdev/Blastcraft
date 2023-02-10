package blastcraft.datagen.server.recipe.custom.fluiditem2fluid;

import java.util.function.Consumer;

import blastcraft.References;
import blastcraft.registers.BlastcraftFluids;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.server.recipe.types.custom.fluiditem2fluid.ElectrodynamicsChemicalMixerRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class BlastcraftChemicalMixerRecipes extends ElectrodynamicsChemicalMixerRecipes {

	public BlastcraftChemicalMixerRecipes() {
		super(References.ID);
	}

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		newRecipe(new FluidStack(BlastcraftFluids.fluidConcrete, 5000), 0, CHEMICALMIXER_REQUIRED_TICKS, CHEMICALMIXER_USAGE_PER_TICK, "concrete_slurry")
				//
				.addFluidTagInput(FluidTags.WATER, 1000)
				//
				.addItemStackInput(new ItemStack(BlastcraftItems.ITEM_CONCRETEMIX.get()))
				//
				.complete(consumer);

	}

}
