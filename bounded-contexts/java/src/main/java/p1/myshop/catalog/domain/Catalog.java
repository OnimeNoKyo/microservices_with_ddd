package p1.myshop.catalog.domain;

public interface Catalog {

    Item findBy(ItemId itemId);
    Item updateWeight(ItemId itemId, Weight weight);
}
