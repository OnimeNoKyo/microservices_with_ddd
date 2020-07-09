package p1.myshop.catalog.entity;

import p1.myshop.aggregate.Item;
import p1.myshop.aggregate.ItemId;

public class Dvd implements Item {
    @Override
    public ItemId itemId() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }
}
