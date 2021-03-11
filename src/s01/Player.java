package s01;

import java.util.List;

public class Player {
    Player player;
    private String nik;
    private int level;
    private Sex sex;
    private int costGold;
    private List<Backpack>  backpack;

     Player(String nik){
       this.nik = nik;
    };

    public Player createPlayer(String nik){
        return new Player(nik);
    };

    public void increaseLevel() {
       level++;
    }

    public void chengecostGold(int costGold) {
        this.costGold +=costGold;
    }

    public void addBackpack(String item) {

            backpack.add(Backpack.valueOf(item));
    }

    public void deleteBackpack(String item) {
       backpack.remove(item);
    }

     enum Backpack{
        PEN,
        PAPER,
        WATER,
        EAT
    }

    enum Sex{
        М,
        МEN,
        МENS
    }

}
