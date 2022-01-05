package fr.warzou.api.kitapi.impl.kit;

import fr.warzou.api.kitapi.KitAPI;
import fr.warzou.api.kitapi.core.common.element.KitElement;
import fr.warzou.api.kitapi.core.kit.Kit;
import fr.warzou.api.kitapi.core.kit.sub.ItemKitPart;
import fr.warzou.api.kitapi.impl.element.ItemStackElement;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class EmptyKit implements Kit {

    private final ItemKitPart kitPart;
    private final UUID uuid;

    public EmptyKit() {
        this.kitPart = new EmptyItemKitPart();
        this.uuid = KitAPI.DEFAULT_KIT_UUID;
    }

    @Override
    public int tick() {
        return 0;
    }

    @Override
    public @NotNull ItemKitPart getItems() {
        return this.kitPart;
    }

    @Override
    public @NotNull UUID getUUID() {
        return this.uuid;
    }

    private static class EmptyItemKitPart implements ItemKitPart {

        private final KitElement<?> emptyItem = new ItemStackElement(0, new ItemStack(Material.AIR), -1);
        private final KitElement<?>[] armor = new ItemStackElement[4];
        private final KitElement<?>[] inventory = new ItemStackElement[36];
        private final List<KitElement<?>> elements;

        private EmptyItemKitPart() {
            Arrays.fill(armor, emptyItem);
            Arrays.fill(inventory, emptyItem);
            this.elements = new ArrayList<>();
            this.elements.addAll(Arrays.asList(armor));
            this.elements.addAll(Arrays.asList(inventory));
            this.elements.add(emptyItem);
        }

        @Override
        public @NotNull KitElement<?>[] getArmorItemStacks() {
            return this.armor;
        }

        @Override
        public @NotNull KitElement<?>[] getInventoryItemStacks() {
            return this.inventory;
        }

        @Override
        public @NotNull KitElement<?> getOffHandItemStack() {
            return this.emptyItem;
        }

        @Override
        public @NotNull List<? extends KitElement<?>> getKitContent() {
            return this.elements;
        }
    }
}
