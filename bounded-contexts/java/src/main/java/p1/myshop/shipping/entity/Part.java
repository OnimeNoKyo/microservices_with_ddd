package p1.myshop.shipping.entity;

import p1.myshop.aggregate.Item;
import p1.myshop.aggregate.ItemId;

public class Part implements Item {

    @Override
    public ItemId itemId() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }
}
