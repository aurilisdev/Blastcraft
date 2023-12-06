package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import ballistix.common.tags.BallistixTags;
import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBrick;
import blastcraft.common.block.subtype.SubtypeWalling;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import electrodynamics.common.tags.ElectrodynamicsTags;
import electrodynamics.datagen.utils.recipe.AbstractRecipeGenerator;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsShapedCraftingRecipe;
import electrodynamics.datagen.utils.recipe.ElectrodynamicsShapelessCraftingRecipe;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.NotCondition;

public class BlastcraftCraftingTableRecipes extends AbstractRecipeGenerator {

	@Override
	public void addRecipes(Consumer<FinishedRecipe> consumer) {

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.blockCamoflage.asItem(), 12)
				//
				.addPattern("WGW")
				//
				.addPattern("GWG")
				//
				.addPattern("WGW")
				//
				.addKey('W', ItemTags.WOOL)
				//
				.addKey('G', Tags.Items.GLASS)
				//
				.complete(References.ID, "camoflage", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.blockGlassPressurePlate.asItem(), 1)
				//
				.addPattern("GG")
				//
				.addKey('G', Tags.Items.GLASS)
				//
				.complete(References.ID, "glass_pressureplate", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.blockSpike.asItem(), 6)
				//
				.addPattern("CGC")
				//
				.addPattern("PPP")
				//
				.addKey('C', Items.CACTUS)
				//
				.addKey('G', Items.GRASS)
				//
				.addKey('P', ElectrodynamicsTags.Items.PLATE_BRONZE)
				//
				.complete(References.ID, "spikes_regular", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.blockSpikeFire.asItem(), 1)
				//
				.addIngredient(BlastcraftBlocks.blockSpike.asItem())
				//
				.addIngredient(Items.FIRE_CHARGE)
				//
				.complete(References.ID, "spikes_fire", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.blockSpikePoison.asItem(), 1)
				//
				.addIngredient(BlastcraftBlocks.blockSpike.asItem())
				//
				.addIngredient(Items.SPIDER_EYE)
				//
				.addConditions(new NotCondition(new ModLoadedCondition(ballistix.References.ID)))
				//
				.complete(References.ID, "spikes_poison_spidereye", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.blockSpikePoison.asItem(), 1)
				//
				.addIngredient(BlastcraftBlocks.blockSpike.asItem())
				//
				.addIngredient(BallistixTags.Items.DUST_POISON)
				//
				.addConditions(new ModLoadedCondition(ballistix.References.ID))
				//
				.complete(References.ID, "spikes_poison_poisondust", consumer);

		// BASE BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem(), 3)
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addKey('W', BlastcraftTags.Items.BLASTPROOF_WALLS)
				//
				.addKey('C', ItemTags.COALS)
				//
				.complete(References.ID, "base_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem(), 6)
				//
				.addPattern("OBO")
				//
				.addPattern("OBO")
				//
				.addPattern("OBO")
				//
				.addKey('O', Tags.Items.OBSIDIAN)
				//
				.addKey('B', Items.BRICKS)
				//
				.complete(References.ID, "base_hardenedbricks_obsidian", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem(), 6)
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addKey('C', ElectrodynamicsTags.Items.CONCRETES)
				//
				.addKey('B', Items.BRICKS)
				//
				.complete(References.ID, "base_hardenedbricks_concrete", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem(), 3)
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addKey('H', BlastcraftTags.Items.HARDENED_BRICKS)
				//
				.addKey('O', Tags.Items.OBSIDIAN)
				//
				.complete(References.ID, "base_rawblastproofwalling_obsidian", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem(), 3)
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addKey('H', BlastcraftTags.Items.HARDENED_BRICKS)
				//
				.addKey('C', ElectrodynamicsTags.Items.CONCRETES)
				//
				.complete(References.ID, "base_rawblastproofwalling_concrete", consumer);

		// BIG BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.big).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base)))
				//
				.complete(References.ID, "big_blastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.big).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base)))
				//
				.complete(References.ID, "big_rawblastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.big).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base)))
				//
				.complete(References.ID, "big_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.big).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base)))
				//
				.complete(References.ID, "big_hardenedbricks", consumer);

		// POLISHED BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.polished).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.smooth)))
				//
				.complete(References.ID, "polished_blastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.polished).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.smooth)))
				//
				.complete(References.ID, "polished_rawblastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.polished).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.smooth)))
				//
				.complete(References.ID, "polished_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.polished).asItem(), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.smooth)))
				//
				.complete(References.ID, "polished_hardenedbricks", consumer);

		// GLASS BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.blastproofwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.BLASTPROOF_WALLS)
				//
				.complete(References.ID, "glass_blastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.rawblastproofwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.RAW_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "glass_rawblastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.carbonplatedwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.CARBON_PLATED_WALLS)
				//
				.complete(References.ID, "glass_carbonplatedwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.hardenedbricks).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.HARDENED_BRICKS)
				//
				.complete(References.ID, "glass_hardenedbricks", consumer);

		// RESET BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.blastproofwalling, SubtypeBrick.base).asItem(), 1)
				//
				.addIngredient(BlastcraftTags.Items.BLASTPROOF_WALLS)
				//
				.complete(References.ID, "reset_blastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.rawblastproofwalling, SubtypeBrick.base).asItem(), 1)
				//
				.addIngredient(BlastcraftTags.Items.RAW_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "reset_rawblastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.carbonplatedwalling, SubtypeBrick.base).asItem(), 1)
				//
				.addIngredient(BlastcraftTags.Items.CARBON_PLATED_WALLS)
				//
				.complete(References.ID, "reset_carbonplatedwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getWallForType(SubtypeWalling.hardenedbricks, SubtypeBrick.base).asItem(), 1)
				//
				.addIngredient(BlastcraftTags.Items.HARDENED_BRICKS)
				//
				.complete(References.ID, "reset_hardenedbricks", consumer);

	}

	private void addMachines(Consumer<FinishedRecipe> consumer) {

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.blockBlastCompressor.asItem(), 1)
				//
				.addPattern("SFS")
				//
				.addPattern("PCP")
				//
				.addPattern("SSS")
				//
				.addKey('S', ElectrodynamicsTags.Items.PLATE_STEEL)
				//
				.addKey('F', Items.FURNACE)
				//
				.addKey('P', Items.PISTON)
				//
				.addKey('C', ElectrodynamicsTags.Items.CIRCUITS_ADVANCED)
				//
				.complete(References.ID, "blastcompressor", consumer);

	}

}
