package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
        @Test
        public void testWorld() {
                //Given
                World world = new World();
                Country poland = new Country("Poland", new BigDecimal("38122452"));
                Country germany = new Country("Germany", new BigDecimal("80348201"));
                Country france = new Country("France", new BigDecimal("58122452"));
                Continent europe = new Continent("Europe");
                europe.addCountry(poland);
                europe.addCountry(germany);
                europe.addCountry(france);
                world.addContinent(europe);

//        world.addContinent(new Continent(new Country("Poland","38122452"),"Europe"));
//        world.addContinent(new Continent(new Country("Germany","80348201"),"Europe"));
//        world.addContinent(new Continent(new Country("France","58122452"),"Europe"));
//        world.addContinent(new Continent(new Country("Norway","5120903"),"Europe"));
//        world.addContinent(new Continent(new Country("Poland","38122452"),"Europe"));
//        world.addContinent(new Continent(new Country("USA","325122452"),"North America"));
//        world.addContinent(new Continent(new Country("Mexico","139122452"),"North America"));
//        world.addContinent(new Continent(new Country("Canada","18122452"),"North Amercia"));
//        world.addContinent(new Continent(new Country("Brasil","231000050"),"South America"));
//        world.addContinent(new Continent(new Country("Argentina","8999200"),"South America"));
//        world.addContinent(new Continent(new Country("Peru","2122452"),"South America"));
//        world.addContinent(new Continent(new Country("China","1346850923"),"Asia"));
//        world.addContinent(new Continent(new Country("Japan","395086212"),"Asia"));
//        world.addContinent(new Continent(new Country("Qatar","1122452"),"Asia"));
//        world.addContinent(new Continent(new Country("Marocco","21124512"),"Africa"));
//        world.addContinent(new Continent(new Country("Egipt","98135992"),"Africa"));
//        world.addContinent(new Continent(new Country("Sudan","4122452"),"Africa"));
//        world.addContinent(new Continent(new Country("Australia","25698321"),"Australia/Oceania"));
//        world.addContinent(new Continent(new Country("Antarctica","52"),"Antarctica"));
                //When
                BigDecimal result = world.getPeopleQuantity();


                //Then
                BigDecimal expectedWorldPeopleQuantity = new BigDecimal("2836466434");
                Assert.assertEquals(expectedWorldPeopleQuantity, result);
        }
}
