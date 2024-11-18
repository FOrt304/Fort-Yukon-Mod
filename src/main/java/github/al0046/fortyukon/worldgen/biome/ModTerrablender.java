package github.al0046.fortyukon.worldgen.biome;

import github.al0046.fortyukon.FortYukon;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(FortYukon.MOD_ID, "overworld"), 5));
    }
}
