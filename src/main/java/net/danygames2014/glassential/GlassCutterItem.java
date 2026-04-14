package net.danygames2014.glassential;

import net.danygames2014.glassential.block.GlassentialGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.template.item.TemplateToolItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class GlassCutterItem extends TemplateToolItem {
    private static final Block[] effectiveBlocks = new Block[] {Block.GLASS};
    
    public GlassCutterItem(Identifier identifier, ToolMaterial material) {
        super(identifier, 1, material, effectiveBlocks);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, Block block) {
        if (block instanceof GlassBlock || block instanceof GlassentialGlassBlock) {
            return this.miningSpeed;
        }
        
        return super.getMiningSpeedMultiplier(stack, block);
    }

    @Override
    public boolean isSuitableFor(Block block) {
        return block instanceof GlassBlock || block instanceof GlassentialGlassBlock || super.isSuitableFor(block);
    }

    @Override
    public boolean postMine(ItemStack stack, int blockId, int x, int y, int z, LivingEntity player) {
        if (super.postMine(stack, blockId, x, y, z, player) && player.world.getBlockState(x, y, z).isOf(Block.GLASS)) {
            ItemEntity itemEntity = new ItemEntity(player.world, x + 0.5D, y + 0.5D, z + 0.5D, new ItemStack(Block.GLASS));
            itemEntity.pickupDelay = 10;
            player.world.spawnEntity(itemEntity);
            return true;
        }
        
        return false;
    }
}
