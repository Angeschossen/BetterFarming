package me.angeschossen.betterfarming.api.interfaces.protection;

import me.angeschossen.betterfarming.api.interfaces.farm.Farm;
import org.bukkit.World;

public interface FarmWorld {

    World getWorld();

    Farm getAccessedFarm(int x, int y, int z);

    boolean isFarm(int x, int y, int z);

    Farm getFarm(int iD);

    Farm overlaps(Farm farm, int radius);
}
