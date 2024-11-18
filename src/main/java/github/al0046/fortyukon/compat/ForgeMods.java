package github.al0046.fortyukon.compat;

import github.al0046.fortyukon.compat.Mods;
import net.minecraftforge.fml.ModList;

public enum ForgeMods implements Mods {

    ;

    public final String MOD_ID;

    ForgeMods(String modID) {
        this.MOD_ID = modID;
    }

    @Override
    public boolean isInstalled() {
        return ModList.get().isLoaded(MOD_ID);
    }

}
