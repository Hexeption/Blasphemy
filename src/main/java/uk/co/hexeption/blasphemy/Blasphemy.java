package uk.co.hexeption.blasphemy;

import net.fabricmc.api.ModInitializer;
import uk.co.hexeption.blasphemy.init.ModItems;
import uk.co.hexeption.blasphemy.init.ModMobEntities;

public class Blasphemy implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
