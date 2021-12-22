package fr.warzou.api.kitapi.core.console;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Optional;

/**
 *
 *
 * @author Warzou
 * @since 0.0.1
 * @version 0.0.1
 */
public enum Color {

    BLACK('0', 0),
    DARK_BLUE('1', 1),
    DARK_GREEN('2', 2),
    DARK_AQUA('3', 3),
    DARK_RED('4', 4),
    DARK_PURPLE('5', 5),
    GOLD('6', 6),
    GRAY('7', 7),
    DARK_GRAY('8', 8),
    BLUE('9', 9),
    GREEN('a', 10),
    AQUA('b', 11),
    RED('c', 12),
    LIGHT_PURPLE('d', 13),
    YELLOW('e', 14),
    WHITE('f', 15),
    MAGIC('k', 16),
    BOLD('l', 17),
    STRIKETHROUGH('m', 18),
    UNDERLINE('n', 19),
    ITALIC('o', 20),
    RESET('r', 21);

    private final char charCode;
    private final int code;
    private final String toString;

    Color(char charCode, int code) {
        this.charCode = charCode;
        this.code = code;
        this.toString = new String(new char[] {'§', charCode});
    }

    public static Optional<Color> fromCode(int code) {
        return Arrays.stream(values()).filter(color -> color.getCode() == code).findAny();
    }

    public static Optional<Color> fromCharCode(char code) {
        return Arrays.stream(values()).filter(color -> color.getCharCode() == code).findAny();
    }

    public char getCharCode() {
        return this.charCode;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return this.toString;
    }
}
