package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> theResult = movieStore.getMovies();
                theResult.entrySet().stream()
                .map(s->s.getValue())
                .map(List::toString)
                .collect(Collectors.joining(",!","<<",">>"));

        System.out.println(theResult);
    }
}
