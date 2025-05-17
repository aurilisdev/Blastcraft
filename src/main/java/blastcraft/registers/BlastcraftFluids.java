package blastcraft.registers;

import blastcraft.Blastcraft;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import voltaic.common.fluid.FluidNonPlaceable;
import voltaic.common.fluid.SimpleWaterBasedFluidType;
import voltaic.prefab.utilities.math.Color;

public class BlastcraftFluids {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Blastcraft.ID);

	public static final RegistryObject<FluidNonPlaceable> FLUID_CONCRETE = FLUIDS.register("fluidconcrete", () -> new FluidNonPlaceable(() -> Items.AIR, new SimpleWaterBasedFluidType(Blastcraft.ID, "fluidconcrete", "concrete", Color.WHITE)));


}
