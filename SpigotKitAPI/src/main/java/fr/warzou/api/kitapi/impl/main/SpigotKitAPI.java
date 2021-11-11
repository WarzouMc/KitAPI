package fr.warzou.api.kitapi.impl.main;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotKitAPI extends JavaPlugin {

    private final KitAPIHandler handler = new SpigotKitAPIHandler();

    @Override
    public void onEnable() {
        super.onEnable();
        KitAPI.initAPI(this.handler);

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
