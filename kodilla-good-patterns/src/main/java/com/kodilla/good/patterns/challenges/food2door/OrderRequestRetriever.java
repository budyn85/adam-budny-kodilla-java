package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Andrzej", "Zmarzly","Andrew","Pocztowa 1");

        LocalDateTime orderTime = LocalDateTime.of(2018, 4, 6, 10, 10);

        return new OrderRequest(user,orderTime);
    }
}
