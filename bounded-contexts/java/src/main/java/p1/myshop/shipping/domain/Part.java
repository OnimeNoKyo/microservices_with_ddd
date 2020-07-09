package p1.myshop.shipping.domain;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public class Part {
    public final ItemId itemId;
    public final Quantity quantity;

    public Part(ItemId itemId, Weight quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId itemId() {
        return itemId;
    }
}
