package fr.warzou.api.kitapi.impl.main;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import fr.warzou.api.kitapi.impl.common.SpigotKitMap;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotKitAPI extends JavaPlugin {

    private final SpigotKitMap kitMap = new SpigotKitMap();
    private final KitAPIHandler handler = new SpigotKitAPIHandler(kitMap);
    private final KitAPI api = new KitAPI(handler);

    @Override
    public void onEnable() {
        super.onEnable();
        this.api.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.api.onDisable();
    }
}
