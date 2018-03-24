package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;

import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        String print =poemBeautifier.beautify("ABC ", (text) -> text);
        String upper =poemBeautifier.beautifyUpper("to duzymi literami ", (text) -> text.toUpperCase());
        String format = poemBeautifier.beautify("format ",(text)-> String.format("%h",text));
        String daten = poemBeautifier.beautify("LOWER ",(text)-> text.toLowerCase());
        System.out.println(print);
        System.out.println(upper);
        System.out.println(format);
        System.out.println(daten);

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/


        System.out.println(" ZADANIE 7.3 ");

        Forum forum =new Forum();
        Map<Integer, Object> forumFunctionMap = forum.getUserList().stream()
                .filter(s-> s.getSex()=='M')
                .filter(s->s.getBirth()<2008)
                .filter (s-> s.getPostsQuantity()>1)
                .collect(Collectors.toMap(ForumUser::getUserId, s->s));

        System.out.println("ForumUser with criterias are: " + forumFunctionMap.size());
        forumFunctionMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}