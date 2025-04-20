package blastcraft.datagen.server.recipe.custom.fluid2item;


import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.server.recipe.types.custom.fluid2item.ElectrodynamicsChemicalCrystallizerRecipes;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.ItemStack;

public class BlastcraftChemicalCrystallizerRecipes extends ElectrodynamicsChemicalCrystallizerRecipes {

    public BlastcraftChemicalCrystallizerRecipes() {
        super(Blastcraft.ID);
    }

    @Override
    public void addRecipes(RecipeOutput output) {

        newRecipe(new ItemStack(BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular)), 0, CHEMICALCRYSTALLIZER_REQUIRED_TICKS, CHEMICALCRYSTALLIZER_USAGE_PER_TICK, "concrete_regular", modID)
                //
                .addFluidTagInput(BlastcraftTags.Fluids.CONCRETE, 1000)
                //
                .save(output);

    }

}
