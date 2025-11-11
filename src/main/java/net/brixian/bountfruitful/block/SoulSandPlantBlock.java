package net.brixian.bountfruitful.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class SoulSandPlantBlock extends Block {
    protected SoulSandPlantBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    protected abstract MapCodec<? extends net.minecraft.block.PlantBlock> getCodec();

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SOUL_SPEED_BLOCKS);
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);
    }

    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return type == NavigationType.AIR && !this.collidable ? true : super.canPathfindThrough(state, type);
    }
}
