package blastcraft.datagen.client;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelBuilder.Perspective;
import net.minecraftforge.common.data.ExistingFileHelper;
import voltaic.common.item.subtype.SubtypeItemUpgrade;
import voltaic.datagen.utils.client.BaseItemModelsProvider;

public class BlastcraftItemModelsProvider extends BaseItemModelsProvider {

	public BlastcraftItemModelsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
		super(gen, existingFileHelper, Blastcraft.ID);
	}

	@Override
	protected void registerModels() {

		layeredBuilder(name(BlastcraftItems.ITEM_SPEEDUPGRADE_BASIC), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.basicspeed.tag())).transforms().transform(Perspective.GUI).scale(0.8F).end();
		layeredBuilder(name(BlastcraftItems.ITEM_SPEEDUPGRADE_ADVANCED), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.advancedspeed.tag())).transforms().transform(Perspective.GUI).scale(0.8F).end();
		layeredBuilder(name(BlastcraftItems.ITEM_UPGRADEITEMINPUT), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.iteminput.tag())).transforms().transform(Perspective.GUI).scale(0.8F).end();
		layeredBuilder(name(BlastcraftItems.ITEM_UPGRADEITEMOUTPUT), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.itemoutput.tag())).transforms().transform(Perspective.GUI).scale(0.8F).end();
		layeredBuilder(name(BlastcraftItems.ITEM_UPGRADERANGE), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.range.tag())).transforms().transform(Perspective.GUI).scale(0.8F).end();

	}

}
