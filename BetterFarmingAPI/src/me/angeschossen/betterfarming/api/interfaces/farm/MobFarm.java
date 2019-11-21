package me.angeschossen.betterfarming.api.interfaces.farm;


import org.bukkit.entity.Entity;

import java.util.Collection;

public interface MobFarm extends Farm {

    Collection<Entity> getEntities();
}
