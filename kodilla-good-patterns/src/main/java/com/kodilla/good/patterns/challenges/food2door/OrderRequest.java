package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

        private User user;
        private LocalDateTime orderRequest;

        public OrderRequest(final User user,final LocalDateTime orderRequest) {
            this.user = user;
            this.orderRequest = orderRequest;
        }

        public User getUser() {
            return user;
        }

        public LocalDateTime getOrderRequest() {
            return orderRequest;
        }
    }

