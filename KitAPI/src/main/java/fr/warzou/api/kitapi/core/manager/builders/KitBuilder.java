package fr.warzou.api.kitapi.core.manager.builders;

import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface KitBuilder {

    KitBuilder with(UUID uuid);

    KitBuilder withTick(int tick);

    KitBuilder withItemKitPart(@NotNull ItemKitPart itemKitPart);

    @NotNull
    Kit build();
}
