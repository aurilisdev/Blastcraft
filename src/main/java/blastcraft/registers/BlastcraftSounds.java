package blastcraft.registers;

import blastcraft.Blastcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlastcraftSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT,
	    Blastcraft.ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> SOUND_BLASTCOMPRESSOR = sound("blastcompressor");

    private static DeferredHolder<SoundEvent, SoundEvent> sound(String name) {
	return SOUNDS.register(name, () -> SoundEvent.createFixedRangeEvent(Blastcraft.rl(name), 16.0F));
    }

}
