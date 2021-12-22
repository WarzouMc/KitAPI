package fr.warzou.api.kitapi.impl.element;

import fr.warzou.api.kitapi.common.random.UniqueRandomObject;
import fr.warzou.api.kitapi.core.common.element.ElementType;
import fr.warzou.api.kitapi.core.common.element.RandomKitElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class RandomItemStackElement implements RandomKitElement<ItemStack> {

    private final int tick;
    private final UniqueRandomObject<ItemStack> randomObject;
    private final int slot;

    public RandomItemStackElement(int tick, int slot, ItemStack... itemStacks) {
        this(tick, slot, UniqueRandomObject.createUniqueRandomObject(Arrays.asList(itemStacks)));
    }

    public RandomItemStackElement(int tick, int slot, @NotNull List<ItemStack> itemStacks, double... probabilities) {
        this(tick, slot, new UniqueRandomObject<>(itemStacks.toArray(new ItemStack[0]), probabilities));
    }

    public RandomItemStackElement(int tick, int slot, @NotNull UniqueRandomObject<ItemStack> randomObject) {
        this.tick = Math.abs(tick);
        this.randomObject = randomObject;
        this.slot = slot;
    }

    @Override
    public int tick() {
        return this.tick;
    }

    @Override
    public @NotNull ElementType getType() {
        return ElementType.ITEM_STACK_RANDOM;
    }

    @Override
    public @NotNull ItemStack get() {
        return this.randomObject.next();
    }

    public int getSlot() {
        return this.slot;
    }

    @Override
    public @NotNull UniqueRandomObject<ItemStack> getRandom() {
        return this.randomObject;
    }
}
