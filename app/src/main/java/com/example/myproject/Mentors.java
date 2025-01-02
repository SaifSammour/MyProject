package com.example.myproject;

public class Mentors {
    private final int image;
    private final String Name;
    public  String Role;

    public String getRole() {
        return Role;
    }

    public Mentors(int image, String name, String role) {
        this.image = image;
        Name = name;
        Role = role;
    }

    public String getName() {
        return Name;
    }

    public int getImage() {
        return image;
    }

    public Mentors(int image, String name) {
        this.image = image;
        Name = name;
    }
}
