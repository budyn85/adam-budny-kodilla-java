package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface OrderService {
    boolean order(final User user,final LocalDateTime ordTime);
}
