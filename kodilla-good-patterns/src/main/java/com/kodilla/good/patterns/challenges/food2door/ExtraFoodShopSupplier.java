package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class ExtraFoodShopSupplier implements Supplier {


    @Override
    public boolean process(Order order) {
        Random random=new Random();
        return random.nextBoolean();
    }
}
