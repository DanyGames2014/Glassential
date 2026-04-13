package net.danygames2014.glassential.block;

import net.modificationstation.stationapi.api.util.Identifier;

public class LuminousGlassBlock extends GlassentialGlassBlock {
    public LuminousGlassBlock(Identifier identifier) {
        super(identifier);
        this.setLuminance(1.0F);
    }
}
