package blastcraft.datagen.server.tags.types;

import java.util.concurrent.CompletableFuture;

import blastcraft.Blastcraft;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlastcraftItemTagsProvider extends ItemTagsProvider {

	public BlastcraftItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, provider.contentsGetter(), Blastcraft.ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {

		tag(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS).add(
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.base),
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.big),
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished),
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS).add(
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.base),
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.big),
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished),
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS).add(
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base),
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.big),
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished),
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SOLID_HARDENED_BRICKS).add(
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.base),
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.big),
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished),
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth)
		//
		);

		tag(BlastcraftTags.Items.SOLID_CONCRETES).add(
				//
				BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.regular),
				//
				BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.bricks),
				//
				BlastcraftItems.ITEMS_CONCRETE.getValue(SubtypeConcrete.tile)
		//
		);

		tag(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS).add(
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.polished),
				//
				BlastcraftItems.ITEMS_BLASTPROOFWALL.getValue(SubtypeBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS).add(
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.polished),
				//
				BlastcraftItems.ITEMS_RAW_BLASTPROOFWALL.getValue(SubtypeRawBlastproofWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS).add(
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.polished),
				//
				BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.smooth)
		//
		);

		tag(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS).add(
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.polished),
				//
				BlastcraftItems.ITEMS_HARDENEDBRICKS.getValue(SubtypeHardenedBricks.smooth)
		//
		);

	}

}
