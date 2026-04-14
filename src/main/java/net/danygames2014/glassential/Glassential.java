package net.danygames2014.glassential;

import javafx.scene.paint.Material;
import net.danygames2014.glassential.block.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Namespace;

public class Glassential {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;
    
    public static Block clearGlass;
    public static Block darkGlass;
    public static Block etherealGlass;
    public static Block reverseEtherealGlass;
    public static Block ghostlyGlass;
    public static Block luminousGlass;
    public static Block redstoneGlass;
    
    public static Item ironGlassCutter;
    
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        clearGlass = new GlassentialGlassBlock(NAMESPACE.id("clear_glass"));
        darkGlass = new DarkGlassBlock(NAMESPACE.id("dark_glass"));
        etherealGlass = new EtherealGlassBlock(NAMESPACE.id("ethereal_glass"));
        reverseEtherealGlass = new ReverseEtherealGlassBlock(NAMESPACE.id("reverse_ethereal_glass"));
        ghostlyGlass = new GhostlyGlassBlock(NAMESPACE.id("ghostly_glass"));
        luminousGlass = new LuminousGlassBlock(NAMESPACE.id("luminous_glass"));
        redstoneGlass = new RedstoneGlassBlock(NAMESPACE.id("redstone_glass"));
    }
    
    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        ironGlassCutter = new GlassCutterItem(NAMESPACE.id("iron_glass_cutter"), ToolMaterial.IRON).setTranslationKey(NAMESPACE, "iron_glass_cutter");
    }
}
