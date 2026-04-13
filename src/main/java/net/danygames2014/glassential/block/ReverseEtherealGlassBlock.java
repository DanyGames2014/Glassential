package net.danygames2014.glassential.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

public class ReverseEtherealGlassBlock extends GlassentialGlassBlock implements CollisionExcluding {
    public ReverseEtherealGlassBlock(Identifier identifier) {
        super(identifier);
    }

    @Override
    public boolean excludeCollision(World world, int x, int y, int z, Entity entity) {
        return !(entity instanceof PlayerEntity);
    }
}
