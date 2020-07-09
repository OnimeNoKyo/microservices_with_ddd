package p1.myshop.shipping.domain;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Parcel {
    private final List<Part> items;

    public Parcel(List<Part> items) {
        this.items = items;
    }

    public List<Part> items() {
        return items;
    }
}
