package blastcraft.common.block;

import electrodynamics.api.ISubtype;

public enum SubtypeBrick implements ISubtype {
    base, smooth, polished, big;

    @Override
    public String tag() {
	return name().equals("base") ? "" : name();
    }

    @Override
    public boolean isItem() {
	return false;
    }

    @Override
    public String forgeTag() {
	return tag();
    }

}
