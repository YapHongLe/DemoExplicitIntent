package com.example.demoexplicitintent;

import java.io.Serializable;

public class Hero implements Serializable {
    public String name;
    public int strength;
    public int technicalProwess;

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }
}
