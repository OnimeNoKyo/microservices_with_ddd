package p1.myshop.shipping.entity;

import p1.myshop.aggregate.User;

public class Recipient implements User {
    private final String name;

    public Recipient(String name) {
        this.name = name;
    }

    @Override
    public Long getUserId() {
        return null;
    }
}
