package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

public enum SubtypeRawBlastproofWall implements ISubtype {

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

	private SubtypeRawBlastproofWall(float hardness, float resistance) {
		this.hardness = hardness;
		this.resistance = resistance;
	}

	private SubtypeRawBlastproofWall() {
		this(2, 50);
	}

	@Override
	public String forgeTag() {
		return "wall/rawblastproofwall" + name();
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public String tag() {
		return "rawblastproofwall" + name();
	}

}
