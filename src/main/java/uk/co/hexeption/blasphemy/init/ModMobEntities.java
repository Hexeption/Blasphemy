package uk.co.hexeption.blasphemy.init;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import uk.co.hexeption.blasphemy.entity.ViridedeerEntity;
import uk.co.hexeption.blasphemy.entity.renderer.ViridedeerEntityRenderer;

/**
 * ModEntitys
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/03/2020 - 09:48 am
 */
public class ModMobEntities {

    public static EntityType<ViridedeerEntity> VIRIDEDEER_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier("blasphemy", "viridedeer"),
        FabricEntityTypeBuilder.create(EntityCategory.CREATURE, ViridedeerEntity::new).size(EntityDimensions.changing(1, 2)).build());

    @Environment(EnvType.CLIENT)
    public static void registerClientRenderer() {
        EntityRendererRegistry.INSTANCE.register(VIRIDEDEER_ENTITY, ((entityRenderDispatcher, context) -> new ViridedeerEntityRenderer(entityRenderDispatcher)));
    }


}
