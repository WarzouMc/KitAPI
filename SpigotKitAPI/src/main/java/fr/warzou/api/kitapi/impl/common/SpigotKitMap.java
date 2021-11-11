package fr.warzou.api.kitapi.impl.common;

import fr.warzou.api.kitapi.core.kit.save.PlayerKit;
import fr.warzou.api.kitapi.core.manager.KitMap;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class SpigotKitMap implements KitMap {

    @Override
    public Set<UUID> getPlayerUUIDs() {
        return null;
    }

    @Override
    public Optional<PlayerKit> getPlayerKit(UUID playerUUID) {
        return Optional.empty();
    }

    @Override
    public boolean hasKit(UUID playerUUID) {
        return false;
    }
}
