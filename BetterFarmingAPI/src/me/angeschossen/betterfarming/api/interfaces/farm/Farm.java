package me.angeschossen.betterfarming.api.interfaces.farm;


import me.angeschossen.betterfarming.api.enums.FarmRole;
import me.angeschossen.betterfarming.api.enums.FarmType;
import me.angeschossen.betterfarming.api.enums.RoleSetting;
import me.angeschossen.betterfarming.api.interfaces.player.Role;
import me.angeschossen.betterfarming.api.interfaces.protection.FarmWorld;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BlockVector;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface Farm {

    UUID getOwner();

    int getInterval();

    int getRadius();

    Location getLocation();

    int getStorageSlots();

    boolean isStorageFull();

    void setStorageSlots(int slots);

    Role getRole(int iD);

    List<UUID> getRoleMembers(int roleId);

    Role getNextPriorityRole(Role role, boolean higher);

    Role promotePlayer(UUID playerUID);

    Role demotePlayer(UUID playerUID);

    Inventory getTransferDestination();

    FarmType getFarmType();

    void stopTask();

    void continueTask();

    boolean canAction(UUID playerUUID, RoleSetting roleSetting);

    boolean canAction(Player player, RoleSetting roleSetting, boolean sendMessage);

    void trustPlayer(UUID uuid);

    @Nullable
    Role getRole(UUID playerUID);

    void untrustPlayer(UUID uuid);

    void enableAction(FarmRole farmRole, RoleSetting farmAction);

    void disableAction(FarmRole farmRole, RoleSetting farmAction);

    boolean toggleAction(FarmRole farmRole, RoleSetting farmAction);

    int getID();

    void setInterval(int interval);

    BlockVector getMinPoint();

    BlockVector getMaxPoint();

    boolean setRadius(int radius);

    boolean isChunkLoaded();

    Collection<Block> getBlocks();

    Location getOrigin();

    Set<UUID> getTrusted();

    Collection<String> getActiveSettings();

    FarmWorld getFarmWorld();

    List<ItemStack> getStorage();

    void setTransferDestination(Inventory inventory);

    void addToStorage(ItemStack itemStack);

    boolean removeFromStorage(ItemStack itemStack);
}
