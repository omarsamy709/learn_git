package Oop.omar;

import java.util.Arrays;
import java.util.List;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }

        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.hasauthor(author.firstname)) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.hasauthor(String.valueOf(author))) {
                filteredBooks[index++] = book;
            }
        }

        return filteredBooks;
    }
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {

        if (publisher == null || books == null) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            if(book.getPublisher().equals(publisher.PublisherName)) {
                matchBooksAmount++;
            }}
        Book[] filteredBooks1 = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher.PublisherName)) {
                filteredBooks1[index++] = book;
                }
        }
            return filteredBooks1;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {

        if (books == null || books.length == 0) {
            return new Book[0];
        }
        int matchBooksAmount = 0;
        for (Book book : books) {
            if(book.getPublishingYear() > yearFromInclusively) {
                matchBooksAmount++;
            }
            }
        Book[] filteredBooks2 = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if(book.getPublishingYear() > yearFromInclusively){
                filteredBooks2[index++] = book;
            }

        }
        return filteredBooks2;
    }

}
