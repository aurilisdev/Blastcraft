package blastcraft.registers;

import blastcraft.Blastcraft;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlastcraftFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister
	    .create(ForgeRegistries.Keys.FLUID_TYPES, Blastcraft.ID);

    public static final RegistryObject<FluidType> FLUID_TYPE_CONCRETE = FLUID_TYPES.register("fluidconcrete",
	    () -> BlastcraftFluids.FLUID_CONCRETE.get().getFluidType());

}
