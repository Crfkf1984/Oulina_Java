package s01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = Player.createPlayer("Santa");
        Armor armor = new Armor("Lite");
        Armor armor1 = new Armor("Average");
        Armor armor2 = new Armor("Hard");
        Weapon weapon = new Weapon("Меч");
        Weapon weapon1 = new Weapon("Пика");
        List<Item> items = new ArrayList<>();
        Item item = new Armor("Book");
        items.add(new Armor("Notebook"));
        items.add(new Weapon("Shovel"));
        items.add(new Weapon("Scrap"));
        items.add(new Potion("Pick"));
//        items.add( Item.createItem("Rock"));
//        items.add(Item.createItem("Stick"));
//        items.add( Item.createItem("Broom"));
//        items.add( Item.createItem("Knife"));
//        items.add( Item.createItem("Saw"));
        for (Item item12: items) {
            player.addBackpack(item12);
        }
    }

}
