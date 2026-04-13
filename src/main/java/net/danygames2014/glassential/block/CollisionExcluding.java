package net.danygames2014.glassential.block;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public interface CollisionExcluding {
    boolean excludeCollision(World world, int x, int y, int z, Entity entity);
}
