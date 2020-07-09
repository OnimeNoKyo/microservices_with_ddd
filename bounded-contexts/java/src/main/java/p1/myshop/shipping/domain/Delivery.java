package p1.myshop.shipping.domain;

import p1.myshop.shoppingcart.domain.Cart;
import p1.myshop.shoppingcart.domain.CartItem;

public class Delivery {
    private final Inventory inventory;

    public Delivery(Inventory inventory) {
        this.inventory = inventory;
    }

    public double calculateOrderWeight(Cart cart) {
        return cart.items().stream()
                .map(CartItem::itemId)
                .map(inventory::getWeight)
                .mapToDouble(Weight::getWeight)
                .sum();
    }
}
