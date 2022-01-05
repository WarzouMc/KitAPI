package fr.warzou.api.kitapi.core.manager.builders;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;

public interface ItemKitPartBuilder {

    ItemKitPartBuilder withHelmet(KitElement<?> element);

    ItemKitPartBuilder withChestplate(KitElement<?> element);

    ItemKitPartBuilder withLeggings(KitElement<?> element);

    ItemKitPartBuilder withBoots(KitElement<?> element);

    ItemKitPartBuilder withOffHand(KitElement<?> element);

    ItemKitPartBuilder withItem(KitElement<?> element, int slot);

    ItemKitPartBuilder withItem(KitElement<?> element);

    ItemKitPartBuilder withItems(KitElement<?>... elements);

    ItemKitPart build();

}
