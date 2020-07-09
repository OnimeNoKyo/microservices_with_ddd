package p1.myshop.shipping.infra;

import p1.myshop.shipping.domain.Part;
import p1.myshop.shipping.domain.Inventory;

// annoatation spring listener broker event
public class EventListener {

    public final Inventory inventory;

    public EventListener(Inventory inventory) {
        this.inventory = inventory;
    }


    void onEventReceived(EventItemWeightUpdated event) {
        Part part = new Part(event.getItemId(), event.getWeight());
        inventory.definePartWeight(part);
    }
}
