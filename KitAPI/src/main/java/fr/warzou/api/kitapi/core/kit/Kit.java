package fr.warzou.api.kitapi.core.kit;

import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Kit {

    int tick();

    @NotNull
    ItemKitPart getItems();

    @NotNull
    UUID getUUID();

}
