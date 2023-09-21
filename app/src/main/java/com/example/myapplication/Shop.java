package com.example.myapplication;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Weapon> weapon_list;

    // TODO: Instance should be named "shop"

    /*
     * TODO: Constructor for Shop
     * Initialize weapon_list to an empty ArrayList
     */

    /*
     * TODO: Returns the instance of the player
     * Name: getInstance()
     * @return the instance of the shop
     */

    public void add_weapon(String name, int damage) {

        Weapon weapon = new Weapon(name, damage);
        weapon_list.add(weapon);

    }

    public ArrayList<Weapon> getWeapon_list() {
        return weapon_list;
    }
}
