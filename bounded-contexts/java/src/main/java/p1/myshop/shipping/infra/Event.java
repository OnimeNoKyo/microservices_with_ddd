package p1.myshop.shipping.infra;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public interface Event {

    Weight getWeight();

    ItemId getItemId();
}
