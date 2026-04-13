package net.danygames2014.glassential.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class GlassentialGlassBlock extends TemplateBlock {
    public GlassentialGlassBlock(Identifier identifier) {
        super(identifier, Material.GLASS);
        this.setTranslationKey(identifier);
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
}
