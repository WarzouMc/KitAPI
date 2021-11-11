package fr.warzou.api.kitapi.core.kit;

import fr.warzou.api.kitapi.core.kit.save.SavedKit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;

public interface Kit {

    @NotNull
    ItemKitPart getItem();

    Optional<UUID> getUUID();

    @NotNull
    default SavedKit save() {
        return save(UUID.randomUUID());
    }

    @NotNull
    default SavedKit save(@NotNull UUID uuid) {
        return save(uuid, false);
    }

    @NotNull
    SavedKit save(@NotNull UUID uuid, boolean overwrite);

}
