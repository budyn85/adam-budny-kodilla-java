package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface Order {
    double getOrderPrice();
    int getOrderIndex();
    Map<Food,Integer> getProducts();
    User getUser();
    Supplier getSupplierIndex();


}
