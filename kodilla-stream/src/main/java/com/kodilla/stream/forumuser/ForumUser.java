package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int numberOfUserPosts;

    public ForumUser(final int userId, final String userName, final char userSex, final CharSequence birth, final int numberOfUserPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.parse(birth);
        this.numberOfUserPosts = numberOfUserPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfUserPosts=" + numberOfUserPosts +
                '}';
    }
}
