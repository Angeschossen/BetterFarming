package me.angeschossen.betterfarming.api.interfaces;

import java.util.Collection;
import java.util.UUID;

public interface FarmPlayer {

    UUID getUUID();

    Collection<Integer> getFarms();
}
