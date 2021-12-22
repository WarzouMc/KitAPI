package fr.warzou.api.kitapi.core.kit.sub;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import org.jetbrains.annotations.NotNull;

public interface ItemKitPart extends KitPart {

    @NotNull
    KitElement<?>[] getArmorItemStacks();

    @NotNull
    KitElement<?>[] getInventoryItemStacks();

    @NotNull
    KitElement<?> getOffHandItemStack();

}
