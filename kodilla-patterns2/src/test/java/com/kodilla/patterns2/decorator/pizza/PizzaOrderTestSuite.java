package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderMargheritaGetCost() {
        // Given
        final PizzaOrder pizzaOrder = new MargheritaPizzaOrderDecorator(new BasicPizzaOrder());
        // When
        final BigDecimal price = pizzaOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(17), price);
    }
    @Test
    public void testPizzaOrderMargheritaGetDescription() {
        // Given
        final PizzaOrder pizzaOrder = new MargheritaPizzaOrderDecorator(new BasicPizzaOrder());
        // When
        final String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza + cheese and tomato sauce + extra cheese", description);
    }
    @Test
    public void testPizzaOrderCapricciosaGetCost() {
        // Given
        final PizzaOrder pizzaOrder = new CapricciosaPizzaOrderDecorator( new BasicPizzaOrder());
        // When
        final BigDecimal price = pizzaOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(25), price);
    }

    @Test
    public void testPizzaOrderCapricciosaGetDescription() {
        // Given
        final PizzaOrder pizzaOrder = new CapricciosaPizzaOrderDecorator( new BasicPizzaOrder());
        // When
        final String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza + cheese and tomato sauce + ham + mushrooms", description);
    }

}
