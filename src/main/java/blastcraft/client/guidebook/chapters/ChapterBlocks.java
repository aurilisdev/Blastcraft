package blastcraft.client.guidebook.chapters;

import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.client.guidebook.ScreenGuidebook;
import electrodynamics.client.guidebook.utils.components.Chapter;
import electrodynamics.client.guidebook.utils.components.Module;
import electrodynamics.client.guidebook.utils.pagedata.graphics.ItemWrapperObject;
import electrodynamics.client.guidebook.utils.pagedata.text.TextWrapperObject;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextFormatting;

public class ChapterBlocks extends Chapter {

	private static final ItemWrapperObject LOGO = new ItemWrapperObject(7, 10, 32, 32, 32, 2.0F, BlastcraftBlocks.blockCamoflage.asItem());

	public ChapterBlocks(Module module) {
		super(module);
	}

	@Override
	public ItemWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public IFormattableTextComponent getTitle() {
		return BlastcraftTextUtils.guidebook("chapter.blocks");
	}

	@Override
	public void addData() {
		
		//Camoflage
		pageData.add(new TextWrapperObject(BlastcraftBlocks.blockCamoflage.asItem().getDescription().copy().withStyle(TextFormatting.BOLD)).setCentered().setSeparateStart());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 32, 32, 32, 2.0F, BlastcraftBlocks.blockCamoflage.asItem()));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.camoflage1")).setSeparateStart().setIndentions(1));
		
		//Blast resistant walls
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastprooftitle").withStyle(TextFormatting.BOLD)).setCentered().setNewPage());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 32, 32, 32, 2.0F, BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem()));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof1")).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardened").withStyle(TextFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.hardenedbricks.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.hardenedbricks.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.rawblastproof").withStyle(TextFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.rawblastproofwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.rawblastproofwalling.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof").withStyle(TextFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.blastproofwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.blastproofwalling.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.carbonplated").withStyle(TextFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.carbonplatedwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.carbonplatedwalling.resistance)).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(BlastcraftTextUtils.guidebook("chapter.blocks.blastproof2")).setSeparateStart());
		
		
	}

}