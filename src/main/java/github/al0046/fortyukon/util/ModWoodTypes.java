package github.al0046.fortyukon.util;

import github.al0046.fortyukon.FortYukon;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(FortYukon.MOD_ID + ":pine", BlockSetType.OAK));
}
