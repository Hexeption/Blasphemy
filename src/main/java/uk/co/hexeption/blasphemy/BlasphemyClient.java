package uk.co.hexeption.blasphemy;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import uk.co.hexeption.blasphemy.init.ModMobEntities;

/**
 * BlasphemyClient
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/03/2020 - 09:28 am
 */
@Environment(EnvType.CLIENT)
public class BlasphemyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModMobEntities.registerClientRenderer();
    }
}
