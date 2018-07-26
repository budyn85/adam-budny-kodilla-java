package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite  {

    @Test
    public void testMedianAdapter() {
    //Given
    Set<Book> bookSet = new HashSet<>();

    bookSet.add(new Book("Robert Ludlum", "Tożsamość Bourne'a ",2014,"234218"));
    bookSet.add(new Book("Stephen King", "Outsider ",2018,"432218"));
    bookSet.add(new Book("Paulina Swist", "Podejrzany ",1998,"411218"));
    bookSet.add(new Book("Madelline Miller", "Kirke ",2010,"398213"));
    bookSet.add(new Book("Lukasz Grass", "Najlepszy ",2000,"948220"));

    MedianAdapter adapter = new MedianAdapter();

    //When
    int median = adapter.publicationYearMedian(bookSet);

    //Then
    Assert.assertEquals(2010, median);
}
}
