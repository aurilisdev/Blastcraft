package blastcraft.client.guidebook;

import java.util.ArrayList;
import java.util.List;

import blastcraft.References;
import blastcraft.client.guidebook.chapters.ChapterBlocks;
import electrodynamics.client.guidebook.utils.ImageWrapperObject;
import electrodynamics.client.guidebook.utils.components.Chapter;
import electrodynamics.client.guidebook.utils.components.Module;

public class ModuleBlastcraft extends Module {

	private static final ImageWrapperObject LOGO = new ImageWrapperObject(10, 38, 0, 0, 32, 32, 32, 32, References.ID + ":textures/screen/guidebook/blastcraftlogo.png");

	@Override
	protected List<Chapter> genChapters() {
		List<Chapter> chapters = new ArrayList<>();
		chapters.add(new ChapterBlocks());
		return chapters;
	}

	@Override
	public ImageWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public String getTitleCat() {
		return References.ID;
	}

	@Override
	public boolean isFirst() {
		return false;
	}

}
