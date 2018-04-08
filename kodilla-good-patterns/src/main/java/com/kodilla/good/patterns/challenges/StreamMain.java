package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> theResult = movieStore.getMovies();
                theResult.entrySet().stream()
                .flatMap(e->e.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(theResult);
    }
}