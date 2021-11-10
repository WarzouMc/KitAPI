package fr.warzou.api.kitapi.core.kit.sub;

import fr.warzou.api.kitapi.common.element.KitElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

interface KitPart {

    @NotNull
    List<KitElement<?>> getKitContent();

}
