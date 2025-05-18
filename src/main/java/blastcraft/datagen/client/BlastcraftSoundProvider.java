package blastcraft.datagen.client;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftSounds;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseSoundProvider;

public class BlastcraftSoundProvider extends BaseSoundProvider {

	public BlastcraftSoundProvider(DataGenerator gen, ExistingFileHelper helper) {
		super(gen, helper, Blastcraft.ID);
	}

	@Override
	public void registerSounds() {
		add(BlastcraftSounds.SOUND_BLASTCOMPRESSOR);
	}

}
