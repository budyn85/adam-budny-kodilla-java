package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String print =poemBeautifier.beautify("ABC ", (text) -> text);
        String upper =poemBeautifier.beautifyUpper("to duzymi literami ", (text) -> text.toUpperCase());
        String format = poemBeautifier.beautify("format ",(text)-> String.format("%h",text));
        String daten = poemBeautifier.beautify("LOWER ",(text)-> text.toLowerCase());
        //People.getList().stream()
           //     .forEach(System.out::println);
        System.out.println(print);
        System.out.println(upper);
        System.out.println(format);
        System.out.println(daten);
    }
}