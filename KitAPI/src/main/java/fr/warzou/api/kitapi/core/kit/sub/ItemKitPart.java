package fr.warzou.api.kitapi.core.kit.sub;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ItemKitPart extends KitPart {

    @NotNull
    List<? extends KitElement<?>> getArmorItemStacks();

    @NotNull
    List<? extends KitElement<?>> getInventoryItemStacks();

    @NotNull
    KitElement<?> getOffHandItemStack();

}
