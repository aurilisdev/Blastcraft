package blastcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BlockSpike extends Block {

    public BlockSpike() {
	super(Properties.create(Material.IRON).hardnessAndResistance(1F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).doesNotBlockMovement());
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
	if (entityIn instanceof LivingEntity) {
	    entityIn.attackEntityFrom(DamageSource.CACTUS, 2f);
	}
    }

    public static class BlockSpikeFire extends BlockSpike {
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
	    if (entityIn instanceof LivingEntity) {
		entityIn.setFire(10);
		entityIn.attackEntityFrom(DamageSource.CACTUS, 1f);
	    }
	}
    }

    public static class BlockSpikePoison extends BlockSpike {
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
	    if (entityIn instanceof LivingEntity) {
		((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.POISON, 200, 1));
		entityIn.attackEntityFrom(DamageSource.CACTUS, 1f);
	    }
	}
    }

}
