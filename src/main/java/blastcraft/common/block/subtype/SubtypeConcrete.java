package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

public enum SubtypeConcrete implements ISubtype {

	regular,
	regular_stairs,
	regular_wall,
	regular_slab,
	//
	tile,
	tile_stairs,
	tile_wall,
	tile_slab,
	//
	bricks,
	bricks_stairs,
	bricks_wall,
	bricks_slab;

	public final float hardness;
	public final float resistance;

	private SubtypeConcrete(float hardness, float resistance) {
		this.hardness = hardness;
		this.resistance = resistance;
	}

	private SubtypeConcrete() {
		this(50, 1200);
	}

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
