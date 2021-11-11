package fr.warzou.api.kitapi.core.kit.sub;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.ShapedKit;
import org.jetbrains.annotations.NotNull;

import java.util.List;

interface KitPart {

    @NotNull
    List<? extends KitElement<?>> getKitContent();

    @NotNull
    ShapedKit toKit();

}
