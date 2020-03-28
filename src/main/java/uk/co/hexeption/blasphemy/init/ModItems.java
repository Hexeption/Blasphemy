package uk.co.hexeption.blasphemy.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import uk.co.hexeption.blasphemy.items.ItemWand;

public class ModItems {

    public static final Item ITEM_WAND = new ItemWand(new Settings().group(ModGroups.ITEM_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("blasphemy", "wand"), ITEM_WAND);
        Registry.register(Registry.ITEM, new Identifier("blasphemy", "viridedeer_spawn_egg"), new SpawnEggItem(ModMobEntities.VIRIDEDEER_ENTITY, 0x198f4b, 0xffffff, new Item.Settings().group(ModGroups.ITEM_GROUP)));
    }
}
