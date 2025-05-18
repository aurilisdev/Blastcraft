package blastcraft.datagen.server;

import blastcraft.Blastcraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftFluidTagsProvider extends FluidTagsProvider {

	public BlastcraftFluidTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Blastcraft.ID, existingFileHelper);
	}

	@Override
	protected void addTags() {


	}

}
