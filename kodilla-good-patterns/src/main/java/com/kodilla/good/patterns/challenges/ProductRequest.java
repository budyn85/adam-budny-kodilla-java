package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductRequest {

    private User user;
    private LocalDateTime timeRequest;

    public ProductRequest(final User user,final LocalDateTime timeRequest) {
        this.user = user;
        this.timeRequest = timeRequest;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeRequest() {
        return timeRequest;
    }
}
