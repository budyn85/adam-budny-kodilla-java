package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();
}

