package me.angeschossen.betterfarming.api.interfaces.farm;

import org.bukkit.block.Block;

import java.util.Collection;

public interface CropFarm extends Farm {

    Collection<Block> getCrops();

    void setGrowthInterval(int interval);
}
