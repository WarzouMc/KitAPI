package fr.warzou.api.kitapi.impl.kit;

import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import fr.warzou.api.kitapi.impl.element.ItemStackElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpigotItemKitPart implements ItemKitPart {

    private final ItemStackElement[] armor;
    private final ItemStackElement[] inventory;
    private final ItemStackElement offHand;

    private final List<ItemStackElement> content;

    public SpigotItemKitPart(ItemStackElement[] armor, ItemStackElement[] inventory, ItemStackElement offHand) {
        this.armor = armor;
        this.inventory = inventory;
        this.offHand = offHand;

        this.content = new ArrayList<>();
        this.content.addAll(Arrays.asList(armor));
        this.content.addAll(Arrays.asList(inventory));
        this.content.add(offHand);
    }

    @Override
    public @NotNull ItemStackElement[] getArmorItemStacks() {
        return this.armor;
    }

    @Override
    public @NotNull ItemStackElement[] getInventoryItemStacks() {
        return this.inventory;
    }

    @Override
    public @NotNull ItemStackElement getOffHandItemStack() {
        return this.offHand;
    }

    @Override
    public @NotNull List<ItemStackElement> getKitContent() {
        return this.content;
    }
}
