package me.angeschossen.betterfarming.api.interfaces.farm;


import me.angeschossen.betterfarming.api.enums.FarmAction;
import me.angeschossen.betterfarming.api.enums.FarmRole;
import me.angeschossen.betterfarming.api.interfaces.BlockCoord;
import me.angeschossen.betterfarming.api.interfaces.FarmWorld;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public interface Farm {

    UUID getOwner();

    int getGrowthInterval();

    int getRadius();

    Location getLocation();

    int getStorageSlots();

    void setStorageSlots(int slots);

    void enableAction(FarmRole farmRole, FarmAction farmAction);

    void disableAction(FarmRole farmRole, FarmAction farmAction);

    boolean toggleAction(FarmRole farmRole, FarmAction farmAction);

    int getID();

    void delete();

    Collection<BlockCoord> updateRadius();

    void load();

    void setup(boolean setGround);

    void setRadius(int radius);

    Location getOrigin();

    HashMap<UUID, FarmRole> getTrusted();

    Collection<String> getActiveSettings();

    FarmWorld getFarmWorld();

    void unload();

    List<ItemStack> getStorage();

    void addToStorage(ItemStack itemStack);

    boolean removeFromStorage(ItemStack itemStack);
}
