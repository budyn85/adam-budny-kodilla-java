package com.kodilla.exception.test;

public class ThirdChallange {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Krakow");
        Flight flight2 = new Flight("Warsaw", "Gdansk");
        Flight flight3 = new Flight("Poznan", "Lodz");
        Flight flight4 = new Flight("Poznan", "Rzeszow");
        Flight flight5 = new Flight("Krakow", "Warsaw");
        Flight flight6 = new Flight("Krakow", "Wroclaw");
        Flight flight7 = new Flight("Wroclaw", "Bydgoszcz");

        RouteSearch routeSearch = new RouteSearch();
        try {
            routeSearch.findFlight(flight1);
        }catch (RouteNotFoundException c){
            System.out.println("Sorry. ");
        }
        System.out.println("See our other destinations");
    }
}