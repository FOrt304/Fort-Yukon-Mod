package github.al0046.fortyukon.util;

import net.minecraft.core.BlockPos;

public interface JammingEntity {

    void resetJammingInfo();

    void updateMusicSource(BlockPos sourcePos);

    void updateMusicSource(Integer sourceEntityID);

    int getNodTick();

    int getSlightNodTick();

}
