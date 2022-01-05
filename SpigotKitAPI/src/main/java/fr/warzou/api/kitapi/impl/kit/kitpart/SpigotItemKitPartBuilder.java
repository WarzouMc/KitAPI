package fr.warzou.api.kitapi.impl.kit.kitpart;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import fr.warzou.api.kitapi.core.manager.builders.ItemKitPartBuilder;

import java.lang.reflect.Array;

public class SpigotItemKitPartBuilder implements ItemKitPartBuilder {

    private final KitElement<?>[] armor = (KitElement<?>[]) Array.newInstance(KitElement[].class, 4);

    @Override
    public ItemKitPartBuilder withHelmet(KitElement<?> element) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withChestplate(KitElement<?> element) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withLeggings(KitElement<?> element) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withBoots(KitElement<?> element) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withOffHand(KitElement<?> element) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withItem(KitElement<?> element, int slot) {
        return this;
    }

    @Override
    public ItemKitPartBuilder withItem(KitElement<?> element) {
        return null;
    }

    @Override
    public ItemKitPartBuilder withItems(KitElement<?>... elements) {
        return this;
    }

    @Override
    public ItemKitPart build() {
        return null;
    }
}
