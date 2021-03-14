package s01;

import java.util.List;

public class Player {
    private String nik;
    private int level;
    private Sex sex;
    private int costGold;
    private List<Item>  backpack;

     Player(String nik){
       this.nik = nik;
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

            backpack.add(item);
    }

    public void deleteBackpack(Item item) {
       backpack.remove(item);
    }
}
enum Sex{
    М,
    W
}
