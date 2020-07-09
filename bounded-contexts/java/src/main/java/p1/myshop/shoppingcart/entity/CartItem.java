package p1.myshop.shoppingcart.entity;

import p1.myshop.aggregate.ItemId;
import p1.myshop.aggregate.Quantity;

public class CartItem {
    public final ItemId itemId;
    public final Quantity quantity;

    public CartItem(ItemId itemId, Quantity quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId itemId() {
        return itemId;
    }
}
