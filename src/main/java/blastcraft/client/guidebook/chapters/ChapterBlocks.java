package blastcraft.client.guidebook.chapters;

import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import blastcraft.registers.BlastcraftItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import voltaic.client.guidebook.ScreenGuidebook;
import voltaic.client.guidebook.utils.components.Chapter;
import voltaic.client.guidebook.utils.components.Module;
import voltaic.client.guidebook.utils.pagedata.graphics.ItemWrapperObject;
import voltaic.client.guidebook.utils.pagedata.text.TextWrapperObject;

public class ChapterBlocks extends Chapter {

	private static final ItemWrapperObject LOGO = new ItemWrapperObject(7, 10, 32, 32, 32, 2.0F, BlastcraftItems.ITEM_CAMOFLAGE.get());

	public ChapterBlocks(Module module) {
		super(module);
	}

	@Override
	public ItemWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public MutableComponent getTitle() {
		return BlastcraftTextUtils.guidebook("chapter.blocks");
	}

	@Override
	public void addData() {

		// Camoflage
		pageData.add(new TextWrapperObject(BlastcraftItems.ITEM_CAMOFLAGE.get().getDescription().copy().withStyle(ChatFormatting.BOLD)).setCentered().setSeparateStart());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 32, 32, 32, 2.0F, BlastcraftItems.ITEM_CAMOFLAGE.get()));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.camoflage1")).setSeparateStart().setIndentions(1));

		// Blast resistant walls
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastprooftitle").withStyle(ChatFormatting.BOLD)).setCentered().setNewPage());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 32, 32, 32, 2.0F, BlastcraftItems.ITEMS_CARBONPLATEDWALL.getValue(SubtypeCarbonPlatedWall.base)));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof1")).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardened").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeHardenedBricks.base.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeHardenedBricks.base.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.rawblastproof").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeRawBlastproofWall.base.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeRawBlastproofWall.base.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeBlastproofWall.base.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeBlastproofWall.base.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.carbonplated").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeCarbonPlatedWall.base.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeCarbonPlatedWall.base.resistance)).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof2")).setSeparateStart());

	}

}
