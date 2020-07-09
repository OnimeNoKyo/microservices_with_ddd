package p1.myshop.shipping.domain;

import p1.myshop.catalog.domain.HasWeight;
import p1.myshop.catalog.domain.CatalogRepository;
import p1.myshop.shoppingcart.domain.Cart;
import p1.myshop.shoppingcart.domain.CartItem;

public class DeliveryService {
    private final CatalogRepository catalogService;

    public DeliveryService(CatalogRepository catalogService) {
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
