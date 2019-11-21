package me.angeschossen.betterfarming.api.interfaces.player;

import com.sun.istack.internal.NotNull;
import me.angeschossen.betterfarming.api.enums.RoleSetting;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface Role {

    List<UUID> getPlayers();

    void setIcon(ItemStack itemStack);

    ItemStack getIcon();

    Set<RoleSetting> getSettings();

    void setName(String name);

    String getName();

    int getId();

    int getPriority();

    void getPriority(@NotNull int priority);

    boolean addSetting(RoleSetting roleSetting);

    boolean removeSetting(RoleSetting roleSetting);

    boolean toggleSetting(RoleSetting roleSetting);

    boolean hasSetting(RoleSetting roleSetting);
}
