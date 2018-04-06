package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main (String[]args){
        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();
        ProductRequest productRequest = productRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MobileInformationService(),new MobileOrderService(),new MobileOrderRepository());
                productOrderService.process(productRequest);
    }
}
