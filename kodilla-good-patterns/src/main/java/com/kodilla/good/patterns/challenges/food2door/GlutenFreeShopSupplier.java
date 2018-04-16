package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class GlutenFreeShopSupplier implements Supplier{

    @Override
    public boolean process(Order order) {
        Random random=new Random();
        return random.nextBoolean();
    }
}
