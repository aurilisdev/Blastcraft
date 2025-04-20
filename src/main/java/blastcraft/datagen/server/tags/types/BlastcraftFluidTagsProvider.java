package blastcraft.datagen.server.tags.types;

import java.util.concurrent.CompletableFuture;

import blastcraft.Blastcraft;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlastcraftFluidTagsProvider extends FluidTagsProvider {

	public BlastcraftFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, Blastcraft.ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {

		tag(BlastcraftTags.Fluids.CONCRETE).add(BlastcraftFluids.FLUID_CONCRETE.get());

	}

}
