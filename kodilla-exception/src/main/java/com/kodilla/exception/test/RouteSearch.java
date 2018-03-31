package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Krakow", true);
        airports.put("Gdansk", false);
        airports.put("Lodz", false);
        airports.put("Rzeszow", true);
        airports.put("Warsaw", true);
        airports.put("Wroclaw", true);
        airports.put("Bydgoszcz", true);

        boolean g = true;
        for (Map.Entry<String, Boolean> ports : airports.entrySet()) {
            if (ports.getKey() == flight.getArrivalAirport() && (ports.getValue() == g)){
               System.out.println("Y can fly");
            }
        }
        throw new RouteNotFoundException("No airports");
    }


}

