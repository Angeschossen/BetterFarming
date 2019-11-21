package me.angeschossen.betterfarming.api.interfaces.player;

import java.util.Collection;
import java.util.UUID;

public interface FarmPlayer {

    void removeFarm(int id);

    boolean isCreating();

    UUID getUUID();

    Collection<Integer> getFarms();

    void save();
}
