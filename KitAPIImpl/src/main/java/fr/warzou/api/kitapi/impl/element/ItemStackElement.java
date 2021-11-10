package fr.warzou.api.kitapi.impl.element;

import fr.warzou.api.kitapi.common.element.ElementType;
import fr.warzou.api.kitapi.common.element.KitElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemStackElement implements KitElement<ItemStack> {

    private final @NotNull ItemStack itemStack;

    public ItemStackElement(@NotNull ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    @Override
    public @NotNull ElementType getType() {
        return ElementType.ITEM_STACK;
    }

    @Override
    public @NotNull ItemStack get() {
        return this.itemStack.clone();
    }
}
