package uk.co.hexeption.blasphemy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.tag.FabricItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blasphemy implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("blasphemy", "general"),
        () -> new ItemStack(Blocks.COBBLESTONE));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("blasphemy", "wand"), new Item(new Settings().group(ITEM_GROUP)));
    }
}
