package me.joeyspawners.listeners;

import me.joeyspawners.JoeySpawners;
import me.joeyspawners.Utils;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class GuiClickListener implements Listener {

    JoeySpawners main;
    public GuiClickListener(JoeySpawners main) {
        this.main = main;
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (!e.getView().getTitle().equalsIgnoreCase("Spawner Menu")) return;

        e.setCancelled(true);

        final ItemStack clickedItem = e.getCurrentItem();

        if (clickedItem == null || clickedItem.getType().isAir()) return;

        final Player p = (Player) e.getWhoClicked();

        ItemStack sheepSpawner = new ItemStack(Material.SPAWNER);
        ItemStack cowSpawner = new ItemStack(Material.SPAWNER);
        ItemStack pigSpawner = new ItemStack(Material.SPAWNER);
        ItemStack chickenSpawner = new ItemStack(Material.SPAWNER);
        ItemStack creeperSpawner = new ItemStack(Material.SPAWNER);
        ItemStack endermanSpawner = new ItemStack(Material.SPAWNER);
        ItemStack ironGolemSpawner = new ItemStack(Material.SPAWNER);
        ItemStack witherSkeletonSpawner = new ItemStack(Material.SPAWNER);
        ItemStack skeletonSpawner = new ItemStack(Material.SPAWNER);
        ItemStack zombieSpawner = new ItemStack(Material.SPAWNER);
        ItemStack ghastSpawner = new ItemStack(Material.SPAWNER);
        ItemStack zombifiedPiglinSpawner = new ItemStack(Material.SPAWNER);
        ItemStack piglinSpawner = new ItemStack(Material.SPAWNER);
        ItemStack guardianSpawner = new ItemStack(Material.SPAWNER);
        ItemStack vindicatorSpawner = new ItemStack(Material.SPAWNER);
        ItemStack phantomSpawner = new ItemStack(Material.SPAWNER);
        ItemStack evokerSpawner = new ItemStack(Material.SPAWNER);

        ItemMeta sheepSpawnerMeta = sheepSpawner.getItemMeta();
        sheepSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "sheep");
        sheepSpawnerMeta.setDisplayName(Utils.color("&eSheep Spawner"));
        sheepSpawner.setItemMeta(sheepSpawnerMeta);

        ItemMeta cowSpawnerMeta = cowSpawner.getItemMeta();
        cowSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "cow");
        cowSpawnerMeta.setDisplayName(Utils.color("&eCow Spawner"));
        cowSpawner.setItemMeta(cowSpawnerMeta);

        ItemMeta pigSpawnerMeta = pigSpawner.getItemMeta();
        pigSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "pig");
        pigSpawnerMeta.setDisplayName(Utils.color("&ePig Spawner"));
        pigSpawner.setItemMeta(pigSpawnerMeta);

        ItemMeta chickenSpawnerMeta = chickenSpawner.getItemMeta();
        chickenSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "chicken");
        chickenSpawnerMeta.setDisplayName(Utils.color("&eChicken Spawner"));
        chickenSpawner.setItemMeta(chickenSpawnerMeta);

        ItemMeta creeperSpawnerMeta = creeperSpawner.getItemMeta();
        creeperSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "creeper");
        creeperSpawnerMeta.setDisplayName(Utils.color("&eCreeper Spawner"));
        creeperSpawner.setItemMeta(creeperSpawnerMeta);

        ItemMeta endermanSpawnerMeta = endermanSpawner.getItemMeta();
        endermanSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "enderman");
        endermanSpawnerMeta.setDisplayName(Utils.color("&eEnderman Spawner"));
        endermanSpawner.setItemMeta(endermanSpawnerMeta);

        ItemMeta irongolemSpawnerMeta = ironGolemSpawner.getItemMeta();
        irongolemSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "iron_golem");
        irongolemSpawnerMeta.setDisplayName(Utils.color("&eIron Golem Spawner"));
        ironGolemSpawner.setItemMeta(irongolemSpawnerMeta);

        ItemMeta witherskeletonSpawnerMeta = witherSkeletonSpawner.getItemMeta();
        witherskeletonSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "wither_skeleton");
        witherskeletonSpawnerMeta.setDisplayName(Utils.color("&eWither Skeleton Spawner"));
        witherSkeletonSpawner.setItemMeta(witherskeletonSpawnerMeta);

        ItemMeta skeletonSpawnerMeta = skeletonSpawner.getItemMeta();
        skeletonSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "skeleton");
        skeletonSpawnerMeta.setDisplayName(Utils.color("&eSkeleton Spawner"));
        skeletonSpawner.setItemMeta(skeletonSpawnerMeta);

        ItemMeta zombieSpawnerMeta = zombieSpawner.getItemMeta();
        zombieSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "zombie");
        zombieSpawnerMeta.setDisplayName(Utils.color("&eZombie Spawner"));
        zombieSpawner.setItemMeta(zombieSpawnerMeta);

        ItemMeta ghastSpawnerMeta = ghastSpawner.getItemMeta();
        ghastSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "ghast");
        ghastSpawnerMeta.setDisplayName(Utils.color("&eGhast Spawner"));
        ghastSpawner.setItemMeta(ghastSpawnerMeta);

        ItemMeta zombifiedpiglinSpawnerMeta = zombifiedPiglinSpawner.getItemMeta();
        zombifiedpiglinSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "zombified_piglin");
        zombifiedpiglinSpawnerMeta.setDisplayName(Utils.color("&eZombified Piglin Spawner"));
        zombifiedPiglinSpawner.setItemMeta(zombifiedpiglinSpawnerMeta);

        ItemMeta piglinSpawnerMeta = piglinSpawner.getItemMeta();
        piglinSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "piglin");
        piglinSpawnerMeta.setDisplayName(Utils.color("&ePiglin Spawner"));
        piglinSpawner.setItemMeta(piglinSpawnerMeta);

        ItemMeta guardianSpawnerMeta = guardianSpawner.getItemMeta();
        guardianSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "guardian");
        guardianSpawnerMeta.setDisplayName(Utils.color("&eGuardian Spawner"));
        guardianSpawner.setItemMeta(guardianSpawnerMeta);

        ItemMeta vindicatorSpawnerMeta = vindicatorSpawner.getItemMeta();
        vindicatorSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "vindicator");
        vindicatorSpawnerMeta.setDisplayName(Utils.color("&eVindicator Spawner"));
        vindicatorSpawner.setItemMeta(vindicatorSpawnerMeta);

        ItemMeta phantomSpawnerMeta = phantomSpawner.getItemMeta();
        phantomSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "phantom");
        phantomSpawnerMeta.setDisplayName(Utils.color("&ePhantom Spawner"));
        phantomSpawner.setItemMeta(phantomSpawnerMeta);

        ItemMeta evokerSpawnerMeta = evokerSpawner.getItemMeta();
        evokerSpawnerMeta.getPersistentDataContainer().set(main.spawnerkey, PersistentDataType.STRING, "evoker");
        evokerSpawnerMeta.setDisplayName(Utils.color("&eEvoker Spawner"));
        evokerSpawner.setItemMeta(evokerSpawnerMeta);






        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&7Sheep"))) {
            p.getInventory().addItem(sheepSpawner);
            p.sendMessage(Utils.color("&aGiven " + p.getName() + Utils.color(" a &eSheep spawner")));
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&8Cow"))) {
            p.getInventory().addItem(cowSpawner);
            p.sendMessage("Given " + p.getName() + " a Cow spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&dPig"))) {
            p.getInventory().addItem(pigSpawner);
            p.sendMessage("Given " + p.getName() + " a Pig spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&fChicken"))) {
            p.getInventory().addItem(chickenSpawner);
            p.sendMessage("Given " + p.getName() + " a Chicken spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&2Creeper"))) {
            p.getInventory().addItem(creeperSpawner);
            p.sendMessage("Given " + p.getName() + " a Creeper spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&8Enderman"))) {
            p.getInventory().addItem(endermanSpawner);
            p.sendMessage("Given " + p.getName() + " an Enderman spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&fIron Golem"))) {
            p.getInventory().addItem(ironGolemSpawner);
            p.sendMessage("Given " + p.getName() + " an Iron Golem spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&8Wither Skeleton"))) {
            p.getInventory().addItem(witherSkeletonSpawner);
            p.sendMessage("Given " + p.getName() + " a Wither Skeleton spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&7Skeleton"))) {
            p.getInventory().addItem(skeletonSpawner);
            p.sendMessage("Given " + p.getName() + " a Skeleton spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&2Zom&3bie"))) {
            p.getInventory().addItem(zombieSpawner);
            p.sendMessage("Given " + p.getName() + " a Zombie spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&fGhast"))) {
            p.getInventory().addItem(ghastSpawner);
            p.sendMessage("Given " + p.getName() + " a Ghast spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&5Zombified Piglin"))) {
            p.getInventory().addItem(zombifiedPiglinSpawner);
            p.sendMessage("Given " + p.getName() + " a Zombified Piglin spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&5Piglin"))) {
            p.getInventory().addItem(piglinSpawner);
            p.sendMessage("Given " + p.getName() + " a Piglin spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&3Guardian"))) {
            p.getInventory().addItem(guardianSpawner);
            p.sendMessage("Given " + p.getName() + " a Guardian spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&7Vindicator"))) {
            p.getInventory().addItem(vindicatorSpawner);
            p.sendMessage("Given " + p.getName() + " a Vindicator spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&9Phantom"))) {
            p.getInventory().addItem(phantomSpawner);
            p.sendMessage("Given " + p.getName() + " a Phantom spawner");
        }
        if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.color("&aEvoker"))) {
            p.getInventory().addItem(evokerSpawner);
            p.sendMessage("Given " + p.getName() + " an Evoker spawner");
        }
    }


}
