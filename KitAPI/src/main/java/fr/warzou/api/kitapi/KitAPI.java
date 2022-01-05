package fr.warzou.api.kitapi;

import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import fr.warzou.api.kitapi.core.console.Color;
import fr.warzou.api.kitapi.core.console.ConsolePrinter;
import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.manager.KitMap;
import fr.warzou.api.kitapi.core.manager.builders.ItemKitPartBuilder;
import fr.warzou.api.kitapi.core.manager.builders.KitBuilder;
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
        print(ConsolePrinter.ColorCouple.GREEN, "%1$s[%2$sKitAPI%1$s] " + Color.WHITE + "is now enable !");
    }

    public void onDisable() {
        print(ConsolePrinter.ColorCouple.RED, "%1$s[%2$sKitAPI%1$s] " + Color.WHITE + "is now disable !");
    }

    public static final UUID DEFAULT_KIT_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");

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

    public static void print(@NotNull ConsolePrinter.ColorCouple colorCouple, String message) {
        handler.getPrinter().print(colorCouple, message);
    }

    public static void print(@NotNull ConsolePrinter.ColorCouple colorCouple, String... messages) {
        handler.getPrinter().print(colorCouple, messages);
    }
    @NotNull
    public static KitBuilder createKitBuilder() {
        return handler.createKitBuilder();
    }

    @NotNull
    public static ItemKitPartBuilder createItemKitPartBuilder() {
        return handler.createItemKitPartBuilder();
    }

    @NotNull
    public static Kit getDefaultKit() {
        return handler.getKitMap().getDefaultKit();
    }

    public static Optional<Kit> getPlayerKit(@NotNull UUID playerUUID) {
        return handler.getKitMap().getPlayerKit(playerUUID);
    }

    public static boolean hasKit(@NotNull UUID playerUUID) {
        return handler.getKitMap().hasKit(playerUUID);
    }

    public static Optional<Kit> getKit(@NotNull UUID kitUUID) {
        return handler.getKitMap().getKit(kitUUID);
    }
}
