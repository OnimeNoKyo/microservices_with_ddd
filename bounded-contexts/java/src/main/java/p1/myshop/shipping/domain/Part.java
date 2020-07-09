package p1.myshop.shipping.domain;

import p1.myshop.catalog.domain.ItemId;

public class Part {
    public final ItemId itemId;
    public final Quantity quantity;

    public Part(ItemId itemId, Quantity quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId itemId() {
        return itemId;
    }
}
