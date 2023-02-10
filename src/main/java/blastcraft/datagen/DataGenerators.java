package blastcraft.datagen;

import blastcraft.References;
import blastcraft.datagen.client.BlastcraftBlockStateProvider;
import blastcraft.datagen.client.BlastcraftItemModelsProvider;
import blastcraft.datagen.client.BlastcraftLangKeyProvider;
import blastcraft.datagen.client.BlastcraftSoundProvider;
import blastcraft.datagen.server.BlastcraftBlockTagsProvider;
import blastcraft.datagen.server.BlastcraftFluidTagsProvider;
import blastcraft.datagen.server.BlastcraftItemTagsProvider;
import blastcraft.datagen.server.BlastcraftLootTablesProvider;
import blastcraft.datagen.server.recipe.BlastcraftRecipeProvider;
import electrodynamics.datagen.client.ElectrodynamicsLangKeyProvider.Locale;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {

		DataGenerator generator = event.getGenerator();
		if (event.includeServer()) {

			BlastcraftBlockTagsProvider blocks = new BlastcraftBlockTagsProvider(generator, event.getExistingFileHelper());

			generator.addProvider(true, blocks);
			generator.addProvider(true, new BlastcraftItemTagsProvider(generator, blocks, event.getExistingFileHelper()));
			generator.addProvider(true, new BlastcraftFluidTagsProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(true, new BlastcraftLootTablesProvider(generator));
			generator.addProvider(true, new BlastcraftRecipeProvider(generator));

		}
		if (event.includeClient()) {
			generator.addProvider(true, new BlastcraftBlockStateProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(true, new BlastcraftItemModelsProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(true, new BlastcraftLangKeyProvider(generator, Locale.EN_US));
			generator.addProvider(true, new BlastcraftSoundProvider(generator, event.getExistingFileHelper()));
		}
	}

}
