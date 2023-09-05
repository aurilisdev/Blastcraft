package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.registers.BlastcraftItems;
import electrodynamics.datagen.client.ElectrodynamicsItemModelsProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftItemModelsProvider extends ElectrodynamicsItemModelsProvider {

	public BlastcraftItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, existingFileHelper, References.ID);
	}

	@Override
	protected void registerModels() {

		layeredItem(BlastcraftItems.ITEM_CONCRETEMIX, Parent.GENERATED, itemLoc(name(BlastcraftItems.ITEM_CONCRETEMIX)));

	}

}
