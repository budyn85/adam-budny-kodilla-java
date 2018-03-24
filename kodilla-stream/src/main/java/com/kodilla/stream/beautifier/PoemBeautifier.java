package com.kodilla.stream.beautifier;

public class PoemBeautifier{

    public String beautify( String text,PoemDecorator poemDecorator){
       String result =poemDecorator.decorate(text);
      return result+ "Lambda is very useful " + result;
    }
    public String beautifyUpper( String text,PoemDecorator poemDecorator){
        String up =poemDecorator.decorate(text);
        return up + "Lambda is very useful";}
}
