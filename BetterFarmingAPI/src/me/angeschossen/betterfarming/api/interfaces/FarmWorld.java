package me.angeschossen.betterfarming.api.interfaces;

import me.angeschossen.betterfarming.api.interfaces.farm.Farm;
import org.bukkit.World;

import java.util.Collection;

public interface FarmWorld {

    World getWorld();

    Farm getAccessedFarm(int x, int y, int z);

    Farm getAccessedFarm3D(int x, int y, int z);

    void addFarm(Farm farm, Collection<BlockCoord> blockCoords);

    Collection<BlockCoord> getBlockCoords(Farm farm);

    void unloadFarm(Farm farm);

    Farm getFarm(int iD);

    Collection<Farm> getFarms();
}
