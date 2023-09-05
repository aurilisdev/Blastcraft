package blastcraft.datagen.client;

import blastcraft.References;
import blastcraft.registers.BlastcraftSounds;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinition.Sound;
import net.minecraftforge.common.data.SoundDefinition.SoundType;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftSoundProvider extends SoundDefinitionsProvider {

	public BlastcraftSoundProvider(PackOutput output, ExistingFileHelper helper) {
		super(output, References.ID, helper);
	}

	@Override
	public void registerSounds() {
		add(BlastcraftSounds.SOUND_BLASTCOMPRESSOR);
	}

	private void add(RegistryObject<SoundEvent> sound) {
		add(sound.get(), SoundDefinition.definition().subtitle("subtitles." + References.ID + "." + sound.getId().getPath()).with(Sound.sound(sound.getId(), SoundType.SOUND)));
	}

}
