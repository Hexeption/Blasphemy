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
import uk.co.hexeption.blasphemy.init.ModItems;

public class Blasphemy implements ModInitializer {


    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
