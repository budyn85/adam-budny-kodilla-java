package com.kodilla.good.patterns.challenges.flights;

public class FlightSearcher {
    public static void main(String[] args) {
        SearchProcessor searchProcessor= new SearchProcessor();
        searchProcessor.getFlightsFrom("Krakow").forEach(System.out::println);
        searchProcessor.getFlightsTo("Krakow").forEach(System.out::println);
        searchProcessor.getFlightsThru("Poznan",
                                        "Krakow",
                                        "Warszawa")
                        .forEach(System.out::println);

    }

}
