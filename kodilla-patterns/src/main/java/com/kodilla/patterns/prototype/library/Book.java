package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;

    public Book(final String title, final String author, int year,
                int month, int day) {
        this.title = title;
        this.author = author;
        this.publicationDate = LocalDate.of(year,month,day);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}