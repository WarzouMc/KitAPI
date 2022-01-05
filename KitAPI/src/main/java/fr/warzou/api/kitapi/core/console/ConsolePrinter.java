package fr.warzou.api.kitapi.core.console;

import org.jetbrains.annotations.NotNull;

public interface ConsolePrinter {

    void print(String message);

    void print(String... messages);

    default void print(@NotNull ConsolePrinter.ColorCouple colorCouple, String message) {
        print(colorCouple.parse(message));
    }

    default void print(@NotNull ConsolePrinter.ColorCouple colorCouple, String... messages) {
        for (String message : messages)
            print(colorCouple, message);
    }

    enum ColorCouple {
        GREEN(fr.warzou.api.kitapi.core.console.Color.DARK_GREEN, fr.warzou.api.kitapi.core.console.Color.GREEN),
        RED(fr.warzou.api.kitapi.core.console.Color.DARK_RED, fr.warzou.api.kitapi.core.console.Color.RED),
        YELLOW(fr.warzou.api.kitapi.core.console.Color.GOLD, fr.warzou.api.kitapi.core.console.Color.YELLOW),
        BLUE(fr.warzou.api.kitapi.core.console.Color.DARK_BLUE, fr.warzou.api.kitapi.core.console.Color.BLUE),
        AQUA(fr.warzou.api.kitapi.core.console.Color.DARK_AQUA, fr.warzou.api.kitapi.core.console.Color.AQUA),
        BLACK_AND_WHITE(fr.warzou.api.kitapi.core.console.Color.BLACK, fr.warzou.api.kitapi.core.console.Color.WHITE);

        private final fr.warzou.api.kitapi.core.console.Color first;
        private final fr.warzou.api.kitapi.core.console.Color second;
        ColorCouple(fr.warzou.api.kitapi.core.console.Color first, fr.warzou.api.kitapi.core.console.Color second) {
            this.first = first;
            this.second = second;
        }

        public String parse(String message) {
            return String.format(message, this.first, this.second);
        }

        public fr.warzou.api.kitapi.core.console.Color getFirst() {
            return this.first;
        }

        public fr.warzou.api.kitapi.core.console.Color getSecond() {
            return this.second;
        }
    }

}
