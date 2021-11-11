package fr.warzou.api.kitapi.common.handler;

import fr.warzou.api.kitapi.core.manager.KitBuilder;
import fr.warzou.api.kitapi.core.manager.KitMap;
import org.jetbrains.annotations.NotNull;

public abstract class KitAPIHandler {

    @NotNull
    public abstract KitBuilder createKitBuilder();

    @NotNull
    public abstract KitMap getKitMap();

}
