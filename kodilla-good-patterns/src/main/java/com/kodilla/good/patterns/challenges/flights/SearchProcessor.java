package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchProcessor {
    private Set<Flight> flights = new HashSet<>();

    public SearchProcessor() {
        flights.add(new Flight("Gdansk","Krakow"));
        flights.add(new Flight("Krakow","Warszawa"));
        flights.add(new Flight("Gdansk","Radom"));
        flights.add(new Flight("Radom","Poznan"));
        flights.add(new Flight("Poznan","Krakow"));
        flights.add(new Flight("Warszawa","Krakow"));
    }
    public Set<Flight> getFlightsTo(String arrivalAirport){
        return flights.stream()
                .filter(f->f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }
    public Set<Flight> getFlightsFrom(String departureAirport){
        return flights.stream()
                .filter(f->f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }
    public Set<Flight> getFlightsThru(String arrivalAirport,
                                      String thruAirport,
                                      String departureAirport){
        Set<Flight> stage1=flights.stream()
                .filter(f->f.getDepartureAirport().equals(departureAirport))
                .filter(f->f.getArrivalAirport().equals(thruAirport))
                .collect(Collectors.toSet());
        Set<Flight> stage2=flights.stream()
                .filter(f ->f.getDepartureAirport().equals(thruAirport))
                .filter(f->f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        stage1.addAll(stage2);
        return stage1;

    }
}
