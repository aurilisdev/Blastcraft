package blastcraft.datagen.server.recipe.vanilla;

import java.util.function.Consumer;

import ballistix.common.tags.BallistixTags;
import blastcraft.References;
import blastcraft.common.block.subtype.SubtypeBlastproofWall;
import blastcraft.common.block.subtype.SubtypeCarbonPlatedWall;
import blastcraft.common.block.subtype.SubtypeConcrete;
import blastcraft.common.block.subtype.SubtypeHardenedBricks;
import blastcraft.common.block.subtype.SubtypeRawBlastproofWall;
import blastcraft.common.block.subtype.SubtypeWallingGlass;
import blastcraft.common.tag.BlastcraftTags;
import blastcraft.registers.BlastcraftBlocks;
import blastcraft.registers.BlastcraftItems;
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

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.ITEM_CONCRETEMIX.get(), 4)
				//
				.addPattern("SGS")
				//
				.addPattern("GMG")
				//
				.addPattern("SGS")
				//
				.addKey('S', ItemTags.SAND)
				//
				.addKey('G', Tags.Items.GRAVEL)
				//
				.addKey('M', ElectrodynamicsTags.Items.SLAG)
				//
				.complete(References.ID, "concretemix_slag", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.ITEM_CONCRETEMIX.get(), 10)
				//
				.addPattern("SGS")
				//
				.addPattern("GMG")
				//
				.addPattern("SGS")
				//
				.addKey('S', ItemTags.SAND)
				//
				.addKey('G', Tags.Items.GRAVEL)
				//
				.addKey('M', ElectrodynamicsTags.Items.DUST_NETHERITE)
				//
				.complete(References.ID, "concretemix_netherite", consumer);

		addMachines(consumer);

		addHardenedBricks(consumer);

		addRawBlastproofWalls(consumer);

		addBlastproofWalls(consumer);

		addCarbonPlatedWalls(consumer);

		addConcrete(consumer);

		// GLASS BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.blastproofwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "glass_blastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.rawblastproofwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "glass_rawblastproofwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.carbonplatedwalling).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS)
				//
				.complete(References.ID, "glass_carbonplatedwalling", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeWallingGlass.hardenedbricks).asItem(), 1)
				//
				.addIngredient(Tags.Items.GLASS)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.complete(References.ID, "glass_hardenedbricks", consumer);

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

	private void addHardenedBricks(Consumer<FinishedRecipe> consumer) {

		// BASE BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 6)
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

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 6)
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addPattern("CBC")
				//
				.addKey('C', BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.addKey('B', Items.BRICKS)
				//
				.complete(References.ID, "base_hardenedbricks_concrete", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.base))
				//
				.complete(References.ID, "base_hardenedbricks_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.base_stairs))
				//
				.complete(References.ID, "base_hardenedbricks_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.base))
				//
				.complete(References.ID, "base_hardenedbricks_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.base_wall))
				//
				.complete(References.ID, "base_hardenedbricks_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.base))
				//
				.complete(References.ID, "base_hardenedbricks_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.base_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.base_slab))
				//
				.complete(References.ID, "base_hardenedbricks_slabreset", consumer);

		// BIG BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeHardenedBricks.base)))
				//
				.complete(References.ID, "big_hardenedbricks", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.big))
				//
				.complete(References.ID, "big_hardenedbricks_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.big_stairs))
				//
				.complete(References.ID, "big_hardenedbricks_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.big))
				//
				.complete(References.ID, "big_hardenedbricks_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.big_wall))
				//
				.complete(References.ID, "big_hardenedbricks_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.big))
				//
				.complete(References.ID, "big_hardenedbricks_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.big_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.big_slab))
				//
				.complete(References.ID, "big_hardenedbricks_slabreset", consumer);

		// SMOOTH

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.smooth))
				//
				.complete(References.ID, "smooth_hardenedbricks_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_stairs))
				//
				.complete(References.ID, "smooth_hardenedbricks_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.smooth))
				//
				.complete(References.ID, "smooth_hardenedbricks_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_wall))
				//
				.complete(References.ID, "smooth_hardenedbricks_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.smooth))
				//
				.complete(References.ID, "smooth_hardenedbricks_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth_slab))
				//
				.complete(References.ID, "smooth_hardenedbricks_slabreset", consumer);

		// POLISHED BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeHardenedBricks.smooth)))
				//
				.complete(References.ID, "polished_hardenedbricks", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.polished))
				//
				.complete(References.ID, "polished_hardenedbricks_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_stairs))
				//
				.complete(References.ID, "polished_hardenedbricks_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.polished))
				//
				.complete(References.ID, "polished_hardenedbricks_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_wall))
				//
				.complete(References.ID, "polished_hardenedbricks_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeHardenedBricks.polished))
				//
				.complete(References.ID, "polished_hardenedbricks_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeHardenedBricks.polished_slab))
				//
				.complete(References.ID, "polished_hardenedbricks_slabreset", consumer);

		// RESET BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeHardenedBricks.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.complete(References.ID, "reset_hardenedbricks", consumer);

	}

	private void addRawBlastproofWalls(Consumer<FinishedRecipe> consumer) {

		// BASE BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 3)
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addPattern("OHO")
				//
				.addKey('H', BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.addKey('O', Tags.Items.OBSIDIAN)
				//
				.complete(References.ID, "base_rawblastproofwalling_obsidian", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 3)
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addPattern("CHC")
				//
				.addKey('H', BlastcraftTags.Items.SOLID_HARDENED_BRICKS)
				//
				.addKey('C', BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.complete(References.ID, "base_rawblastproofwalling_concrete", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.base))
				//
				.complete(References.ID, "base_rawblastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_stairs))
				//
				.complete(References.ID, "base_rawblastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.base))
				//
				.complete(References.ID, "base_rawblastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_wall))
				//
				.complete(References.ID, "base_rawblastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.base))
				//
				.complete(References.ID, "base_rawblastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base_slab))
				//
				.complete(References.ID, "base_rawblastproofwall_slabreset", consumer);

		// BIG BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base)))
				//
				.complete(References.ID, "big_rawblastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.big))
				//
				.complete(References.ID, "big_rawblastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_stairs))
				//
				.complete(References.ID, "big_rawblastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.big))
				//
				.complete(References.ID, "big_rawblastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_wall))
				//
				.complete(References.ID, "big_rawblastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.big))
				//
				.complete(References.ID, "big_rawblastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.big_slab))
				//
				.complete(References.ID, "big_rawblastproofwall_slabreset", consumer);

		// SMOOTH

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_rawblastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_stairs))
				//
				.complete(References.ID, "smooth_rawblastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_rawblastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_wall))
				//
				.complete(References.ID, "smooth_rawblastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_rawblastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth_slab))
				//
				.complete(References.ID, "smooth_rawblastproofwall_slabreset", consumer);

		// POLISHED BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeRawBlastproofWall.smooth)))
				//
				.complete(References.ID, "polished_rawblastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished))
				//
				.complete(References.ID, "polished_rawblastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_stairs))
				//
				.complete(References.ID, "polished_rawblastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished))
				//
				.complete(References.ID, "polished_rawblastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_wall))
				//
				.complete(References.ID, "polished_rawblastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished))
				//
				.complete(References.ID, "polished_rawblastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeRawBlastproofWall.polished_slab))
				//
				.complete(References.ID, "polished_rawblastproofwall_slabreset", consumer);

		// RESET BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeRawBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_RAW_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "reset_rawblastproofwalling", consumer);

	}

	private void addBlastproofWalls(Consumer<FinishedRecipe> consumer) {

		// BASE BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.base))
				//
				.complete(References.ID, "base_blastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.base_stairs))
				//
				.complete(References.ID, "base_blastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.base))
				//
				.complete(References.ID, "base_blastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.base_wall))
				//
				.complete(References.ID, "base_blastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.base))
				//
				.complete(References.ID, "base_blastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.base_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.base_slab))
				//
				.complete(References.ID, "base_blastproofwall_slabreset", consumer);

		// BIG BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeBlastproofWall.base)))
				//
				.complete(References.ID, "big_blastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.big))
				//
				.complete(References.ID, "big_blastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.big_stairs))
				//
				.complete(References.ID, "big_blastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.big))
				//
				.complete(References.ID, "big_blastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.big_wall))
				//
				.complete(References.ID, "big_blastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.big))
				//
				.complete(References.ID, "big_blastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.big_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.big_slab))
				//
				.complete(References.ID, "big_blastproofwall_slabreset", consumer);

		// SMOOTH

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_blastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_stairs))
				//
				.complete(References.ID, "smooth_blastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_blastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_wall))
				//
				.complete(References.ID, "smooth_blastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.smooth))
				//
				.complete(References.ID, "smooth_blastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth_slab))
				//
				.complete(References.ID, "smooth_blastproofwall_slabreset", consumer);

		// POLISHED BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeBlastproofWall.smooth)))
				//
				.complete(References.ID, "polished_blastproofwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.polished))
				//
				.complete(References.ID, "polished_blastproofwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_stairs))
				//
				.complete(References.ID, "polished_blastproofwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.polished))
				//
				.complete(References.ID, "polished_blastproofwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_wall))
				//
				.complete(References.ID, "polished_blastproofwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeBlastproofWall.polished))
				//
				.complete(References.ID, "polished_blastproofwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeBlastproofWall.polished_slab))
				//
				.complete(References.ID, "polished_blastproofwall_slabreset", consumer);

		// RESET BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeBlastproofWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.complete(References.ID, "reset_blastproofwalling", consumer);

	}

	private void addCarbonPlatedWalls(Consumer<FinishedRecipe> consumer) {

		// BASE BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 3)
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addPattern("CWC")
				//
				.addKey('W', BlastcraftTags.Items.SOLID_BLASTPROOF_WALLS)
				//
				.addKey('C', ItemTags.COALS)
				//
				.complete(References.ID, "base_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base))
				//
				.complete(References.ID, "base_carbonplatedwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_stairs))
				//
				.complete(References.ID, "base_carbonplatedwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base))
				//
				.complete(References.ID, "base_carbonplatedwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_wall))
				//
				.complete(References.ID, "base_carbonplatedwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base))
				//
				.complete(References.ID, "base_carbonplatedwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base_slab))
				//
				.complete(References.ID, "base_carbonplatedwall_slabreset", consumer);

		// BIG BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base)))
				//
				.complete(References.ID, "big_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big))
				//
				.complete(References.ID, "big_carbonplatedwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_stairs))
				//
				.complete(References.ID, "big_carbonplatedwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big))
				//
				.complete(References.ID, "big_carbonplatedwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_wall))
				//
				.complete(References.ID, "big_carbonplatedwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big))
				//
				.complete(References.ID, "big_carbonplatedwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.big_slab))
				//
				.complete(References.ID, "big_carbonplatedwall_slabreset", consumer);

		// SMOOTH

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(References.ID, "smooth_carbonplatedwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_stairs))
				//
				.complete(References.ID, "smooth_carbonplatedwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(References.ID, "smooth_carbonplatedwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_wall))
				//
				.complete(References.ID, "smooth_carbonplatedwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth))
				//
				.complete(References.ID, "smooth_carbonplatedwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth_slab))
				//
				.complete(References.ID, "smooth_carbonplatedwall_slabreset", consumer);

		// POLISHED BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), 4)
				//
				.addPattern("BB")
				//
				.addPattern("BB")
				//
				.addKey('B', new ItemStack(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.smooth)))
				//
				.complete(References.ID, "polished_carbonplatedwalling", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished))
				//
				.complete(References.ID, "polished_carbonplatedwall_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_stairs))
				//
				.complete(References.ID, "polished_carbonplatedwall_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished))
				//
				.complete(References.ID, "polished_carbonplatedwall_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_wall))
				//
				.complete(References.ID, "polished_carbonplatedwall_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished))
				//
				.complete(References.ID, "polished_carbonplatedwall_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.polished_slab))
				//
				.complete(References.ID, "polished_carbonplatedwall_slabreset", consumer);

		// RESET BRICKS

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeCarbonPlatedWall.base), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CARBON_PLATED_WALLS)
				//
				.complete(References.ID, "reset_carbonplatedwalling", consumer);
	}

	private void addConcrete(Consumer<FinishedRecipe> consumer) {

		// REGULAR

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.regular))
				//
				.complete(References.ID, "regular_concrete_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.regular_stairs))
				//
				.complete(References.ID, "regular_concrete_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.regular))
				//
				.complete(References.ID, "regular_concrete_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.regular_wall))
				//
				.complete(References.ID, "regular_concrete_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.regular))
				//
				.complete(References.ID, "regular_concrete_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.regular), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.regular_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.regular_slab))
				//
				.complete(References.ID, "regular_concrete_slabreset", consumer);

		// BRICKS

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeConcrete.bricks).asItem(), 4)
				//
				.addPattern("CC")
				//
				.addPattern("CC")
				//
				.addKey('C', BlastcraftBlocks.getBlock(SubtypeConcrete.regular).asItem())
				//
				.complete(References.ID, "bricks_concrete", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.bricks))
				//
				.complete(References.ID, "bricks_concrete_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.bricks_stairs))
				//
				.complete(References.ID, "bricks_concrete_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.bricks))
				//
				.complete(References.ID, "bricks_concrete_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.bricks_wall))
				//
				.complete(References.ID, "bricks_concrete_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.bricks))
				//
				.complete(References.ID, "bricks_concrete_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.bricks), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.bricks_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.bricks_slab))
				//
				.complete(References.ID, "bricks_concrete_slabreset", consumer);

		// TILE

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeConcrete.tile).asItem(), 4)
				//
				.addPattern("CC")
				//
				.addPattern("CC")
				//
				.addKey('C', BlastcraftBlocks.getBlock(SubtypeConcrete.bricks).asItem())
				//
				.complete(References.ID, "tile_concrete", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile_stairs), 6)
				//
				.addPattern("B  ")
				//
				.addPattern("BB ")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.tile))
				//
				.complete(References.ID, "tile_concrete_stairs", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.tile_stairs))
				//
				.complete(References.ID, "tile_concrete_stairsreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile_wall), 6)
				//
				.addPattern("BBB")
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.tile))
				//
				.complete(References.ID, "tile_concrete_wall", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.tile_wall))
				//
				.complete(References.ID, "tile_concrete_wallreset", consumer);

		ElectrodynamicsShapedCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile_slab), 6)
				//
				.addPattern("BBB")
				//
				.addKey('B', BlastcraftItems.getItem(SubtypeConcrete.tile))
				//
				.complete(References.ID, "tile_concrete_slab", consumer);

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftItems.getItem(SubtypeConcrete.tile), 1)
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.tile_slab))
				//
				.addIngredient(BlastcraftItems.getItem(SubtypeConcrete.tile_slab))
				//
				.complete(References.ID, "tile_concrete_slabreset", consumer);

		// RESET

		ElectrodynamicsShapelessCraftingRecipe.start(BlastcraftBlocks.getBlock(SubtypeConcrete.regular).asItem(), 1)
				//
				.addIngredient(BlastcraftTags.Items.SOLID_CONCRETES)
				//
				.complete(References.ID, "reset_concrete", consumer);
	}

}
