package com.kodilla.zad_3_01;

import java.util.*;
import java.lang.*;
import java.time.*;

public class Book {
    private String title;
    private String author;
    private LocalDate data;

    public Book(String title, String author, int year, int month, int day){
        this.title= title;
        this.author= author;
        this.data = LocalDate.of(year, month, day);

    }
    @Override
    public int hashCode(){
        return data.getYear()*100 + data.getMonthValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(data, book.data);
    }
}

