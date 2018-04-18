package com.kodilla.patterns.prototype.library;


import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private  Set<Book> booksLists = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return booksLists;
    }

    void addBook(final Book book) {
        booksLists.add(book);
    }

    boolean removeBook(final Book book) {
        return booksLists.remove(book);
    }

    @Override
    public String toString() {
        String lib = "Library[" + name + "]\n";
        for (Book book : booksLists) {
            lib = lib + booksLists.toString() + "\n";
        }
        return lib;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.booksLists = new HashSet<>();
        for (Book theBook: booksLists){
            Book clonedBook=new Book(theBook.getTitle( "New Book"),theBook.getAuthor(),1953,3,12);

        }
        return clonedLibrary;
    }


}

