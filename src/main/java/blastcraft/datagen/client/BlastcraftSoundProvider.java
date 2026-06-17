package blastcraft.datagen.client;

import blastcraft.Blastcraft;
import blastcraft.registers.BlastcraftSounds;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseSoundProvider;

public class BlastcraftSoundProvider extends BaseSoundProvider {

    public BlastcraftSoundProvider(PackOutput output, ExistingFileHelper helper) {
	super(output, helper, Blastcraft.ID);
    }

    @Override
    public void registerSounds() {
	add(BlastcraftSounds.SOUND_BLASTCOMPRESSOR);
    }

}
