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
                Country norway = new Country("Norway",new BigDecimal("5120903"));
                Country usa = new Country("USA",new BigDecimal("325122452"));
                Country mexico =new Country("Mexico",new BigDecimal("139122452"));
                Country canada = new Country("Canada",new BigDecimal("18122452"));
                Country brasil = new Country("Brasil",new BigDecimal("231000050"));
                Country argentina = new Country("Argentina",new BigDecimal("8999200"));
                Country peru = new Country("Peru",new BigDecimal("2122452"));
                Country china =new Country("China",new BigDecimal("1346850923"));
                Country japan = new Country("Japan",new BigDecimal("395086212"));
                Country qatar =new Country("Qatar",new BigDecimal("1122452"));
                Country marocco =new Country("Marocco",new BigDecimal("21124512"));
                Country egipt =new Country("Egipt",new BigDecimal("98135992"));
                Country sudan = new Country("Sudan",new BigDecimal("4122452"));
                Country australia = new Country("Australia",new BigDecimal("25698321"));
                Country newZealand = new Country("New Zealand",new BigDecimal("4212459"));

                Continent europe = new Continent("Europe");
                europe.addCountry(poland);
                europe.addCountry(germany);
                europe.addCountry(france);
                europe.addCountry(norway);

                Continent asia = new Continent("Asia");
                asia.addCountry(china);
                asia.addCountry(japan);
                asia.addCountry(qatar);

                Continent northAmerica = new Continent("North America");
                northAmerica.addCountry(usa);
                northAmerica.addCountry(canada);
                northAmerica.addCountry(mexico);

                Continent southAmerica = new Continent("South America");
                southAmerica.addCountry(brasil);
                southAmerica.addCountry(peru);
                southAmerica.addCountry(argentina);

                Continent africa = new Continent("Africa");
                africa.addCountry(marocco);
                africa.addCountry(egipt);
                africa.addCountry(sudan);

                Continent australiaAndOceania = new Continent("Australia");
                australiaAndOceania.addCountry(australia);
                australiaAndOceania.addCountry(newZealand);

                //When
                BigDecimal result;
                result = world.getAllPeopleQuantity();


                //Then
                BigDecimal expectedWorldPeopleQuantity = new BigDecimal("176593105");
                Assert.assertEquals(expectedWorldPeopleQuantity, result);
        }
}
