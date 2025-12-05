package blastcraft.datagen.client;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseItemModelsProvider;

public class BlastcraftItemModelsProvider extends BaseItemModelsProvider {

	public BlastcraftItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, existingFileHelper, Blastcraft.ID);
	}

	@Override
	protected void registerModels() {

		layeredItem(BlastcraftItems.ITEM_CONCRETEMIX, Parent.GENERATED, itemLoc(name(BlastcraftItems.ITEM_CONCRETEMIX)));

		//layeredBuilder(name(BlastcraftItems.ITEM_SPEEDUPGRADE_BASIC), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.basicspeed.tag())).transforms().transform(ItemDisplayContext.GUI).scale(0.8F).end();
		//layeredBuilder(name(BlastcraftItems.ITEM_SPEEDUPGRADE_ADVANCED), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.advancedspeed.tag())).transforms().transform(ItemDisplayContext.GUI).scale(0.8F).end();
		//layeredBuilder(name(BlastcraftItems.ITEM_UPGRADEITEMINPUT), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.iteminput.tag())).transforms().transform(ItemDisplayContext.GUI).scale(0.8F).end();
		//layeredBuilder(name(BlastcraftItems.ITEM_UPGRADEITEMOUTPUT), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.itemoutput.tag())).transforms().transform(ItemDisplayContext.GUI).scale(0.8F).end();
		//layeredBuilder(name(BlastcraftItems.ITEM_UPGRADERANGE), Parent.GENERATED, itemLoc("upgrade/" + SubtypeItemUpgrade.range.tag())).transforms().transform(ItemDisplayContext.GUI).scale(0.8F).end();

	}

}
