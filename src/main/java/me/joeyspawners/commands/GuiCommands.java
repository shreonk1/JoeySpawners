package me.joeyspawners.commands;

import me.joeyspawners.JoeySpawners;
import me.joeyspawners.Utils;
import me.joeyspawners.guis.SpawnerGui;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public class GuiCommands implements CommandExecutor {

    JoeySpawners main;
    public GuiCommands(JoeySpawners main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;

        if(command.getName().equalsIgnoreCase("givespawner")) {
            if(args.length < 1) {
                sender.sendMessage("Please choose a command!");
            }
            if(args[0].equalsIgnoreCase("gui")) {
                SpawnerGui gui = new SpawnerGui();
                gui.createGUI(player);
                return false;
            }
            String playerName = args[0];
            if (!Bukkit.getOnlinePlayers().contains(Bukkit.getPlayer(playerName))) {
                player.sendMessage(Utils.color("&cInvalid player"));
                return false;
            }
            Player reciever = Bukkit.getPlayer(playerName);
            String spawnerName = args[1];
            if(EntityType.fromName(spawnerName) == null) {
                player.sendMessage(Utils.color("&cInvalid Spawner"));
                return false;
            }
            EntityType spawnerType = EntityType.fromName(spawnerName);
            int amount = getAmount(args[2]);
            ItemStack spawner = new ItemStack(Material.SPAWNER, amount);
            ItemMeta spawnerMeta = spawner.getItemMeta();
            spawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, spawnerName);
            String fancyName = spawnerName.substring(0, 1).toUpperCase() + spawnerName.substring(1).replaceAll("_", " ");
            spawnerMeta.setDisplayName(Utils.color("&e" + fancyName + " &eSpawner"));
            spawner.setItemMeta(spawnerMeta);
            reciever.getInventory().addItem(spawner);
            player.sendMessage(Utils.color("&aYou recieved " + "&c" + amount + " " + "&e" + fancyName + "&a" + " spawner(s)"));

        }
        return false;
    }

    public int getAmount(String amount) {
        try {
            return Integer.parseInt(amount);

        } catch (NumberFormatException exception) {
            return 1;
        }

    }
}
