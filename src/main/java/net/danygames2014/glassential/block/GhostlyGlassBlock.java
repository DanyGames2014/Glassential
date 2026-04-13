package net.danygames2014.glassential.block;

import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

public class GhostlyGlassBlock extends GlassentialGlassBlock {
    public GhostlyGlassBlock(Identifier identifier) {
        super(identifier);
    }

    @Override
    public Box getCollisionShape(World world, int x, int y, int z) {
        return null;
    }
}
