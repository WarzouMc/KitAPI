package fr.warzou.api.kitapi.impl.common;

import fr.warzou.api.kitapi.core.kit.save.PlayerKit;
import fr.warzou.api.kitapi.core.manager.KitMap;

import java.util.*;

public class SpigotKitMap implements KitMap {

    private final Map<UUID, PlayerKit> map;

    public SpigotKitMap() {
        this.map = new HashMap<>();
    }

    @Override
    public Set<UUID> getPlayerUUIDs() {
        return this.map.keySet();
    }

    @Override
    public Optional<PlayerKit> getPlayerKit(UUID playerUUID) {
        return Optional.ofNullable(this.map.get(playerUUID));
    }

    @Override
    public boolean hasKit(UUID playerUUID) {
        return this.map.containsKey(playerUUID);
    }
}
