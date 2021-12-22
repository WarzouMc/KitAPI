package fr.warzou.api.kitapi;

import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import fr.warzou.api.kitapi.core.console.Color;
import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.kit.save.PlayerKit;
import fr.warzou.api.kitapi.core.manager.builders.KitBuilder;
import fr.warzou.api.kitapi.core.manager.KitMap;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;

public class KitAPI {

    public static boolean alreadyInitialized = false;
    private static KitAPIHandler handler;

    public KitAPI(KitAPIHandler handler) {
        if (alreadyInitialized)
            throw new IllegalStateException("KitAPI is already initialized !");

        alreadyInitialized = true;
        KitAPI.handler = handler;
    }

    public void onEnable() {
        print(Color.DARK_GREEN + "[" + Color.GREEN + "KitAPI"
                + Color.DARK_GREEN + "] " + Color.WHITE + "is now enable !");
    }

    public void onDisable() {
        print(Color.DARK_RED + "[" + Color.RED + "KitAPI"
                + Color.DARK_RED + "] " + Color.WHITE + "is now disable !");
    }

    public static KitAPIHandler getHandler() {
        return handler;
    }

    public static KitMap getKitMap() {
        return handler.getKitMap();
    }

    public static void print(String message) {
        handler.getPrinter().print(message);
    }

    public static void print(String... messages) {
        handler.getPrinter().print(messages);
    }

    @NotNull
    public static KitBuilder createKitBuilder() {
        return handler.createKitBuilder();
    }

    public static Optional<PlayerKit> getPlayerKit(UUID playerUUID) {
        return handler.getKitMap().getPlayerKit(playerUUID);
    }

    public static boolean hasKit(UUID playerUUID) {
        return handler.getKitMap().hasKit(playerUUID);
    }

    public static Optional<Kit> getKit(UUID uuid) {
        // TODO: 22/12/2021  
        return null;
    }
}
