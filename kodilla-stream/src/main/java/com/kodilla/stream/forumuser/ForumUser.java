package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birth;
    private final int postsQuantity;

    public ForumUser(final int userId,final String userName,final char sex,final int yearOfBirth,
                    final int monthOfBirth,final int dayOfBirth,final int postsQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getBirth() {
        return birth.getYear();
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
