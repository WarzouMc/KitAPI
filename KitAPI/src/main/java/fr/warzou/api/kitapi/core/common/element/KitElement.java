package fr.warzou.api.kitapi.core.common.element;

import org.jetbrains.annotations.NotNull;

public interface KitElement<E> {

    int tick();

    @NotNull
    ElementType getType();

    @NotNull
    E get();

}
