package fr.warzou.api.kitapi.impl.main;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerKitAPI extends JavaPlugin {

    private KitAPIHandler handler = new ServerKitAPIHandler();

    @Override
    public void onEnable() {
        super.onEnable();
        KitAPI.initAPI(handler);

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
