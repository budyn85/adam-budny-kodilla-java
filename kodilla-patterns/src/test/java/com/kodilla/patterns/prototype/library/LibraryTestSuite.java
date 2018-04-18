package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        //creating books
        Book book1=new Book("Sirmallirion","J.R.R Tolkien",1940,3,12);
        Book book2=new Book("Opowieści z meekhańskiego pogranicza. Północ-Południe","Robert M. Wegner",1954,3,12);
        Book book3=new Book("Malowany Człowiek","Peter V. Brett",1976,12,12);

        //creating Library and set booksList
        Library library=new Library("FantasyLibrary1");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
             clonedLibrary= library.shallowCopy();
            clonedLibrary.setName("FantasyLibrary2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary= library.deepCopy();
            deepClonedLibrary.setName("FantasyLibrary2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.removeBook(book3);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(),library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());

    }
}
