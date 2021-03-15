package s01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = Player.createPlayer("Santa");
        Armor armor = new Armor("Lite", "Black");
        Armor armor1 = new Armor("Average", "Grey");
        Armor armor2 = new Armor("Hard", "White");
        Weapon weapon = new Weapon("Меч", "Простой");
        Weapon weapon1 = new Weapon("Пика", "Резная");
        List<Item> items = new ArrayList<>();
        Item item = Item.createItem("Book");
        items.add(Item.createItem("Notebook"));
        items.add(Item.createItem("Shovel"));
        items.add(Item.createItem("Scrap"));
        items.add(Item.createItem("Pick"));
        items.add( Item.createItem("Rock"));
        items.add(Item.createItem("Stick"));
        items.add( Item.createItem("Broom"));
        items.add( Item.createItem("Knife"));
        items.add( Item.createItem("Saw"));
        player.addBackpack(item); // TODO: 15.03.2021 как добавить конкретные предметы
    }

}
