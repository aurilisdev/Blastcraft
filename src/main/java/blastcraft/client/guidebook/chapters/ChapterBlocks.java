package blastcraft.client.guidebook.chapters;

import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.prefab.utils.TextUtils;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.client.guidebook.ScreenGuidebook;
import electrodynamics.client.guidebook.utils.components.Chapter;
import electrodynamics.client.guidebook.utils.components.Module;
import electrodynamics.client.guidebook.utils.pagedata.ItemWrapperObject;
import electrodynamics.client.guidebook.utils.pagedata.TextWrapperObject;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;

public class ChapterBlocks extends Chapter {

	private static final ItemWrapperObject LOGO = new ItemWrapperObject(7, 10, 2.0F, 32, 32, BlastcraftBlocks.blockCamoflage.asItem());

	public ChapterBlocks(Module module) {
		super(module);
	}

	@Override
	public ItemWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public MutableComponent getTitle() {
		return TextUtils.guidebook("chapter.blocks");
	}

	@Override
	public void addData() {
		
		//Camoflage
		pageData.add(new TextWrapperObject(BlastcraftBlocks.blockCamoflage.asItem().getDescription().copy().withStyle(ChatFormatting.BOLD)).setCentered().setSeparateStart());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 2.0F, 32, 32, BlastcraftBlocks.blockCamoflage.asItem()));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.camoflage1")).setSeparateStart().setIndentions(1));
		
		//Blast resistant walls
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.blastprooftitle").withStyle(ChatFormatting.BOLD)).setCentered().setNewPage());
		pageData.add(new ItemWrapperObject(7 + ScreenGuidebook.TEXT_WIDTH / 2 - 16, 10, 2.0F, 32, 32, BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem()));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.blastproof1")).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardened").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.hardenedbricks.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.hardenedbricks.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.concrete").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardness", SubtypeConcrete.regular.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.strength", SubtypeConcrete.regular.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.rawblastproof").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.rawblastproofwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.rawblastproofwalling.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.blastproof").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.blastproofwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.blastproofwalling.resistance)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.carbonplated").withStyle(ChatFormatting.UNDERLINE)).setSeparateStart());
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.hardness", SubtypeWalling.carbonplatedwalling.hardness)).setSeparateStart().setIndentions(1));
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.strength", SubtypeWalling.carbonplatedwalling.resistance)).setSeparateStart().setIndentions(1));
		blankLine();
		pageData.add(new TextWrapperObject(TextUtils.guidebook("chapter.blocks.blastproof2")).setSeparateStart());
		
		
	}

}
