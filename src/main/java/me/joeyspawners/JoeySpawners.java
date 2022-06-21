package me.joeyspawners;

import me.joeyspawners.commands.GuiCommands;
import me.joeyspawners.listeners.GuiClickListener;
import me.joeyspawners.listeners.SpawnerChanger;
import me.joeyspawners.tabCompleters.SpawnerTabCompleter;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoeySpawners extends JavaPlugin {

    public NamespacedKey spawnerkey = new NamespacedKey(this, "spawnertype");

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(Utils.color("&a[JoeySpawners]") + Utils.color(" is now enabled."));
        getCommand("givespawner").setExecutor(new GuiCommands(this));

        getServer().getPluginManager().registerEvents(new GuiClickListener(this), this);
        getServer().getPluginManager().registerEvents(new SpawnerChanger(this), this);

        getCommand("givespawner").setTabCompleter(new SpawnerTabCompleter());

    }
}
