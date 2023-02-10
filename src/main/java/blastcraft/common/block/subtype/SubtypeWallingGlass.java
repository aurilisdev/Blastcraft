package blastcraft.common.block.subtype;

import electrodynamics.api.ISubtype;

/**
 * This is kept separate from the regular walling in case we want to change the hardness or resistance without affecting the actual blocks
 * 
 * @author skip999
 *
 */
public enum SubtypeWallingGlass implements ISubtype {
	blastproofwalling(50, 12500), 
	rawblastproofwalling(2, 50), 
	carbonplatedwalling(85, 18000), 
	hardenedbricks(10, 4000);
	
	public final float hardness;
	public final float resistance;
	
	private SubtypeWallingGlass(float hardness, float resistance) {
		this.hardness = hardness;
		this.resistance = resistance;
	}

	@Override
	public String forgeTag() {
		return "hardened_glass/" + name();
	}

	@Override
	public boolean isItem() {
		return false;
	}

	@Override
	public String tag() {
		return name() + "glass";
	}

}
