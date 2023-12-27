package blastcraft.datagen;

import blastcraft.References;
import blastcraft.datagen.client.BlastcraftBlockStateProvider;
import blastcraft.datagen.client.BlastcraftLangKeyProvider;
import blastcraft.datagen.client.BlastcraftSoundProvider;
import blastcraft.datagen.server.BlastcraftBlockTagsProvider;
import blastcraft.datagen.server.BlastcraftItemTagsProvider;
import blastcraft.datagen.server.BlastcraftLootTablesProvider;
import blastcraft.datagen.server.recipe.BlastcraftRecipeProvider;
import electrodynamics.datagen.client.ElectrodynamicsLangKeyProvider.Locale;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = References.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {

		DataGenerator generator = event.getGenerator();
		if (event.includeServer()) {

			BlastcraftBlockTagsProvider blocks = new BlastcraftBlockTagsProvider(generator, event.getExistingFileHelper());

			generator.addProvider(blocks);
			generator.addProvider(new BlastcraftItemTagsProvider(generator, blocks, event.getExistingFileHelper()));
			generator.addProvider(new BlastcraftLootTablesProvider(generator));
			generator.addProvider(new BlastcraftRecipeProvider(generator));

		}
		if (event.includeClient()) {
			generator.addProvider(new BlastcraftBlockStateProvider(generator, event.getExistingFileHelper()));
			generator.addProvider(new BlastcraftLangKeyProvider(generator, Locale.EN_US));
			generator.addProvider(new BlastcraftSoundProvider(generator, event.getExistingFileHelper()));
		}
	}

}
