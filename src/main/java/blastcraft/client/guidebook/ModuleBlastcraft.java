package blastcraft.client.guidebook;

import blastcraft.Blastcraft;
import blastcraft.client.guidebook.chapters.ChapterBlocks;
import blastcraft.prefab.utils.BlastcraftTextUtils;
import net.minecraft.network.chat.MutableComponent;
import voltaic.client.guidebook.utils.components.Module;
import voltaic.client.guidebook.utils.pagedata.graphics.ImageWrapperObject;

public class ModuleBlastcraft extends Module {

	private static final ImageWrapperObject LOGO = new ImageWrapperObject(0, 0, 0, 0, 32, 32, 32, 32, Blastcraft.rl("textures/screen/guidebook/blastcraftlogo.png"));

	@Override
	public ImageWrapperObject getLogo() {
		return LOGO;
	}

	@Override
	public MutableComponent getTitle() {
		return BlastcraftTextUtils.guidebook(Blastcraft.ID);
	}

	@Override
	public void addChapters() {
		chapters.add(new ChapterBlocks(this));
	}

}
