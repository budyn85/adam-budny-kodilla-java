package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteSearch {

    public boolean findFlight(Flight flight) throws Exception {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Krakow", true);
        airports.put("Gdansk", false);
        airports.put("Lodz", false);
        airports.put("Rzeszow", true);
        airports.put("Warsaw", true);
        airports.put("Wroclaw", true);
        airports.put("Bydgoszcz", true);


        Boolean port = true;
        if (airports.containsKey(flight.getDepartureAirport())) {
            port= airports.get(flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException("Error");
        }

        return port;
    }
}