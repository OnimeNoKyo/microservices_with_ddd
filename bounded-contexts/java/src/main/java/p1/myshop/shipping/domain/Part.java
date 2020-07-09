package p1.myshop.shipping.domain;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public class Part {
    public final ItemId itemId;
    public final Quantity quantity;
    private final Weight weight;

    public Part(ItemId itemId, Quantity quantity, Weight weight) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.weight = weight;
    }

    public Part(ItemId itemId, Weight weight) {
        this.itemId = itemId;
        this.weight = weight;
        quantity = null;
    }

    public ItemId itemId() {
        return itemId;
    }
}
