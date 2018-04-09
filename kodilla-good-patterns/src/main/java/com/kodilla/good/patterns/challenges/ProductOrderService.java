package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final ProductRequest productRequest) {
        boolean isOrdered = orderService.order(productRequest.getUser(), productRequest.getTimeRequest());

        if(isOrdered) {
            informationService.inform(productRequest.getUser());
            orderRepository.createOrder(productRequest.getUser(), productRequest.getTimeRequest());
            return new OrderDto(productRequest.getUser(), true);
        } else {
            return new OrderDto(productRequest.getUser(), false);
        }
    }

}
