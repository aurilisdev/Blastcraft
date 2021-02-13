package blastcraft.common.settings;

import electrodynamics.api.configuration.Configuration;
import electrodynamics.api.configuration.DoubleValue;
import electrodynamics.api.configuration.IntValue;

@Configuration(name = "Blastcraft")
public class Constants {
	@DoubleValue(def = 100.0)
	public static double BLASTCOMPRESSOR_USAGE_PER_TICK = 100.0;
	@IntValue(def = 220)
	public static int BLASTCOMPRESSOR_REQUIRED_TICKS = 220;

}
