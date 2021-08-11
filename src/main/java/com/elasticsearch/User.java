package com.elasticsearch;

public class User {
    private String name;

    private int age;

    public static User valueOf(String name, int age) {
        User user = new User();
        user.name = name;
        user.age = age;
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
