package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Test
public class WorldTestSuite {

        //Given
        World world= new World();

        //When
        world.addContinent(new Continent(new Country("Poland","38122452"),"Europe"));
        world.addContinent(new Continent(new Country("Germany","80348201"),"Europe"));
        world.addContinent(new Continent(new Country("France","58122452"),"Europe"));
        world.addContinent(new Continent(new Country("Norway","5120903"),"Europe"));
        world.addContinent(new Continent(new Country("Poland","38122452"),"Europe"));
        world.addContinent(new Continent(new Country("USA","325122452"),"North America"));
        world.addContinent(new Continent(new Country("Mexico","139122452"),"North America"));
        world.addContinent(new Continent(new Country("Canada","18122452"),"North Amercia"));
        world.addContinent(new Continent(new Country("Brasil","231000050"),"South America"));
        world.addContinent(new Continent(new Country("Argentina","8999200"),"South America"));
        world.addContinent(new Continent(new Country("Peru","2122452"),"South America"));
        world.addContinent(new Continent(new Country("China","1346850923"),"Asia"));
        world.addContinent(new Continent(new Country("Japan","395086212"),"Asia"));
        world.addContinent(new Continent(new Country("Qatar","1122452"),"Asia"));
        world.addContinent(new Continent(new Country("Marocco","21124512"),"Africa"));
        world.addContinent(new Continent(new Country("Egipt","98135992"),"Africa"));
        world.addContinent(new Continent(new Country("Sudan","4122452"),"Africa"));
        world.addContinent(new Continent(new Country("Australia","25698321"),"Australia/Oceania"));
        world.addContinent(new Continent(new Country("Antarctica","52"),"Antarctica"));


    //Then
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("2836466434");
        Assert.assertEquals(expectedWorldPeopleQuantity, peopleQuantity);
    }

