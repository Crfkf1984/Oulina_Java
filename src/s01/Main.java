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
        player.addBackpack(item);
        List<Monster> monsters = spawnMonsters();
        List<Item> items23 = spawnItems();
        System.out.println(monsters);
        System.out.println(items23);
    }

    public static List spawnMonsters() {
        List<Monster> monsters = new ArrayList();
        monsters.add(new Monster("Buffalo"));
        monsters.add(new Monster("Zubration"));
        return monsters;
    }

    public static List spawnItems() {
        List<Item> items = new ArrayList<>();
        items.add(Item.createItem("Palka"));
        items.add(Item.createItem("Lopata"));
        return items;
    }

}
