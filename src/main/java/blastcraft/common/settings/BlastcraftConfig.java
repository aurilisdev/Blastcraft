package blastcraft.common.settings;

import net.neoforged.neoforge.common.ModConfigSpec;

public class BlastcraftConfig {
    private static BlastcraftConfig INSTANCE = new BlastcraftConfig();

    public ModConfigSpec SPEC;

    public BlastcraftConfig() {
	ModConfigSpec.Builder builder = new ModConfigSpec.Builder();
	builder.push("common");
	builder.pop();
	SPEC = builder.build();
    }

    public static BlastcraftConfig getInstance() {
	return INSTANCE;
    }
}
