package s01;

import java.util.ArrayList;
import java.util.List;

// TODO: 14.03.2021 Свитч кейс как найти перечисление 

public class Player {
    private String name;
    private int level;
    private Sex sex;
    private int costGold;
    private List<Item>  backpack = new ArrayList<>();
    private Race race;

     Player(String name){
       this.name = name;
    };

    public static Player createPlayer(String nik){
        return new Player(nik);
    };

    public void increaseLevel() {
       level++;
    }

    public void chengecostGold(int costGold) {
        this.costGold +=costGold;
    }

    public void addBackpack(Item item) {
        item.setPlayer(this);
        backpack.add(item);
    }

    public void deleteBackpack(Item item) {
       backpack.remove(item);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Sex getSex() {
        return sex;
    }

    public Race getRace() {
        return race;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", race=" + race +
                '}';
    }
}
enum Sex{
    М,
    W
}

enum Race{
    GOBLIN("Гоблин"),
    HUMAN("Человек");

    private String name;
    Race(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

enum State{
    AGRESSIVE("Агрессивный"),
    PEACEFUL("Мирный");

    private String status;

    State(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
