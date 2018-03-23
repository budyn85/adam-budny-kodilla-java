import beautifier.PoemBeautifier;
import iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String print =poemBeautifier.beautify("ABC ", (text) -> text);
        String upper =poemBeautifier.beautify("L", (text) -> text);
        System.out.println(print);
        System.out.println(upper);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }

}