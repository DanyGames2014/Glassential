package net.danygames2014.glassential.block;

import net.minecraft.world.BlockView;
import net.modificationstation.stationapi.api.util.Identifier;

public class RedstoneGlassBlock extends GlassentialGlassBlock {
    public RedstoneGlassBlock(Identifier identifier) {
        super(identifier);
    }

    @Override
    public boolean canEmitRedstonePower() {
        return true;
    }

    @Override
    public boolean isPoweringSide(BlockView blockView, int x, int y, int z, int side) {
        return true;
    }
}
