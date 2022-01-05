package fr.warzou.api.kitapi.core.manager;

import fr.warzou.api.kitapi.core.kit.Kit;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface KitMap {

    boolean addPlayer(@NotNull UUID uuid);

    boolean setPlayerKit(@NotNull UUID uuid, @NotNull Kit kit);

    Set<UUID> getPlayerUUIDs();

    Optional<Kit> getPlayerKit(@NotNull UUID playerUUID);

    boolean hasKit(@NotNull UUID playerUUID);

    Optional<Kit> getKit(@NotNull UUID kitUUID);

    void setDefaultKit(@NotNull Kit kit);

    @NotNull
    Kit getDefaultKit();

}
