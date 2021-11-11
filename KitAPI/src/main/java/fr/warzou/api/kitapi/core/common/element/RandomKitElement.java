package fr.warzou.api.kitapi.core.common.element;

import fr.warzou.api.kitapi.common.random.UniqueRandomObject;
import org.jetbrains.annotations.NotNull;

public interface RandomKitElement<E> extends KitElement<E> {

    @NotNull
    UniqueRandomObject<E> getRandom();

}
