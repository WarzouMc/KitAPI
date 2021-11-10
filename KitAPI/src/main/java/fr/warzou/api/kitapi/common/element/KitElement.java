package fr.warzou.api.kitapi.common.element;

import org.jetbrains.annotations.NotNull;

public interface KitElement<E> {

    @NotNull
    ElementType getType();

    @NotNull
    E get();

}
