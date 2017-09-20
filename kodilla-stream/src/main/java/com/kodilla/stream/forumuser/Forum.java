package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "John", 'M', "2000-01-01", 20));
        userList.add(new ForumUser(2, "Adam", 'M', "1990-01-01", 10));
        userList.add(new ForumUser(3, "Nora", 'F', "2010-01-01", 15));
        userList.add(new ForumUser(4, "Jane", 'F', "2000-01-01", 0));
        userList.add(new ForumUser(5, "George", 'M', "1900-01-01", 0));
        userList.add(new ForumUser(6, "Mark", 'M', "1900-01-01", 2));
        userList.add(new ForumUser(7, "Ron", 'M', "1997-01-01", 2));
        userList.add(new ForumUser(8, "RonOld", 'M', "1997-10-01", 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
