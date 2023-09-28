package blastcraft.datagen.server.tags.types;

import java.util.concurrent.CompletableFuture;

import blastcraft.References;
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
		super(output, lookupProvider, provider.contentsGetter(), References.ID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider pProvider) {

		tag(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS).add(BlastcraftItems.getItem(SubtypeBlastproofWall.base), BlastcraftItems.getItem(SubtypeBlastproofWall.big), BlastcraftItems.getItem(SubtypeBlastproofWall.polished), BlastcraftItems.getItem(SubtypeBlastproofWall.smooth));

		tag(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS).add(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth));

		tag(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS).add(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth));

		tag(BlastcraftTags.Items.SOLID_HARDENED_BRICKS).add(BlastcraftItems.getItem(SubtypeHardenedBricks.base), BlastcraftItems.getItem(SubtypeHardenedBricks.big), BlastcraftItems.getItem(SubtypeHardenedBricks.polished), BlastcraftItems.getItem(SubtypeHardenedBricks.smooth));

		tag(BlastcraftTags.Items.SOLID_CONCRETES).add(BlastcraftItems.getItem(SubtypeConcrete.regular), BlastcraftItems.getItem(SubtypeConcrete.bricks), BlastcraftItems.getItem(SubtypeConcrete.tile));

		tag(BlastcraftTags.Items.SMOOTH_SOLID_BLASTPROOF_WALLS).add(BlastcraftItems.getItem(SubtypeBlastproofWall.polished), BlastcraftItems.getItem(SubtypeBlastproofWall.smooth));

		tag(BlastcraftTags.Items.SMOOTH_SOLID_RAW_BLASTPROOF_WALLS).add(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth));

		tag(BlastcraftTags.Items.SMOOTH_SOLID_CARBON_PLATED_WALLS).add(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth));

		tag(BlastcraftTags.Items.SMOOTH_SOLID_HARDENED_BRICKS).add(BlastcraftItems.getItem(SubtypeHardenedBricks.polished), BlastcraftItems.getItem(SubtypeHardenedBricks.smooth));

	}

}
