package uk.co.hexeption.blasphemy.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModGroups {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("blasphemy", "general"),
        () -> new ItemStack(ModItems.ITEM_WAND));

}
