package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        Supplier supplier= new GlutenFreeShopSupplier();
        Order order=new OrderImp(orderRequest.getUser(),supplier);
        System.out.println(supplier.process(order));

    }
}

