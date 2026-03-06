package com.example.myapplication;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Singleton_Tests {

    @Test
    public void ShopTest() {
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(new Weapon("Sword", 100));
        weapons.add(new Weapon("Knife", 10));
        weapons.add(new Weapon("Spear", 150));
        weapons.add(new Weapon("Crossbow", 200));

        Shop shop1 = Shop.getInstance();
        shop1.add_weapon("Sword", 100);
        Shop shop2 = Shop.getInstance();
        shop2.add_weapon("Knife", 10);
        Shop shop3 = Shop.getInstance();
        shop3.add_weapon("Spear", 150);
        Shop shop4 = Shop.getInstance();
        shop4.add_weapon("Crossbow", 200);
        Shop shop = Shop.getInstance();
        ArrayList<Weapon> weapons1 = shop.getWeapon_list();

        assertEquals(weapons.size(), weapons1.size());

        for (int i = 0; i < weapons.size(); i ++) {
            assertEquals(weapons.get(i).getName(), weapons1.get(i).getName());
            assertEquals(weapons.get(i).getDamage(), weapons1.get(i).getDamage());
        }
    }

    @Test
    public void playerTest() {
        Player player1 = Player.getPlayer();
        player1.moveDown();
        player1.moveRight();
        assertEquals(player1.getX(), 5.0, 0.1);
        assertEquals(player1.getY(), 5.0, 0.1);
        Player player2 = Player.getPlayer();
        player2.moveDown();
        player2.moveRight();
        assertEquals(player1.getX(), 10.0, 0.1);
        assertEquals(player1.getY(), 10.0, 0.1);
    }

}
