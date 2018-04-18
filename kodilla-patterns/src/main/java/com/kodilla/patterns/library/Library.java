package com.kodilla.patterns.library;


import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    void addBook(final Book book) {
        books.add(book);
    }

    boolean removeBook(final Book book) {
        return books.remove(book);
    }

    @Override
    public String toString() {
        String lib = "Library[" + name + "]\n";
        for (Book book : books) {
            lib = lib + books.toString() + "\n";
        }
        return lib;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        return clonedLibrary;
    }
}

