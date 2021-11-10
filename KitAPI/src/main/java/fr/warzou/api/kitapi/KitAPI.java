package fr.warzou.api.kitapi;

import fr.warzou.api.kitapi.common.handler.KitAPIHandler;

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
}
