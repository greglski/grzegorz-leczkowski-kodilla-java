package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        return resultList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        /*List<Book> bookList = new ArrayList<>();
        Book book = new Book("The book title", "The book author", 2000);
        Book book1 = new Book("The book title1", "The book author1", 2001);
        bookList.add(book);
        bookList.add(book1);
*/
        return bookList;
    }

}
