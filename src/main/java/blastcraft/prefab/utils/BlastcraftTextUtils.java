package blastcraft.prefab.utils;

import static electrodynamics.prefab.utilities.ElectroTextUtils.BLOCK_BASE;
import static electrodynamics.prefab.utilities.ElectroTextUtils.GUIDEBOOK_BASE;
import static electrodynamics.prefab.utilities.ElectroTextUtils.GUI_BASE;
import static electrodynamics.prefab.utilities.ElectroTextUtils.JEI_BASE;
import static electrodynamics.prefab.utilities.ElectroTextUtils.JEI_INFO_FLUID;
import static electrodynamics.prefab.utilities.ElectroTextUtils.JEI_INFO_ITEM;
import static electrodynamics.prefab.utilities.ElectroTextUtils.MESSAGE_BASE;
import static electrodynamics.prefab.utilities.ElectroTextUtils.TOOLTIP_BASE;

import java.text.DecimalFormat;

import blastcraft.References;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BlastcraftTextUtils {

	public static final DecimalFormat FORMATTER = new DecimalFormat("0.0##");

	public static IFormattableTextComponent tooltip(String key, Object... additional) {
		return translated(TOOLTIP_BASE, key, additional);
	}

	public static IFormattableTextComponent guidebook(String key, Object... additional) {
		return translated(GUIDEBOOK_BASE, key, additional);
	}

	public static IFormattableTextComponent gui(String key, Object... additional) {
		return translated(GUI_BASE, key, additional);
	}

	public static IFormattableTextComponent chatMessage(String key, Object... additional) {
		return translated(MESSAGE_BASE, key, additional);
	}

	public static IFormattableTextComponent jeiTranslated(String key, Object... additional) {
		return new TranslationTextComponent(JEI_BASE + "." + key, additional);
	}

	public static IFormattableTextComponent jeiItemTranslated(String key, Object... additional) {
		return jeiTranslated(JEI_INFO_ITEM + "." + key, additional);
	}

	public static IFormattableTextComponent jeiFluidTranslated(String key, Object... additional) {
		return jeiTranslated(JEI_INFO_FLUID + "." + key, additional);
	}

	public static IFormattableTextComponent block(String key, Object... additional) {
		return translated(BLOCK_BASE, key, additional);
	}

	public static IFormattableTextComponent translated(String base, String key, Object... additional) {
		return new TranslationTextComponent(base + "." + References.ID + "." + key, additional);
	}

	public static boolean guiExists(String key) {
		return translationExists(GUI_BASE, key);
	}

	public static boolean tooltipExists(String key) {
		return translationExists(TOOLTIP_BASE, key);
	}

	public static boolean translationExists(String base, String key) {
		return I18n.exists(base + "." + References.ID + "." + key);
	}

}
