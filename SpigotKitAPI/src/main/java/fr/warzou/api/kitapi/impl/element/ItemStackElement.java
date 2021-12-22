package fr.warzou.api.kitapi.impl.element;

import fr.warzou.api.kitapi.core.common.element.ElementType;
import fr.warzou.api.kitapi.core.common.element.KitElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemStackElement implements KitElement<ItemStack> {

    private final int tick;
    private final ItemStack itemStack;
    public final int slot;

    public ItemStackElement(int tick, @NotNull ItemStack itemStack, int slot) {
        this.tick = Math.abs(tick);
        this.itemStack = itemStack;
        this.slot = slot;
    }

    @Override
    public int tick() {
        return this.tick;
    }

    @Override
    public @NotNull ElementType getType() {
        return ElementType.ITEM_STACK;
    }

    @Override
    public @NotNull ItemStack get() {
        return this.itemStack.clone();
    }

    public int getSlot() {
        return this.slot;
    }
}
