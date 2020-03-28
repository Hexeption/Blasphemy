package uk.co.hexeption.blasphemy.entity.renderer;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import uk.co.hexeption.blasphemy.entity.ViridedeerEntity;
import uk.co.hexeption.blasphemy.entity.model.ViridedeerEntityModel;

/**
 * ViridedeerEntityRenderer
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/03/2020 - 09:21 am
 */
public class ViridedeerEntityRenderer extends MobEntityRenderer<ViridedeerEntity, ViridedeerEntityModel> {

    public ViridedeerEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new ViridedeerEntityModel(), 1);
    }

    @Override
    public Identifier getTexture(ViridedeerEntity entity) {
        return new Identifier("blasphemy:textures/entity/viridedeer/viridedeer.png");
    }
}
