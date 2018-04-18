package com.kodilla.patterns.library;

public class Prototype<Library> implements Cloneable {
    @Override
    public Library clone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
}
