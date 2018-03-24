package com.kodilla.stream.beautifier;

public class PoemProcessor {
    public String decorateABC (String text){
        return "ABC"+text+"ABC";
    }
    public String decorateUpper (String text){
        return text.toUpperCase();
    }
    public String decorateHex (String text){
        return String.format("%h",text);
    }
    public String decorateDate (String text){
        return String.format("%tH",text);
    }
}
