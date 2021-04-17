package blastcraft.compatability.jei.recipecategories.psuedorecipes;

import java.util.ArrayList;

import electrodynamics.compatability.jei.recipecategories.psuedorecipes.PsuedoRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlastCraftPsuedoRecipes {

	public static void addBlastCraftRecipes() {
		PsuedoRecipes.addElectrodynamicsMachines();
		PsuedoRecipes.addElectrodynamicsFluids();
		PsuedoRecipes.addElectrodynamicsItems();
		
		addBlastCraftMachines();
		addBlastCraftFluids();
		addBlastCraftItems();
	}
	
	private static void addBlastCraftMachines() {
		 
	}
	
	private static void addBlastCraftFluids() {
		
	}
	
	private static void addBlastCraftItems() {
		
	}
	
	private static ArrayList<ItemStack> formItemStacks(Item[] items, int countPerItemStack){
		ArrayList<ItemStack> inputItems = new ArrayList<ItemStack>();
		
		for(int i = 0; i < items.length;i++) {
			inputItems.add(new ItemStack(items[i]));
			inputItems.get(i).setCount(countPerItemStack);
		}
		return inputItems;
	}
	
}
