package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private MobileInformationService informationService;
    private MobileOrderService orderService;
    private MobileOrderRepository orderRepository;

    public ProductOrderService(final MobileInformationService informationService,
                               final MobileOrderService orderService,
                               final MobileOrderRepository orderRepository) {
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
