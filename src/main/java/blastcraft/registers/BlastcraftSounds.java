package blastcraft.registers;

import blastcraft.Blastcraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
	    Blastcraft.ID);

    public static final RegistryObject<SoundEvent> SOUND_BLASTCOMPRESSOR = sound("blastcompressor");

    private static RegistryObject<SoundEvent> sound(String name) {
	return SOUNDS.register(name, () -> SoundEvent.createFixedRangeEvent(Blastcraft.rl(name), 16.0F));
    }

}
