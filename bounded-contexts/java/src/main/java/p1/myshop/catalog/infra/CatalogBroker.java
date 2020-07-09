package p1.myshop.catalog.infra;

import p1.myshop.catalog.domain.Catalog;
import p1.myshop.catalog.domain.Item;
import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public class CatalogBroker implements Catalog {

    @Override
    public Item findBy(ItemId itemId) {
        return null;
    }

    @Override
    public Item updateWeight(ItemId itemId, Weight weight) {
        EventItemWeightUpdated eventItemWeightUpdated = new EventItemWeightUpdated(itemId, weight);
        // send event
        return null;
    }
}
