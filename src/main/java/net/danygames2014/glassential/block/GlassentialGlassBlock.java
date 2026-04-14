package net.danygames2014.glassential.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.material.Material;
import net.minecraft.world.BlockView;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class GlassentialGlassBlock extends TemplateBlock {
    public GlassentialGlassBlock(Identifier identifier) {
        super(identifier, Material.GLASS);
        this.setTranslationKey(identifier);
        this.setHardness(0.3F);
        this.setSoundGroup(GLASS_SOUND_GROUP);
    }

    @Override
    public boolean isFullCube() {
        return false;
    }
    
    @Override
    public boolean isOpaque() {
        return false;
    }

    @Environment(EnvType.CLIENT)
    public int getRenderLayer() {
        return 0;
    }

    @Environment(EnvType.CLIENT)
    public boolean isSideVisible(BlockView blockView, int x, int y, int z, int side) {
        int blockId = blockView.getBlockId(x, y, z);
        return blockId != this.id && super.isSideVisible(blockView, x, y, z, side);
    }
}
