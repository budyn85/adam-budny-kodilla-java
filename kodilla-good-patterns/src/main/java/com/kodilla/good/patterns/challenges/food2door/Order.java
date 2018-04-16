package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface Order {
    double getOrderValue();
    int getOrderNumber();
    Map<String,Integer> getProducts();
    User getUser();
    Supplier getSupplier();

}
