package fr.warzou.api.kitapi.common.handler;

import fr.warzou.api.kitapi.core.console.ConsolePrinter;
import fr.warzou.api.kitapi.core.manager.builders.ItemKitPartBuilder;
import fr.warzou.api.kitapi.core.manager.builders.KitBuilder;
import fr.warzou.api.kitapi.core.manager.KitMap;
import org.jetbrains.annotations.NotNull;

public abstract class KitAPIHandler {

    private final KitMap kitMap;
    private final ConsolePrinter printer;

    public KitAPIHandler(@NotNull KitMap kitMap, @NotNull ConsolePrinter printer) {
        this.kitMap = kitMap;
        this.printer = printer;
    }

    @NotNull
    public abstract KitBuilder createKitBuilder();

    @NotNull
    public abstract ItemKitPartBuilder createItemKitPartBuilder();

    @NotNull
    public KitMap getKitMap() {
        return this.kitMap;
    }

    @NotNull
    public ConsolePrinter getPrinter() {
        return this.printer;
    }

}
