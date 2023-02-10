package blastcraft.registers;

import blastcraft.References;
import blastcraft.common.fluid.types.FluidConcrete;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlastcraftFluids {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, References.ID);

	public static FluidConcrete fluidConcrete;

	static {

		FLUIDS.register("fluidconcrete", () -> fluidConcrete = new FluidConcrete());

	}

}
