package blastcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockSpike extends Block {

	public BlockSpike() {
		super(Properties.of(Material.METAL).strength(1F).sound(SoundType.METAL).noOcclusion());
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader getter, BlockPos pos, ISelectionContext context) {
		return VoxelShapes.box(0, 0, 0, 1, 4.0 / 16.0, 1);
	}

	@Override
	public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof LivingEntity) {
			entityIn.hurt(DamageSource.CACTUS, 2f);
		}
	}

	public static class BlockSpikeFire extends BlockSpike {
		@Override
		public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
			if (entityIn instanceof LivingEntity) {
				entityIn.setSecondsOnFire(10);
				entityIn.hurt(DamageSource.CACTUS, 1f);
			}
		}
	}

	public static class BlockSpikePoison extends BlockSpike {
		@Override
		public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
			if (entityIn instanceof LivingEntity) {
				((LivingEntity) entityIn).addEffect(new EffectInstance(Effects.POISON, 200, 1));
				entityIn.hurt(DamageSource.CACTUS, 1f);
			}
		}
	}

}