package blastcraft.registers;

import blastcraft.Blastcraft;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class BlastcraftFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister
	    .create(NeoForgeRegistries.Keys.FLUID_TYPES, Blastcraft.ID);

    public static final DeferredHolder<FluidType, FluidType> FLUID_TYPE_CONCRETE = FLUID_TYPES.register("fluidconcrete",
	    () -> BlastcraftFluids.FLUID_CONCRETE.get().getFluidType());

}
