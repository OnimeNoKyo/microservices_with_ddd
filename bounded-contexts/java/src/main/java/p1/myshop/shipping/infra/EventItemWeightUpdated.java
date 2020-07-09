package p1.myshop.shipping.infra;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public class EventItemWeightUpdated implements Event {

    @Override
    public Weight getWeight() {
        return null;
    }

    @Override
    public ItemId getItemId() {
        return null;
    }
}
