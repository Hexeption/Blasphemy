package uk.co.hexeption.blasphemy.entity.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import uk.co.hexeption.blasphemy.entity.ViridedeerEntity;

public class ViridedeerEntityModel extends EntityModel<ViridedeerEntity> {

    private final ModelPart bb_main;

    public ViridedeerEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.addCuboid("bb_main", -4.2F, -14.0F, -8.0F, 3, 14, 3, 0.0F, 0, 36);
        bb_main.addCuboid("bb_main", -4.2F, -14.0F, 4.0F, 3, 14, 3, 0.0F, 0, 0);
        bb_main.addCuboid("bb_main", 1.2F, -14.0F, -8.0F, 3, 14, 3, 0.0F, 33, 0);
        bb_main.addCuboid("bb_main", 1.2F, -14.0F, 4.0F, 3, 14, 3, 0.0F, 24, 24);
        bb_main.addCuboid("bb_main", -4.0F, -18.0F, -9.0F, 8, 7, 17, 0.0F, 0, 0);
        bb_main.addCuboid("bb_main", -3.0F, -22.0F, -15.0F, 6, 6, 6, 0.0F, 0, 24);
        bb_main.addCuboid("bb_main", -2.0F, -21.0F, -19.0F, 4, 4, 4, 0.0F, 36, 24);
        bb_main.addCuboid("bb_main", 1.0F, -31.0F, -11.0F, 1, 11, 1, 0.0F, 12, 0);
        bb_main.addCuboid("bb_main", -2.0F, -30.0F, -11.0F, 1, 10, 1, 0.0F, 12, 42);
        bb_main.addCuboid("bb_main", -2.0F, -17.0F, 7.0F, 4, 4, 5, 0.0F, 31, 36);
        bb_main.addCuboid("bb_main", -1.0F, -17.0F, 16.0F, 2, 2, 4, 0.0F, 20, 41);
        bb_main.addCuboid("bb_main", -1.0F, -16.0F, 12.0F, 2, 2, 4, 0.0F, 12, 36);
        bb_main.addCuboid("bb_main", 2.0F, -29.0F, -11.0F, 1, 1, 1, 0.0F, 18, 24);
        bb_main.addCuboid("bb_main", -3.0F, -28.0F, -11.0F, 1, 1, 1, 0.0F, 12, 14);
        bb_main.addCuboid("bb_main", 0.0F, -28.0F, -11.0F, 1, 1, 1, 0.0F, 0, 24);
        bb_main.addCuboid("bb_main", -1.0F, -27.0F, -11.0F, 1, 1, 1, 0.0F, 12, 12);
    }

    @Override
    public void setAngles(ViridedeerEntity entity, float limbAngle, float limbDistance, float customAngle, float headYaw, float headPitch) {
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        bb_main.render(matrices, vertexConsumer, light, overlay);
    }
}
