package me.joeyspawners.guis;

import me.joeyspawners.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SpawnerGui {

    public void createGUI(Player player) {
        Inventory givespawnergui = Bukkit.getServer().createInventory(null, 54, "Spawner Menu");

        ItemStack spawner1 = new ItemStack(Material.SHEEP_SPAWN_EGG);
        ItemStack spawner2 = new ItemStack(Material.COW_SPAWN_EGG);
        ItemStack spawner3 = new ItemStack(Material.PIG_SPAWN_EGG);
        ItemStack spawner4 = new ItemStack(Material.CHICKEN_SPAWN_EGG);
        ItemStack spawner5 = new ItemStack(Material.CREEPER_SPAWN_EGG);
        ItemStack spawner6 = new ItemStack(Material.ENDERMAN_SPAWN_EGG);
        ItemStack spawner7 = new ItemStack(Material.IRON_BLOCK);
        ItemStack spawner8 = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG);
        ItemStack spawner9 = new ItemStack(Material.SKELETON_SPAWN_EGG);
        ItemStack spawner10 = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        ItemStack spawner11 = new ItemStack(Material.GHAST_SPAWN_EGG);
        ItemStack spawner12 = new ItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
        ItemStack spawner13 = new ItemStack(Material.PIGLIN_SPAWN_EGG);
        ItemStack spawner14 = new ItemStack(Material.GUARDIAN_SPAWN_EGG);
        ItemStack spawner15 = new ItemStack(Material.VINDICATOR_SPAWN_EGG);
        ItemStack spawner16 = new ItemStack(Material.PHANTOM_SPAWN_EGG);
        ItemStack spawner17 = new ItemStack(Material.EVOKER_SPAWN_EGG);

        ItemMeta spawnermeta1 = spawner1.getItemMeta();
        spawnermeta1.setDisplayName(Utils.color("&7Sheep"));
        ArrayList<String> spawnerlore1 = new ArrayList<>();
        spawnerlore1.add(Utils.color("&7Give yourself a sheep spawner"));
        spawnermeta1.setLore(spawnerlore1);
        spawner1.setItemMeta(spawnermeta1);

        ItemMeta spawnermeta2 = spawner2.getItemMeta();
        spawnermeta2.setDisplayName(Utils.color("&8Cow"));
        ArrayList<String> spawnerlore2 = new ArrayList<>();
        spawnerlore2.add(Utils.color("&8Give yourself a cow spawner"));
        spawnermeta2.setLore(spawnerlore2);
        spawner2.setItemMeta(spawnermeta2);

        ItemMeta spawnermeta3 = spawner3.getItemMeta();
        spawnermeta3.setDisplayName(Utils.color("&dPig"));
        ArrayList<String> spawnerlore3 = new ArrayList<>();
        spawnerlore3.add(Utils.color("&dGive yourself a pig spawner"));
        spawnermeta3.setLore(spawnerlore3);
        spawner3.setItemMeta(spawnermeta3);

        ItemMeta spawnermeta4 = spawner4.getItemMeta();
        spawnermeta4.setDisplayName(Utils.color("&fChicken"));
        ArrayList<String> spawnerlore4 = new ArrayList<>();
        spawnerlore4.add(Utils.color("&fGive yourself a chicken spawner"));
        spawnermeta4.setLore(spawnerlore4);
        spawner4.setItemMeta(spawnermeta4);

        ItemMeta spawnermeta5 = spawner5.getItemMeta();
        spawnermeta5.setDisplayName(Utils.color("&2Creeper"));
        ArrayList<String> spawnerlore5 = new ArrayList<>();
        spawnerlore5.add(Utils.color("&2Give yourself a creeper spawner"));
        spawnermeta5.setLore(spawnerlore5);
        spawner5.setItemMeta(spawnermeta5);

        ItemMeta spawnermeta6 = spawner6.getItemMeta();
        spawnermeta6.setDisplayName(Utils.color("&8Enderman"));
        ArrayList<String> spawnerlore6 = new ArrayList<>();
        spawnerlore6.add(Utils.color("&8Give yourself an enderman spawner"));
        spawnermeta6.setLore(spawnerlore6);
        spawner6.setItemMeta(spawnermeta6);

        ItemMeta spawnermeta7 = spawner7.getItemMeta();
        spawnermeta7.setDisplayName(Utils.color("&fIron Golem"));
        ArrayList<String> spawnerlore7 = new ArrayList<>();
        spawnerlore7.add(Utils.color("&fGive yourself an iron golem spawner"));
        spawnermeta7.setLore(spawnerlore7);
        spawner7.setItemMeta(spawnermeta7);

        ItemMeta spawnermeta8 = spawner8.getItemMeta();
        spawnermeta8.setDisplayName(Utils.color("&8Wither Skeleton"));
        ArrayList<String> spawnerlore8 = new ArrayList<>();
        spawnerlore8.add(Utils.color("&8Give yourself a wither skeleton spawner"));
        spawnermeta8.setLore(spawnerlore8);
        spawner8.setItemMeta(spawnermeta8);

        ItemMeta spawnermeta9 = spawner9.getItemMeta();
        spawnermeta9.setDisplayName(Utils.color("&7Skeleton"));
        ArrayList<String> spawnerlore9 = new ArrayList<>();
        spawnerlore9.add(Utils.color("&fGive yourself a skeleton spawner"));
        spawnermeta9.setLore(spawnerlore9);
        spawner9.setItemMeta(spawnermeta9);

        ItemMeta spawnermeta10 = spawner10.getItemMeta();
        spawnermeta10.setDisplayName(Utils.color("&2Zom&3bie"));
        ArrayList<String> spawnerlore10 = new ArrayList<>();
        spawnerlore10.add(Utils.color("&2Give yourself a &3zombie spawner"));
        spawnermeta10.setLore(spawnerlore10);
        spawner10.setItemMeta(spawnermeta10);

        ItemMeta spawnermeta11 = spawner11.getItemMeta();
        spawnermeta11.setDisplayName(Utils.color("&fGhast"));
        ArrayList<String> spawnerlore11 = new ArrayList<>();
        spawnerlore11.add(Utils.color("&fGive yourself a ghast spawner"));
        spawnermeta11.setLore(spawnerlore11);
        spawner11.setItemMeta(spawnermeta11);

        ItemMeta spawnermeta12 = spawner12.getItemMeta();
        spawnermeta12.setDisplayName(Utils.color("&5Zombified Piglin"));
        ArrayList<String> spawnerlore12 = new ArrayList<>();
        spawnerlore12.add(Utils.color("&5Give yourself a zombified piglin spawner"));
        spawnermeta12.setLore(spawnerlore12);
        spawner12.setItemMeta(spawnermeta12);

        ItemMeta spawnermeta13 = spawner13.getItemMeta();
        spawnermeta13.setDisplayName(Utils.color("&5Piglin"));
        ArrayList<String> spawnerlore13 = new ArrayList<>();
        spawnerlore13.add(Utils.color("&5Give yourself a piglin spawner"));
        spawnermeta13.setLore(spawnerlore13);
        spawner13.setItemMeta(spawnermeta13);

        ItemMeta spawnermeta14 = spawner14.getItemMeta();
        spawnermeta14.setDisplayName(Utils.color("&3Guardian"));
        ArrayList<String> spawnerlore14 = new ArrayList<>();
        spawnerlore14.add(Utils.color("&3Give yourself a guardian spawner"));
        spawnermeta14.setLore(spawnerlore14);
        spawner14.setItemMeta(spawnermeta14);

        ItemMeta spawnermeta15 = spawner15.getItemMeta();
        spawnermeta15.setDisplayName(Utils.color("&7Vindicator"));
        ArrayList<String> spawnerlore15 = new ArrayList<>();
        spawnerlore15.add(Utils.color("&7Give yourself a vindicator spawner"));
        spawnermeta15.setLore(spawnerlore15);
        spawner15.setItemMeta(spawnermeta15);

        ItemMeta spawnermeta16 = spawner16.getItemMeta();
        spawnermeta16.setDisplayName(Utils.color("&9Phantom"));
        ArrayList<String> spawnerlore16 = new ArrayList<>();
        spawnerlore16.add(Utils.color("&9Give yourself a phantom spawner"));
        spawnermeta16.setLore(spawnerlore16);
        spawner16.setItemMeta(spawnermeta16);

        ItemMeta spawnermeta17 = spawner17.getItemMeta();
        spawnermeta17.setDisplayName(Utils.color("&aEvoker"));
        ArrayList<String> spawnerlore17 = new ArrayList<>();
        spawnerlore17.add(Utils.color("&aGive yourself an evoker spawner"));
        spawnermeta17.setLore(spawnerlore17);
        spawner17.setItemMeta(spawnermeta17);




        givespawnergui.setItem(0, spawner1);
        givespawnergui.setItem(1, spawner2);
        givespawnergui.setItem(2, spawner3);
        givespawnergui.setItem(3, spawner4);
        givespawnergui.setItem(4, spawner5);
        givespawnergui.setItem(5, spawner6);
        givespawnergui.setItem(6, spawner7);
        givespawnergui.setItem(7, spawner8);
        givespawnergui.setItem(8, spawner9);
        givespawnergui.setItem(9, spawner10);
        givespawnergui.setItem(10, spawner11);
        givespawnergui.setItem(11, spawner12);
        givespawnergui.setItem(12, spawner13);
        givespawnergui.setItem(13, spawner14);
        givespawnergui.setItem(14, spawner15);
        givespawnergui.setItem(15, spawner16);
        givespawnergui.setItem(16, spawner17);

        player.openInventory(givespawnergui);

    }
}
