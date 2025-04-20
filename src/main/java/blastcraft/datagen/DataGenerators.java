package blastcraft.datagen;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import blastcraft.Blastcraft;
import blastcraft.datagen.client.BlastcraftBlockStateProvider;
import blastcraft.datagen.client.BlastcraftItemModelsProvider;
import blastcraft.datagen.client.BlastcraftLangKeyProvider;
import blastcraft.datagen.client.BlastcraftSoundProvider;
import blastcraft.datagen.server.BlastcraftLootTablesProvider;
import blastcraft.datagen.server.recipe.BlastcraftRecipeProvider;
import blastcraft.datagen.server.tags.BlastcraftTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import voltaic.datagen.utils.client.BaseLangKeyProvider;

@EventBusSubscriber(modid = Blastcraft.ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {

		DataGenerator generator = event.getGenerator();

		PackOutput output = generator.getPackOutput();

		ExistingFileHelper helper = event.getExistingFileHelper();

		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		if (event.includeServer()) {

			generator.addProvider(true, new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(BlastcraftLootTablesProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
			generator.addProvider(true, new BlastcraftRecipeProvider(output, lookupProvider));
			BlastcraftTagsProvider.addTagProviders(generator, output, lookupProvider, helper);

		}
		if (event.includeClient()) {
			generator.addProvider(true, new BlastcraftBlockStateProvider(output, helper));
			generator.addProvider(true, new BlastcraftItemModelsProvider(output, helper));
			generator.addProvider(true, new BlastcraftLangKeyProvider(output, BaseLangKeyProvider.Locale.EN_US));
			generator.addProvider(true, new BlastcraftSoundProvider(output, helper));
		}
	}

}
