package fr.warzou.api.kitapi.impl.element;

import fr.warzou.api.kitapi.common.random.UniqueRandomObject;
import fr.warzou.api.kitapi.core.common.element.ElementType;
import fr.warzou.api.kitapi.core.common.element.RandomKitElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class RandomItemStackElement implements RandomKitElement<ItemStack> {

    private final @NotNull UniqueRandomObject<ItemStack> randomObject;

    public RandomItemStackElement(ItemStack... itemStacks) {
        this(UniqueRandomObject.createUniqueRandomObject(Arrays.asList(itemStacks)));
    }

    public RandomItemStackElement(@NotNull List<ItemStack> itemStacks, double... probabilities) {
        this(new UniqueRandomObject<>(itemStacks.toArray(new ItemStack[0]), probabilities));
    }

    public RandomItemStackElement(@NotNull UniqueRandomObject<ItemStack> randomObject) {
        this.randomObject = randomObject;
    }

    @Override
    public @NotNull ElementType getType() {
        return ElementType.ITEM_STACK_RANDOM;
    }

    @Override
    public @NotNull ItemStack get() {
        return this.randomObject.next();
    }

    @Override
    public @NotNull UniqueRandomObject<ItemStack> getRandom() {
        return this.randomObject;
    }
}
