package p1.myshop.shipping.domain;

import p1.myshop.catalog.domain.ItemId;

public interface Inventory {

    void definePartWeight(Part part);

    Weight getWeight(ItemId itemId);
}
