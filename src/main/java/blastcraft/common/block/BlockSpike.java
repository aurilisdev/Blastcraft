package blastcraft.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockSpike extends Block {

    public BlockSpike() {
	super(Properties.of(Material.METAL).strength(1F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).noCollission());
    }

    @Override
    public void stepOn(Level worldIn, BlockPos pos, Entity entityIn) {
	if (entityIn instanceof LivingEntity) {
	    entityIn.hurt(DamageSource.CACTUS, 2f);
	}
    }

    public static class BlockSpikeFire extends BlockSpike {
	@Override
	public void stepOn(Level worldIn, BlockPos pos, Entity entityIn) {
	    if (entityIn instanceof LivingEntity) {
		entityIn.setSecondsOnFire(10);
		entityIn.hurt(DamageSource.CACTUS, 1f);
	    }
	}
    }

    public static class BlockSpikePoison extends BlockSpike {
	@Override
	public void stepOn(Level worldIn, BlockPos pos, Entity entityIn) {
	    if (entityIn instanceof LivingEntity) {
		((LivingEntity) entityIn).addEffect(new MobEffectInstance(MobEffects.POISON, 200, 1));
		entityIn.hurt(DamageSource.CACTUS, 1f);
	    }
	}
    }

}
