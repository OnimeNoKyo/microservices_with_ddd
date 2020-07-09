package p1.myshop.shipping.infra;

import p1.myshop.catalog.domain.ItemId;
import p1.myshop.shipping.domain.Part;
import p1.myshop.shipping.domain.Inventory;
import p1.myshop.shipping.domain.Weight;

public class PartDAO implements Inventory {

    @Override
    public void definePartWeight(Part part) {
        // save part in DB
    }

    @Override
    public Weight getWeight(ItemId itemId) {
        // get weight by ID
        return null;
    }
}
