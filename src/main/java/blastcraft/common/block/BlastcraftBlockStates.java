package blastcraft.common.block;

import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class BlastcraftBlockStates {

    public static void init() {
    }

    public static final BooleanProperty HASCAMOFLAUGE = BooleanProperty.create("isself");
    public static final BooleanProperty ISWALKTHROUGHABLE = BooleanProperty.create("canwalk");

}
