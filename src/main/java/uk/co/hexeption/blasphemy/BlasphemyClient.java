package uk.co.hexeption.blasphemy;

import static uk.co.hexeption.blasphemy.Blasphemy.VIRIDEDEER_ENTITY_ENTITY_TYPE;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import uk.co.hexeption.blasphemy.entity.renderer.ViridedeerEntityRenderer;

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
        EntityRendererRegistry.INSTANCE.register(VIRIDEDEER_ENTITY_ENTITY_TYPE, ((entityRenderDispatcher, context) -> new ViridedeerEntityRenderer(entityRenderDispatcher)));
    }
}
