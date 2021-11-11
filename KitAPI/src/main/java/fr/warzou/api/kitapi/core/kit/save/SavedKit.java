package fr.warzou.api.kitapi.core.kit.save;

import fr.warzou.api.kitapi.core.kit.Kit;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface SavedKit {

    @NotNull
    Map<String, Object> serialized();

    @NotNull
    Kit getKit();

    @NotNull
    UUID getUUID();

    Optional<PlayerKit> getPlayerKit(UUID player);

}
