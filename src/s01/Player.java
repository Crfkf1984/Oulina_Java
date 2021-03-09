package s01;

import java.util.List;

public class Player {
    Player player;
    private String nik;
    private int level;
    private String sex;
    private int costGold;
    private List<String> backpack;

    public Player(String nik, int level){

    };

    public Player(String nik, int level, String sex, int costGold, List<String> backpack,
                  String pen, String sheet, String pencil, String rubber) {
        this.nik = nik;
        this.level = level;
        this.sex = sex;
        this.costGold = costGold;
        this.backpack = backpack;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCostGold() {
        return costGold;
    }

    public void setCostGold(int costGold) {
        this.costGold = costGold;
    }

    public List<String> getBackpack() {
        return backpack;
    }

    public void setBackpack(List<String> backpack) {
        this.backpack = backpack;
    }

    public void createPlayer(String nik, int level) {
       player = new Player("Run" , 1);
    }

    public void increaseLevel() {
        int level = player.getLevel();
        level++;
        player.setLevel(level);
    }

    public void chengecostGold(int costGold) {
        int res  = player.getCostGold();
        res +=costGold;
        player.setCostGold(res);
    }

    public void addBackpack(String item) {
        backpack.add(item);
    }

    public void deleteBackpack(String item) {
        backpack.remove(item);
    }

    public static void main(String[] args) {

    }
}
