package fr.warzou.api.kitapi.core.kit.save;

import fr.warzou.api.kitapi.core.kit.Kit;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface PlayerKit {

    @NotNull
    UUID getPlayer();

    @NotNull
    Kit getKit();

}
