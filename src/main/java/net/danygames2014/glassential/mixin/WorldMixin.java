package net.danygames2014.glassential.mixin;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import net.danygames2014.glassential.block.CollisionExcluding;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.ArrayList;

@SuppressWarnings({"rawtypes", "NameDoesntMatchTargetClass", "RedundantIfStatement", "LocalMayUseName"})
@Mixin(World.class)
public class WorldMixin {
    @WrapWithCondition(method = "getEntityCollisions", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;addIntersectingBoundingBox(Lnet/minecraft/world/World;IIILnet/minecraft/util/math/Box;Ljava/util/ArrayList;)V"))
    public boolean tomFoolery(Block block, World world, int x, int y, int z, Box box, ArrayList boxes, @Local(argsOnly = true, ordinal = 0) Entity entity) {
        if (block instanceof CollisionExcluding collisionExcluding && collisionExcluding.excludeCollision(world, x, y, z, entity)) {
            return false;
        }
        
        return true;
    }
}
