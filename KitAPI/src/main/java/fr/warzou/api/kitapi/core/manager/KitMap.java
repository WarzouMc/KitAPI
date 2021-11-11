package fr.warzou.api.kitapi.core.manager;

import fr.warzou.api.kitapi.core.kit.save.PlayerKit;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface KitMap {

    Set<UUID> getPlayerUUIDs();

    Optional<PlayerKit> getPlayerKit(UUID playerUUID);

    boolean hasKit(UUID playerUUID);

}
