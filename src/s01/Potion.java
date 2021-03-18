package s01;

public class Potion implements Item{
    Player player;
    String name = "";
    String discripsion = "";
    int amount;
    public Potion(String name, String discripsion) {
        this.name = name;
        this.discripsion = discripsion;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPlayer(Player player) {

    }

    @Override
    public String getDiscripsion() {
        return discripsion;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
