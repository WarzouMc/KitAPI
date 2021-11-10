package fr.warzou.api.kitapi.impl.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerKitAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[" + ChatColor.GREEN + "KitAPI"
                + ChatColor.DARK_GREEN + "] " + ChatColor.WHITE + "is now enable !");
    }

    @Override
    public void onDisable() {
        super.onDisable();

        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "[" + ChatColor.RED + "KitAPI"
                + ChatColor.DARK_RED + "] " + ChatColor.WHITE + "is now enable !");
    }
}
