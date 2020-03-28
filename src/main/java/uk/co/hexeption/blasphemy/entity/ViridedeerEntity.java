package uk.co.hexeption.blasphemy.entity;

import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;
import uk.co.hexeption.blasphemy.Blasphemy;

/**
 * ViridedeerEntity
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/03/2020 - 09:00 am
 */
public class ViridedeerEntity extends PassiveEntity {

    public ViridedeerEntity(World world) {
        super(Blasphemy.VIRIDEDEER_ENTITY_ENTITY_TYPE, world);
    }

    @Override
    public PassiveEntity createChild(PassiveEntity mate) {
        return null;
    }



}
