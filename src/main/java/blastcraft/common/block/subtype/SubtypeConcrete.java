package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

public enum SubtypeConcrete implements ISubtype {
	regular,
	tile,
	bricks;

	public final float hardness = 50;
	public final float resistance = 1200;

	@Override
	public String tag() {
		return "concrete" + name();
	}

	@Override
	public String forgeTag() {
		return "concrete/" + name();
	}

	@Override
	public boolean isItem() {
		return false;
	}

}
