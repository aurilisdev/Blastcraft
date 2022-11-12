package blastcraft.client.guidebook.chapters;

import java.util.ArrayList;
import java.util.List;

import blastcraft.common.block.SubtypeBrick;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.api.item.ItemUtils;
import electrodynamics.client.guidebook.utils.ItemWrapperObject;
import electrodynamics.client.guidebook.utils.TextWrapperObject;
import electrodynamics.client.guidebook.utils.components.Chapter;
import electrodynamics.client.guidebook.utils.components.Page;
import net.minecraft.ChatFormatting;

public class ChapterBlocks extends Chapter {

	private static final ItemWrapperObject LOGO = new ItemWrapperObject(17, 60, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.blockCamoflage));

	@Override
	protected List<Page> genPages() {
		List<Page> pages = new ArrayList<>();

		pages.add(new Page(new TextWrapperObject[] {
				//
				new TextWrapperObject(45, 53, 4210752, "guidebook.blastcraft.chapter.blocks.camtitle").setTextStyles(ChatFormatting.UNDERLINE),
				//
				new TextWrapperObject(10, 80, 4210752, "guidebook.blastcraft.chapter.blocks.p1l1"),
				//
				new TextWrapperObject(10, 90, 4210752, "guidebook.blastcraft.chapter.blocks.p1l2"),
				//
				new TextWrapperObject(10, 100, 4210752, "guidebook.blastcraft.chapter.blocks.p1l3"),
				//
				new TextWrapperObject(10, 110, 4210752, "guidebook.blastcraft.chapter.blocks.p1l4"),
				//
				new TextWrapperObject(10, 120, 4210752, "guidebook.blastcraft.chapter.blocks.p1l5"),
				//
				new TextWrapperObject(10, 130, 4210752, "guidebook.blastcraft.chapter.blocks.p1l6"),
				//
				new TextWrapperObject(10, 140, 4210752, "guidebook.blastcraft.chapter.blocks.p1l7") },
				new ItemWrapperObject[] {
						//
						new ItemWrapperObject(17, 50, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.blockCamoflage)) }));

		pages.add(new Page(new TextWrapperObject[] {
				//
				new TextWrapperObject(45, 47, 4210752, "block.blastcraft.hardenedbricks"),
				//
				new TextWrapperObject(45, 57, 4210752, "guidebook.blastcraft.chapter.blocks.tier", 1),
				//
				new TextWrapperObject(45, 67, 4210752, "guidebook.blastcraft.chapter.blocks.resistance", 50),
				//
				new TextWrapperObject(45, 83, 4210752, "block.blastcraft.carbonplatedwalling"),
				//
				new TextWrapperObject(45, 93, 4210752, "guidebook.blastcraft.chapter.blocks.tier", 2),
				//
				new TextWrapperObject(45, 103, 4210752, "guidebook.blastcraft.chapter.blocks.resistance", 4000),
				//
				new TextWrapperObject(45, 117, 4210752, "block.blastcraft.rawblastproofwalling"),
				//
				new TextWrapperObject(45, 127, 4210752, "guidebook.blastcraft.chapter.blocks.tier", 3),
				//
				new TextWrapperObject(45, 137, 4210752, "guidebook.blastcraft.chapter.blocks.resistance", 12000),
				//
				new TextWrapperObject(45, 153, 4210752, "block.blastcraft.blastproofwalling"),
				//
				new TextWrapperObject(45, 163, 4210752, "guidebook.blastcraft.chapter.blocks.tier", 4),
				//
				new TextWrapperObject(45, 173, 4210752, "guidebook.blastcraft.chapter.blocks.resistance", 18000), },
				//
				new ItemWrapperObject[] {
						//
						new ItemWrapperObject(15, 50, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.bricksMap.get(SubtypeBrick.base).get(3).get())),
						//
						new ItemWrapperObject(15, 85, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.bricksMap.get(SubtypeBrick.base).get(2).get())),
						//
						new ItemWrapperObject(15, 120, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.bricksMap.get(SubtypeBrick.base).get(1).get())),
						//
						new ItemWrapperObject(15, 155, 2.0F, ItemUtils.fromBlock(BlastcraftBlocks.bricksMap.get(SubtypeBrick.base).get(0).get())), }));

		return pages;
	}

	@Override
	public ItemWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public String getTitleKey() {
		return "guidebook.blastcraft.chapter.blocks";
	}

}
