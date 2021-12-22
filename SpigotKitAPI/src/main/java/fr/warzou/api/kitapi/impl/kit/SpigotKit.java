package fr.warzou.api.kitapi.impl.kit;

import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class SpigotKit implements Kit {

    private final UUID uuid;
    private final int tick;
    private final ItemKitPart itemKitPart;

    public SpigotKit(UUID uuid, int tick, ItemKitPart itemKitPart) {
        this.uuid = uuid == null ? UUID.randomUUID() : uuid;
        this.tick = tick;
        this.itemKitPart = itemKitPart;
    }

    @Override
    public int tick() {
        return this.tick;
    }

    @Override
    public @NotNull ItemKitPart getItems() {
        return this.itemKitPart;
    }

    @Override
    public @NotNull UUID getUUID() {
        return this.uuid;
    }
}
