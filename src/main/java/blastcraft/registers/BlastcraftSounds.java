package blastcraft.registers;

import blastcraft.References;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftSounds {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, References.ID);

	public static final RegistryObject<SoundEvent> SOUND_BLASTCOMPRESSOR = sound("blastcompressor");

	private static RegistryObject<SoundEvent> sound(String name) {
		return SOUNDS.register(name, () -> SoundEvent.createFixedRangeEvent(new ResourceLocation(References.ID + ":" + name), 16.0F));
	}

}
