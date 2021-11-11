package fr.warzou.api.kitapi;

import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import fr.warzou.api.kitapi.core.kit.save.PlayerKit;
import fr.warzou.api.kitapi.core.manager.KitMap;

import java.util.Optional;
import java.util.UUID;

public class KitAPI {

    public static boolean alreadyInitialized = false;
    private static KitAPIHandler handler;

    public static void initAPI(KitAPIHandler handler) {
        if (alreadyInitialized)
            throw new IllegalStateException("KitAPI is already initialized !");

        alreadyInitialized = true;
        KitAPI.handler = handler;
    }

    public static KitAPIHandler getHandler() {
        return handler;
    }

    public static KitMap getKitMap() {
        return handler.getKitMap();
    }

    public static Optional<PlayerKit> getPlayerKit(UUID playerUUID) {
        return handler.getKitMap().getPlayerKit(playerUUID);
    }

    public static boolean hasKit(UUID playerUUID) {
        return handler.getKitMap().hasKit(playerUUID);
    }
}
