package blastcraft.registers;

import blastcraft.References;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftSounds {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, References.ID);
	public static final RegistryObject<SoundEvent> SOUND_BLASTCOMPRESSOR = SOUNDS.register("blastcompressor", () -> new SoundEvent(new ResourceLocation(References.ID + ":blastcompressor")));
}
