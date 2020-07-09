package p1.myshop.catalog.infra;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.catalog.domain.Weight;

public class EventItemWeightUpdated implements Event {

    private ItemId itemId;
    private Weight weight;

    public EventItemWeightUpdated(ItemId itemId, Weight weight) {
        this.itemId = itemId;
        this.weight = weight;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public void setItemId(ItemId itemId) {
        this.itemId = itemId;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
