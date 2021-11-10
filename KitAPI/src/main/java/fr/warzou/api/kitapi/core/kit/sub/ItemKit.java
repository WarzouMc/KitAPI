package fr.warzou.api.kitapi.core.kit.sub;

import fr.warzou.api.kitapi.common.element.KitElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface ItemKit extends KitPart {

    @NotNull
    List<KitElement<ItemStack>> getArmorItemStacks();

    @NotNull
    List<KitElement<ItemStack>> getInventoryItemStacks();

    @NotNull
    KitElement<ItemStack> getOffHandItemStack();

}
