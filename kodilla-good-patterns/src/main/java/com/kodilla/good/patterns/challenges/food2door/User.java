package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String name;
    private String surname;
    private String userName;
    private String address;

    public User(final String name,final String surname,final String userName,final String address) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

}
