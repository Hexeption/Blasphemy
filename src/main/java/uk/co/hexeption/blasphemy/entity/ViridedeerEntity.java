package uk.co.hexeption.blasphemy.entity;

import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import uk.co.hexeption.blasphemy.init.ModMobEntities;

/**
 * ViridedeerEntity
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/03/2020 - 09:00 am
 */
public class ViridedeerEntity extends AnimalEntity {

    private static final Ingredient BREEDING_INGREDIENT = Ingredient.ofItems(Items.PURPLE_DYE);

    public ViridedeerEntity(World world) {
        super(ModMobEntities.VIRIDEDEER_ENTITY, world);
    }

    @Override
    public PassiveEntity createChild(PassiveEntity mate) {
        return (ViridedeerEntity) ModMobEntities.VIRIDEDEER_ENTITY.create(this.world);
    }

    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(EntityAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.25D));
        this.goalSelector.add(3, new AnimalMateGoal(this, 1.0D));
        this.goalSelector.add(4, new TemptGoal(this, 1.2D, Ingredient.ofItems(Items.OAK_BOAT), false));
        this.goalSelector.add(4, new TemptGoal(this, 1.2D, false, BREEDING_INGREDIENT));
        this.goalSelector.add(5, new FollowParentGoal(this, 1.1D));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(7, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }

    @Override
    public boolean interactMob(PlayerEntity player, Hand hand) {
        if (super.interactMob(player, hand)) {
            return true;
        } else {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.getItem() == Items.NAME_TAG) {
                itemStack.useOnEntity(player, this, hand);
                return true;
            } else {
                return itemStack.useOnEntity(player, this, hand);
            }
        }
    }


}
