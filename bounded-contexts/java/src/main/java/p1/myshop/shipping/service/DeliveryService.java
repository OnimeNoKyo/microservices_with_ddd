package p1.myshop.shipping.service;

import p1.myshop.aggregate.HasWeight;
import p1.myshop.catalog.service.CatalogService;
import p1.myshop.shoppingcart.entity.Cart;
import p1.myshop.shoppingcart.entity.CartItem;

public class DeliveryService {
    private final CatalogService catalogService;

    public DeliveryService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public double calculateOrderWeight(Cart cart) {
        return cart.items().stream()
                .map(CartItem::itemId)
                .map(catalogService::loadItem)
                .mapToDouble(HasWeight::weight)
                .sum();
    }
}
