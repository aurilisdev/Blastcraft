package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

public enum SubtypeCarbonPlatedWall implements ISubtype {

	base,
	base_wall,
	base_stairs,
	base_slab,
	//
	big,
	big_wall,
	big_stairs,
	big_slab,
	//
	polished,
	polished_wall,
	polished_stairs,
	polished_slab,
	//
	smooth,
	smooth_wall,
	smooth_stairs,
	smooth_slab;

	public final float hardness;
	public final float resistance;

	private SubtypeCarbonPlatedWall(float hardness, float resistance) {
		this.hardness = hardness;
		this.resistance = resistance;
	}

	private SubtypeCarbonPlatedWall() {
		this(85, 18000);
	}

	@Override
	public String forgeTag() {
		return "wall/carbonplatedwall" + name();
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public String tag() {
		return "carbonplatedwall" + name();
	}

}
