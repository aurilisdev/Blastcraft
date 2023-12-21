package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

public enum SubtypeWalling implements ISubtype {

	blastproofwalling(50, 12500),
	rawblastproofwalling(2, 50),
	carbonplatedwalling(85, 18000),
	hardenedbricks(10, 4000);

	public final float hardness;
	public final float resistance;

	SubtypeWalling(float hardness, float resistance) {
		this.hardness = hardness;
		this.resistance = resistance;
	}

	@Override
	public String forgeTag() {
		return "wall/" + name();
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public String tag() {
		return name();
	}

}