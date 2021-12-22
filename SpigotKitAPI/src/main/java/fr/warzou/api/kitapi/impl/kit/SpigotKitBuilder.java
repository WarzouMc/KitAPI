package fr.warzou.api.kitapi.impl.kit;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import fr.warzou.api.kitapi.core.manager.builders.KitBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class SpigotKitBuilder implements KitBuilder {

    private UUID uuid;
    private int tick;
    private ItemKitPart itemKitPart;

    @Override
    public KitBuilder with(UUID uuid) {
        // TODO: 22/12/2021 check if uuid is used or not 
        this.uuid = uuid;
        return this;
    }

    @Override
    public KitBuilder withTick(int tick) {
        this.tick = tick;
        return this;
    }

    @Override
    public KitBuilder withItemKitPart(@NotNull ItemKitPart itemKitPart) {
        this.itemKitPart = itemKitPart;
        return this;
    }

    @Override
    public @NotNull Kit build() {
        if (this.itemKitPart == null)
            throw new IllegalStateException("Cannot have an item kit part equal to null !");
        return new SpigotKit();
    }
}
