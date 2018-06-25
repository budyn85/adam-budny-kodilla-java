package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private  Authenticator authenticator;
    @Autowired
    private ProductService productService;

    public  Long openOrder(Long userId) {
        if(authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder+1,userId,productService ));
            return maxOrder + 1;
        }else {
            return  -1L;
        }
    }
    public void addItem(Long orderId,Long productId,double qty) {
        orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .forEach(order -> order.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId,Long productId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
                 Order order = orderIterator.next();
                 int orderSize = order.getItems().size();
            for (int n = 0; n < order.getItems().size(); n++) {
                if (order.getItems().get(n).getProductId().equals(productId)) {
                    order.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getItems().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            return order.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public boolean doPayment(final Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theorder = orderIterator.next();
            if (theorder.isPaid()) {
                return true;
            } else {
                Random generator = new Random();
                theorder.setPaid(generator.nextBoolean());
                return theorder.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(final Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            final boolean result = theOrder.isPaid();
            final Random generator = new Random();
            if (!theOrder.isVerified()) {
                theOrder.setVerified(result && generator.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }

    public boolean submitOrder(final Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(o -> o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            if (order.isVerified()) {
                order.setSubmitted(true);
            }
            return order.isSubmitted();
        }
        return false;
    }

    public void cancelOrder(final Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            final Order order = orderIterator.next();
            orders.remove(order);
        }
    }
}
