package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac=new Bigmac.BigmacBuilder()
                .bun("Sesame bun")
                .burgers(2)
                .sauce("Chilli Hot Spicy")
                .ingredient("Tomato")
                .ingredient("Cucumber")
                .ingredient("Onion")
                .ingredient("Salat")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients=bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5,howManyIngredients);
    }
}
