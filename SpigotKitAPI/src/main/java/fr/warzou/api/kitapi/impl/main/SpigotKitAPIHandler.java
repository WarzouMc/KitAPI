package fr.warzou.api.kitapi.impl.main;

import fr.warzou.api.kitapi.common.handler.KitAPIHandler;
import fr.warzou.api.kitapi.core.console.Color;
import fr.warzou.api.kitapi.core.console.ConsolePrinter;
import fr.warzou.api.kitapi.core.manager.KitMap;
import fr.warzou.api.kitapi.core.manager.builders.ItemKitPartBuilder;
import fr.warzou.api.kitapi.core.manager.builders.KitBuilder;
import fr.warzou.api.kitapi.impl.kit.SpigotKitBuilder;
import fr.warzou.api.kitapi.impl.kit.kitpart.SpigotItemKitPartBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

class SpigotKitAPIHandler extends KitAPIHandler {

    public SpigotKitAPIHandler(KitMap kitMap) {
        super(kitMap, new Printer());
    }

    @Override
    public @NotNull KitBuilder createKitBuilder() {
        return new SpigotKitBuilder();
    }

    @Override
    public @NotNull ItemKitPartBuilder createItemKitPartBuilder() {
        return new SpigotItemKitPartBuilder();
    }

    private static class Printer implements ConsolePrinter {

        @Override
        public void print(String message) {
            Bukkit.getConsoleSender().sendMessage(replace(message));
        }

        @Override
        public void print(String... messages) {
            for (String message : messages)
                print(message);
        }

        private String replace(String message) {
            for (Color color : Color.values())
                message = message.replaceAll("(?i)" + color.toString(),
                        "" + ChatColor.getByChar(color.getCharCode()));
            return message;
        }
    }
}
