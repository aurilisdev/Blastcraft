package blastcraft.datagen.server.tags;

import java.util.concurrent.CompletableFuture;

import blastcraft.datagen.server.tags.types.BlastcraftBlockTagsProvider;
import blastcraft.datagen.server.tags.types.BlastcraftFluidTagsProvider;
import blastcraft.datagen.server.tags.types.BlastcraftItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftTagsProvider {

	public static void addTagProviders(DataGenerator generator, PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
		BlastcraftBlockTagsProvider blockProvider = new BlastcraftBlockTagsProvider(output, lookupProvider, helper);
		generator.addProvider(true, blockProvider);
		generator.addProvider(true, new BlastcraftItemTagsProvider(output, lookupProvider, blockProvider, helper));
		generator.addProvider(true, new BlastcraftFluidTagsProvider(output, lookupProvider, helper));
	}

}
