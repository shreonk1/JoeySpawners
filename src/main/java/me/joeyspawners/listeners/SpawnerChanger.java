package me.joeyspawners.listeners;

import me.joeyspawners.JoeySpawners;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.persistence.PersistentDataType;

public class SpawnerChanger implements Listener {

    JoeySpawners main;

    public SpawnerChanger(JoeySpawners main) {
        this.main = main;
    }

    @EventHandler
    public void blockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();

        if (e.getItemInHand().getItemMeta().getPersistentDataContainer().has(main.spawnerkey)) {
            final BlockState blockState = e.getBlock().getState();
            CreatureSpawner spawner = (CreatureSpawner) blockState;
            EntityType entityType = EntityType.fromName(e.getItemInHand().getItemMeta().getPersistentDataContainer().get(main.spawnerkey, PersistentDataType.STRING));
            spawner.setSpawnedType(entityType);
            blockState.update(true);

        }

    }
}
