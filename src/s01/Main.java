package s01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

         Player create = startPlayer();
        System.out.println(create);
    }

    public static Player startPlayer() {
        Race race; // TODO: 18.03.2021 В конце поля без инициализации нельзя использовать! Почему?
        Sex sex;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя игрока!");
        String name = in.nextLine();
        Player player = new Player(name);
        System.out.println("Выберите расу!");
        System.out.println("1. --- Гоблин ---");
        System.out.println("2. --- Человек ---");
        int choise = in.nextInt();
        switch (choise) {
            case 1:
                 race = Race.GOBLIN;
                player.setRace(race);
                break;
            case 2:
                race = Race.HUMAN;
                player.setRace(race);
                break;
        }

        System.out.println("Выберите пол!");
        System.out.println("1. --- Мужской ---");
        System.out.println("2. --- Женский ---");
        int pol = in.nextInt();
        switch (pol) {
            case 1:
                sex = Sex.М;
                player.setSex(sex);
                break;
            case 2:
                sex = Sex.W;
                player.setSex(sex);
                break;
        }
        player.setName(name);
        //player.setRace(race); - вот тут!!!!!!!!!
        return player;
    }

}