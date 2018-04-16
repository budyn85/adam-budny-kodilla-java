package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderImp implements Order {
    private User user;
    private Supplier supplier;

    public OrderImp(User user,Supplier supplier) {
        this.user = user;
        this.supplier=supplier;
    }

    @Override
    public double getOrderValue() {
        return 12;
    }

    @Override
    public int getOrderNumber() {
        return 3;
    }

    @Override
    public Map<String, Integer> getProducts() {
        Map<String,Integer> products=new HashMap<>();
        products.put("Milk",2);
        return products;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Supplier getSupplier() {
        return supplier;
    }
}
