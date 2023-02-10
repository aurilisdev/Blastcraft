package blastcraft.common.fluid.types;

import blastcraft.References;
import electrodynamics.common.fluid.FluidNonPlaceable;
import electrodynamics.common.fluid.types.SimpleWaterBasedFluidType;
import electrodynamics.registers.ElectrodynamicsItems;
import net.minecraftforge.fluids.FluidType;

public class FluidConcrete extends FluidNonPlaceable {

	public static final String FORGE_TAG = "concrete";

	private final FluidType type;

	public FluidConcrete() {
		super(() -> ElectrodynamicsItems.ITEM_CANISTERREINFORCED);
		type = new SimpleWaterBasedFluidType(References.ID, "fluidconcrete");
	}

	@Override
	public FluidType getFluidType() {
		return type;
	}

}
