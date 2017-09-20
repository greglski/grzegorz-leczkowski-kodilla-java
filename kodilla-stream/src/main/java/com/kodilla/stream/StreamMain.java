package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() >2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(theResultListOfBooks);

//        7.3 Zadanie: funkcyjny spacer po liście użytkowników forum

        System.out.println();
        System.out.println("Forum users");
        System.out.println();

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getNumberOfUserPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
