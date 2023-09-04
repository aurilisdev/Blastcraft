package blastcraft.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockSpike extends Block {

	public BlockSpike() {
		super(Properties.copy(Blocks.IRON_BLOCK).strength(1F).sound(SoundType.METAL).noOcclusion());
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
		return Shapes.box(0, 0, 0, 1, 4.0 / 16.0, 1);
	}

	@Override
	public void stepOn(Level worldIn, BlockPos pos, BlockState state, Entity entityIn) {
		if (entityIn instanceof LivingEntity) {
			entityIn.hurt(entityIn.damageSources().cactus(), 2f);
		}
	}

	public static class BlockSpikeFire extends BlockSpike {
		@Override
		public void stepOn(Level worldIn, BlockPos pos, BlockState state, Entity entityIn) {
			if (entityIn instanceof LivingEntity) {
				entityIn.setSecondsOnFire(10);
				entityIn.hurt(entityIn.damageSources().cactus(), 1f);
			}
		}
	}

	public static class BlockSpikePoison extends BlockSpike {
		@Override
		public void stepOn(Level worldIn, BlockPos pos, BlockState state, Entity entityIn) {
			if (entityIn instanceof LivingEntity l) {
				l.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 1));
				entityIn.hurt(entityIn.damageSources().cactus(), 1f);
			}
		}
	}

}
