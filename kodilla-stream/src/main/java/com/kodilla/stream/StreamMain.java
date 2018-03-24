package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String print =poemBeautifier.beautify("ABC ", (text) -> text);
        String upper =poemBeautifier.beautify("ABC", (text) -> text.toUpperCase());
        //People.getList().stream()
           //     .forEach(System.out::println);
        System.out.println(print);
        System.out.println(upper);
    }
}