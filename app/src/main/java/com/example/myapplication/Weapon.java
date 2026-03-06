package com.example.myapplication;

public class Weapon {

    private int damage;
    private String name;

    public Weapon(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }


}
