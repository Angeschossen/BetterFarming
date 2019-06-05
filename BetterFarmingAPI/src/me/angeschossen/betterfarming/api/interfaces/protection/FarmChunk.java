package me.angeschossen.betterfarming.api.interfaces.protection;

import me.angeschossen.betterfarming.api.interfaces.BlockCoord;
import me.angeschossen.betterfarming.api.interfaces.FarmWorld;
import me.angeschossen.betterfarming.api.interfaces.farm.Farm;

import java.util.Collection;

public interface FarmChunk {

    int getX();

    int getZ();

    FarmWorld getFarmWorld();

    Farm getAccessedFarm(int x, int y, int z);

    Farm getAccessedFarm3D(int x, int y, int z);

    void addFarm(Farm farm, Collection<BlockCoord> blockCoords);

    Collection<BlockCoord> getBlockCoords(Farm farm);

    void unloadFarm(Farm farm);
}
