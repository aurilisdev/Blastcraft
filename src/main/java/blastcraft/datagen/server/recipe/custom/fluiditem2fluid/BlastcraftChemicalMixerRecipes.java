package blastcraft.datagen.server.recipe.custom.fluiditem2fluid;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftFluids;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.server.recipe.types.custom.fluiditem2fluid.ElectrodynamicsChemicalMixerRecipes;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.fluids.FluidStack;

public class BlastcraftChemicalMixerRecipes extends ElectrodynamicsChemicalMixerRecipes {

    public BlastcraftChemicalMixerRecipes() {
        super(Blastcraft.ID);
    }

    @Override
    public void addRecipes(RecipeOutput output) {

        newRecipe(new FluidStack(BlastcraftFluids.FLUID_CONCRETE.get(), 5000), 0, CHEMICALMIXER_REQUIRED_TICKS, CHEMICALMIXER_USAGE_PER_TICK, "concrete_slurry", modID)
                //
                .addFluidTagInput(FluidTags.WATER, 1000)
                //
                .addItemStackInput(new ItemStack(BlastcraftItems.ITEM_CONCRETEMIX.get()))
                //
                .save(output);

    }

}
