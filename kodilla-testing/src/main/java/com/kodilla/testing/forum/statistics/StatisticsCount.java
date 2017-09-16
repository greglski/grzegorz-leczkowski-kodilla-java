package com.kodilla.testing.forum.statistics;

public class StatisticsCount {
    Statistics statistics;

    private int usersQuantity = 0;
    private int postsQuantity = 0;
    private int commentsQuantity = 0;
    private double postsAvgPerUser = 0;
    private double commentsAvgPerUser = 0;
    private double commentsAvgPerPost = 0;

    public StatisticsCount(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {

        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        this.postsAvgPerUser = (double)statistics.postsCount() / statistics.usersNames().size();
        this.commentsAvgPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
        this.commentsAvgPerPost = (double)statistics.commentsCount() / statistics.postsCount();
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }
}
