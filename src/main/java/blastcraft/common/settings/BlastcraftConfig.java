package blastcraft.common.settings;

import net.neoforged.neoforge.common.ModConfigSpec;

public class BlastcraftConfig {
    public static BlastcraftConfig INSTANCE;

    public ModConfigSpec SPEC;

    public BlastcraftConfig() {
	ModConfigSpec.Builder builder = new ModConfigSpec.Builder();
	builder.push("common");
	builder.pop();
	SPEC = builder.build();
    }
}
