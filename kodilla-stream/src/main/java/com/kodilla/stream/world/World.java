package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    @Override
    public BigDecimal getPeopleQuantity() {
         continents.stream()
                .flatMap(continent1 -> continent1.addContinent().stream());
                .map(Country::getPeopleQuantity)
    }
}
