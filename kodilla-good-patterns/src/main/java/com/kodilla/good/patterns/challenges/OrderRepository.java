package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(final User user, final LocalDateTime ordTime);
}
