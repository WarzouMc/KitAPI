package fr.warzou.api.kitapi.impl.common;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.manager.KitMap;
import fr.warzou.api.kitapi.impl.kit.EmptyKit;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SpigotKitMap implements KitMap {

    private final Map<UUID, Kit> playerKit;
    private final Map<UUID, Kit> kits;
    private Kit defaultKit;

    public SpigotKitMap() {
        this.playerKit = new HashMap<>();
        this.kits = new HashMap<>();
        this.defaultKit = new EmptyKit();
        this.kits.put(defaultKit.getUUID(), defaultKit);
    }

    @Override
    public boolean addPlayer(@NotNull UUID uuid) {
        if (this.playerKit.containsKey(uuid))
            return false;
        this.playerKit.put(uuid, this.defaultKit);
        return false;
    }

    @Override
    public boolean setPlayerKit(@NotNull UUID uuid, @NotNull Kit kit) {
        if (!this.playerKit.containsKey(uuid))
            return false;
        this.playerKit.put(uuid, kit);
        return false;
    }

    @Override
    public Set<UUID> getPlayerUUIDs() {
        return this.playerKit.keySet();
    }

    @Override
    public Optional<Kit> getPlayerKit(@NotNull UUID playerUUID) {
        return Optional.ofNullable(this.playerKit.get(playerUUID));
    }

    @Override
    public boolean hasKit(@NotNull UUID playerUUID) {
        return this.playerKit.containsKey(playerUUID);
    }

    @Override
    public Optional<Kit> getKit(@NotNull UUID kitUUID) {
        return Optional.ofNullable(this.kits.get(kitUUID));
    }

    @Override
    public void setDefaultKit(@NotNull Kit kit) {
        if (!kit.getUUID().equals(KitAPI.DEFAULT_KIT_UUID))
            throw new IllegalStateException(String.format("Default kit need to have the following UUID : " +
                    "%s (KitAPI.DEFAULT_KIT_UUID) !", KitAPI.DEFAULT_KIT_UUID));

        this.defaultKit = kit;
        this.kits.put(KitAPI.DEFAULT_KIT_UUID, kit);

        for (Map.Entry<UUID, Kit> entry : new HashMap<>(this.playerKit).entrySet()) {
            if (!entry.getValue().getUUID().equals(KitAPI.DEFAULT_KIT_UUID))
                continue;
            this.playerKit.put(entry.getKey(), kit);
        }
    }

    @Override
    public @NotNull Kit getDefaultKit() {
        return this.defaultKit;
    }
}
