//package com.kodilla.good.patterns.challenges.food2door;
//
//public class ExtraFoodShopSupplier implements Supplier {
//    OrderService orderService;
//
//    public OrderDto process(final OrderRequest productRequest) {
//        boolean isOrdered = orderService.order(productRequest.getUser(), productRequest.getTimeRequest());
//
//        if (isOrdered) {
//            orderService.inform(productRequest.getSupplier());
//            orderRepository.createOrder(productRequest.getSupplier(), productRequest.getTimeRequest());
//            return new OrderDto(productRequest.getSupplier(), true);
//        } else {
//            return new OrderDto(productRequest.getSupplier(), false);
//        }
//    }
//
//}
