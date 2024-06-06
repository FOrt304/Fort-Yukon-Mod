package net.kaupenjoe.tutorialmod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;

public class BlueDragonEntity extends Mob {
    public BlueDragonEntity(EntityType<? extends Mob> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }
}