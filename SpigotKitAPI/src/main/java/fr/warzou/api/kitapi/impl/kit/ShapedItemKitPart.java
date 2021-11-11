package fr.warzou.api.kitapi.impl.kit;

import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.ShapedKit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import fr.warzou.api.kitapi.impl.element.ItemStackElement;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ShapedItemKitPart implements ItemKitPart {

    private final List<ItemStackElement> armor;
    private final List<ItemStackElement> inventory;
    private final ItemStackElement offHand;

    private final List<ItemStackElement> content;

    public ShapedItemKitPart(List<ItemStackElement> armor, List<ItemStackElement> inventory, ItemStackElement offHand) {
        this.armor = armor;
        this.inventory = inventory;
        this.offHand = offHand;

        this.content = new ArrayList<>();
        this.content.addAll(inventory);
        this.content.addAll(armor);
        this.content.add(offHand);
    }

    @Override
    public @NotNull List<ItemStackElement> getArmorItemStacks() {
        return this.armor;
    }

    @Override
    public @NotNull List<ItemStackElement> getInventoryItemStacks() {
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

    @Override
    public @NotNull ShapedKit toKit() {
        return null;
    }
}
