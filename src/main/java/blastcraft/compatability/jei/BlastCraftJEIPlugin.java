package blastcraft.compatability.jei;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import blastcraft.compatability.jei.recipecategories.psuedorecipes.BlastCraftPsuedoRecipes;
import electrodynamics.client.screen.ScreenO2OProcessor;
import electrodynamics.common.recipe.MachineRecipes;
import electrodynamics.compatability.jei.ElectrodynamicsJEIPlugin;
import blastcraft.compatability.jei.recipecategories.specificmachines.blastcraft.BlastCompressorRecipeCategory;
import electrodynamics.prefab.tile.processing.O2OProcessingRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;

@JeiPlugin
public class BlastCraftJEIPlugin implements IModPlugin{
	
	//public static final boolean isBlastCraftLoaded = ModList.get().isLoaded("blastcraft");
	
	private static final Logger logger = LogManager.getLogger(electrodynamics.api.References.ID);
	
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(blastcraft.References.ID, "blastc_jei_plugin");
	}
	
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration)
	{
		//Blast Compressor
		registration.addRecipeCatalyst(new ItemStack(blastcraft.DeferredRegisters.blockBlastCompressor.getBlock()), 
				BlastCompressorRecipeCategory.UID);
	}
	
	@Override
	public void registerRecipes(IRecipeRegistration registration) 
	{
		BlastCraftPsuedoRecipes.addBlastCraftRecipes();
		
		//Blast Compressor
		Set<O2OProcessingRecipe> blastCompressorRecipes = 
				MachineRecipes.o2orecipemap.get(blastcraft.DeferredRegisters.TILE_BLASTCOMPRESSOR.get());
		
		registration.addRecipes(blastCompressorRecipes, BlastCompressorRecipeCategory.UID);
		
		blastcraftInfoTabs(registration);
			
	}
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) 
	{
		//Blast Compressor
		registration.addRecipeCategories(new BlastCompressorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}
	
	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration registry) {
		int[] O2OArrowLocation = {80,35,22,15};
		
		//Each click area needs to be tied to a unique machine Screen class. Otherwise you will get multiple machines
		//popping up as with the O2O recipes for example
		
		//Wire Mill, Mineral Grinder, Mineral Crusher, Blast Compressor
		registry.addRecipeClickArea(ScreenO2OProcessor.class, O2OArrowLocation[0], O2OArrowLocation[1], O2OArrowLocation[2], O2OArrowLocation[3],
				BlastCraftJEIPlugin.getO2OGuiScreens()
		);
	}
	
	private static ResourceLocation[] getO2OGuiScreens() {
		ResourceLocation[] edLocations = ElectrodynamicsJEIPlugin.getO2OGuiScreens();
		ResourceLocation[] totalLocations = new ResourceLocation[edLocations.length + 1];
		for(int i = 0; i < totalLocations.length - 1;i++) {
			totalLocations[i] = edLocations[i];
		}
		totalLocations[totalLocations.length - 1] = BlastCompressorRecipeCategory.UID;
		return totalLocations;
	}

	
	
	
	private void blastcraftInfoTabs(IRecipeRegistration registration) {
		
	}
	

}
