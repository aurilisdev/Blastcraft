package blastcraft.datagen.server;

import blastcraft.Blastcraft;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftFluids;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftFluidTagsProvider extends FluidTagsProvider {

	public BlastcraftFluidTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Blastcraft.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		tag(BlastcraftTags.Fluids.CONCRETE).add(BlastcraftFluids.FLUID_CONCRETE.get());

	}

}
