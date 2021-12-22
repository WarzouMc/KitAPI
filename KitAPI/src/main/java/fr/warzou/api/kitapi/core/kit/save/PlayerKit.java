package fr.warzou.api.kitapi.core.kit.save;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public interface PlayerKit {

    @NotNull
    UUID getPlayer();

    @NotNull
    UUID getKit();

    List<KitElement<?>> getElements();

}
