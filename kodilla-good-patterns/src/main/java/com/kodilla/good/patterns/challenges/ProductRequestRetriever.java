package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductRequestRetriever {

    public ProductRequest retrieve() {
        User user = new User("Andrzej", "Zmarzly");

        LocalDateTime orderTime = LocalDateTime.of(2018, 4, 6, 10, 10);

        return new ProductRequest(user,orderTime);
    }
}
