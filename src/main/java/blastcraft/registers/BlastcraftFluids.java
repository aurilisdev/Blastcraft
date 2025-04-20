package blastcraft.registers;

import blastcraft.Blastcraft;
import electrodynamics.registers.ElectrodynamicsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import voltaic.common.fluid.FluidNonPlaceable;
import voltaic.common.fluid.SimpleWaterBasedFluidType;
import voltaic.prefab.utilities.math.Color;

public class BlastcraftFluids {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, Blastcraft.ID);

	public static final DeferredHolder<Fluid, FluidNonPlaceable> FLUID_CONCRETE = FLUIDS.register("fluidconcrete", () -> new FluidNonPlaceable(ElectrodynamicsItems.ITEM_CANISTERREINFORCED, new SimpleWaterBasedFluidType(Blastcraft.ID, "fluidconcrete", "concrete", Color.WHITE)));


}
