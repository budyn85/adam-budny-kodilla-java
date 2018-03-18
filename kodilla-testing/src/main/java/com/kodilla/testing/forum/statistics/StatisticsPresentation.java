package com.kodilla.testing.forum.statistics;

public class StatisticsPresentation {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public StatisticsPresentation(Statistics statisticsMock) {

    }

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        avgPostPerUser = postCount / userCount;
        avgCommentPerUser = commentCount / userCount;
        avgCommentPerPost = commentCount / postCount;
    }

    public void showStatistics() {
        System.out.println("Statistics:\n"
                + "User count = " + userCount + "\n"
                + "Post count = " + postCount + "\n"
                + "Comment count = " + commentCount + "\n"
                + "Average post count per user = " + avgPostPerUser + "\n"
                + "Average comment count per user = " + avgCommentPerUser + "\n"
                + "Average comment count per post = " + avgCommentPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
