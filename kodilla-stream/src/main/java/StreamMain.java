

import beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String print =poemBeautifier.beautify("ABC ", (text) -> text);
        String upper =poemBeautifier.beautify("L", (text) -> text);
        System.out.println(print);
        System.out.println(upper);
    }
}