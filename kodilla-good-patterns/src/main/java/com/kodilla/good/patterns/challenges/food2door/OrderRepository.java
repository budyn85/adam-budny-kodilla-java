package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRepository {
    public boolean createOrder(final User user, final LocalDateTime ordTime){
        System.out.println("Order"+ user.getName()+ " "+user.getSurname()+user.getAddress()+user.getAddress()+" date: "+ ordTime.toString());
        return true;
    }
}
